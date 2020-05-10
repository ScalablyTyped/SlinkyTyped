package typingsSlinky.reactBigScheduler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerDataConfig extends js.Object {
  var agendaMaxEventWidth: js.UndefOr[Double] = js.native
  var agendaResourceTableWidth: js.UndefOr[Double] = js.native
  var calendarPopoverEnabled: js.UndefOr[Boolean] = js.native
  var checkConflict: js.UndefOr[Boolean] = js.native
  var creatable: js.UndefOr[Boolean] = js.native
  var crossResourceMove: js.UndefOr[Boolean] = js.native
  var dayCellWidth: js.UndefOr[Double] = js.native
  var dayMaxEvents: js.UndefOr[Double] = js.native
  var dayResourceTableWidth: js.UndefOr[Double] = js.native
  var dayStartFrom: js.UndefOr[Double] = js.native
  var dayStopTo: js.UndefOr[Double] = js.native
  var defaultEventBgColor: js.UndefOr[String] = js.native
  var displayWeekend: js.UndefOr[Boolean] = js.native
  var endResizable: js.UndefOr[Boolean] = js.native
  var eventItemHeight: js.UndefOr[Double] = js.native
  var eventItemLineHeight: js.UndefOr[Double] = js.native
  var eventItemPopoverEnabled: js.UndefOr[Boolean] = js.native
  var headerEnabled: js.UndefOr[Boolean] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var monthCellWidth: js.UndefOr[Double] = js.native
  var monthMaxEvents: js.UndefOr[Double] = js.native
  var monthResourceTableWidth: js.UndefOr[Double] = js.native
  var movable: js.UndefOr[Boolean] = js.native
  var nonAgendaSlotMinHeight: js.UndefOr[Double] = js.native
  var nonWorkingTimeBodyBgColor: js.UndefOr[String] = js.native
  var nonWorkingTimeHeadBgColor: js.UndefOr[String] = js.native
  var nonWorkingTimeHeadColor: js.UndefOr[String] = js.native
  var quarterCellWidth: js.UndefOr[Double] = js.native
  var quarterMaxEvents: js.UndefOr[Double] = js.native
  var quarterResourceTableWidth: js.UndefOr[Double] = js.native
  var recurringEventsEnabled: js.UndefOr[Boolean] = js.native
  var relativeMove: js.UndefOr[Boolean] = js.native
  var resourceName: js.UndefOr[String] = js.native
  var schedulerMaxHeight: js.UndefOr[Double] = js.native
  var schedulerWidth: js.UndefOr[Double | String] = js.native
  var scrollToSpecialMomentEnabled: js.UndefOr[Boolean] = js.native
  var selectedAreaColor: js.UndefOr[String] = js.native
  var startResizable: js.UndefOr[Boolean] = js.native
  var summaryColor: js.UndefOr[String] = js.native
  var summaryPos: js.UndefOr[SummaryPos] = js.native
  var tableHeaderHeight: js.UndefOr[Double] = js.native
  var views: js.UndefOr[js.Array[View]] = js.native
  var weekCellWidth: js.UndefOr[Double] = js.native
  var weekMaxEvents: js.UndefOr[Double] = js.native
  var weekResourceTableWidth: js.UndefOr[Double] = js.native
  var yearCellWidth: js.UndefOr[Double] = js.native
  var yearMaxEvents: js.UndefOr[Double] = js.native
  var yearResourceTableWidth: js.UndefOr[Double] = js.native
}

object SchedulerDataConfig {
  @scala.inline
  def apply(): SchedulerDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerDataConfig]
  }
  @scala.inline
  implicit class SchedulerDataConfigOps[Self <: SchedulerDataConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgendaMaxEventWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaMaxEventWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaMaxEventWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaMaxEventWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaResourceTableWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaResourceTableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaResourceTableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaResourceTableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarPopoverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarPopoverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarPopoverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarPopoverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckConflict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatable")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossResourceMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossResourceMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossResourceMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossResourceMove")(js.undefined)
        ret
    }
    @scala.inline
    def withDayCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayCellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayCellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDayMaxEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayMaxEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayMaxEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayMaxEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDayResourceTableWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayResourceTableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayResourceTableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayResourceTableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDayStartFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayStartFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayStartFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayStartFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withDayStopTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayStopTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayStopTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayStopTo")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEventBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventBgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEventBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventBgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayWeekend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayWeekend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayWeekend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayWeekend")(js.undefined)
        ret
    }
    @scala.inline
    def withEndResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withEventItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventItemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventItemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withEventItemLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventItemLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventItemLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventItemLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withEventItemPopoverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventItemPopoverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventItemPopoverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventItemPopoverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthCellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthCellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthMaxEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthMaxEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthMaxEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthMaxEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthResourceTableWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthResourceTableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthResourceTableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthResourceTableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(js.undefined)
        ret
    }
    @scala.inline
    def withNonAgendaSlotMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonAgendaSlotMinHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonAgendaSlotMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonAgendaSlotMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNonWorkingTimeBodyBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWorkingTimeBodyBgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonWorkingTimeBodyBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWorkingTimeBodyBgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNonWorkingTimeHeadBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWorkingTimeHeadBgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonWorkingTimeHeadBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWorkingTimeHeadBgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNonWorkingTimeHeadColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWorkingTimeHeadColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonWorkingTimeHeadColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWorkingTimeHeadColor")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarterCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterCellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarterCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterCellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarterMaxEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterMaxEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarterMaxEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterMaxEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarterResourceTableWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterResourceTableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarterResourceTableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarterResourceTableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurringEventsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurringEventsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurringEventsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurringEventsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeMove")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedulerMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedulerMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedulerWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedulerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToSpecialMomentEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToSpecialMomentEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToSpecialMomentEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToSpecialMomentEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedAreaColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAreaColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedAreaColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAreaColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStartResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryPos(value: SummaryPos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryPos")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: js.Array[View]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekCellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekCellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekMaxEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekMaxEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekMaxEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekMaxEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekResourceTableWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekResourceTableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekResourceTableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekResourceTableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withYearCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearCellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearCellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withYearMaxEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearMaxEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearMaxEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearMaxEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withYearResourceTableWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearResourceTableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearResourceTableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearResourceTableWidth")(js.undefined)
        ret
    }
  }
  
}

