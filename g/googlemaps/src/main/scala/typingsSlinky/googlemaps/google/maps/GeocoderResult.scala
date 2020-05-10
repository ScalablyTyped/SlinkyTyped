package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocoderResult extends js.Object {
  var address_components: js.Array[GeocoderAddressComponent] = js.native
  var formatted_address: String = js.native
  var geometry: GeocoderGeometry = js.native
  var partial_match: Boolean = js.native
  var place_id: String = js.native
  var postcode_localities: js.Array[String] = js.native
  var types: js.Array[String] = js.native
}

object GeocoderResult {
  @scala.inline
  def apply(
    address_components: js.Array[GeocoderAddressComponent],
    formatted_address: String,
    geometry: GeocoderGeometry,
    partial_match: Boolean,
    place_id: String,
    postcode_localities: js.Array[String],
    types: js.Array[String]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], partial_match = partial_match.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], postcode_localities = postcode_localities.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResult]
  }
  @scala.inline
  implicit class GeocoderResultOps[Self <: GeocoderResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress_components(value: js.Array[GeocoderAddressComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatted_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: GeocoderGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartial_match(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode_localities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode_localities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

