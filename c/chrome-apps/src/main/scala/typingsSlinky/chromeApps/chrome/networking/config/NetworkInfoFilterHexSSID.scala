package typingsSlinky.chromeApps.chrome.networking.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfoFilterHexSSID extends js.Object {
  /**
    * A hex-encoded byte sequence.
    */
  var HexSSID: js.UndefOr[String] = js.native
}

object NetworkInfoFilterHexSSID {
  @scala.inline
  def apply(): NetworkInfoFilterHexSSID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfoFilterHexSSID]
  }
  @scala.inline
  implicit class NetworkInfoFilterHexSSIDOps[Self <: NetworkInfoFilterHexSSID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

