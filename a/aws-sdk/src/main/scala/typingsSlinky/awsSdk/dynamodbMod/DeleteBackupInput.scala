package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupInput extends js.Object {
  /**
    * The ARN associated with the backup.
    */
  var BackupArn: typingsSlinky.awsSdk.dynamodbMod.BackupArn = js.native
}

object DeleteBackupInput {
  @scala.inline
  def apply(BackupArn: BackupArn): DeleteBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupInput]
  }
  @scala.inline
  implicit class DeleteBackupInputOps[Self <: DeleteBackupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupArn(value: BackupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

