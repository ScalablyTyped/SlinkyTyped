package typingsSlinky.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait City extends js.Object {
  var city: String = js.native
  var citycode: String = js.native
  var district: String = js.native
  var provice: String = js.native
}

object City {
  @scala.inline
  def apply(city: String, citycode: String, district: String, provice: String): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], provice = provice.asInstanceOf[js.Any])
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
    def withProvice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

