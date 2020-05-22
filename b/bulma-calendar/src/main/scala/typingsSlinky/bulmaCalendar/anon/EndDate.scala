package typingsSlinky.bulmaCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndDate extends js.Object {
  var endDate: js.UndefOr[js.Date] = js.undefined
  var startDate: js.Date
}

object EndDate {
  @scala.inline
  def apply(startDate: js.Date, endDate: js.Date = null): EndDate = {
    val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
}

