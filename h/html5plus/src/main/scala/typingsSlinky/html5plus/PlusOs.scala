package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.Android
import typingsSlinky.html5plus.html5plusStrings.Apple
import typingsSlinky.html5plus.html5plusStrings.Google
import typingsSlinky.html5plus.html5plusStrings.iOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OS模块管理操作系统信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
@js.native
trait PlusOs extends StObject {
  
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
    *     iOS系统。
    *                                 
    * - Android: 
    *     Android系统。
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var name: js.UndefOr[iOS | Android] = js.native
  
  /**
    * 系统的供应商信息
    * 获取当前操作系统的供应商名称，字符串类型数据。
    * - Apple: 
    *     iOS设备，包括iPhone、iPad、iTouch。
    *                                 
    * - Google: 
    *     Android设备。
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
  implicit class PlusOsMutableBuilder[Self <: PlusOs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: iOS | Android): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVendor(value: Apple | Google): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
