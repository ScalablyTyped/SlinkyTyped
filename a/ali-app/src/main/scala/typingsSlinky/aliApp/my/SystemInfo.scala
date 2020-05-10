package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.Android
import typingsSlinky.aliApp.aliAppStrings.alipay
import typingsSlinky.aliApp.aliAppStrings.iOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 系统信息 https://docs.alipay.com/mini/api/system-info
@js.native
trait SystemInfo extends js.Object {
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
  implicit class SystemInfoOps[Self <: SystemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: alipay | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentBattery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentBattery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSizeSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: Android | iOS | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

