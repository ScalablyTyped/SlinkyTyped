package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设备-----拨打电话
@js.native
trait MakePhoneCallOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要拨打的电话号码
    */
  var phoneNumber: String = js.native
}
object MakePhoneCallOptions {
  
  @scala.inline
  def apply(phoneNumber: String): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
  
  @scala.inline
  implicit class MakePhoneCallOptionsMutableBuilder[Self <: MakePhoneCallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
