package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecoveryPointCreator extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.native
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  /**
    * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be edited.
    */
  var BackupPlanVersion: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies a rule used to schedule the backup of a selection of resources.
    */
  var BackupRuleId: js.UndefOr[String] = js.native
}

object RecoveryPointCreator {
  @scala.inline
  def apply(): RecoveryPointCreator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryPointCreator]
  }
  @scala.inline
  implicit class RecoveryPointCreatorOps[Self <: RecoveryPointCreator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlanArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanId")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupPlanVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupRuleId")(js.undefined)
        ret
    }
  }
  
}

