package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
  /**
    * The dedicated IP address that you want to update the warm-up attributes for.
    */
  var Ip: typingsSlinky.awsSdk.pinpointemailMod.Ip = js.native
  /**
    * The warm-up percentage that you want to associate with the dedicated IP address.
    */
  var WarmupPercentage: Percentage100Wrapper = js.native
}

object PutDedicatedIpWarmupAttributesRequest {
  @scala.inline
  def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper): PutDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
  }
  @scala.inline
  implicit class PutDedicatedIpWarmupAttributesRequestOps[Self <: PutDedicatedIpWarmupAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: Ip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarmupPercentage(value: Percentage100Wrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmupPercentage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

