package typingsSlinky.amapJsApiGeolocation.AMap.Geolocation

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.all
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 是否PC端为优先使用浏览器定位
    */
  var GeoLocationFirst: js.UndefOr[Boolean] = js.native
  /**
    * 自定义定位按钮的内容
    */
  var buttonDom: js.UndefOr[String | HTMLElement] = js.native
  /**
    * 按钮距离停靠位置的偏移量
    */
  var buttonOffset: js.UndefOr[Pixel] = js.native
  /**
    * 定位按钮可停靠的位置
    * “LT”：左上角
    * “LB”：左下角
    * “RT”：右上角
    * “RB”：右下角
    */
  var buttonPosition: js.UndefOr[ButtonPosition] = js.native
  /**
    * 定位点Circle的配置
    */
  var circleOptions: js.UndefOr[typingsSlinky.amapJsApi.AMap.Circle.Options[_]] = js.native
  /**
    * 是否转换成高德坐标
    */
  var convert: js.UndefOr[Boolean] = js.native
  // internal
  var convertUrl: js.UndefOr[String] = js.native
  /**
    * 是否使用高精度
    */
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  /**
    * 是否返回详细信息
    */
  var extensions: js.UndefOr[all | base] = js.native
  /**
    * 定位点Marker的配置
    */
  var markerOptions: js.UndefOr[typingsSlinky.amapJsApi.AMap.Marker.Options[_]] = js.native
  /**
    * 缓存毫秒数
    */
  var maximumAge: js.UndefOr[Double] = js.native
  /**
    * 是否禁止使用浏览器Geolocation定位，默认值为0
    * 0: 可以使用浏览器定位
    * 1: 手机设备禁止使用浏览器定位
    * 2: PC上禁止使用浏览器定位
    * 3: 所有终端禁止使用浏览器定位
    */
  var noGeoLocation: js.UndefOr[Double] = js.native
  /**
    * 是否禁止使用IP定位，默认值为0
    * 0: 可以使用IP定位
    * 1: 手机设备禁止使用IP定位
    * 2: PC上禁止使用IP定位
    * 3: 所有终端禁止使用IP定位
    */
  var noIpLocate: js.UndefOr[Double] = js.native
  /**
    * 定位成功后，是否把定位得到的坐标设置为地图中心点坐标
    */
  var panToLocation: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示定位按钮
    */
  var showButton: js.UndefOr[Boolean] = js.native
  /**
    * 定位成功并且有精度信息时，是否用一个圆圈circle表示精度范围
    */
  var showCircle: js.UndefOr[Boolean] = js.native
  /**
    * 定位成功时是否在定位位置显示一个Marker
    */
  var showMarker: js.UndefOr[Boolean] = js.native
  var stopWhenPermissionDenied: js.UndefOr[Boolean] = js.native
  /**
    * 超时毫秒数
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * 是否使用安卓定位sdk用来进行定位
    */
  var useNative: js.UndefOr[Boolean] = js.native
  /**
    * 定位成功且显示精度范围时，是否把地图视野调整到正好显示精度范围
    */
  var zoomToAccuracy: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoLocationFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoLocationFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoLocationFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoLocationFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonDomHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonDom(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDom")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonOffset(value: Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPosition(value: ButtonPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleOptions(value: typingsSlinky.amapJsApi.AMap.Circle.Options[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHighAccuracy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: all | base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOptions(value: typingsSlinky.amapJsApi.AMap.Marker.Options[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(js.undefined)
        ret
    }
    @scala.inline
    def withNoGeoLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGeoLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoGeoLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGeoLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withNoIpLocate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIpLocate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoIpLocate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIpLocate")(js.undefined)
        ret
    }
    @scala.inline
    def withPanToLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panToLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanToLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panToLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCircle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withStopWhenPermissionDenied(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopWhenPermissionDenied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopWhenPermissionDenied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopWhenPermissionDenied")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomToAccuracy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomToAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToAccuracy")(js.undefined)
        ret
    }
  }
  
}

