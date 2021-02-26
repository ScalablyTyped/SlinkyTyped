package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupWindowCloseUpEventArgs extends PopupWindowEventArgs {
  
  val closeReason: BootstrapPopupControlCloseReason = js.native
}
object PopupWindowCloseUpEventArgs {
  
  @scala.inline
  def apply(closeReason: BootstrapPopupControlCloseReason, sender: Control, window: BootstrapPopupWindow): PopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowCloseUpEventArgs]
  }
  
  @scala.inline
  implicit class PopupWindowCloseUpEventArgsMutableBuilder[Self <: PopupWindowCloseUpEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseReason(value: BootstrapPopupControlCloseReason): Self = StObject.set(x, "closeReason", value.asInstanceOf[js.Any])
  }
}
