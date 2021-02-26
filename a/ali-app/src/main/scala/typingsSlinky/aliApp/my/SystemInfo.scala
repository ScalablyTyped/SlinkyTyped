package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.Android
import typingsSlinky.aliApp.aliAppStrings.alipay
import typingsSlinky.aliApp.aliAppStrings.iOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 系统信息 https://docs.alipay.com/mini/api/system-info
@js.native
trait SystemInfo extends StObject {
  
  /**
    * 当前运行的客户端，当前是支付宝则有效值是"alipay"
    */
  var app: alipay | String = js.native
  
  /**
    * 手机品牌
    */
  var brand: String = js.native
  
  /**
    * 当前电量百分比
    */
  var currentBattery: String = js.native
  
  /**
    * 用户设置字体大小
    */
  var fontSizeSetting: Double = js.native
  
  /**
    * 支付宝设置的语言
    */
  var language: String = js.native
  
  /**
    * 手机型号
    */
  var model: String = js.native
  
  /**
    * 设备像素比
    */
  var pixelRatio: Double = js.native
  
  /**
    * 系统名：Android，iOS
    */
  var platform: Android | iOS | String = js.native
  
  /**
    * 屏幕高度
    */
  var screenHeight: Double = js.native
  
  /**
    * 屏幕宽度
    */
  var screenWidth: Double = js.native
  
  /**
    * 设备磁盘容量
    */
  var storage: String = js.native
  
  /**
    * 系统版本
    */
  var system: String = js.native
  
  /**
    * 支付宝版本号
    */
  var version: String = js.native
  
  /**
    * 窗口高度
    */
  var windowHeight: Double = js.native
  
  /**
    * 窗口宽度
    */
  var windowWidth: Double = js.native
}
object SystemInfo {
  
  @scala.inline
  def apply(
    app: alipay | String,
    brand: String,
    currentBattery: String,
    fontSizeSetting: Double,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: Android | iOS | String,
    screenHeight: Double,
    screenWidth: Double,
    storage: String,
    system: String,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], currentBattery = currentBattery.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
  
  @scala.inline
  implicit class SystemInfoMutableBuilder[Self <: SystemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: alipay | String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBattery(value: String): Self = StObject.set(x, "currentBattery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeSetting(value: Double): Self = StObject.set(x, "fontSizeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: Android | iOS | String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
