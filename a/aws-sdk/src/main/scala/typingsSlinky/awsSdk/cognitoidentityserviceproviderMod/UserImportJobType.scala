package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserImportJobType extends js.Object {
  /**
    * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.native
  /**
    * The date when the user import job was completed.
    */
  var CompletionDate: js.UndefOr[js.Date] = js.native
  /**
    * The message returned when the user import job is completed.
    */
  var CompletionMessage: js.UndefOr[CompletionMessageType] = js.native
  /**
    * The date the user import job was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The number of users that could not be imported.
    */
  var FailedUsers: js.UndefOr[LongType] = js.native
  /**
    * The number of users that were successfully imported.
    */
  var ImportedUsers: js.UndefOr[LongType] = js.native
  /**
    * The job ID for the user import job.
    */
  var JobId: js.UndefOr[UserImportJobIdType] = js.native
  /**
    * The job name for the user import job.
    */
  var JobName: js.UndefOr[UserImportJobNameType] = js.native
  /**
    * The pre-signed URL to be used to upload the .csv file.
    */
  var PreSignedUrl: js.UndefOr[PreSignedUrlType] = js.native
  /**
    * The number of users that were skipped.
    */
  var SkippedUsers: js.UndefOr[LongType] = js.native
  /**
    * The date when the user import job was started.
    */
  var StartDate: js.UndefOr[js.Date] = js.native
  /**
    * The status of the user import job. One of the following:    Created - The job was created but not started.    Pending - A transition state. You have started the job, but it has not begun importing users yet.    InProgress - The job has started, and users are being imported.    Stopping - You have stopped the job, but the job has not stopped importing users yet.    Stopped - You have stopped the job, and the job has stopped importing users.    Succeeded - The job has completed successfully.    Failed - The job has stopped due to an error.    Expired - You created a job, but did not start the job within 24-48 hours. All data associated with the job was deleted, and the job cannot be started.  
    */
  var Status: js.UndefOr[UserImportJobStatusType] = js.native
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object UserImportJobType {
  @scala.inline
  def apply(): UserImportJobType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserImportJobType]
  }
  @scala.inline
  implicit class UserImportJobTypeOps[Self <: UserImportJobType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLogsRoleArn(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsRoleArn")(js.undefined)
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
    def withCompletionMessage(value: CompletionMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionMessage")(js.undefined)
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
    def withFailedUsers(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withImportedUsers(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportedUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportedUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: UserImportJobIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobName(value: UserImportJobNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(js.undefined)
        ret
    }
    @scala.inline
    def withPreSignedUrl(value: PreSignedUrlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreSignedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreSignedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreSignedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippedUsers(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkippedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippedUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkippedUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: UserImportJobStatusType): Self = {
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
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
  }
  
}

