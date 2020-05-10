package typingsSlinky.agoraRtcSdk.mod

import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.UNSUPPORTED
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.bluetooth
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.cellular
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.ethernet
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.none
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.other
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.unknown
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.wifi
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.wimax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**  Statistics of the system network. */
@js.native
trait NetworkStats extends js.Object {
  /**
    * Network type.
    *
    * - "bluetooth": Bluetooth network.
    * - "cellular": Cellular network.
    * - "ethernet": Ethernet.
    * - "none": No network.
    * - "wifi": Wi-Fi.
    * - "wimax": WiMax.
    * - "other": Other network type.
    * - "unknown": Unknown network type.
    * - "UNSUPPORTED": The browser does not support getting the network type.
    */
  var NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED = js.native
}

object NetworkStats {
  @scala.inline
  def apply(NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): NetworkStats = {
    val __obj = js.Dynamic.literal(NetworkType = NetworkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkStats]
  }
  @scala.inline
  implicit class NetworkStatsOps[Self <: NetworkStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkType(value: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

