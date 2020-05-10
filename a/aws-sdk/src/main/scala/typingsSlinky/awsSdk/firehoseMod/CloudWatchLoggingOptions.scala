package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptions extends js.Object {
  /**
    * Enables or disables CloudWatch logging.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The CloudWatch group name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogGroupName: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.LogGroupName] = js.native
  /**
    * The CloudWatch log stream name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogStreamName: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.LogStreamName] = js.native
}

object CloudWatchLoggingOptions {
  @scala.inline
  def apply(): CloudWatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLoggingOptions]
  }
  @scala.inline
  implicit class CloudWatchLoggingOptionsOps[Self <: CloudWatchLoggingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamName(value: LogStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStreamName")(js.undefined)
        ret
    }
  }
  
}

