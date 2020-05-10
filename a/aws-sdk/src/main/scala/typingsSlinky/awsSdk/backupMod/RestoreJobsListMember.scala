package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreJobsListMember extends js.Object {
  /**
    * The size, in bytes, of the restored resource.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.native
  /**
    * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[js.Date] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var CreatedResourceArn: js.UndefOr[ARN] = js.native
  /**
    * The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The amount of time in minutes that a job restoring a recovery point is expected to take.
    */
  var ExpectedCompletionTimeMinutes: js.UndefOr[Long_] = js.native
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * Contains an estimated percentage complete of a job at the time the job status was queried.
    */
  var PercentDone: js.UndefOr[String] = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: js.UndefOr[String] = js.native
  /**
    * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
    */
  var Status: js.UndefOr[RestoreJobStatus] = js.native
  /**
    * A detailed message explaining the status of the job to restore a recovery point.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object RestoreJobsListMember {
  @scala.inline
  def apply(): RestoreJobsListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreJobsListMember]
  }
  @scala.inline
  implicit class RestoreJobsListMemberOps[Self <: RestoreJobsListMember] (val x: Self) extends AnyVal {
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
    def withCreatedResourceArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedResourceArn")(js.undefined)
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
    def withExpectedCompletionTimeMinutes(value: Long_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedCompletionTimeMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedCompletionTimeMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedCompletionTimeMinutes")(js.undefined)
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
    def withPercentDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentDone")(js.undefined)
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
    def withRestoreJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: RestoreJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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

