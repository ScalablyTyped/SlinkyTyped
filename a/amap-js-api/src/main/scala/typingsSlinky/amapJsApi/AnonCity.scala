package typingsSlinky.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCity extends js.Object {
  /**
    * 市名称
    */
  var city: String = js.native
  /**
    * 市代码
    */
  var citycode: String = js.native
  /**
    * 区名称
    */
  var district: String = js.native
  /**
    * 省
    */
  var province: String | js.Array[scala.Nothing] = js.native
}

object AnonCity {
  @scala.inline
  def apply(city: String, citycode: String, district: String, province: String | js.Array[scala.Nothing]): AnonCity = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
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
    def withProvince(value: String | js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

