package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupInput extends js.Object {
  /**
    * Specified name for the backup.
    */
  var BackupName: typingsSlinky.awsSdk.dynamodbMod.BackupName = js.native
  /**
    * The name of the table.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}

object CreateBackupInput {
  @scala.inline
  def apply(BackupName: BackupName, TableName: TableName): CreateBackupInput = {
    val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupInput]
  }
  @scala.inline
  implicit class CreateBackupInputOps[Self <: CreateBackupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupName(value: BackupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

