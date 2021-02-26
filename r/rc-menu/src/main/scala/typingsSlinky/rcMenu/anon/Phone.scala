package typingsSlinky.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phone extends StObject {
  
  var device: js.Any = js.native
  
  var phone: js.Any = js.native
  
  var tablet: js.Any = js.native
}
object Phone {
  
  @scala.inline
  def apply(device: js.Any, phone: js.Any, tablet: js.Any): Phone = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
  
  @scala.inline
  implicit class PhoneMutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: js.Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: js.Any): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablet(value: js.Any): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
  }
}
