package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * A value that determines the type of logs DataSync will deliver to your AWS CloudWatch Logs file. If set to OFF, no logs will be delivered. BASIC will deliver a few logs per transfer operation and TRANSFER will deliver a verbose log that contains logs for every file that is transferred.
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
    * A value that determines whether tasks should be queued before executing the tasks. If set to ENABLED, the tasks will be queued. The default is ENABLED. If you use the same agent to run multiple tasks you can enable the tasks to run in series. For more information see queue-task-execution.
    */
  var TaskQueueing: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.TaskQueueing] = js.native
  /**
    * The user ID (UID) of the file's owner.  Default value: INT_VALUE. This preserves the integer value of the ID. INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended). NONE: Ignore UID and GID. 
    */
  var Uid: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Uid] = js.native
  /**
    * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.  Default value: POINT_IN_TIME_CONSISTENT. POINT_IN_TIME_CONSISTENT: Perform verification (recommended).  ONLY_FILES_TRANSFERRED: Perform verification on only files that were transferred. NONE: Skip verification.
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
    def withAtime(value: Atime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Atime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Atime")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesPerSecond(value: BytesPerSecond): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: Gid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gid")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMtime(value: Mtime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mtime")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteMode(value: OverwriteMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverwriteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwriteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverwriteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPosixPermissions(value: PosixPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PosixPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosixPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PosixPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDeletedFiles(value: PreserveDeletedFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreserveDeletedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDeletedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreserveDeletedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDevices(value: PreserveDevices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreserveDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreserveDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskQueueing(value: TaskQueueing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskQueueing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskQueueing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskQueueing")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Uid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uid")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyMode(value: VerifyMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyMode")(js.undefined)
        ret
    }
  }
  
}

