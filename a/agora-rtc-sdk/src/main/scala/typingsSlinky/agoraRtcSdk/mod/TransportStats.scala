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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics of the network connection.
  *
  * If {@link getTransportStats} is called successfully, this interface provides the statistics.
  */
@js.native
trait TransportStats extends StObject {
  
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
  ] = js.native
  
  /** The estimated available bandwidth for sending the stream, in Kbps. */
  val OutgoingAvailableBandwidth: js.UndefOr[String] = js.native
  
  /** RTT (Round-Trip Time) between the SDK and the access node of the SD-RTN, in ms. */
  val RTT: js.UndefOr[String] = js.native
}
object TransportStats {
  
  @scala.inline
  def apply(): TransportStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportStats]
  }
  
  @scala.inline
  implicit class TransportStatsMutableBuilder[Self <: TransportStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkType(value: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    @scala.inline
    def setOutgoingAvailableBandwidth(value: String): Self = StObject.set(x, "OutgoingAvailableBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingAvailableBandwidthUndefined: Self = StObject.set(x, "OutgoingAvailableBandwidth", js.undefined)
    
    @scala.inline
    def setRTT(value: String): Self = StObject.set(x, "RTT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTTUndefined: Self = StObject.set(x, "RTT", js.undefined)
  }
}
