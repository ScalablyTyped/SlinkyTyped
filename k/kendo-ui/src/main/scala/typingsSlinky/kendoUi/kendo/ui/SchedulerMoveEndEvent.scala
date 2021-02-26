package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMoveEndEvent extends SchedulerEvent {
  
  var end: js.UndefOr[js.Date] = js.native
  
  var event: js.UndefOr[typingsSlinky.kendoUi.kendo.data.SchedulerEvent] = js.native
  
  var resources: js.UndefOr[js.Any] = js.native
  
  var slot: js.UndefOr[js.Any] = js.native
  
  var start: js.UndefOr[js.Date] = js.native
}
object SchedulerMoveEndEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Scheduler): SchedulerMoveEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMoveEndEvent]
  }
  
  @scala.inline
  implicit class SchedulerMoveEndEventMutableBuilder[Self <: SchedulerMoveEndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setEvent(value: typingsSlinky.kendoUi.kendo.data.SchedulerEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setResources(value: js.Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setSlot(value: js.Any): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
