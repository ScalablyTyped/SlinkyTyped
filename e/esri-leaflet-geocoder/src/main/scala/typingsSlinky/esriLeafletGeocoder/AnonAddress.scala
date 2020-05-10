package typingsSlinky.esriLeafletGeocoder

import typingsSlinky.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddress extends js.Object {
  var address: String = js.native
  var latlng: LatLng_ = js.native
}

object AnonAddress {
  @scala.inline
  def apply(address: String, latlng: LatLng_): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
  @scala.inline
  implicit class AnonAddressOps[Self <: AnonAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatlng(value: LatLng_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latlng")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

