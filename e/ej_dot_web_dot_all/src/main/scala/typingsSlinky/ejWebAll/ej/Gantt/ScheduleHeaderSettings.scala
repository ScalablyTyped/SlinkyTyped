package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleHeaderSettings extends js.Object {
  /** Specified the format for day view in schedule header
    */
  var dayHeaderFormat: js.UndefOr[String] = js.native
  /** Specified the format for Hour view in schedule header
    * @Default {HH}
    */
  var hourHeaderFormat: js.UndefOr[String] = js.native
  /** Specifies the number of minutes per interval
    * @Default {ej.Gantt.minutesPerInterval.Auto}
    */
  var minutesPerInterval: js.UndefOr[typingsSlinky.ejWebAll.ej.Gantt.minutesPerInterval | String] = js.native
  /** Specified the format for month view in schedule header
    * @Default {MMM}
    */
  var monthHeaderFormat: js.UndefOr[String] = js.native
  /** Specifies the schedule mode
    * @Default {ej.Gantt.ScheduleHeaderType.Week}
    */
  var scheduleHeaderType: js.UndefOr[ScheduleHeaderType | String] = js.native
  /** Specifies the round-off mode for the start date in schedule header.
    * @Default {ej.Gantt.TimescaleRoundMode.Auto}
    */
  var timescaleStartDateMode: js.UndefOr[TimescaleRoundMode | String] = js.native
  /** Specifies the size of the lowest time unit along the timescale, with minimum value as &quot;50%&quot; and maximum value as &quot;500%&quot;. It is also possible to set the value
    * in pixels.
    * @Default {100%}
    */
  var timescaleUnitSize: js.UndefOr[String] = js.native
  /** Enable or disable the automatic timescale update on cell editing, dialog editing and taskbar editing.
    * @Default {true}
    */
  var updateTimescaleView: js.UndefOr[Boolean] = js.native
  /** Specified the format for week view in schedule header
    * @Default {MMM dd , yyyy}
    */
  var weekHeaderFormat: js.UndefOr[String] = js.native
  /** Specifies the start day of the week in week timescale mode
    * @Default {0}
    */
  var weekStartDay: js.UndefOr[Double] = js.native
  /** Specified the background for weekends in Gantt
    * @Default {#F2F2F2}
    */
  var weekendBackground: js.UndefOr[String] = js.native
  /** Specified the format for year view in schedule header
    * @Default {yyyy}
    */
  var yearHeaderFormat: js.UndefOr[String] = js.native
}

object ScheduleHeaderSettings {
  @scala.inline
  def apply(): ScheduleHeaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleHeaderSettings]
  }
  @scala.inline
  implicit class ScheduleHeaderSettingsOps[Self <: ScheduleHeaderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withHourHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutesPerInterval(value: minutesPerInterval | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesPerInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutesPerInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesPerInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleHeaderType(value: ScheduleHeaderType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleHeaderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleHeaderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleHeaderType")(js.undefined)
        ret
    }
    @scala.inline
    def withTimescaleStartDateMode(value: TimescaleRoundMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timescaleStartDateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimescaleStartDateMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timescaleStartDateMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTimescaleUnitSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timescaleUnitSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimescaleUnitSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timescaleUnitSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTimescaleView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTimescaleView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTimescaleView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTimescaleView")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStartDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStartDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartDay")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekendBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekendBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekendBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekendBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withYearHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearHeaderFormat")(js.undefined)
        ret
    }
  }
  
}

