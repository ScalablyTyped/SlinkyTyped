package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.GanttDependency
import typingsSlinky.kendoUi.kendo.data.GanttTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttAddEvent extends GanttEvent {
  
  var dependency: js.UndefOr[GanttDependency] = js.native
  
  var task: js.UndefOr[GanttTask] = js.native
}
object GanttAddEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttAddEvent]
  }
  
  @scala.inline
  implicit class GanttAddEventMutableBuilder[Self <: GanttAddEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependency(value: GanttDependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    @scala.inline
    def setTask(value: GanttTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
