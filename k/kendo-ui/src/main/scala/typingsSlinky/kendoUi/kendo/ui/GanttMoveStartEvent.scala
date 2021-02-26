package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.GanttTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttMoveStartEvent extends GanttEvent {
  
  var task: js.UndefOr[GanttTask] = js.native
}
object GanttMoveStartEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttMoveStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMoveStartEvent]
  }
  
  @scala.inline
  implicit class GanttMoveStartEventMutableBuilder[Self <: GanttMoveStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTask(value: GanttTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
