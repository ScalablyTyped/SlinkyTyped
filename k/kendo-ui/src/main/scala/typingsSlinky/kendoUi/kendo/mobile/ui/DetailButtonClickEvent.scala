package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailButtonClickEvent extends DetailButtonEvent {
  
  var button: js.UndefOr[JQuery] = js.native
  
  var target: js.UndefOr[JQuery] = js.native
}
object DetailButtonClickEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DetailButton): DetailButtonClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailButtonClickEvent]
  }
  
  @scala.inline
  implicit class DetailButtonClickEventMutableBuilder[Self <: DetailButtonClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: JQuery): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
