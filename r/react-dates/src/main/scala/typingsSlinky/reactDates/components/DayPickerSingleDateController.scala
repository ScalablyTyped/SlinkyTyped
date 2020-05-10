package typingsSlinky.reactDates.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDates.AnonDate
import typingsSlinky.reactDates.AnonFocused
import typingsSlinky.reactDates.AnonIsVisible
import typingsSlinky.reactDates.mod.CalendarInfoPositionShape
import typingsSlinky.reactDates.mod.DayPickerSingleDateControllerCls
import typingsSlinky.reactDates.mod.DayPickerSingleDateControllerShape
import typingsSlinky.reactDates.mod.ScrollableOrientationShape
import typingsSlinky.reactDates.mod.SingleDatePickerPhrases
import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import typingsSlinky.reactDates.reactDatesNumbers.`0`
import typingsSlinky.reactDates.reactDatesNumbers.`1`
import typingsSlinky.reactDates.reactDatesNumbers.`2`
import typingsSlinky.reactDates.reactDatesNumbers.`3`
import typingsSlinky.reactDates.reactDatesNumbers.`4`
import typingsSlinky.reactDates.reactDatesNumbers.`5`
import typingsSlinky.reactDates.reactDatesNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DayPickerSingleDateController {
  @JSImport("react-dates", "DayPickerSingleDateController")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, DayPickerSingleDateControllerCls] {
    @scala.inline
    def calendarInfoPosition(value: CalendarInfoPositionShape): this.type = set("calendarInfoPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def date(value: momentObj): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def dateNull: this.type = set("date", null)
    @scala.inline
    def dayAriaLabelFormat(value: String): this.type = set("dayAriaLabelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def daySize(value: Double): this.type = set("daySize", value.asInstanceOf[js.Any])
    @scala.inline
    def enableOutsideDays(value: Boolean): this.type = set("enableOutsideDays", value.asInstanceOf[js.Any])
    @scala.inline
    def firstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def hideKeyboardShortcutsPanel(value: Boolean): this.type = set("hideKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontalMonthPadding(value: Double): this.type = set("horizontalMonthPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def initialVisibleMonth(value: () => momentObj): this.type = set("initialVisibleMonth", js.Any.fromFunction0(value))
    @scala.inline
    def isDayBlocked(value: /* day */ js.Any => Boolean): this.type = set("isDayBlocked", js.Any.fromFunction1(value))
    @scala.inline
    def isDayHighlighted(value: /* day */ js.Any => Boolean): this.type = set("isDayHighlighted", js.Any.fromFunction1(value))
    @scala.inline
    def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def isOutsideRange(value: /* day */ js.Any => Boolean): this.type = set("isOutsideRange", js.Any.fromFunction1(value))
    @scala.inline
    def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def keepOpenOnDateSelect(value: Boolean): this.type = set("keepOpenOnDateSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def monthFormat(value: String): this.type = set("monthFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def navNextReactElement(value: ReactElement): this.type = set("navNext", value.asInstanceOf[js.Any])
    @scala.inline
    def navNext(value: String | ReactElement): this.type = set("navNext", value.asInstanceOf[js.Any])
    @scala.inline
    def navPrevReactElement(value: ReactElement): this.type = set("navPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def navPrev(value: String | ReactElement): this.type = set("navPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def noBorder(value: Boolean): this.type = set("noBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def numberOfMonths(value: Double): this.type = set("numberOfMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: () => Unit): this.type = set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def onClose(value: /* final */ AnonDate => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def onNextMonthClick(value: /* newCurrentMonth */ momentObj => Unit): this.type = set("onNextMonthClick", js.Any.fromFunction1(value))
    @scala.inline
    def onOutsideClick(value: /* e */ js.Any => Unit): this.type = set("onOutsideClick", js.Any.fromFunction1(value))
    @scala.inline
    def onPrevMonthClick(value: /* newCurrentMonth */ momentObj => Unit): this.type = set("onPrevMonthClick", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: ScrollableOrientationShape): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def phrases(value: SingleDatePickerPhrases): this.type = set("phrases", value.asInstanceOf[js.Any])
    @scala.inline
    def renderCalendarDay(value: /* day */ momentObj => String | ReactElement): this.type = set("renderCalendarDay", js.Any.fromFunction1(value))
    @scala.inline
    def renderCalendarInfo(value: () => String | ReactElement): this.type = set("renderCalendarInfo", js.Any.fromFunction0(value))
    @scala.inline
    def renderDayContents(value: /* day */ momentObj => String | ReactElement): this.type = set("renderDayContents", js.Any.fromFunction1(value))
    @scala.inline
    def renderMonthElement(value: /* props */ AnonIsVisible => String | ReactElement): this.type = set("renderMonthElement", js.Any.fromFunction1(value))
    @scala.inline
    def renderMonthText(value: /* day */ momentObj => String | ReactElement): this.type = set("renderMonthText", js.Any.fromFunction1(value))
    @scala.inline
    def showKeyboardShortcuts(value: Boolean): this.type = set("showKeyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalHeight(value: Double): this.type = set("verticalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def weekDayFormat(value: String): this.type = set("weekDayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def withPortal(value: Boolean): this.type = set("withPortal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DayPickerSingleDateControllerShape): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(focused: Boolean, onDateChange: js.UndefOr[momentObj] => Unit, onFocusChange: AnonFocused => Unit): Builder = {
    val __props = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], onDateChange = js.Any.fromFunction1(onDateChange), onFocusChange = js.Any.fromFunction1(onFocusChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[DayPickerSingleDateControllerShape]))
  }
}

