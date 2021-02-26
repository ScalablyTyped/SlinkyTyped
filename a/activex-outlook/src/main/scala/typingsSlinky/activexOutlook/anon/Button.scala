package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.OlMouseButton
import typingsSlinky.activexOutlook.Outlook.OlShiftState
import typingsSlinky.activexStdole.stdole.OLE_XPOS_CONTAINER
import typingsSlinky.activexStdole.stdole.OLE_YPOS_CONTAINER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button extends StObject {
  
  val Button: OlMouseButton = js.native
  
  val Shift: OlShiftState = js.native
  
  val X: OLE_XPOS_CONTAINER = js.native
  
  val Y: OLE_YPOS_CONTAINER = js.native
}
object Button {
  
  @scala.inline
  def apply(Button: OlMouseButton, Shift: OlShiftState, X: OLE_XPOS_CONTAINER, Y: OLE_YPOS_CONTAINER): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: OlMouseButton): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: OlShiftState): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: OLE_XPOS_CONTAINER): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: OLE_YPOS_CONTAINER): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
