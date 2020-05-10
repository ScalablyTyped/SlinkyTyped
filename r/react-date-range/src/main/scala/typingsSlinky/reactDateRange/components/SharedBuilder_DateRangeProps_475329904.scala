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
  def endDate(value: Moment): this.type = set("endDate", value.asInstanceOf[js.Any])
  @scala.inline
  def firstDayOfWeek(value: Double): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
  @scala.inline
  def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
  @scala.inline
  def lang(value: LanguageType): this.type = set("lang", value.asInstanceOf[js.Any])
  @scala.inline
  def linkedCalendars(value: Boolean): this.type = set("linkedCalendars", value.asInstanceOf[js.Any])
  @scala.inline
  def maxDateFunction1(value: /* now */ Moment => AnyDate): this.type = set("maxDate", js.Any.fromFunction1(value))
  @scala.inline
  def maxDate(value: DateInputType): this.type = set("maxDate", value.asInstanceOf[js.Any])
  @scala.inline
  def minDateFunction1(value: /* now */ Moment => AnyDate): this.type = set("minDate", js.Any.fromFunction1(value))
  @scala.inline
  def minDate(value: DateInputType): this.type = set("minDate", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* range */ Range => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onInit(value: /* range */ Range => Unit): this.type = set("onInit", js.Any.fromFunction1(value))
  @scala.inline
  def rangedCalendars(value: Boolean): this.type = set("rangedCalendars", value.asInstanceOf[js.Any])
  @scala.inline
  def ranges(value: js.Object): this.type = set("ranges", value.asInstanceOf[js.Any])
  @scala.inline
  def specialDays(value: js.Array[DateContainerType]): this.type = set("specialDays", value.asInstanceOf[js.Any])
  @scala.inline
  def startDate(value: Moment): this.type = set("startDate", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: CalendarTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  @scala.inline
  def twoStepChange(value: Boolean): this.type = set("twoStepChange", value.asInstanceOf[js.Any])
}

