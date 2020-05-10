package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeliveryChannelsResponse extends js.Object {
  /**
    * A list that contains the descriptions of the specified delivery channel.
    */
  var DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.native
}

object DescribeDeliveryChannelsResponse {
  @scala.inline
  def apply(): DescribeDeliveryChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelsResponse]
  }
  @scala.inline
  implicit class DescribeDeliveryChannelsResponseOps[Self <: DescribeDeliveryChannelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryChannels(value: DeliveryChannelList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryChannels")(js.undefined)
        ret
    }
  }
  
}

