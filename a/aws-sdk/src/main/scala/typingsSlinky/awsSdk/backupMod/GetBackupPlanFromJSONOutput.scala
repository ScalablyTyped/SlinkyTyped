package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupPlanFromJSONOutput extends js.Object {
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: js.UndefOr[typingsSlinky.awsSdk.backupMod.BackupPlan] = js.native
}

object GetBackupPlanFromJSONOutput {
  @scala.inline
  def apply(): GetBackupPlanFromJSONOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanFromJSONOutput]
  }
  @scala.inline
  implicit class GetBackupPlanFromJSONOutputOps[Self <: GetBackupPlanFromJSONOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlan(value: BackupPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlan")(js.undefined)
        ret
    }
  }
  
}

