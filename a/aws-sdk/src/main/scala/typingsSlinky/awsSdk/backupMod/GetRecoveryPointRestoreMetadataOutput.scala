package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecoveryPointRestoreMetadataOutput extends StObject {
  
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  
  /**
    * The set of metadata key-value pairs that describe the original configuration of the backed-up resource. These values vary depending on the service that is being restored.
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
  implicit class GetRecoveryPointRestoreMetadataOutputMutableBuilder[Self <: GetRecoveryPointRestoreMetadataOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupVaultArn(value: ARN): Self = StObject.set(x, "BackupVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupVaultArnUndefined: Self = StObject.set(x, "BackupVaultArn", js.undefined)
    
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
    
    @scala.inline
    def setRestoreMetadata(value: Metadata): Self = StObject.set(x, "RestoreMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreMetadataUndefined: Self = StObject.set(x, "RestoreMetadata", js.undefined)
  }
}
