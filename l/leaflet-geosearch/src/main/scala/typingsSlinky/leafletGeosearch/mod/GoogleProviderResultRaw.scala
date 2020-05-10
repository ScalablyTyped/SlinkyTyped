package typingsSlinky.leafletGeosearch.mod

import typingsSlinky.leafletGeosearch.AnonLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleProviderResultRaw extends js.Object {
  var address_components: js.Array[GoogleProviderResultAddressComponent] = js.native
  var formatted_address: String = js.native
  var geometry: AnonLocation = js.native
  var place_id: String = js.native
  var types: js.Array[String] = js.native
}

object GoogleProviderResultRaw {
  @scala.inline
  def apply(
    address_components: js.Array[GoogleProviderResultAddressComponent],
    formatted_address: String,
    geometry: AnonLocation,
    place_id: String,
    types: js.Array[String]
  ): GoogleProviderResultRaw = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderResultRaw]
  }
  @scala.inline
  implicit class GoogleProviderResultRawOps[Self <: GoogleProviderResultRaw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress_components(value: js.Array[GoogleProviderResultAddressComponent]): Self = {
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
    def withGeometry(value: AnonLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place_id")(value.asInstanceOf[js.Any])
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

