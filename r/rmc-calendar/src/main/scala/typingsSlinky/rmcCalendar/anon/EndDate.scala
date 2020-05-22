package typingsSlinky.rmcCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndDate extends js.Object {
  var endDate: js.UndefOr[js.Date] = js.undefined
  var startDate: js.UndefOr[js.Date] = js.undefined
}

object EndDate {
  @scala.inline
  def apply(endDate: js.Date = null, startDate: js.Date = null): EndDate = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
}

