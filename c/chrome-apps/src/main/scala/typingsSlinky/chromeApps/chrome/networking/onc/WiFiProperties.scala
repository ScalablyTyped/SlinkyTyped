package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.networking.onc.internal.ObjectFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiFiProperties[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L] extends WiFiPropertiesBase[M, String | ManagedDOMString] {
  /**
    * Whether ARP polling of default gateway is allowed.
    * @default true
    */
  var AllowGatewayARPPolling: js.UndefOr[B] = js.native
  /** Whether the WiFi network should be connected automatically when in range. */
  var AutoConnect: js.UndefOr[B] = js.native
  /** The network EAP properties. Required for WEP-8021X and WPA-EAP networks. */
  var EAP: js.UndefOr[EAPProperties] = js.native
  /** Contains all operating frequency recently seen for the WiFi network. */
  var FrequencyList: js.UndefOr[js.Array[integer]] = js.native
  /** Whether the network SSID will be broadcast. */
  var HiddenSSID: js.UndefOr[B] = js.native
  /**
    * @since Chrome 66.
    * The passphrase for WEP/WPA/WPA2 connections.
    * *This property can only be set!*
    */
  var Passphrase: js.UndefOr[String] = js.native
  /** Signal-to-noise value (in dB) below which roaming to a new network should be attempted. */
  var RoamTreshold: js.UndefOr[L] = js.native
}

object WiFiProperties {
  @scala.inline
  def apply[M, OF, B, S, L](): WiFiProperties[M, OF, B, S, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiProperties[M, OF, B, S, L]]
  }
  @scala.inline
  implicit class WiFiPropertiesOps[Self[m, of, b, s, l] <: WiFiProperties[m, of, b, s, l], M, OF, B, S, L] (val x: Self[M, OF, B, S, L]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, OF, B, S, L] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, OF, B, S, L]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, OF, B, S, L]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, OF, B, S, L]) with Other]
    @scala.inline
    def withAllowGatewayARPPolling(value: B): Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowGatewayARPPolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGatewayARPPolling: Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowGatewayARPPolling")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoConnect(value: B): Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withEAP(value: EAPProperties): Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEAP: Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAP")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequencyList(value: js.Array[integer]): Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrequencyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequencyList: Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrequencyList")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenSSID(value: B): Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HiddenSSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenSSID: Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HiddenSSID")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withRoamTreshold(value: L): Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoamTreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoamTreshold: Self[M, OF, B, S, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoamTreshold")(js.undefined)
        ret
    }
  }
  
}

