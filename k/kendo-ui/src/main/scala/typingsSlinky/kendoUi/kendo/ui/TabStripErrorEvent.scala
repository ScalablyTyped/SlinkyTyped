package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStripErrorEvent extends TabStripEvent {
  
  var status: js.UndefOr[String] = js.native
  
  var xhr: js.UndefOr[JQueryXHR] = js.native
}
object TabStripErrorEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TabStrip): TabStripErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripErrorEvent]
  }
  
  @scala.inline
  implicit class TabStripErrorEventMutableBuilder[Self <: TabStripErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setXhr(value: JQueryXHR): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
