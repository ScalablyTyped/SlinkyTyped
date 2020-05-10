package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionUpdate extends js.Object {
  /**
    * ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id = js.native
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.native
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object CloudWatchLoggingOptionUpdate {
  @scala.inline
  def apply(CloudWatchLoggingOptionId: Id): CloudWatchLoggingOptionUpdate = {
    val __obj = js.Dynamic.literal(CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
  }
  @scala.inline
  implicit class CloudWatchLoggingOptionUpdateOps[Self <: CloudWatchLoggingOptionUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLoggingOptionId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogStreamARNUpdate(value: LogStreamARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStreamARNUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamARNUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStreamARNUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARNUpdate(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARNUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARNUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARNUpdate")(js.undefined)
        ret
    }
  }
  
}

