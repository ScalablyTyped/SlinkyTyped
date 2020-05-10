package typingsSlinky.clndr.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickEvents extends js.Object {
  /**
    * Fired whenever a calendar box is clicked. Returns a 'target' object
    * containing the DOM element, any events, and the date as a moment.js
    * object.
    */
  var click: js.UndefOr[js.Function1[/* target */ Target, Unit]] = js.native
  /**
    * Fired when a user goes forward a period. Returns moment.js objects
    * for the updated start and end date.
    */
  var nextInterval: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.native
  /**
    * Fired when a user goes forward a month. Returns a moment.js object
    * set to the correct month.
    */
  var nextMonth: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired when the next year button is clicked. Returns a moment.js
    * object set to the correct month and year.
    */
  var nextYear: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired whenever the time period changes as configured in lengthOfTime.
    * Returns moment.js objects for the updated start and end date.
    */
  var onIntervalChange: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.native
  /**
    * Fires any time the month changes as a result of a click action.
    * Returns a moment.js object set to the correct month.
    */
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fires any time the year changes as a result of a click action. If
    * onMonthChange is also set, it is fired BEFORE onYearChange. Returns
    * a moment.js object set to the correct month and year.
    */
  var onYearChange: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired when a user goes back an interval. Returns moment.js objects for
    * the updated start and end date.
    */
  var previousInterval: js.UndefOr[js.Function2[/* start */ Moment, /* end */ Moment, Unit]] = js.native
  /**
    * Fired when a user goes back a month. Returns a moment.js object set
    * to the correct month.
    *
    */
  var previousMonth: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired when the previous year button is clicked. Returns a moment.js
    * object set to the correct month and year.
    */
  var previousYear: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
  /**
    * Fired when a user goes to the current month and year. Returns a
    * moment.js object set to the correct month.
    */
  var today: js.UndefOr[js.Function1[/* month */ Moment, Unit]] = js.native
}

object ClickEvents {
  @scala.inline
  def apply(): ClickEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickEvents]
  }
  @scala.inline
  implicit class ClickEventsOps[Self <: ClickEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: /* target */ Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withNextInterval(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextInterval")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNextInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMonth(value: /* month */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withNextYear(value: /* month */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIntervalChange(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIntervalChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnIntervalChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIntervalChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMonthChange(value: /* month */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMonthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnYearChange(value: /* month */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnYearChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousInterval(value: (/* start */ Moment, /* end */ Moment) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousInterval")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreviousInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousMonth(value: /* month */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousYear(value: /* month */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousYear")(js.undefined)
        ret
    }
    @scala.inline
    def withToday(value: /* month */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.undefined)
        ret
    }
  }
  
}

