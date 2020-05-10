package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupOutput extends js.Object {
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupDescription] = js.native
}

object DescribeBackupOutput {
  @scala.inline
  def apply(): DescribeBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupOutput]
  }
  @scala.inline
  implicit class DescribeBackupOutputOps[Self <: DescribeBackupOutput] (val x: Self) extends AnyVal {
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

