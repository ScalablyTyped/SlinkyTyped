package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupVaultOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[String] = js.native
  /**
    * The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  /**
    * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.native
  /**
    * The number of recovery points that are stored in a backup vault.
    */
  var NumberOfRecoveryPoints: js.UndefOr[long] = js.native
}

object DescribeBackupVaultOutput {
  @scala.inline
  def apply(): DescribeBackupVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupVaultOutput]
  }
  @scala.inline
  implicit class DescribeBackupVaultOutputOps[Self <: DescribeBackupVaultOutput] (val x: Self) extends AnyVal {
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
    def withBackupVaultName(value: String): Self = {
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
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKeyArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfRecoveryPoints(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfRecoveryPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRecoveryPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfRecoveryPoints")(js.undefined)
        ret
    }
  }
  
}

