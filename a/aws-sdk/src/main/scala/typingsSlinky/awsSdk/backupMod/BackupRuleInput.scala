package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupRuleInput extends js.Object {
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * An array of CopyAction objects, which contains the details of the copy operation.
    */
  var CopyActions: js.UndefOr[typingsSlinky.awsSdk.backupMod.CopyActions] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days”. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typingsSlinky.awsSdk.backupMod.Lifecycle] = js.native
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.native
  /**
    * &gt;An optional display name for a backup rule.
    */
  var RuleName: BackupRuleName = js.native
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.native
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var TargetBackupVaultName: BackupVaultName = js.native
}

object BackupRuleInput {
  @scala.inline
  def apply(RuleName: BackupRuleName, TargetBackupVaultName: BackupVaultName): BackupRuleInput = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], TargetBackupVaultName = TargetBackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupRuleInput]
  }
  @scala.inline
  implicit class BackupRuleInputOps[Self <: BackupRuleInput] (val x: Self) extends AnyVal {
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

