package typingsSlinky.reactDateRange.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactDateRange.mod.AnyDate
import typingsSlinky.reactDateRange.mod.CalendarTheme
import typingsSlinky.reactDateRange.mod.DateContainerType
import typingsSlinky.reactDateRange.mod.DateInputType
import typingsSlinky.reactDateRange.mod.LanguageType
import typingsSlinky.reactDateRange.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_DateRangeProps_475329904[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def calendars(value: Double): this.type = set("calendars", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def dateDisplayFormat(value: String): this.type = set("dateDisplayFormat", value.asInstanceOf[js.Any])
  @scala.inline
  def dayDisplayFormat(value: String): this.type = set("dayDisplayFormat", value.asInstanceOf[js.Any])
  @scala.inline
  def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
  @scala.inline
  def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value :_*))
  @scala.inline
  def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
  @scala.inline
  def editableDateInputs(value: Boolean): this.type = set("editableDateInputs", value.asInstanceOf[js.Any])
  @scala.inline
  def endDate(value: Moment): this.type = set("endDate", value.asInstanceOf[js.Any])
  @scala.inline
  def endDatePlaceholder(value: String): this.type = set("endDatePlaceholder", value.asInstanceOf[js.Any])
  @scala.inline
  def firstDayOfWeek(value: Double): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
  @scala.inline
  def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
  @scala.inline
  def lang(value: LanguageType): this.type = set("lang", value.asInstanceOf[js.Any])
  @scala.inline
  def linkedCalendars(value: Boolean): this.type = set("linkedCalendars", value.asInstanceOf[js.Any])
  @scala.inline
  def locale(value: js.Object): this.type = set("locale", value.asInstanceOf[js.Any])
  @scala.inline
  def maxDateFunction1(value: /* now */ Moment => AnyDate): this.type = set("maxDate", js.Any.fromFunction1(value))
  @scala.inline
  def maxDate(value: DateInputType): this.type = set("maxDate", value.asInstanceOf[js.Any])
  @scala.inline
  def minDateFunction1(value: /* now */ Moment => AnyDate): this.type = set("minDate", js.Any.fromFunction1(value))
  @scala.inline
  def minDate(value: DateInputType): this.type = set("minDate", value.asInstanceOf[js.Any])
  @scala.inline
  def monthDisplayFormat(value: String): this.type = set("monthDisplayFormat", value.asInstanceOf[js.Any])
  @scala.inline
  def months(value: Double): this.type = set("months", value.asInstanceOf[js.Any])
  @scala.inline
  def moveRangeOnFirstSelection(value: Boolean): this.type = set("moveRangeOnFirstSelection", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* range */ Range => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onInit(value: /* range */ Range => Unit): this.type = set("onInit", js.Any.fromFunction1(value))
  @scala.inline
  def rangeColorsVarargs(value: String*): this.type = set("rangeColors", js.Array(value :_*))
  @scala.inline
  def rangeColors(value: js.Array[String]): this.type = set("rangeColors", value.asInstanceOf[js.Any])
  @scala.inline
  def rangedCalendars(value: Boolean): this.type = set("rangedCalendars", value.asInstanceOf[js.Any])
  @scala.inline
  def ranges(value: js.Object): this.type = set("ranges", value.asInstanceOf[js.Any])
  @scala.inline
  def scroll(value: js.Object): this.type = set("scroll", value.asInstanceOf[js.Any])
  @scala.inline
  def showMonthAndYearPickers(value: Boolean): this.type = set("showMonthAndYearPickers", value.asInstanceOf[js.Any])
  @scala.inline
  def showMonthArrow(value: Boolean): this.type = set("showMonthArrow", value.asInstanceOf[js.Any])
  @scala.inline
  def showSelectionPreview(value: Boolean): this.type = set("showSelectionPreview", value.asInstanceOf[js.Any])
  @scala.inline
  def shownDate(value: js.Date): this.type = set("shownDate", value.asInstanceOf[js.Any])
  @scala.inline
  def specialDaysVarargs(value: DateContainerType*): this.type = set("specialDays", js.Array(value :_*))
  @scala.inline
  def specialDays(value: js.Array[DateContainerType]): this.type = set("specialDays", value.asInstanceOf[js.Any])
  @scala.inline
  def startDate(value: Moment): this.type = set("startDate", value.asInstanceOf[js.Any])
  @scala.inline
  def startDatePlaceholder(value: String): this.type = set("startDatePlaceholder", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: CalendarTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  @scala.inline
  def twoStepChange(value: Boolean): this.type = set("twoStepChange", value.asInstanceOf[js.Any])
  @scala.inline
  def weekStartsOn(value: Double): this.type = set("weekStartsOn", value.asInstanceOf[js.Any])
  @scala.inline
  def weekdayDisplayFormat(value: String): this.type = set("weekdayDisplayFormat", value.asInstanceOf[js.Any])
}

