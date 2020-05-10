package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiFiPropertiesBase[M /* <: ManagedObject */, S] extends js.Object {
  /** The BSSID of the associated access point.. */
  var BSSID: js.UndefOr[String] = js.native
  /**
    * The WiFi service operating frequency in MHz.
    * For connected networks, the current frequency on which the network is connected.
    * Otherwise, the frequency of the best available BSS.
    */
  var Frequency: js.UndefOr[integer] = js.native
  /** HEX-encoded copy of the network SSID. */
  var HexSSID: js.UndefOr[S] = js.native
  /** The network SSID. */
  var SSID: js.UndefOr[S] = js.native
  /** The network security type. */
  var Security: js.UndefOr[S] = js.native
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.native
  /**
    * @since Chrome 70
    * @description The tethering state associated with the connection.
    */
  var TetheringState: js.UndefOr[String] = js.native
}

object WiFiPropertiesBase {
  @scala.inline
  def apply[M, S](): WiFiPropertiesBase[M, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiPropertiesBase[M, S]]
  }
  @scala.inline
  implicit class WiFiPropertiesBaseOps[Self[m, s] <: WiFiPropertiesBase[m, s], M, S] (val x: Self[M, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, S]) with Other]
    @scala.inline
    def withBSSID(value: String): Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BSSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBSSID: Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BSSID")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: integer): Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withHexSSID(value: S): Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HexSSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexSSID: Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HexSSID")(js.undefined)
        ret
    }
    @scala.inline
    def withSSID(value: S): Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSID: Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSID")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: S): Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Security")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalStrength(value: integer): Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalStrength: Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalStrength")(js.undefined)
        ret
    }
    @scala.inline
    def withTetheringState(value: String): Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TetheringState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTetheringState: Self[M, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TetheringState")(js.undefined)
        ret
    }
  }
  
}

