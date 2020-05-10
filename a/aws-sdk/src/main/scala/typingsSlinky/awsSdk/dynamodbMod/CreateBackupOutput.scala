package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupOutput extends js.Object {
  /**
    * Contains the details of the backup created for the table.
    */
  var BackupDetails: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BackupDetails] = js.native
}

object CreateBackupOutput {
  @scala.inline
  def apply(): CreateBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupOutput]
  }
  @scala.inline
  implicit class CreateBackupOutputOps[Self <: CreateBackupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupDetails(value: BackupDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupDetails")(js.undefined)
        ret
    }
  }
  
}

