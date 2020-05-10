package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBandwidthRateLimitInput extends js.Object {
  /**
    * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete. Valid Values: Upload, Download, All.
    */
  var BandwidthType: typingsSlinky.awsSdk.storagegatewayMod.BandwidthType = js.native
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object DeleteBandwidthRateLimitInput {
  @scala.inline
  def apply(BandwidthType: BandwidthType, GatewayARN: GatewayARN): DeleteBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(BandwidthType = BandwidthType.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBandwidthRateLimitInput]
  }
  @scala.inline
  implicit class DeleteBandwidthRateLimitInputOps[Self <: DeleteBandwidthRateLimitInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidthType(value: BandwidthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BandwidthType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

