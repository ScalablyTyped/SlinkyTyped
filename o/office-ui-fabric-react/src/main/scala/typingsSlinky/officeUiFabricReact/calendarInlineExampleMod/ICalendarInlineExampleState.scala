package typingsSlinky.officeUiFabricReact.calendarInlineExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarInlineExampleState extends js.Object {
  var selectedDate: js.UndefOr[js.Date | Null] = js.undefined
  var selectedDateRange: js.UndefOr[js.Array[js.Date] | Null] = js.undefined
}

object ICalendarInlineExampleState {
  @scala.inline
  def apply(selectedDate: js.Date = null, selectedDateRange: js.Array[js.Date] = null): ICalendarInlineExampleState = {
    val __obj = js.Dynamic.literal()
    if (selectedDate != null) __obj.updateDynamic("selectedDate")(selectedDate.asInstanceOf[js.Any])
    if (selectedDateRange != null) __obj.updateDynamic("selectedDateRange")(selectedDateRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarInlineExampleState]
  }
}

