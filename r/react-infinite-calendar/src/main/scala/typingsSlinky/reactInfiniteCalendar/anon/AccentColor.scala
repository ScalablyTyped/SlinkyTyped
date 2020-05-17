package typingsSlinky.reactInfiniteCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccentColor extends js.Object {
  var accentColor: js.UndefOr[String] = js.native
  var floatingNav: js.UndefOr[Background] = js.native
  var headerColor: js.UndefOr[String] = js.native
  var selectionColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[Active] = js.native
  var todayColor: js.UndefOr[String] = js.native
  var weekdayColor: js.UndefOr[String] = js.native
}

object AccentColor {
  @scala.inline
  def apply(): AccentColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccentColor]
  }
  @scala.inline
  implicit class AccentColorOps[Self <: AccentColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingNav(value: Background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingNav")(js.undefined)
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
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: Active): Self = {
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
    @scala.inline
    def withTodayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayColor")(js.undefined)
        ret
    }
  }
  
}

