package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionDescription extends js.Object {
  /**
    * ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.native
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typingsSlinky.awsSdk.kinesisanalyticsMod.LogStreamARN = js.native
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARN: typingsSlinky.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}

object CloudWatchLoggingOptionDescription {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN, RoleARN: RoleARN): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
  }
  @scala.inline
  implicit class CloudWatchLoggingOptionDescriptionOps[Self <: CloudWatchLoggingOptionDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogStreamARN(value: LogStreamARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudWatchLoggingOptionId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLoggingOptionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionId")(js.undefined)
        ret
    }
  }
  
}

