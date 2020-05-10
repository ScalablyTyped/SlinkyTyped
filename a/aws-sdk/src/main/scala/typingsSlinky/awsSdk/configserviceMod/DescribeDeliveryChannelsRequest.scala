package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeliveryChannelsRequest extends js.Object {
  /**
    * A list of delivery channel names.
    */
  var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.native
}

object DescribeDeliveryChannelsRequest {
  @scala.inline
  def apply(): DescribeDeliveryChannelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelsRequest]
  }
  @scala.inline
  implicit class DescribeDeliveryChannelsRequestOps[Self <: DescribeDeliveryChannelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryChannelNames(value: DeliveryChannelNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryChannelNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryChannelNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryChannelNames")(js.undefined)
        ret
    }
  }
  
}

