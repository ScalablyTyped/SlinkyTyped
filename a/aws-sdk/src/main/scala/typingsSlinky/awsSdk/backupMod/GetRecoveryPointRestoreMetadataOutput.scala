package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecoveryPointRestoreMetadataOutput extends js.Object {
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * The set of metadata key-value pairs that describes the original configuration of the backed-up resource. These values vary depending on the service that is being restored.
    */
  var RestoreMetadata: js.UndefOr[Metadata] = js.native
}

object GetRecoveryPointRestoreMetadataOutput {
  @scala.inline
  def apply(): GetRecoveryPointRestoreMetadataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecoveryPointRestoreMetadataOutput]
  }
  @scala.inline
  implicit class GetRecoveryPointRestoreMetadataOutputOps[Self <: GetRecoveryPointRestoreMetadataOutput] (val x: Self) extends AnyVal {
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
    def withRecoveryPointArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryPointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveryPointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryPointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreMetadata")(js.undefined)
        ret
    }
  }
  
}

