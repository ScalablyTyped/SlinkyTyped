package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to). If you set Atime to BEST_EFFORT, DataSync attempts to preserve the original Atime attribute on all source files (that is, the version before the PREPARING phase). However, Atime's behavior is not fully standard across platforms, so AWS DataSync can only do this on a best-effort basis.  Default value: BEST_EFFORT. BEST_EFFORT: Attempt to preserve the per-file Atime value (recommended). NONE: Ignore Atime.  If Atime is set to BEST_EFFORT, Mtime must be set to PRESERVE.  If Atime is set to NONE, Mtime must also be NONE.  
    */
  var Atime: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Atime] = js.native
  
  /**
    * A value that limits the bandwidth used by AWS DataSync. For example, if you want AWS DataSync to use a maximum of 1 MB, set this value to 1048576 (=1024*1024).
    */
  var BytesPerSecond: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.BytesPerSecond] = js.native
  
  /**
    * The group ID (GID) of the file's owners.  Default value: INT_VALUE. This preserves the integer value of the ID. INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended). NONE: Ignore UID and GID. 
    */
  var Gid: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Gid] = js.native
  
  /**
    * A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide. For more information about providing a log group for DataSync, see CloudWatchLogGroupArn. If set to OFF, no logs are published. BASIC publishes logs on errors for individual files transferred, and TRANSFER publishes logs for every file or object that is transferred and integrity checked.
    */
  var LogLevel: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LogLevel] = js.native
  
  /**
    * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.  Default value: PRESERVE.  PRESERVE: Preserve original Mtime (recommended)  NONE: Ignore Mtime.   If Mtime is set to PRESERVE, Atime must be set to BEST_EFFORT. If Mtime is set to NONE, Atime must also be set to NONE.  
    */
  var Mtime: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Mtime] = js.native
  
  /**
    * A value that determines whether files at the destination should be overwritten or preserved when copying files. If set to NEVER a destination file will not be replaced by a source file, even if the destination file differs from the source file. If you modify files in the destination and you sync the files, you can use this value to protect against overwriting those changes.  Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed information, see using-storage-classes in the AWS DataSync User Guide.
    */
  var OverwriteMode: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.OverwriteMode] = js.native
  
  /**
    * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.  Default value: PRESERVE. PRESERVE: Preserve POSIX-style permissions (recommended). NONE: Ignore permissions.   AWS DataSync can preserve extant permissions of a source location. 
    */
  var PosixPermissions: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.PosixPermissions] = js.native
  
  /**
    * A value that specifies whether files in the destination that don't exist in the source file system should be preserved. This option can affect your storage cost. If your task deletes objects, you might incur minimum storage duration charges for certain storage classes. For detailed information, see using-storage-classes in the AWS DataSync User Guide. Default value: PRESERVE. PRESERVE: Ignore such destination files (recommended).  REMOVE: Delete destination files that aren’t present in the source.
    */
  var PreserveDeletedFiles: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.PreserveDeletedFiles] = js.native
  
  /**
    * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.  AWS DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an end-of-file (EOF) marker.  Default value: NONE. NONE: Ignore special devices (recommended).  PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS. 
    */
  var PreserveDevices: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.PreserveDevices] = js.native
  
  /**
    * A value that determines whether tasks should be queued before executing the tasks. If set to ENABLED, the tasks will be queued. The default is ENABLED. If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information, see queue-task-execution.
    */
  var TaskQueueing: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.TaskQueueing] = js.native
  
  /**
    * TransferMode has two values: CHANGED and ALL. CHANGED performs an "incremental" or "delta sync", it compares file modification time between source and destination to determine which files need to be transferred. ALL skips destination inventory and transfers all files discovered on the source.
    */
  var TransferMode: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.TransferMode] = js.native
  
  /**
    * The user ID (UID) of the file's owner.  Default value: INT_VALUE. This preserves the integer value of the ID. INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended). NONE: Ignore UID and GID. 
    */
  var Uid: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Uid] = js.native
  
  /**
    * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred. For more information, see create-task  Default value: POINT_IN_TIME_CONSISTENT. ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.  POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to verify that source and destination are fully synchronized. This option isn't supported when transferring to S3 Glacier or S3 Glacier Deep Archive storage classes. NONE: No additional verification is done at the end of the transfer, but all data transmissions are integrity-checked with checksum verification during the transfer.
    */
  var VerifyMode: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.VerifyMode] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAtime(value: Atime): Self = this.set("Atime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtime: Self = this.set("Atime", js.undefined)
    
    @scala.inline
    def setBytesPerSecond(value: BytesPerSecond): Self = this.set("BytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesPerSecond: Self = this.set("BytesPerSecond", js.undefined)
    
    @scala.inline
    def setGid(value: Gid): Self = this.set("Gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGid: Self = this.set("Gid", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("LogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("LogLevel", js.undefined)
    
    @scala.inline
    def setMtime(value: Mtime): Self = this.set("Mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("Mtime", js.undefined)
    
    @scala.inline
    def setOverwriteMode(value: OverwriteMode): Self = this.set("OverwriteMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteMode: Self = this.set("OverwriteMode", js.undefined)
    
    @scala.inline
    def setPosixPermissions(value: PosixPermissions): Self = this.set("PosixPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosixPermissions: Self = this.set("PosixPermissions", js.undefined)
    
    @scala.inline
    def setPreserveDeletedFiles(value: PreserveDeletedFiles): Self = this.set("PreserveDeletedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDeletedFiles: Self = this.set("PreserveDeletedFiles", js.undefined)
    
    @scala.inline
    def setPreserveDevices(value: PreserveDevices): Self = this.set("PreserveDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDevices: Self = this.set("PreserveDevices", js.undefined)
    
    @scala.inline
    def setTaskQueueing(value: TaskQueueing): Self = this.set("TaskQueueing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskQueueing: Self = this.set("TaskQueueing", js.undefined)
    
    @scala.inline
    def setTransferMode(value: TransferMode): Self = this.set("TransferMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferMode: Self = this.set("TransferMode", js.undefined)
    
    @scala.inline
    def setUid(value: Uid): Self = this.set("Uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("Uid", js.undefined)
    
    @scala.inline
    def setVerifyMode(value: VerifyMode): Self = this.set("VerifyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyMode: Self = this.set("VerifyMode", js.undefined)
  }
}
