package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.Android
import typingsSlinky.html5plus.html5plusStrings.Apple
import typingsSlinky.html5plus.html5plusStrings.Google
import typingsSlinky.html5plus.html5plusStrings.iOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OS模块管理操作系统信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
@js.native
trait PlusOs extends js.Object {
  /**
    * 系统语言信息
    * 获取当前操作系统设置的系统语言，字符串类型数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var language: js.UndefOr[String] = js.native
  /**
    * 系统的名称
    * 获取当前操作系统的名称，字符串类型数据。
    * - iOS: 
    * 	iOS系统。
    * 								
    * - Android: 
    * 	Android系统。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var name: js.UndefOr[iOS | Android] = js.native
  /**
    * 系统的供应商信息
    * 获取当前操作系统的供应商名称，字符串类型数据。
    * - Apple: 
    * 	iOS设备，包括iPhone、iPad、iTouch。
    * 								
    * - Google: 
    * 	Android设备。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var vendor: js.UndefOr[Apple | Google] = js.native
  /**
    * 系统版本信息
    * 获取当前操作系统的版本信息，字符串类型数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var version: js.UndefOr[String] = js.native
}

object PlusOs {
  @scala.inline
  def apply(): PlusOs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOs]
  }
  @scala.inline
  implicit class PlusOsOps[Self <: PlusOs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: iOS | Android): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withVendor(value: Apple | Google): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

