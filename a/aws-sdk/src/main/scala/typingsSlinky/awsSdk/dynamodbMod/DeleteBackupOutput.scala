package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupOutput extends js.Object {
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BackupDescription] = js.native
}

object DeleteBackupOutput {
  @scala.inline
  def apply(): DeleteBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupOutput]
  }
  @scala.inline
  implicit class DeleteBackupOutputOps[Self <: DeleteBackupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupDescription(value: BackupDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupDescription")(js.undefined)
        ret
    }
  }
  
}

