package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressComponent extends js.Object {
  /** is the full text description or name of the address component as returned by the Geocoder. */
  var long_name: String = js.native
  /**
    * is an abbreviated textual name for the address component, if available.
    * For example, an address component for the state of Alaska may have a `long_name` of "Alaska" and a `short_name` of "AK"
    * using the 2-letter postal abbreviation.
    */
  var short_name: String = js.native
  /** is an array indicating the *type* of the address component. */
  var types: js.Array[AddressType | GeocodingAddressComponentType] = js.native
}

object AddressComponent {
  @scala.inline
  def apply(
    long_name: String,
    short_name: String,
    types: js.Array[AddressType | GeocodingAddressComponentType]
  ): AddressComponent = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent]
  }
  @scala.inline
  implicit class AddressComponentOps[Self <: AddressComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLong_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[AddressType | GeocodingAddressComponentType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

