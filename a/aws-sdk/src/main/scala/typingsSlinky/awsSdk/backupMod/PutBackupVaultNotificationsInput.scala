package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBackupVaultNotificationsInput extends js.Object {
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  var BackupVaultEvents: typingsSlinky.awsSdk.backupMod.BackupVaultEvents = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsSlinky.awsSdk.backupMod.BackupVaultName = js.native
  /**
    * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example, arn:aws:sns:us-west-2:111122223333:MyVaultTopic.
    */
  var SNSTopicArn: ARN = js.native
}

object PutBackupVaultNotificationsInput {
  @scala.inline
  def apply(BackupVaultEvents: BackupVaultEvents, BackupVaultName: BackupVaultName, SNSTopicArn: ARN): PutBackupVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(BackupVaultEvents = BackupVaultEvents.asInstanceOf[js.Any], BackupVaultName = BackupVaultName.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBackupVaultNotificationsInput]
  }
  @scala.inline
  implicit class PutBackupVaultNotificationsInputOps[Self <: PutBackupVaultNotificationsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupVaultEvents(value: BackupVaultEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupVaultName(value: BackupVaultName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupVaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSNSTopicArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

