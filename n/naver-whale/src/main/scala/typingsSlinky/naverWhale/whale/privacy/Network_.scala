package typingsSlinky.naverWhale.whale.privacy

import typingsSlinky.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network_ extends js.Object {
  var networkPredictionEnabled: ChromeSetting = js.native
  /** @since Chrome 48. */
  var webRTCIPHandlingPolicy: ChromeSetting = js.native
  /** @deprecated since Chrome 48. Please use privacy.network.webRTCIPHandlingPolicy. */
  var webRTCMultipleRoutesEnabled: ChromeSetting = js.native
  /** @deprecated since Chrome 48. Please use privacy.network.webRTCIPHandlingPolicy. */
  var webRTCNonProxiedUdpEnabled: ChromeSetting = js.native
}

object Network_ {
  @scala.inline
  def apply(
    networkPredictionEnabled: ChromeSetting,
    webRTCIPHandlingPolicy: ChromeSetting,
    webRTCMultipleRoutesEnabled: ChromeSetting,
    webRTCNonProxiedUdpEnabled: ChromeSetting
  ): Network_ = {
    val __obj = js.Dynamic.literal(networkPredictionEnabled = networkPredictionEnabled.asInstanceOf[js.Any], webRTCIPHandlingPolicy = webRTCIPHandlingPolicy.asInstanceOf[js.Any], webRTCMultipleRoutesEnabled = webRTCMultipleRoutesEnabled.asInstanceOf[js.Any], webRTCNonProxiedUdpEnabled = webRTCNonProxiedUdpEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network_]
  }
  @scala.inline
  implicit class Network_Ops[Self <: Network_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkPredictionEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPredictionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebRTCIPHandlingPolicy(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRTCIPHandlingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebRTCMultipleRoutesEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRTCMultipleRoutesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebRTCNonProxiedUdpEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRTCNonProxiedUdpEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

