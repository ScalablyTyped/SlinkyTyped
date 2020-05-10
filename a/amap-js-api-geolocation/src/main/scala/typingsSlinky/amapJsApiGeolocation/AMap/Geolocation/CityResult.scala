package typingsSlinky.amapJsApiGeolocation.AMap.Geolocation

import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CityResult extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String = js.native
  /**
    * 范围
    */
  var bounds: js.Array[Double] = js.native
  /**
    * 中心点
    */
  var center: js.Tuple2[Double, Double] = js.native
  /**
    * 城市
    */
  var city: String = js.native
  /**
    * 城市编码
    */
  var citycode: String = js.native
  /**
    * 国家
    */
  var country: String = js.native
  /**
    * 状态信息
    */
  var info: String = js.native
  /**
    * 是否已转换成高德坐标
    */
  var isConverted: Boolean = js.native
  /**
    * 信息描述
    */
  var message: String = js.native
  /**
    * 省份
    */
  var province: String = js.native
  /**
    * 状态码
    */
  var status: `1` = js.native
}

object CityResult {
  @scala.inline
  def apply(
    adcode: String,
    bounds: js.Array[Double],
    center: js.Tuple2[Double, Double],
    city: String,
    citycode: String,
    country: String,
    info: String,
    isConverted: Boolean,
    message: String,
    province: String,
    status: `1`
  ): CityResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isConverted = isConverted.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityResult]
  }
  @scala.inline
  implicit class CityResultOps[Self <: CityResult] (val x: Self) extends AnyVal {
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
    def withBounds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
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
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

