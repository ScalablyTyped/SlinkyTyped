package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.WaitingPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWaitingPopup extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: WaitingPopup = js.native
}
object TypeofWaitingPopup {
  
  @scala.inline
  def apply(Locale: js.Any, fn: WaitingPopup): TypeofWaitingPopup = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWaitingPopup]
  }
  
  @scala.inline
  implicit class TypeofWaitingPopupMutableBuilder[Self <: TypeofWaitingPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: WaitingPopup): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
