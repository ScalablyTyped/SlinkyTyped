package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBackupPlanInput extends js.Object {
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: BackupPlanInput = js.native
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String = js.native
}

object UpdateBackupPlanInput {
  @scala.inline
  def apply(BackupPlan: BackupPlanInput, BackupPlanId: String): UpdateBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlan = BackupPlan.asInstanceOf[js.Any], BackupPlanId = BackupPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackupPlanInput]
  }
  @scala.inline
  implicit class UpdateBackupPlanInputOps[Self <: UpdateBackupPlanInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlan(value: BackupPlanInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

