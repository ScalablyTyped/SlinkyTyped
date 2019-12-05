package typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.UNSUPPORTED
import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.bluetooth
import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.cellular
import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.ethernet
import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.none
import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.other
import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.unknown
import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.wifi
import typingsSlinky.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.wimax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**  Statistics of the system network. */
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
  var NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED
}

object NetworkStats {
  @scala.inline
  def apply(NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): NetworkStats = {
    val __obj = js.Dynamic.literal(NetworkType = NetworkType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkStats]
  }
}

