package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemWindowsConfiguration extends js.Object {
  /**
    * A set of tags for your final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.native
  /**
    * By default, Amazon FSx for Windows takes a final backup on your behalf when the DeleteFileSystem operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final backup. If you want to skip this backup, use this flag to do so.
    */
  var SkipFinalBackup: js.UndefOr[Flag] = js.native
}

object DeleteFileSystemWindowsConfiguration {
  @scala.inline
  def apply(): DeleteFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemWindowsConfiguration]
  }
  @scala.inline
  implicit class DeleteFileSystemWindowsConfigurationOps[Self <: DeleteFileSystemWindowsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSkipFinalBackup(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkipFinalBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFinalBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkipFinalBackup")(js.undefined)
        ret
    }
  }
  
}

