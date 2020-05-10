package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupRule extends js.Object {
  /**
    * A value in minutes after a backup job is successfully started before it must be completed or it is canceled by AWS Backup. This value is optional.
    */
  var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * An array of CopyAction objects, which contains the details of the copy operation.
    */
  var CopyActions: js.UndefOr[typingsSlinky.awsSdk.backupMod.CopyActions] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typingsSlinky.awsSdk.backupMod.Lifecycle] = js.native
  /**
    * An array of key-value pair strings that are assigned to resources that are associated with this rule when restored from backup.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.native
  /**
    * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
    */
  var RuleId: js.UndefOr[String] = js.native
  /**
    * An optional display name for a backup rule.
    */
  var RuleName: BackupRuleName = js.native
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.native
  /**
    * An optional value that specifies a period of time in minutes after a backup is scheduled before a job is canceled if it doesn't start successfully.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var TargetBackupVaultName: BackupVaultName = js.native
}

object BackupRule {
  @scala.inline
  def apply(RuleName: BackupRuleName, TargetBackupVaultName: BackupVaultName): BackupRule = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], TargetBackupVaultName = TargetBackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupRule]
  }
  @scala.inline
  implicit class BackupRuleOps[Self <: BackupRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleName(value: BackupRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetBackupVaultName(value: BackupVaultName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetBackupVaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionWindowMinutes(value: WindowMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionWindowMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionWindowMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionWindowMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyActions(value: CopyActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyActions")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycle(value: Lifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoveryPointTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryPointTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveryPointTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryPointTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleExpression(value: CronExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withStartWindowMinutes(value: WindowMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartWindowMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartWindowMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartWindowMinutes")(js.undefined)
        ret
    }
  }
  
}

