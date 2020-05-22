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

/**
  * Statistics of the network connection.
  *
  * If {@link getTransportStats} is called successfully, this interface provides the statistics.
  */
trait TransportStats extends js.Object {
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
    *
    * **Note**
    *
    * Chrome 61 or later is required for this function, and the compatibility is not guaranteed.
    * See [Network Information API](https://developer.mozilla.org/en-US/docs/Web/API/Network_Information_API) for details.
    */
  val NetworkType: js.UndefOr[
    bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED
  ] = js.undefined
  /** The estimated available bandwidth for sending the stream, in Kbps. */
  val OutgoingAvailableBandwidth: js.UndefOr[String] = js.undefined
  /** RTT (Round-Trip Time) between the SDK and the access node of the SD-RTN, in ms. */
  val RTT: js.UndefOr[String] = js.undefined
}

object TransportStats {
  @scala.inline
  def apply(
    NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED = null,
    OutgoingAvailableBandwidth: String = null,
    RTT: String = null
  ): TransportStats = {
    val __obj = js.Dynamic.literal()
    if (NetworkType != null) __obj.updateDynamic("NetworkType")(NetworkType.asInstanceOf[js.Any])
    if (OutgoingAvailableBandwidth != null) __obj.updateDynamic("OutgoingAvailableBandwidth")(OutgoingAvailableBandwidth.asInstanceOf[js.Any])
    if (RTT != null) __obj.updateDynamic("RTT")(RTT.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportStats]
  }
}

