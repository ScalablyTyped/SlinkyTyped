package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarTextColor extends js.Object {
  var calendarTextColor: js.UndefOr[String] = js.native
  var calendarYearBackgroundColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var headerColor: js.UndefOr[String] = js.native
  var selectColor: js.UndefOr[String] = js.native
  var selectTextColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object CalendarTextColor {
  @scala.inline
  def apply(): CalendarTextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarTextColor]
  }
  @scala.inline
  implicit class CalendarTextColorOps[Self <: CalendarTextColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarYearBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarYearBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarYearBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarYearBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
  }
  
}

