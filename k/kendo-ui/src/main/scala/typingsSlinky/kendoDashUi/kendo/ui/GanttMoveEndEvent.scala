package typingsSlinky.kendoDashUi.kendo.ui

import typingsSlinky.kendoDashUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMoveEndEvent extends GanttEvent {
  var end: js.UndefOr[js.Date] = js.undefined
  var start: js.UndefOr[js.Date] = js.undefined
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttMoveEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    end: js.Date = null,
    start: js.Date = null,
    task: GanttTask = null
  ): GanttMoveEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMoveEndEvent]
  }
}

