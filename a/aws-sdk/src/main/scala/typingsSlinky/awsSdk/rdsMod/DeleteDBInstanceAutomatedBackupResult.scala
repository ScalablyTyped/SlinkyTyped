package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBInstanceAutomatedBackupResult extends js.Object {
  var DBInstanceAutomatedBackup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBInstanceAutomatedBackup] = js.native
}

object DeleteDBInstanceAutomatedBackupResult {
  @scala.inline
  def apply(): DeleteDBInstanceAutomatedBackupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupResult]
  }
  @scala.inline
  implicit class DeleteDBInstanceAutomatedBackupResultOps[Self <: DeleteDBInstanceAutomatedBackupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBInstanceAutomatedBackup(value: DBInstanceAutomatedBackup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceAutomatedBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceAutomatedBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceAutomatedBackup")(js.undefined)
        ret
    }
  }
  
}

