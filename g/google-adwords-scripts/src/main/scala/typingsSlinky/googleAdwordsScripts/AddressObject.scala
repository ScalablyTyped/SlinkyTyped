package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressObject extends js.Object {
  var cityName: String = js.native
  var countryCode: String = js.native
  var postalCode: String = js.native
  var provinceCode: String = js.native
  var provinceName: String = js.native
  var streetAddress: String = js.native
  var streetAddress2: String = js.native
}

object AddressObject {
  @scala.inline
  def apply(
    cityName: String,
    countryCode: String,
    postalCode: String,
    provinceCode: String,
    provinceName: String,
    streetAddress: String,
    streetAddress2: String
  ): AddressObject = {
    val __obj = js.Dynamic.literal(cityName = cityName.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], provinceCode = provinceCode.asInstanceOf[js.Any], provinceName = provinceName.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any], streetAddress2 = streetAddress2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressObject]
  }
  @scala.inline
  implicit class AddressObjectOps[Self <: AddressObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvinceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provinceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvinceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provinceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetAddress2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

