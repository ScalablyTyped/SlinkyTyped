package typingsSlinky.officeUiFabricReact.calendarButtonExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarButtonExampleState extends js.Object {
  var selectedDate: js.Date | Null = js.native
  var showCalendar: Boolean = js.native
}

object ICalendarButtonExampleState {
  @scala.inline
  def apply(showCalendar: Boolean): ICalendarButtonExampleState = {
    val __obj = js.Dynamic.literal(showCalendar = showCalendar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarButtonExampleState]
  }
  @scala.inline
  implicit class ICalendarButtonExampleStateOps[Self <: ICalendarButtonExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowCalendar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(null)
        ret
    }
  }
  
}

