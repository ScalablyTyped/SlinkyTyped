package typingsSlinky.angularBootstrapCalendar.mod.bootstrap.calendar

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarCell extends js.Object {
  var badgeTotal: Double = js.native
  var date: Moment = js.native
  var events: js.Array[IEvent] = js.native
  var inMonth: Boolean = js.native
  var isFuture: Boolean = js.native
  var isPast: Boolean = js.native
  var isToday: Boolean = js.native
  var isWeekend: Boolean = js.native
  var label: Double = js.native
}

object ICalendarCell {
  @scala.inline
  def apply(
    badgeTotal: Double,
    date: Moment,
    events: js.Array[IEvent],
    inMonth: Boolean,
    isFuture: Boolean,
    isPast: Boolean,
    isToday: Boolean,
    isWeekend: Boolean,
    label: Double
  ): ICalendarCell = {
    val __obj = js.Dynamic.literal(badgeTotal = badgeTotal.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], inMonth = inMonth.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], isWeekend = isWeekend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarCell]
  }
  @scala.inline
  implicit class ICalendarCellOps[Self <: ICalendarCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadgeTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[IEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFuture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFuture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWeekend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWeekend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

