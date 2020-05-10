package typingsSlinky.baseui.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarState extends js.Object {
  var date: js.Date = js.native
  var focused: Boolean = js.native
  var highlightedDate: js.Date = js.native
  var quickSelectId: js.UndefOr[String] = js.native
}

object CalendarState {
  @scala.inline
  def apply(date: js.Date, focused: Boolean, highlightedDate: js.Date): CalendarState = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], highlightedDate = highlightedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarState]
  }
  @scala.inline
  implicit class CalendarStateOps[Self <: CalendarState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuickSelectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSelectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickSelectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSelectId")(js.undefined)
        ret
    }
  }
  
}

