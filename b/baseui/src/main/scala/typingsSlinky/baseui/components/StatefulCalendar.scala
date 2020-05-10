package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonBeginDate
import typingsSlinky.baseui.AnonDate
import typingsSlinky.baseui.AnonDateDate
import typingsSlinky.baseui.AnonDateEvent
import typingsSlinky.baseui.StatefulDatepickerPropsCa
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.mouseLeave
import typingsSlinky.baseui.baseuiStrings.mouseOver
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveLeft
import typingsSlinky.baseui.baseuiStrings.moveRight
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.datepickerMod.ContainerState
import typingsSlinky.baseui.datepickerMod.DatepickerOverrides
import typingsSlinky.baseui.datepickerMod.SharedStylePropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulCalendar {
  @JSImport("baseui/datepicker", "StatefulCalendar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def autoFocusCalendar(value: Boolean): this.type = set("autoFocusCalendar", value.asInstanceOf[js.Any])
    @scala.inline
    def excludeDates(value: js.Array[js.Date]): this.type = set("excludeDates", value.asInstanceOf[js.Any])
    @scala.inline
    def filterDate(value: /* day */ js.Date => Boolean): this.type = set("filterDate", js.Any.fromFunction1(value))
    @scala.inline
    def highlightedDate(value: js.Date): this.type = set("highlightedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def includeDates(value: js.Array[js.Date]): this.type = set("includeDates", value.asInstanceOf[js.Any])
    @scala.inline
    def initialState(value: ContainerState): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: js.Any): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def monthsShown(value: Double): this.type = set("monthsShown", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* args */ AnonDate => js.Any): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onDayClick(value: /* args */ AnonDateEvent => _): this.type = set("onDayClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDayMouseLeave(value: /* args */ AnonDateEvent => _): this.type = set("onDayMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDayMouseOver(value: /* args */ AnonDateEvent => _): this.type = set("onDayMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def onMonthChange(value: /* args */ AnonDateDate => _): this.type = set("onMonthChange", js.Any.fromFunction1(value))
    @scala.inline
    def onYearChange(value: /* args */ AnonDateDate => _): this.type = set("onYearChange", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: DatepickerOverrides[SharedStylePropsT]): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def peekNextMonth(value: Boolean): this.type = set("peekNextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def quickSelect(value: Boolean): this.type = set("quickSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def quickSelectOptions(value: js.Array[AnonBeginDate]): this.type = set("quickSelectOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def range(value: Boolean): this.type = set("range", value.asInstanceOf[js.Any])
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
    def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Date | js.Array[js.Date]): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: StatefulDatepickerPropsCa): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulCalendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

