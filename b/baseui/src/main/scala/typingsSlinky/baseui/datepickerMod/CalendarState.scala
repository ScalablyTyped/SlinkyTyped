package typingsSlinky.baseui.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarState extends js.Object {
  var date: js.Date
  var focused: Boolean
  var highlightedDate: js.Date
  var quickSelectId: js.UndefOr[String] = js.undefined
}

object CalendarState {
  @scala.inline
  def apply(date: js.Date, focused: Boolean, highlightedDate: js.Date, quickSelectId: String = null): CalendarState = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], highlightedDate = highlightedDate.asInstanceOf[js.Any])
    if (quickSelectId != null) __obj.updateDynamic("quickSelectId")(quickSelectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarState]
  }
}

