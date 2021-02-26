package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，定位错误信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
@js.native
trait PlusGeolocationGeolocationError extends StObject {
  
  /**
    * 访问权限被拒绝
    * 系统不允许程序获取定位功能，错误代码常量值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var PERMISSION_DENIED: js.UndefOr[Double] = js.native
  
  /**
    * 位置信息不可用
    * 无法获取有效的位置信息，错误代码常量值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var POSITION_UNAVAILABLE: js.UndefOr[Double] = js.native
  
  /**
    * 获取位置信息超时
    * 无法在指定的时间内获取位置信息，错误代码常量值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var TIMEOUT: js.UndefOr[Double] = js.native
  
  /**
    * 未知错误
    * 其它未知错误导致无法获取位置信息，错误代码常量值为4。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var UNKNOWN_ERROR: js.UndefOr[Double] = js.native
  
  /**
    * 错误代码
    * 取值范围为GeolocationError对象的常量值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * 错误描述信息
    * 详细错误描述信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var message: js.UndefOr[String] = js.native
}
object PlusGeolocationGeolocationError {
  
  @scala.inline
  def apply(): PlusGeolocationGeolocationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGeolocationGeolocationError]
  }
  
  @scala.inline
  implicit class PlusGeolocationGeolocationErrorMutableBuilder[Self <: PlusGeolocationGeolocationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPERMISSION_DENIED(value: Double): Self = StObject.set(x, "PERMISSION_DENIED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERMISSION_DENIEDUndefined: Self = StObject.set(x, "PERMISSION_DENIED", js.undefined)
    
    @scala.inline
    def setPOSITION_UNAVAILABLE(value: Double): Self = StObject.set(x, "POSITION_UNAVAILABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOSITION_UNAVAILABLEUndefined: Self = StObject.set(x, "POSITION_UNAVAILABLE", js.undefined)
    
    @scala.inline
    def setTIMEOUT(value: Double): Self = StObject.set(x, "TIMEOUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIMEOUTUndefined: Self = StObject.set(x, "TIMEOUT", js.undefined)
    
    @scala.inline
    def setUNKNOWN_ERROR(value: Double): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN_ERRORUndefined: Self = StObject.set(x, "UNKNOWN_ERROR", js.undefined)
  }
}
