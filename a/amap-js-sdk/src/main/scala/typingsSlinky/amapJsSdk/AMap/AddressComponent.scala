package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressComponent extends js.Object {
  var adcode: String = js.native
  var building: String = js.native
  var buildingType: String = js.native
  var businessAreas: js.Array[BusinessArea] = js.native
  var city: String = js.native
  var citycode: String = js.native
  var district: String = js.native
  var neighborhood: String = js.native
  var neighborhoodType: String = js.native
  var province: String = js.native
  var street: String = js.native
  var streetNumber: String = js.native
  var township: String = js.native
}

object AddressComponent {
  @scala.inline
  def apply(
    adcode: String,
    building: String,
    buildingType: String,
    businessAreas: js.Array[BusinessArea],
    city: String,
    citycode: String,
    district: String,
    neighborhood: String,
    neighborhoodType: String,
    province: String,
    street: String,
    streetNumber: String,
    township: String
  ): AddressComponent = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], building = building.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], businessAreas = businessAreas.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], neighborhoodType = neighborhoodType.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any], township = township.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent]
  }
  @scala.inline
  implicit class AddressComponentOps[Self <: AddressComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuilding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("building")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusinessAreas(value: js.Array[BusinessArea]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessAreas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCitycode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("citycode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeighborhood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborhood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeighborhoodType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborhoodType")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTownship(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("township")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

