package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotAnalyticsAction extends js.Object {
  /**
    * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
    */
  var channelArn: js.UndefOr[AwsArn] = js.native
  /**
    * The name of the IoT Analytics channel to which message data will be sent.
    */
  var channelName: js.UndefOr[ChannelName] = js.native
  /**
    * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT Analytics (iotanalytics:BatchPutMessage).
    */
  var roleArn: js.UndefOr[AwsArn] = js.native
}

object IotAnalyticsAction {
  @scala.inline
  def apply(): IotAnalyticsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IotAnalyticsAction]
  }
  @scala.inline
  implicit class IotAnalyticsActionOps[Self <: IotAnalyticsAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelArn(value: AwsArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelArn")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelName(value: ChannelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: AwsArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}

