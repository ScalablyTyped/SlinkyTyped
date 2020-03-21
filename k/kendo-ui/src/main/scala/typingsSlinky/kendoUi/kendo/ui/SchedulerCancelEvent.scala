package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerCancelEvent extends SchedulerEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var event: js.UndefOr[typingsSlinky.kendoUi.kendo.data.SchedulerEvent] = js.undefined
}

object SchedulerCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    container: JQuery = null,
    event: typingsSlinky.kendoUi.kendo.data.SchedulerEvent = null
  ): SchedulerCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerCancelEvent]
  }
}

