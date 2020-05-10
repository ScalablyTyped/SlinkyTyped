package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBandwidthRateLimitOutput extends js.Object {
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object UpdateBandwidthRateLimitOutput {
  @scala.inline
  def apply(): UpdateBandwidthRateLimitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBandwidthRateLimitOutput]
  }
  @scala.inline
  implicit class UpdateBandwidthRateLimitOutputOps[Self <: UpdateBandwidthRateLimitOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
  }
  
}

