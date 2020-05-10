package typingsSlinky.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListBaseProps extends CalendarBaseProps {
  /**
    *  Set custom calendar heigth.
    */
  var calendarHeight: js.UndefOr[Double] = js.native
  /**
    *  Set custom calendar width.
    */
  var calendarWidth: js.UndefOr[Double] = js.native
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[Double] = js.native
  /**
    *  Enable horizontal scrolling, default = false
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    *  Enable paging on horizontal, default = false
    */
  var pagingEnabled: js.UndefOr[Boolean] = js.native
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[Double] = js.native
  /**
    *  Enable or disable scrolling of calendar list
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  /**
    *  When true, the calendar list scrolls to top when the status bar is tapped. Default = true
    */
  var scrollsToTop: js.UndefOr[Boolean] = js.native
  /**
    * Initially selected day
    */
  var selected: js.UndefOr[String] = js.native
  /**
    *  Enable or disable vertical scroll indicator. Default = false
    */
  var showScrollIndicator: js.UndefOr[Boolean] = js.native
}

object CalendarListBaseProps {
  @scala.inline
  def apply(): CalendarListBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarListBaseProps]
  }
  @scala.inline
  implicit class CalendarListBasePropsOps[Self <: CalendarListBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFutureScrollRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureScrollRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFutureScrollRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureScrollRange")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPastScrollRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastScrollRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPastScrollRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastScrollRange")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollsToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollsToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollsToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollsToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScrollIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScrollIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollIndicator")(js.undefined)
        ret
    }
  }
  
}

