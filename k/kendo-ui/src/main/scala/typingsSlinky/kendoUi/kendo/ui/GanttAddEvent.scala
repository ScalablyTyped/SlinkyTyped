package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.GanttDependency
import typingsSlinky.kendoUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class GanttAddEventOps[Self <: GanttAddEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependency(value: GanttDependency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(js.undefined)
        ret
    }
    @scala.inline
    def withTask(value: GanttTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(js.undefined)
        ret
    }
  }
  
}

