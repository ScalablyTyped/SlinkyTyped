package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogPublishingOption extends js.Object {
  var CloudWatchLogsLogGroupArn: js.UndefOr[typingsSlinky.awsSdk.esMod.CloudWatchLogsLogGroupArn] = js.native
  /**
    *  Specifies whether given log publishing option is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object LogPublishingOption {
  @scala.inline
  def apply(): LogPublishingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOption]
  }
  @scala.inline
  implicit class LogPublishingOptionOps[Self <: LogPublishingOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLogsLogGroupArn(value: CloudWatchLogsLogGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsLogGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsLogGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsLogGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
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
  }
  
}

