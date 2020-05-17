package typingsSlinky.angularBootstrapCalendar.mod.bootstrap.calendar

import typingsSlinky.angularBootstrapCalendar.anon.Angular
import typingsSlinky.angularBootstrapCalendar.anon.CalendarDayView
import typingsSlinky.angularBootstrapCalendar.anon.WeekNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarConfig extends js.Object {
  var allDateFormats: Angular = js.native
  var dateFormats: IDateFormats = js.native
  var dateFormatter: String = js.native
  var displayAllMonthEvents: Boolean = js.native
  var displayEventEndTimes: Boolean = js.native
  var i18nStrings: WeekNumber = js.native
  var showTimesOnWeekView: Boolean = js.native
  var templates: CalendarDayView = js.native
  var titleFormats: ITitleFormats = js.native
}

object ICalendarConfig {
  @scala.inline
  def apply(
    allDateFormats: Angular,
    dateFormats: IDateFormats,
    dateFormatter: String,
    displayAllMonthEvents: Boolean,
    displayEventEndTimes: Boolean,
    i18nStrings: WeekNumber,
    showTimesOnWeekView: Boolean,
    templates: CalendarDayView,
    titleFormats: ITitleFormats
  ): ICalendarConfig = {
    val __obj = js.Dynamic.literal(allDateFormats = allDateFormats.asInstanceOf[js.Any], dateFormats = dateFormats.asInstanceOf[js.Any], dateFormatter = dateFormatter.asInstanceOf[js.Any], displayAllMonthEvents = displayAllMonthEvents.asInstanceOf[js.Any], displayEventEndTimes = displayEventEndTimes.asInstanceOf[js.Any], i18nStrings = i18nStrings.asInstanceOf[js.Any], showTimesOnWeekView = showTimesOnWeekView.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], titleFormats = titleFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarConfig]
  }
  @scala.inline
  implicit class ICalendarConfigOps[Self <: ICalendarConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDateFormats(value: Angular): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDateFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFormats(value: IDateFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFormatter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayAllMonthEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAllMonthEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayEventEndTimes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEventEndTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18nStrings(value: WeekNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTimesOnWeekView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimesOnWeekView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplates(value: CalendarDayView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFormats(value: ITitleFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

