package typingsSlinky.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amazon extends StObject {
  
  var amazon: Phone = js.native
  
  var android: Phone = js.native
  
  var any: js.Any = js.native
  
  var apple: Device = js.native
  
  var other: Blackberry = js.native
  
  var phone: js.Any = js.native
  
  var tablet: js.Any = js.native
  
  var windows: Phone = js.native
}
object Amazon {
  
  @scala.inline
  def apply(
    amazon: Phone,
    android: Phone,
    any: js.Any,
    apple: Device,
    other: Blackberry,
    phone: js.Any,
    tablet: js.Any,
    windows: Phone
  ): Amazon = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amazon]
  }
  
  @scala.inline
  implicit class AmazonMutableBuilder[Self <: Amazon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmazon(value: Phone): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid(value: Phone): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAny(value: js.Any): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApple(value: Device): Self = StObject.set(x, "apple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: Blackberry): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: js.Any): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablet(value: js.Any): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindows(value: Phone): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
  }
}
