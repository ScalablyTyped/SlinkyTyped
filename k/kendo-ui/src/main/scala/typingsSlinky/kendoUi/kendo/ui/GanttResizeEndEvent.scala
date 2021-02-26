package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.GanttTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttResizeEndEvent extends GanttEvent {
  
  var end: js.UndefOr[js.Date] = js.native
  
  var start: js.UndefOr[js.Date] = js.native
  
  var task: js.UndefOr[GanttTask] = js.native
}
object GanttResizeEndEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttResizeEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttResizeEndEvent]
  }
  
  @scala.inline
  implicit class GanttResizeEndEventMutableBuilder[Self <: GanttResizeEndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTask(value: GanttTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
