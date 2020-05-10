package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReGeocode extends js.Object {
  var addressComponent: AddressComponent = js.native
  var crosses: js.Array[Cross] = js.native
  var formattedAddress: String = js.native
  var pois: js.Array[ReGeocodePoi] = js.native
  var roads: js.Array[Road] = js.native
}

object ReGeocode {
  @scala.inline
  def apply(
    addressComponent: AddressComponent,
    crosses: js.Array[Cross],
    formattedAddress: String,
    pois: js.Array[ReGeocodePoi],
    roads: js.Array[Road]
  ): ReGeocode = {
    val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocode]
  }
  @scala.inline
  implicit class ReGeocodeOps[Self <: ReGeocode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressComponent(value: AddressComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrosses(value: js.Array[Cross]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPois(value: js.Array[ReGeocodePoi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pois")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoads(value: js.Array[Road]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roads")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

