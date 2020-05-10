package typingsSlinky.officeUiFabricReact.calendarInlineExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarInlineExampleState extends js.Object {
  var selectedDate: js.UndefOr[js.Date | Null] = js.native
  var selectedDateRange: js.UndefOr[js.Array[js.Date] | Null] = js.native
}

object ICalendarInlineExampleState {
  @scala.inline
  def apply(): ICalendarInlineExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarInlineExampleState]
  }
  @scala.inline
  implicit class ICalendarInlineExampleStateOps[Self <: ICalendarInlineExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(null)
        ret
    }
    @scala.inline
    def withSelectedDateRange(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDateRangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDateRange")(null)
        ret
    }
  }
  
}

