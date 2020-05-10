package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserImportJobRequest extends js.Object {
  /**
    * The role ARN for the Amazon CloudWatch Logging role for the user import job.
    */
  var CloudWatchLogsRoleArn: ArnType = js.native
  /**
    * The job name for the user import job.
    */
  var JobName: UserImportJobNameType = js.native
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object CreateUserImportJobRequest {
  @scala.inline
  def apply(CloudWatchLogsRoleArn: ArnType, JobName: UserImportJobNameType, UserPoolId: UserPoolIdType): CreateUserImportJobRequest = {
    val __obj = js.Dynamic.literal(CloudWatchLogsRoleArn = CloudWatchLogsRoleArn.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserImportJobRequest]
  }
  @scala.inline
  implicit class CreateUserImportJobRequestOps[Self <: CreateUserImportJobRequest] (val x: Self) extends AnyVal {
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
    def withJobName(value: UserImportJobNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

