package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientMenuActionHotKey extends StObject {
  
  var ctrlKey: Boolean = js.native
  
  var keyCode: Double = js.native
}
object ASPxClientMenuActionHotKey {
  
  @scala.inline
  def apply(ctrlKey: Boolean, keyCode: Double): ASPxClientMenuActionHotKey = {
    val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuActionHotKey]
  }
  
  @scala.inline
  implicit class ASPxClientMenuActionHotKeyMutableBuilder[Self <: ASPxClientMenuActionHotKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
  }
}
