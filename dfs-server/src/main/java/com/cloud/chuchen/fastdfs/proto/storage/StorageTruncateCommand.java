package com.cloud.chuchen.fastdfs.proto.storage;


import com.cloud.chuchen.fastdfs.proto.AbstractFdfsCommand;
import com.cloud.chuchen.fastdfs.proto.FdfsResponse;
import com.cloud.chuchen.fastdfs.proto.storage.internal.StorageTruncateRequest;

/**
 * 文件Truncate命令
 * 
 * @author tobato
 *
 */
public class StorageTruncateCommand extends AbstractFdfsCommand<Void> {

    /**
     * 文件Truncate命令
     * 
     * @param groupName
     * @param path
     */
    public StorageTruncateCommand(String path, long fileSize) {
        super();
        this.request = new StorageTruncateRequest(path, fileSize);
        // 输出响应
        this.response = new FdfsResponse<Void>() {
            // default response
        };
    }

}
