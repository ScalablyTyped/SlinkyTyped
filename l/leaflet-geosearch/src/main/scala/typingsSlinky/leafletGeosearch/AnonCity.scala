package typingsSlinky.leafletGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCity extends js.Object {
  var city: String = js.native
  var country: String = js.native
  var country_code: String = js.native
  var county: String = js.native
  var house_number: String = js.native
  var postcode: String = js.native
  var road: String = js.native
  var state: String = js.native
  var state_district: String = js.native
  var town: String = js.native
}

object AnonCity {
  @scala.inline
  def apply(
    city: String,
    country: String,
    country_code: String,
    county: String,
    house_number: String,
    postcode: String,
    road: String,
    state: String,
    state_district: String,
    town: String
  ): AnonCity = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], house_number = house_number.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], state_district = state_district.asInstanceOf[js.Any], town = town.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCity]
  }
  @scala.inline
  implicit class AnonCityOps[Self <: AnonCity] (val x: Self) extends AnyVal {
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
    def withCountry_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHouse_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("house_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("road")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState_district(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state_district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("town")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

