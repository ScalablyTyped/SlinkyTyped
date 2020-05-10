package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionDescription extends js.Object {
  /**
    * The ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.native
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.LogStreamARN = js.native
  /**
    * The IAM ARN of the role to use to send application messages.   Provided for backward compatibility. Applications created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RoleARN] = js.native
}

object CloudWatchLoggingOptionDescription {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any])
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
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
  }
  
}

