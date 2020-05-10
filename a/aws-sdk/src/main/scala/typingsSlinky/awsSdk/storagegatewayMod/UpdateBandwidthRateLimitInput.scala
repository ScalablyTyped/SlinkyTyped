package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBandwidthRateLimitInput extends js.Object {
  /**
    * The average download bandwidth rate limit in bits per second.
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.native
  /**
    * The average upload bandwidth rate limit in bits per second.
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.native
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object UpdateBandwidthRateLimitInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): UpdateBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBandwidthRateLimitInput]
  }
  @scala.inline
  implicit class UpdateBandwidthRateLimitInputOps[Self <: UpdateBandwidthRateLimitInput] (val x: Self) extends AnyVal {
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
    def withAverageDownloadRateLimitInBitsPerSec(value: BandwidthDownloadRateLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageDownloadRateLimitInBitsPerSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageDownloadRateLimitInBitsPerSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageDownloadRateLimitInBitsPerSec")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageUploadRateLimitInBitsPerSec(value: BandwidthUploadRateLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageUploadRateLimitInBitsPerSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageUploadRateLimitInBitsPerSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageUploadRateLimitInBitsPerSec")(js.undefined)
        ret
    }
  }
  
}

