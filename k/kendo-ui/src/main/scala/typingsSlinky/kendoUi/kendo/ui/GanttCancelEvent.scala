package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttCancelEvent extends GanttEvent {
  
  var container: js.UndefOr[JQuery] = js.native
  
  var task: js.UndefOr[GanttTask] = js.native
}
object GanttCancelEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttCancelEvent]
  }
  
  @scala.inline
  implicit class GanttCancelEventOps[Self <: GanttCancelEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainer(value: JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setTask(value: GanttTask): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
  }
}
