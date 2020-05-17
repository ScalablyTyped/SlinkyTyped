package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.amapJsApiStrings.android
import typingsSlinky.amapJsApi.amapJsApiStrings.ios
import typingsSlinky.amapJsApi.amapJsApiStrings.mac
import typingsSlinky.amapJsApi.amapJsApiStrings.other
import typingsSlinky.amapJsApi.amapJsApiStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBrowser extends js.Object {
  /**
    * 是否安卓设备
    */
  val android: Boolean = js.native
  /**
    * 是否安卓4以下系统
    */
  val android23: Boolean = js.native
  /**
    * 是否支持Css3D的浏览器
    */
  val any3d: Boolean = js.native
  /**
    * 	是否百度浏览器
    */
  val baidu: Boolean = js.native
  /**
    * 是否Chrome浏览器
    */
  val chrome: Boolean = js.native
  /**
    * 	是否Edge浏览器
    */
  val edge: Boolean = js.native
  /**
    * 是否火狐浏览器
    */
  val firefox: Boolean = js.native
  /**
    * 是否支持Css3D的gecko浏览器
    */
  val gecko3d: Boolean = js.native
  /**
    * 是否iPad
    */
  val iPad: Boolean = js.native
  /**
    * 是否iPhone
    */
  val iPhone: Boolean = js.native
  /**
    * 是否IE
    */
  val ie: Boolean = js.native
  /**
    * 是否IE10
    */
  val ie10: Boolean = js.native
  /**
    * 是否IE11
    */
  val ie11: Boolean = js.native
  /**
    * 是否支持Css3D的ie浏览器
    */
  val ie3d: Boolean = js.native
  /**
    * 是否IE6
    */
  val ie6: Boolean = js.native
  /**
    * 是否IE7
    */
  val ie7: Boolean = js.native
  /**
    * 是否IE8
    */
  val ie8: Boolean = js.native
  /**
    * 是否IE9
    */
  val ie9: Boolean = js.native
  /**
    * 是否IE9以下
    */
  val ielt9: Boolean = js.native
  /**
    * 是否iOS设备
    */
  val ios: Boolean = js.native
  /**
    * 是否支持canvas
    */
  val isCanvas: Boolean = js.native
  /**
    * 是否支持Geolocation
    */
  val isGeolocation: Boolean = js.native
  /**
    * 是否支持LocaStorage
    */
  val isLocalStorage: Boolean = js.native
  /**
    * 是否支持svg
    */
  val isSvg: Boolean = js.native
  /**
    * 是否支持vml
    */
  val isVML: Boolean = js.native
  /**
    * 是否支持WebSocket
    */
  val isWebsocket: Boolean = js.native
  /**
    * 是否支持WebWorker
    */
  val isWorker: Boolean = js.native
  /**
    * 是否mac设备
    */
  val mac: Boolean = js.native
  /**
    * 是否移动设备
    */
  val mobile: Boolean = js.native
  /**
    * 是否Opera移动浏览器
    */
  val mobileOpera: Boolean = js.native
  /**
    * 是否Webkit移动浏览器
    */
  val mobileWebkit: Boolean = js.native
  /**
    * 是否支持Css3D的Webkit移动端浏览器
    */
  val mobileWebkit3d: Boolean = js.native
  /**
    * 是否msPointer设备
    */
  val msPointer: Boolean = js.native
  /**
    * 是否支持Css3D的opera浏览器
    */
  val opera3d: Boolean = js.native
  /**
    * 平台类型，如：'windows'、'mac'、'ios'、'android'、'other'
    */
  val plat: typingsSlinky.amapJsApi.amapJsApiStrings.android | typingsSlinky.amapJsApi.amapJsApiStrings.ios | typingsSlinky.amapJsApi.amapJsApiStrings.windows | typingsSlinky.amapJsApi.amapJsApiStrings.mac | other = js.native
  /**
    * 是否pointer设备
    */
  val pointer: Boolean = js.native
  /**
    * 是否QQ或者QQ浏览器
    */
  val qq: Boolean = js.native
  /**
    * 是否高清屏幕，devicePixelRatio>1
    */
  val retina: Boolean = js.native
  /**
    * 是否Safari浏览器
    */
  val safari: Boolean = js.native
  /**
    * 	是否触屏
    */
  val touch: Boolean = js.native
  /**
    * 当前浏览器userAgent
    */
  val ua: String = js.native
  /**
    * 是否UC浏览器
    */
  val uc: Boolean = js.native
  /**
    * 是否webkit浏览器
    */
  val webkit: Boolean = js.native
  /**
    * 是否支持Css3D的Webkit浏览器
    */
  val webkit3d: Boolean = js.native
  /**
    * 是否微信
    */
  val wechat: Boolean = js.native
  /**
    * 是否windows设备
    */
  val windows: Boolean = js.native
  /**
    * 判断是否支持webgl
    */
  def isWebGL(): Boolean = js.native
}

