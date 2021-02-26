package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRecoveryPointOutput extends StObject {
  
  /**
    * The size, in bytes, of a backup.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.native
  
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typingsSlinky.awsSdk.backupMod.BackupVaultName] = js.native
  
  /**
    * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps.
    */
  var CalculatedLifecycle: js.UndefOr[typingsSlinky.awsSdk.backupMod.CalculatedLifecycle] = js.native
  
  /**
    * The date and time that a job to create a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Contains identifying information about the creation of a recovery point, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan used to create it.
    */
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.native
  
  /**
    * The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The server-side encryption key used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.native
  
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  
  /**
    * A Boolean value that is returned as TRUE if the specified recovery point is encrypted, or FALSE if the recovery point is not encrypted.
    */
  var IsEncrypted: js.UndefOr[scala.Boolean] = js.native
  
  /**
    * The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC). The value of LastRestoreTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastRestoreTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typingsSlinky.awsSdk.backupMod.Lifecycle] = js.native
  
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  
  /**
    * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.native
  
  /**
    * The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.backupMod.ResourceType] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the source vault where the resource was originally backed up in; for example, arn:aws:backup:us-east-1:123456789012:vault:BackupVault. If the recovery is restored to the same AWS account or Region, this value will be null.
    */
  var SourceBackupVaultArn: js.UndefOr[ARN] = js.native
  
  /**
    * A status code specifying the state of the recovery point.  A partial status indicates that the recovery point was not successfully re-created and must be retried. 
    */
  var Status: js.UndefOr[RecoveryPointStatus] = js.native
  
  /**
    * Specifies the storage class of the recovery point. Valid values are WARM or COLD.
    */
  var StorageClass: js.UndefOr[typingsSlinky.awsSdk.backupMod.StorageClass] = js.native
}
object DescribeRecoveryPointOutput {
  
  @scala.inline
  def apply(): DescribeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecoveryPointOutput]
  }
  
  @scala.inline
  implicit class DescribeRecoveryPointOutputMutableBuilder[Self <: DescribeRecoveryPointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupSizeInBytes(value: Long_): Self = StObject.set(x, "BackupSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupSizeInBytesUndefined: Self = StObject.set(x, "BackupSizeInBytes", js.undefined)
    
    @scala.inline
    def setBackupVaultArn(value: ARN): Self = StObject.set(x, "BackupVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupVaultArnUndefined: Self = StObject.set(x, "BackupVaultArn", js.undefined)
    
    @scala.inline
    def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupVaultNameUndefined: Self = StObject.set(x, "BackupVaultName", js.undefined)
    
    @scala.inline
    def setCalculatedLifecycle(value: CalculatedLifecycle): Self = StObject.set(x, "CalculatedLifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedLifecycleUndefined: Self = StObject.set(x, "CalculatedLifecycle", js.undefined)
    
    @scala.inline
    def setCompletionDate(value: js.Date): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: RecoveryPointCreator): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setEncryptionKeyArn(value: ARN): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    @scala.inline
    def setIsEncrypted(value: scala.Boolean): Self = StObject.set(x, "IsEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEncryptedUndefined: Self = StObject.set(x, "IsEncrypted", js.undefined)
    
    @scala.inline
    def setLastRestoreTime(value: js.Date): Self = StObject.set(x, "LastRestoreTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRestoreTimeUndefined: Self = StObject.set(x, "LastRestoreTime", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setSourceBackupVaultArn(value: ARN): Self = StObject.set(x, "SourceBackupVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupVaultArnUndefined: Self = StObject.set(x, "SourceBackupVaultArn", js.undefined)
    
    @scala.inline
    def setStatus(value: RecoveryPointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
