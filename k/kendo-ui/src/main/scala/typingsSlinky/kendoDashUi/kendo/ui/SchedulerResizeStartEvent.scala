package typingsSlinky.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerResizeStartEvent extends SchedulerEvent {
  var event: js.UndefOr[typingsSlinky.kendoDashUi.kendo.data.SchedulerEvent] = js.undefined
}

object SchedulerResizeStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    event: typingsSlinky.kendoDashUi.kendo.data.SchedulerEvent = null
  ): SchedulerResizeStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerResizeStartEvent]
  }
}

