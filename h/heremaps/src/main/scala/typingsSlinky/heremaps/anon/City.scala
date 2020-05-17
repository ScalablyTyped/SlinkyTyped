package typingsSlinky.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait City extends js.Object {
  var city: String = js.native
  var country: String = js.native
  var countryCode: String = js.native
  var county: String = js.native
  var district: String = js.native
  var house: String = js.native
  var postalCode: String = js.native
  var stateCode: String = js.native
  var street: String = js.native
  var text: String = js.native
}

object City {
  @scala.inline
  def apply(
    city: String,
    country: String,
    countryCode: String,
    county: String,
    district: String,
    house: String,
    postalCode: String,
    stateCode: String,
    street: String,
    text: String
  ): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], house = house.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], stateCode = stateCode.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  @scala.inline
  implicit class CityOps[Self <: City] (val x: Self) extends AnyVal {
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
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHouse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("house")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

