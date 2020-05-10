package typingsSlinky.chrome.chrome.networking.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfo extends js.Object {
  /** Optional. The basic service set identification (BSSID) uniquely identifying the basic service set. BSSID is represented as a human readable, hex-encoded string with bytes separated by colons, e.g. 45:67:89:ab:cd:ef. */
  var BSSID: js.UndefOr[String] = js.native
  /** Optional. A unique identifier of the network. */
  var GUID: js.UndefOr[String] = js.native
  /** Optional. A hex-encoded byte sequence. */
  var HexSSID: js.UndefOr[String] = js.native
  /** Optional. The decoded SSID of the network (default encoding is UTF-8). To filter for non-UTF-8 SSIDs, use HexSSID instead. */
  var SSID: js.UndefOr[String] = js.native
  /** Optional. Identifier indicating the security type of the network. Valid values are None, WEP-PSK, WPA-PSK and WPA-EAP. */
  var Security: js.UndefOr[String] = js.native
  /** Currently only WiFi supported. */
  var Type: String = js.native
}

object NetworkInfo {
  @scala.inline
  def apply(Type: String): NetworkInfo = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBSSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BSSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBSSID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BSSID")(js.undefined)
        ret
    }
    @scala.inline
    def withGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(js.undefined)
        ret
    }
    @scala.inline
    def withHexSSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HexSSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexSSID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HexSSID")(js.undefined)
        ret
    }
    @scala.inline
    def withSSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSID")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Security")(js.undefined)
        ret
    }
  }
  
}

