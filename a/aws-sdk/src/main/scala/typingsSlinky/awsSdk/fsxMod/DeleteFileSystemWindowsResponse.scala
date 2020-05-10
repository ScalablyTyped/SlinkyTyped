package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemWindowsResponse extends js.Object {
  /**
    * The ID of the final backup for this file system.
    */
  var FinalBackupId: js.UndefOr[BackupId] = js.native
  /**
    * The set of tags applied to the final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.native
}

object DeleteFileSystemWindowsResponse {
  @scala.inline
  def apply(): DeleteFileSystemWindowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemWindowsResponse]
  }
  @scala.inline
  implicit class DeleteFileSystemWindowsResponseOps[Self <: DeleteFileSystemWindowsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinalBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalBackupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalBackupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalBackupId")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalBackupTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalBackupTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalBackupTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalBackupTags")(js.undefined)
        ret
    }
  }
  
}

