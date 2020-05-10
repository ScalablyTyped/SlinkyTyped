package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressComponent extends js.Object {
  var city: String = js.native
  var district: String = js.native
  var province: String = js.native
  var street: String = js.native
  var streetNumber: String = js.native
}

object AddressComponent {
  @scala.inline
  def apply(city: String, district: String, province: String, street: String, streetNumber: String): AddressComponent = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent]
  }
  @scala.inline
  implicit class AddressComponentOps[Self <: AddressComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