object TypeofBrowser {
  @scala.inline
  def apply(
    android: Boolean,
    android23: Boolean,
    any3d: Boolean,
    baidu: Boolean,
    chrome: Boolean,
    edge: Boolean,
    firefox: Boolean,
    gecko3d: Boolean,
    iPad: Boolean,
    iPhone: Boolean,
    ie: Boolean,
    ie10: Boolean,
    ie11: Boolean,
    ie3d: Boolean,
    ie6: Boolean,
    ie7: Boolean,
    ie8: Boolean,
    ie9: Boolean,
    ielt9: Boolean,
    ios: Boolean,
    isCanvas: Boolean,
    isGeolocation: Boolean,
    isLocalStorage: Boolean,
    isSvg: Boolean,
    isVML: Boolean,
    isWebGL: () => Boolean,
    isWebsocket: Boolean,
    isWorker: Boolean,
    mac: Boolean,
    mobile: Boolean,
    mobileOpera: Boolean,
    mobileWebkit: Boolean,
    mobileWebkit3d: Boolean,
    msPointer: Boolean,
    opera3d: Boolean,
    plat: android | ios | windows | mac | other,
    pointer: Boolean,
    qq: Boolean,
    retina: Boolean,
    safari: Boolean,
    touch: Boolean,
    ua: String,
    uc: Boolean,
    webkit: Boolean,
    webkit3d: Boolean,
    wechat: Boolean,
    windows: Boolean
  ): TypeofBrowser = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], android23 = android23.asInstanceOf[js.Any], any3d = any3d.asInstanceOf[js.Any], baidu = baidu.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], gecko3d = gecko3d.asInstanceOf[js.Any], iPad = iPad.asInstanceOf[js.Any], iPhone = iPhone.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ie10 = ie10.asInstanceOf[js.Any], ie11 = ie11.asInstanceOf[js.Any], ie3d = ie3d.asInstanceOf[js.Any], ie6 = ie6.asInstanceOf[js.Any], ie7 = ie7.asInstanceOf[js.Any], ie8 = ie8.asInstanceOf[js.Any], ie9 = ie9.asInstanceOf[js.Any], ielt9 = ielt9.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], isCanvas = isCanvas.asInstanceOf[js.Any], isGeolocation = isGeolocation.asInstanceOf[js.Any], isLocalStorage = isLocalStorage.asInstanceOf[js.Any], isSvg = isSvg.asInstanceOf[js.Any], isVML = isVML.asInstanceOf[js.Any], isWebGL = js.Any.fromFunction0(isWebGL), isWebsocket = isWebsocket.asInstanceOf[js.Any], isWorker = isWorker.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], mobileOpera = mobileOpera.asInstanceOf[js.Any], mobileWebkit = mobileWebkit.asInstanceOf[js.Any], mobileWebkit3d = mobileWebkit3d.asInstanceOf[js.Any], msPointer = msPointer.asInstanceOf[js.Any], opera3d = opera3d.asInstanceOf[js.Any], plat = plat.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], qq = qq.asInstanceOf[js.Any], retina = retina.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any], uc = uc.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any], webkit3d = webkit3d.asInstanceOf[js.Any], wechat = wechat.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBrowser]
  }
  @scala.inline
  implicit class TypeofBrowserOps[Self <: TypeofBrowser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroid23(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android23")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAny3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaidu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baidu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGecko3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gecko3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe10(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe11(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe7(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe9(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIelt9(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ielt9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGeolocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGeolocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocalStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSvg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWebGL(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebGL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWebsocket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebsocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileOpera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileWebkit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileWebkit3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileWebkit3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsPointer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpera3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opera3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlat(value: android | ios | windows | mac | other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQq(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetina(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ua")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkit3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkit3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWechat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wechat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

