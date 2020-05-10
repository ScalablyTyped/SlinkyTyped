package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupVaultNotificationsOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  var BackupVaultEvents: js.UndefOr[typingsSlinky.awsSdk.backupMod.BackupVaultEvents] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typingsSlinky.awsSdk.backupMod.BackupVaultName] = js.native
  /**
    * An ARN that uniquely identifies an Amazon Simple Notification Service (Amazon SNS) topic; for example, arn:aws:sns:us-west-2:111122223333:MyTopic.
    */
  var SNSTopicArn: js.UndefOr[ARN] = js.native
}

object GetBackupVaultNotificationsOutput {
  @scala.inline
  def apply(): GetBackupVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupVaultNotificationsOutput]
  }
  @scala.inline
  implicit class GetBackupVaultNotificationsOutputOps[Self <: GetBackupVaultNotificationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupVaultArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupVaultArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupVaultEvents(value: BackupVaultEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupVaultEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupVaultName(value: BackupVaultName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupVaultName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultName")(js.undefined)
        ret
    }
    @scala.inline
    def withSNSTopicArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSNSTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSTopicArn")(js.undefined)
        ret
    }
  }
  
}

