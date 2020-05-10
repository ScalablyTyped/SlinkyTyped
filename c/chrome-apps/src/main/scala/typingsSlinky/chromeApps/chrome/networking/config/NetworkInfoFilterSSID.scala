package typingsSlinky.chromeApps.chrome.networking.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfoFilterSSID extends js.Object {
  /**
    * The decoded SSID of the network (default encoding is UTF-8).
    * To filter for non-UTF-8 SSIDs, use HexSSID instead.
    */
  var SSID: js.UndefOr[String] = js.native
}

object NetworkInfoFilterSSID {
  @scala.inline
  def apply(): NetworkInfoFilterSSID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfoFilterSSID]
  }
  @scala.inline
  implicit class NetworkInfoFilterSSIDOps[Self <: NetworkInfoFilterSSID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

