package typingsSlinky.amapJsApiGeocoder.AMap.Geocoder

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geocode extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String = js.native
  /**
    * 地址组成元素
    */
  var addressComponent: GeocodeAddressComponent = js.native
  /**
    * 格式化地址
    */
  var formattedAddress: String = js.native
  /**
    * 给定地址匹配级别
    */
  var level: String = js.native
  /**
    * 坐标
    */
  var location: LngLat = js.native
}

object Geocode {
  @scala.inline
  def apply(
    adcode: String,
    addressComponent: GeocodeAddressComponent,
    formattedAddress: String,
    level: String,
    location: LngLat
  ): Geocode = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], addressComponent = addressComponent.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocode]
  }
  @scala.inline
  implicit class GeocodeOps[Self <: Geocode] (val x: Self) extends AnyVal {
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
    def withAddressComponent(value: GeocodeAddressComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

