package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreBackupRequest extends js.Object {
  /**
    * The ID of the backup to be restored. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: typingsSlinky.awsSdk.cloudhsmv2Mod.BackupId = js.native
}

object RestoreBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId): RestoreBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreBackupRequest]
  }
  @scala.inline
  implicit class RestoreBackupRequestOps[Self <: RestoreBackupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

