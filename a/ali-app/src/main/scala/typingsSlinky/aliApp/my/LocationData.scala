package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.Address
import typingsSlinky.aliApp.anon.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 位置 https://docs.alipay.com/mini/api/location
@js.native
trait LocationData extends js.Object {
  /** 精确度，单位m */
  var accuracy: String = js.native
  /**
  		 * 城市(type>0生效)
  		 */
  var city: js.UndefOr[String] = js.native
  /**
  		 * 城市级别的地区代码(type>0生效)
  		 */
  var cityAdcode: js.UndefOr[String] = js.native
  /**
  		 * 国家(type>0生效)
  		 */
  var country: js.UndefOr[String] = js.native
  /**
  		 * 国家编号 (type>0生效)
  		 */
  var countryCode: js.UndefOr[String] = js.native
  /**
  		 * 区县(type>0生效)
  		 */
  var district: js.UndefOr[String] = js.native
  /**
  		 * 区县级别的地区代码(type>0生效)
  		 */
  var districtAdcode: js.UndefOr[String] = js.native
  /**
  		 * 水平精确度，单位m
  		 */
  var horizontalAccuracy: String = js.native
  /** 纬度 */
  var latitude: String = js.native
  /** 经度 */
  var longitude: String = js.native
  /**
  		 * 需要POI级别逆地理的才会有的字段, 定位点附近的 POI 信息，结构是：{ name, address } （type > 2生效）
  		 */
  var pois: js.UndefOr[js.Array[Address]] = js.native
  /**
  		 * 省份(type>0生效)
  		 */
  var province: js.UndefOr[String] = js.native
  /**
  		 * 需要街道级别逆地理的才会有的字段,街道门牌信息，结构是：{ street, number } (type > 1生效)
  		 */
  var streetNumber: js.UndefOr[Number] = js.native
}

object LocationData {
  @scala.inline
  def apply(accuracy: String, horizontalAccuracy: String, latitude: String, longitude: String): LocationData = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], horizontalAccuracy = horizontalAccuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
  @scala.inline
  implicit class LocationDataOps[Self <: LocationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalAccuracy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCityAdcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityAdcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCityAdcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityAdcode")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(js.undefined)
        ret
    }
    @scala.inline
    def withDistrictAdcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("districtAdcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistrictAdcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("districtAdcode")(js.undefined)
        ret
    }
    @scala.inline
    def withPois(value: js.Array[Address]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pois")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPois: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pois")(js.undefined)
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetNumber(value: Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetNumber")(js.undefined)
        ret
    }
  }
  
}

