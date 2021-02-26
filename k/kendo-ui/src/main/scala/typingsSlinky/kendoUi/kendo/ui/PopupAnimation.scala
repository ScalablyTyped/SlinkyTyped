package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupAnimation extends StObject {
  
  var close: js.UndefOr[PopupAnimationClose] = js.native
  
  var open: js.UndefOr[PopupAnimationOpen] = js.native
}
object PopupAnimation {
  
  @scala.inline
  def apply(): PopupAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupAnimation]
  }
  
  @scala.inline
  implicit class PopupAnimationMutableBuilder[Self <: PopupAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: PopupAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: PopupAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
