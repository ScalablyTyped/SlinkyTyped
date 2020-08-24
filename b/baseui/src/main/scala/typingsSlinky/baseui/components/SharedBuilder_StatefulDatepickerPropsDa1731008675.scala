package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.BeginDate
import typingsSlinky.baseui.anon.Date
import typingsSlinky.baseui.anon.DateDate
import typingsSlinky.baseui.anon.DateEvent
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.mouseLeave
import typingsSlinky.baseui.baseuiStrings.mouseOver
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveLeft
import typingsSlinky.baseui.baseuiStrings.moveRight
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.datepickerMod.ContainerState
import typingsSlinky.baseui.datepickerMod.DatepickerOverrides
import typingsSlinky.baseui.datepickerMod.DatepickerProps
import typingsSlinky.baseui.datepickerMod.SharedStylePropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_StatefulDatepickerPropsDa1731008675 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
  @scala.inline
  def autoFocusCalendar(value: Boolean): this.type = set("autoFocusCalendar", value.asInstanceOf[js.Any])
  @scala.inline
  def children(value: /* args */ DatepickerProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
  @scala.inline
  def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def displayValueAtRangeIndex(value: Double): this.type = set("displayValueAtRangeIndex", value.asInstanceOf[js.Any])
  @scala.inline
  def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
  @scala.inline
  def excludeDatesVarargs(value: js.Date*): this.type = set("excludeDates", js.Array(value :_*))
  @scala.inline
  def excludeDates(value: js.Array[js.Date]): this.type = set("excludeDates", value.asInstanceOf[js.Any])
  @scala.inline
  def filterDate(value: /* day */ js.Date => Boolean): this.type = set("filterDate", js.Any.fromFunction1(value))
  @scala.inline
  def formatDisplayValue(value: (/* date */ js.Date | js.Array[js.Date], /* formatString */ String) => String): this.type = set("formatDisplayValue", js.Any.fromFunction2(value))
  @scala.inline
  def formatString(value: String): this.type = set("formatString", value.asInstanceOf[js.Any])
  @scala.inline
  def highlightedDate(value: js.Date): this.type = set("highlightedDate", value.asInstanceOf[js.Any])
  @scala.inline
  def includeDatesVarargs(value: js.Date*): this.type = set("includeDates", js.Array(value :_*))
  @scala.inline
  def includeDates(value: js.Array[js.Date]): this.type = set("includeDates", value.asInstanceOf[js.Any])
  @scala.inline
  def initialState(value: ContainerState): this.type = set("initialState", value.asInstanceOf[js.Any])
  @scala.inline
  def locale(value: js.Any): this.type = set("locale", value.asInstanceOf[js.Any])
  @scala.inline
  def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
  @scala.inline
  def maskNull: this.type = set("mask", null)
  @scala.inline
  def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
  @scala.inline
  def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
  @scala.inline
  def monthsShown(value: Double): this.type = set("monthsShown", value.asInstanceOf[js.Any])
  @scala.inline
  def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* args */ Date => js.Any): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onClose(value: () => _): this.type = set("onClose", js.Any.fromFunction0(value))
  @scala.inline
  def onDayClick(value: /* args */ DateEvent => _): this.type = set("onDayClick", js.Any.fromFunction1(value))
  @scala.inline
  def onDayMouseLeave(value: /* args */ DateEvent => _): this.type = set("onDayMouseLeave", js.Any.fromFunction1(value))
  @scala.inline
  def onDayMouseOver(value: /* args */ DateEvent => _): this.type = set("onDayMouseOver", js.Any.fromFunction1(value))
  @scala.inline
  def onMonthChange(value: /* args */ DateDate => _): this.type = set("onMonthChange", js.Any.fromFunction1(value))
  @scala.inline
  def onYearChange(value: /* args */ DateDate => _): this.type = set("onYearChange", js.Any.fromFunction1(value))
  @scala.inline
  def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
  @scala.inline
  def overrides(value: DatepickerOverrides[SharedStylePropsT]): this.type = set("overrides", value.asInstanceOf[js.Any])
  @scala.inline
  def peekNextMonth(value: Boolean): this.type = set("peekNextMonth", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
  @scala.inline
  def quickSelect(value: Boolean): this.type = set("quickSelect", value.asInstanceOf[js.Any])
  @scala.inline
  def quickSelectOptionsVarargs(value: BeginDate*): this.type = set("quickSelectOptions", js.Array(value :_*))
  @scala.inline
  def quickSelectOptions(value: js.Array[BeginDate]): this.type = set("quickSelectOptions", value.asInstanceOf[js.Any])
  @scala.inline
  def range(value: Boolean): this.type = set("range", value.asInstanceOf[js.Any])
  @scala.inline
  def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  @scala.inline
  def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
  @scala.inline
  def stateReducer(
    value: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => ContainerState
  ): this.type = set("stateReducer", js.Any.fromFunction3(value))
  @scala.inline
  def timeSelectEnd(value: Boolean): this.type = set("timeSelectEnd", value.asInstanceOf[js.Any])
  @scala.inline
  def timeSelectStart(value: Boolean): this.type = set("timeSelectStart", value.asInstanceOf[js.Any])
  @scala.inline
  def trapTabbing(value: Boolean): this.type = set("trapTabbing", value.asInstanceOf[js.Any])
  @scala.inline
  def valueVarargs(value: js.Date*): this.type = set("value", js.Array(value :_*))
  @scala.inline
  def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  @scala.inline
  def value(value: js.Date | js.Array[js.Date]): this.type = set("value", value.asInstanceOf[js.Any])
  @scala.inline
  def valueNull: this.type = set("value", null)
}

