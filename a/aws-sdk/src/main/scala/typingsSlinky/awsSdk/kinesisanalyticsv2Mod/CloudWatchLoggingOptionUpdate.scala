package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionUpdate extends js.Object {
  /**
    * The ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id = js.native
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.native
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
  }
  
}

