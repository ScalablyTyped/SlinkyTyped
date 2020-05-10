package typingsSlinky.reactInfiniteCalendar

import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.landscape
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHideYearsOnSelect extends js.Object {
  var hideYearsOnSelect: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[portrait | landscape] = js.native
  var overscanMonthCount: js.UndefOr[Double] = js.native
  var shouldHeaderAnimate: js.UndefOr[Boolean] = js.native
  var showHeader: js.UndefOr[Boolean] = js.native
  var showMonthsForYears: js.UndefOr[Boolean] = js.native
  var showOverlay: js.UndefOr[Boolean] = js.native
  var showTodayHelper: js.UndefOr[Boolean] = js.native
  var showWeekdays: js.UndefOr[Boolean] = js.native
  var todayHelperRowOffset: js.UndefOr[Double] = js.native
}

object AnonHideYearsOnSelect {
  @scala.inline
  def apply(): AnonHideYearsOnSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHideYearsOnSelect]
  }
  @scala.inline
  implicit class AnonHideYearsOnSelectOps[Self <: AnonHideYearsOnSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideYearsOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideYearsOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideYearsOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideYearsOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanMonthCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanMonthCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanMonthCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanMonthCount")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldHeaderAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHeaderAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldHeaderAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHeaderAnimate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonthsForYears(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthsForYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonthsForYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthsForYears")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTodayHelper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTodayHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTodayHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTodayHelper")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekdays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayHelperRowOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayHelperRowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayHelperRowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayHelperRowOffset")(js.undefined)
        ret
    }
  }
  
}

