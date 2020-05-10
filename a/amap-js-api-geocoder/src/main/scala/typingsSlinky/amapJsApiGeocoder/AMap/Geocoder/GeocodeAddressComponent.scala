package typingsSlinky.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeAddressComponent extends js.Object {
  /**
    * 楼/大厦
    */
  var building: String = js.native
  /**
    * 楼类型
    */
  var buildingType: String = js.native
  /**
    * 城市
    */
  var city: String = js.native
  /**
    * 城市编码
    */
  var citycode: String = js.native
  /**
    * 区
    */
  var district: String = js.native
  /**
    * 社区
    */
  var neighborhood: String = js.native
  /**
    * 社区类型
    */
  var neighborhoodType: String = js.native
  /**
    * 省
    */
  var province: String = js.native
  /**
    * 街道
    */
  var street: String = js.native
  /**
    * 门牌号
    */
  var streetNumber: String = js.native
  /**
    * 乡镇
    */
  var township: String = js.native
}

object GeocodeAddressComponent {
  @scala.inline
  def apply(
    building: String,
    buildingType: String,
    city: String,
    citycode: String,
    district: String,
    neighborhood: String,
    neighborhoodType: String,
    province: String,
    street: String,
    streetNumber: String,
    township: String
  ): GeocodeAddressComponent = {
    val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], neighborhoodType = neighborhoodType.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any], township = township.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeAddressComponent]
  }
  @scala.inline
  implicit class GeocodeAddressComponentOps[Self <: GeocodeAddressComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

