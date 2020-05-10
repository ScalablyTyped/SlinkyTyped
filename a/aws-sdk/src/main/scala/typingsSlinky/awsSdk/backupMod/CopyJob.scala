package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyJob extends js.Object {
  /**
    * The size, in bytes, of a copy job.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.native
  /**
    * The date and time a job to create a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM. 
    */
  var CompletionDate: js.UndefOr[js.Date] = js.native
  /**
    * Uniquely identifies a request to AWS Backup to copy a resource.
    */
  var CopyJobId: js.UndefOr[String] = js.native
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.native
  /**
    * The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM. 
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var DestinationBackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * An ARN that uniquely identifies a destination recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45. 
    */
  var DestinationRecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * Specifies the IAM role ARN used to copy the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database. 
    */
  var ResourceArn: js.UndefOr[ARN] = js.native
  /**
    * The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database. 
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.backupMod.ResourceType] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault. 
    */
  var SourceBackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * An ARN that uniquely identifies a source recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45. 
    */
  var SourceRecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * The current state of a resource recovery point.
    */
  var State: js.UndefOr[CopyJobState] = js.native
  /**
    * A detailed message explaining the status of the job that to copy a resource.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object CopyJob {
  @scala.inline
  def apply(): CopyJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyJob]
  }
  @scala.inline
  implicit class CopyJobOps[Self <: CopyJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupSizeInBytes(value: Long_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: RecoveryPointCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(js.undefined)
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
    def withDestinationBackupVaultArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationBackupVaultArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationBackupVaultArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationBackupVaultArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationRecoveryPointArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRecoveryPointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationRecoveryPointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRecoveryPointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: IAMRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceBackupVaultArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackupVaultArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBackupVaultArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackupVaultArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRecoveryPointArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRecoveryPointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRecoveryPointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRecoveryPointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CopyJobState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
  }
  
}

