package typingsSlinky.amapJsApiGeolocation.AMap.Geolocation

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.Cross
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.ReGeocode
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.ReGeocodeAddressComponent
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.ReGeocodePoi
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.Road
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationResult extends ReGeocode {
  /**
    * 精度
    */
  var accuracy: Double | Null = js.native
  /**
    * 状态信息
    */
  var info: String = js.native
  /**
    * 是否已经转换成高德坐标
    */
  var isConverted: Boolean = js.native
  /**
    * 定位结果的来源
    */
  var location_type: LocationType = js.native
  /**
    * 形成当前定位结果的一些信息
    */
  var message: String = js.native
  /**
    * 定位结果
    */
  var position: LngLat = js.native
  /**
    * 状态码
    */
  var status: `1` = js.native
}

object GeolocationResult {
  @scala.inline
  def apply(
    addressComponent: ReGeocodeAddressComponent,
    crosses: js.Array[Cross],
    formattedAddress: String,
    info: String,
    isConverted: Boolean,
    location_type: LocationType,
    message: String,
    pois: js.Array[ReGeocodePoi],
    position: LngLat,
    roads: js.Array[Road],
    status: `1`
  ): GeolocationResult = {
    val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isConverted = isConverted.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationResult]
  }
  @scala.inline
  implicit class GeolocationResultOps[Self <: GeolocationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLocation_type(value: LocationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccuracyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(null)
        ret
    }
  }
  
}

