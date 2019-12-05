package typingsSlinky.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerSelectOptions extends js.Object {
  var end: js.UndefOr[js.Date] = js.undefined
  var events: js.UndefOr[js.Array[_ | SchedulerEvent]] = js.undefined
  var isAllDay: js.UndefOr[Boolean] = js.undefined
  var resources: js.UndefOr[js.Array[_]] = js.undefined
  var start: js.UndefOr[js.Date] = js.undefined
}

object SchedulerSelectOptions {
  @scala.inline
  def apply(
    end: js.Date = null,
    events: js.Array[_ | SchedulerEvent] = null,
    isAllDay: js.UndefOr[Boolean] = js.undefined,
    resources: js.Array[_] = null,
    start: js.Date = null
  ): SchedulerSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllDay)) __obj.updateDynamic("isAllDay")(isAllDay.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerSelectOptions]
  }
}

