package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: typingsSlinky.awsSdk.dynamodbMod.BackupArn = js.native
}

object DescribeBackupInput {
  @scala.inline
  def apply(BackupArn: BackupArn): DescribeBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupInput]
  }
  @scala.inline
  implicit class DescribeBackupInputOps[Self <: DescribeBackupInput] (val x: Self) extends AnyVal {
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

