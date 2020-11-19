package typingsSlinky.reactDates.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDates.anon.EndDate
import typingsSlinky.reactDates.anon.IsVisible
import typingsSlinky.reactDates.anon.StartDate
import typingsSlinky.reactDates.mod.AnchorDirectionShape
import typingsSlinky.reactDates.mod.CalendarInfoPositionShape
import typingsSlinky.reactDates.mod.DateRangePickerCls
import typingsSlinky.reactDates.mod.DateRangePickerPhrases
import typingsSlinky.reactDates.mod.DateRangePickerShape
import typingsSlinky.reactDates.mod.DayOfWeekShape
import typingsSlinky.reactDates.mod.DisabledShape
import typingsSlinky.reactDates.mod.FocusedInputShape
import typingsSlinky.reactDates.mod.IconPositionShape
import typingsSlinky.reactDates.mod.OpenDirectionShape
import typingsSlinky.reactDates.mod.OrientationShape
import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangePicker {
  
  @JSImport("react-dates", "DateRangePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, DateRangePickerCls] {
    
    @scala.inline
    def anchorDirection(value: AnchorDirectionShape): this.type = set("anchorDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def appendToBody(value: Boolean): this.type = set("appendToBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calendarInfoPosition(value: CalendarInfoPositionShape): this.type = set("calendarInfoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customArrowIconReactElement(value: ReactElement): this.type = set("customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customArrowIcon(value: String | ReactElement): this.type = set("customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customCloseIconReactElement(value: ReactElement): this.type = set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customCloseIcon(value: String | ReactElement): this.type = set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInputIconReactElement(value: ReactElement): this.type = set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInputIcon(value: String | ReactElement): this.type = set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayAriaLabelFormat(value: String): this.type = set("dayAriaLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def daySize(value: Double): this.type = set("daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableScroll(value: Boolean): this.type = set("disableScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: DisabledShape): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayFormatFunction0(value: () => String): this.type = set("displayFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def displayFormat(value: String | js.Function0[String]): this.type = set("displayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableOutsideDays(value: Boolean): this.type = set("enableOutsideDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDate(value: momentObj): this.type = set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDateNull: this.type = set("endDate", null)
    
    @scala.inline
    def endDatePlaceholderText(value: String): this.type = set("endDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstDayOfWeek(value: DayOfWeekShape): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusedInput(value: FocusedInputShape): this.type = set("focusedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusedInputNull: this.type = set("focusedInput", null)
    
    @scala.inline
    def hideKeyboardShortcutsPanel(value: Boolean): this.type = set("hideKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontalMargin(value: Double): this.type = set("horizontalMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontalMonthPadding(value: Double): this.type = set("horizontalMonthPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialVisibleMonth(value: () => momentObj): this.type = set("initialVisibleMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def inputIconPosition(value: IconPositionShape): this.type = set("inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDayBlocked(value: /* day */ js.Any => Boolean): this.type = set("isDayBlocked", js.Any.fromFunction1(value))
    
    @scala.inline
    def isDayHighlighted(value: /* day */ js.Any => Boolean): this.type = set("isDayHighlighted", js.Any.fromFunction1(value))
    
    @scala.inline
    def isOutsideRange(value: /* day */ js.Any => Boolean): this.type = set("isOutsideRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keepFocusOnInput(value: Boolean): this.type = set("keepFocusOnInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keepOpenOnDateSelect(value: Boolean): this.type = set("keepOpenOnDateSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: momentObj): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: momentObj): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumNights(value: Double): this.type = set("minimumNights", value.asInstanceOf[js.Any])
    
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
    def onClose(value: /* final */ StartDate => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNextMonthClick(value: /* newCurrentMonth */ momentObj => Unit): this.type = set("onNextMonthClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPrevMonthClick(value: /* newCurrentMonth */ momentObj => Unit): this.type = set("onPrevMonthClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def openDirection(value: OpenDirectionShape): this.type = set("openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientation(value: OrientationShape): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def phrases(value: DateRangePickerPhrases): this.type = set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def regular(value: Boolean): this.type = set("regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderCalendarDay(value: /* day */ momentObj => String | ReactElement): this.type = set("renderCalendarDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderCalendarInfo(value: () => String | ReactElement): this.type = set("renderCalendarInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderDayContents(value: /* day */ momentObj => String | ReactElement): this.type = set("renderDayContents", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderMonthElement(value: /* props */ IsVisible => String | ReactElement): this.type = set("renderMonthElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderMonthText(value: /* day */ momentObj => String | ReactElement): this.type = set("renderMonthText", js.Any.fromFunction1(value))
    
    @scala.inline
    def reopenPickerOnClearDates(value: Boolean): this.type = set("reopenPickerOnClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def screenReaderInputMessage(value: String): this.type = set("screenReaderInputMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showClearDates(value: Boolean): this.type = set("showClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showDefaultInputIcon(value: Boolean): this.type = set("showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDate(value: momentObj): this.type = set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDateNull: this.type = set("startDate", null)
    
    @scala.inline
    def startDatePlaceholderText(value: String): this.type = set("startDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalHeight(value: Double): this.type = set("verticalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalSpacing(value: Double): this.type = set("verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def weekDayFormat(value: String): this.type = set("weekDayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withFullScreenPortal(value: Boolean): this.type = set("withFullScreenPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withPortal(value: Boolean): this.type = set("withPortal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DateRangePickerShape): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    endDateId: String,
    onDatesChange: EndDate => Unit,
    onFocusChange: js.UndefOr[FocusedInputShape] => Unit,
    startDateId: String
  ): Builder = {
    val __props = js.Dynamic.literal(endDateId = endDateId.asInstanceOf[js.Any], onDatesChange = js.Any.fromFunction1(onDatesChange), onFocusChange = js.Any.fromFunction1(onFocusChange), startDateId = startDateId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DateRangePickerShape]))
  }
}
