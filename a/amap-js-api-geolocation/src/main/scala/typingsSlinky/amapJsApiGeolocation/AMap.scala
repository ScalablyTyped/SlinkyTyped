package typingsSlinky.amapJsApiGeolocation

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.Cross
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.ReGeocode
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.ReGeocodeAddressComponent
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.ReGeocodePoi
import typingsSlinky.amapJsApiGeocoder.AMap.Geocoder.Road
import typingsSlinky.amapJsApiGeolocation.AMap.Geolocation.CityResult
import typingsSlinky.amapJsApiGeolocation.AMap.Geolocation.ErrorStatus
import typingsSlinky.amapJsApiGeolocation.AMap.Geolocation.GeolocationResult
import typingsSlinky.amapJsApiGeolocation.AMap.Geolocation.SearchStatus
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`0`
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`1`
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.all
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.base
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait Geolocation extends EventEmitter {
    
    /**
      * 取消对当前位置的监控
      * @param wathcId 监控id
      */
    def clearWatch(wathcId: String): js.UndefOr[String] = js.native
    
    /**
      * 进行IP城市查询
      * @param callback 回调
      */
    def getCityInfo(callback: js.Function2[/* status */ SearchStatus, /* result */ CityResult | ErrorStatus, Unit]): Unit = js.native
    
    /**
      * 获取用户当前的精确位置信息
      * @param callback 回调
      */
    def getCurrentPosition(
      callback: js.Function2[/* status */ SearchStatus, /* result */ GeolocationResult | ErrorStatus, Unit]
    ): Unit = js.native
    
    /**
      * 是否支持浏览器定位
      */
    def isSupported(): Boolean = js.native
    
    /**
      * 使用浏览器定位接口监控当前位置，移动端有效
      */
    def watchPosition(): js.UndefOr[String | Null] = js.native
  }
  object Geolocation {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.LT
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.LB
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.RT
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.RB
    */
    trait ButtonPosition extends StObject
    object ButtonPosition {
      
      @scala.inline
      def LB: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.LB = "LB".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.LB]
      
      @scala.inline
      def LT: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.LT = "LT".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.LT]
      
      @scala.inline
      def RB: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.RB = "RB".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.RB]
      
      @scala.inline
      def RT: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.RT = "RT".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.RT]
    }
    
    @js.native
    trait CityResult extends StObject {
      
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
      implicit class CityResultMutableBuilder[Self <: CityResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
        
        @scala.inline
        def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsConverted(value: Boolean): Self = StObject.set(x, "isConverted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ErrorStatus extends StObject {
      
      /**
        * 错误信息
        */
      var info: String = js.native
      
      /**
        * 造成定位失败结果的一些有用信息
        */
      var message: String = js.native
      
      /**
        * 状态码
        */
      var status: `0` = js.native
    }
    object ErrorStatus {
      
      @scala.inline
      def apply(info: String, message: String, status: `0`): ErrorStatus = {
        val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorStatus]
      }
      
      @scala.inline
      implicit class ErrorStatusMutableBuilder[Self <: ErrorStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait EventMap extends StObject {
      
      var complete: Event_[
            typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete, 
            GeolocationResult
          ] = js.native
      
      var error: Event_[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error, ErrorStatus] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(complete: Event_[complete, GeolocationResult], error: Event_[error, ErrorStatus]): EventMap = {
        val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComplete(value: Event_[complete, GeolocationResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: Event_[error, ErrorStatus]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
    
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
      implicit class GeolocationResultMutableBuilder[Self <: GeolocationResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccuracyNull: Self = StObject.set(x, "accuracy", null)
        
        @scala.inline
        def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsConverted(value: Boolean): Self = StObject.set(x, "isConverted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocation_type(value: LocationType): Self = StObject.set(x, "location_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.html5
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.ip
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.sdk
    */
    trait LocationType extends StObject
    object LocationType {
      
      @scala.inline
      def html5: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.html5 = "html5".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.html5]
      
      @scala.inline
      def ip: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.ip = "ip".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.ip]
      
      @scala.inline
      def sdk: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.sdk = "sdk".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.sdk]
    }
    
    @js.native
    trait Options extends StObject {
      
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
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setButtonDom(value: String | HTMLElement): Self = StObject.set(x, "buttonDom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonDomHTMLElement(value: HTMLElement): Self = StObject.set(x, "buttonDom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonDomUndefined: Self = StObject.set(x, "buttonDom", js.undefined)
        
        @scala.inline
        def setButtonOffset(value: Pixel): Self = StObject.set(x, "buttonOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonOffsetUndefined: Self = StObject.set(x, "buttonOffset", js.undefined)
        
        @scala.inline
        def setButtonPosition(value: ButtonPosition): Self = StObject.set(x, "buttonPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonPositionUndefined: Self = StObject.set(x, "buttonPosition", js.undefined)
        
        @scala.inline
        def setCircleOptions(value: typingsSlinky.amapJsApi.AMap.Circle.Options[_]): Self = StObject.set(x, "circleOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCircleOptionsUndefined: Self = StObject.set(x, "circleOptions", js.undefined)
        
        @scala.inline
        def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
        
        @scala.inline
        def setConvertUrl(value: String): Self = StObject.set(x, "convertUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConvertUrlUndefined: Self = StObject.set(x, "convertUrl", js.undefined)
        
        @scala.inline
        def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
        
        @scala.inline
        def setExtensions(value: all | base): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
        @scala.inline
        def setGeoLocationFirst(value: Boolean): Self = StObject.set(x, "GeoLocationFirst", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGeoLocationFirstUndefined: Self = StObject.set(x, "GeoLocationFirst", js.undefined)
        
        @scala.inline
        def setMarkerOptions(value: typingsSlinky.amapJsApi.AMap.Marker.Options[_]): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
        
        @scala.inline
        def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
        
        @scala.inline
        def setNoGeoLocation(value: Double): Self = StObject.set(x, "noGeoLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoGeoLocationUndefined: Self = StObject.set(x, "noGeoLocation", js.undefined)
        
        @scala.inline
        def setNoIpLocate(value: Double): Self = StObject.set(x, "noIpLocate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoIpLocateUndefined: Self = StObject.set(x, "noIpLocate", js.undefined)
        
        @scala.inline
        def setPanToLocation(value: Boolean): Self = StObject.set(x, "panToLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPanToLocationUndefined: Self = StObject.set(x, "panToLocation", js.undefined)
        
        @scala.inline
        def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
        
        @scala.inline
        def setShowCircle(value: Boolean): Self = StObject.set(x, "showCircle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowCircleUndefined: Self = StObject.set(x, "showCircle", js.undefined)
        
        @scala.inline
        def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowMarkerUndefined: Self = StObject.set(x, "showMarker", js.undefined)
        
        @scala.inline
        def setStopWhenPermissionDenied(value: Boolean): Self = StObject.set(x, "stopWhenPermissionDenied", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopWhenPermissionDeniedUndefined: Self = StObject.set(x, "stopWhenPermissionDenied", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        @scala.inline
        def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
        
        @scala.inline
        def setZoomToAccuracy(value: Boolean): Self = StObject.set(x, "zoomToAccuracy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomToAccuracyUndefined: Self = StObject.set(x, "zoomToAccuracy", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
      - typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      @scala.inline
      def complete: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete = "complete".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete]
      
      @scala.inline
      def error: typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error = "error".asInstanceOf[typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationStrings.error]
    }
  }
}
