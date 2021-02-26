package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerRemoveEvent extends SchedulerEvent {
  
  var event: js.UndefOr[typingsSlinky.kendoUi.kendo.data.SchedulerEvent] = js.native
}
object SchedulerRemoveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Scheduler): SchedulerRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerRemoveEvent]
  }
  
  @scala.inline
  implicit class SchedulerRemoveEventMutableBuilder[Self <: SchedulerRemoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: typingsSlinky.kendoUi.kendo.data.SchedulerEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
