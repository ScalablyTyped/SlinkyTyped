package typingsSlinky.reactInfiniteCalendar.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInfiniteCalendar.AnonAccentColor
import typingsSlinky.reactInfiniteCalendar.AnonBlank
import typingsSlinky.reactInfiniteCalendar.AnonEnd
import typingsSlinky.reactInfiniteCalendar.AnonHideYearsOnSelect
import typingsSlinky.reactInfiniteCalendar.mod.DateType
import typingsSlinky.reactInfiniteCalendar.mod.RangedSelection
import typingsSlinky.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarBooleans.`false`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.`100Percentsign`
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.auto
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.days
import typingsSlinky.reactInfiniteCalendar.reactInfiniteCalendarStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ReactInfiniteCalendarProps1567389525[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def Component(value: ReactComponentClass[ReactInfiniteCalendarProps]): this.type = set("Component", value.asInstanceOf[js.Any])
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def disabledDates(value: js.Array[DateType]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
  @scala.inline
  def disabledDays(value: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]): this.type = set("disabledDays", value.asInstanceOf[js.Any])
  @scala.inline
  def display(value: days | years): this.type = set("display", value.asInstanceOf[js.Any])
  @scala.inline
  def displayOptions(value: AnonHideYearsOnSelect): this.type = set("displayOptions", value.asInstanceOf[js.Any])
  @scala.inline
  def height(value: Double | auto): this.type = set("height", value.asInstanceOf[js.Any])
  @scala.inline
  def interpolateSelection(value: (/* date */ js.Date, /* selected */ js.Array[js.Date]) => js.Array[js.Date]): this.type = set("interpolateSelection", js.Any.fromFunction2(value))
  @scala.inline
  def locale(value: AnonBlank): this.type = set("locale", value.asInstanceOf[js.Any])
  @scala.inline
  def maxDate(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
  @scala.inline
  def max(value: DateType): this.type = set("max", value.asInstanceOf[js.Any])
  @scala.inline
  def maxDateDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
  @scala.inline
  def minDate(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
  @scala.inline
  def min(value: DateType): this.type = set("min", value.asInstanceOf[js.Any])
  @scala.inline
  def minDateDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
  @scala.inline
  def onScroll(value: /* scrollTop */ Double => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
  @scala.inline
  def onScrollEnd(value: /* scrollTop */ Double => Unit): this.type = set("onScrollEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onSelect(value: (/* date */ js.Date) | (/* rangedDate */ RangedSelection) => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
  @scala.inline
  def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
  @scala.inline
  def selectedDate(value: js.Date): this.type = set("selected", value.asInstanceOf[js.Any])
  @scala.inline
  def selected(value: DateType | `false` | AnonEnd): this.type = set("selected", value.asInstanceOf[js.Any])
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: AnonAccentColor): this.type = set("theme", value.asInstanceOf[js.Any])
  @scala.inline
  def width(value: Double | auto | `100Percentsign`): this.type = set("width", value.asInstanceOf[js.Any])
}

