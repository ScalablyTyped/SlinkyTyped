package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangePickerRange extends js.Object {
  var end: js.UndefOr[js.Date] = js.undefined
  var start: js.UndefOr[js.Date] = js.undefined
}

object DateRangePickerRange {
  @scala.inline
  def apply(end: js.Date = null, start: js.Date = null): DateRangePickerRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangePickerRange]
  }
}

