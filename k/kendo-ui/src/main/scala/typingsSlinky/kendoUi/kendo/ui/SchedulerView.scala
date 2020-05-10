package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerView extends js.Object {
  var adaptiveSlotHeight: js.UndefOr[Boolean] = js.native
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.native
  var allDaySlot: js.UndefOr[Boolean] = js.native
  var allDaySlotTemplate: js.UndefOr[String | js.Function] = js.native
  var columnWidth: js.UndefOr[Double] = js.native
  var dateHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var dayTemplate: js.UndefOr[String | js.Function] = js.native
  var editable: js.UndefOr[Boolean | SchedulerViewEditable] = js.native
  var endTime: js.UndefOr[js.Date] = js.native
  var eventHeight: js.UndefOr[Double | String] = js.native
  var eventSpacing: js.UndefOr[Double] = js.native
  var eventTemplate: js.UndefOr[String | js.Function] = js.native
  var eventTimeTemplate: js.UndefOr[String | js.Function] = js.native
  var eventsPerDay: js.UndefOr[Double] = js.native
  var group: js.UndefOr[SchedulerViewGroup] = js.native
  var majorTick: js.UndefOr[Double] = js.native
  var majorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var minorTickCount: js.UndefOr[Double] = js.native
  var minorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var name: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var selectedDateFormat: js.UndefOr[String] = js.native
  var selectedShortDateFormat: js.UndefOr[String] = js.native
  var showWorkHours: js.UndefOr[Boolean] = js.native
  var slotTemplate: js.UndefOr[String | js.Function] = js.native
  var startTime: js.UndefOr[js.Date] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var workWeekEnd: js.UndefOr[Double] = js.native
  var workWeekStart: js.UndefOr[Double] = js.native
}

object SchedulerView {
  @scala.inline
  def apply(): SchedulerView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerView]
  }
  @scala.inline
  implicit class SchedulerViewOps[Self <: SchedulerView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveSlotHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveSlotHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveSlotHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveSlotHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDayEventTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayEventTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayEventTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayEventTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDaySlot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDaySlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDaySlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDaySlot")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDaySlotTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDaySlotTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDaySlotTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDaySlotTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDateHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDayTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean | SchedulerViewEditable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEventHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimeTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsPerDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsPerDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsPerDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsPerDay")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: SchedulerViewGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTick(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTick")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTimeHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTimeHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTimeHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTimeHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTimeHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTimeHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTimeHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTimeHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
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
    def withSelectedDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedShortDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedShortDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWorkHours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWorkHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWorkHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWorkHours")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeekEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeekEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeekStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeekStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekStart")(js.undefined)
        ret
    }
  }
  
}

