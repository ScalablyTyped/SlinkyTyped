package typingsSlinky.reactDates.anon

import slinky.core.facade.ReactElement
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactDates.mod.AnchorDirectionShape
import typingsSlinky.reactDates.mod.CalendarDayShape
import typingsSlinky.reactDates.mod.CalendarInfoPositionShape
import typingsSlinky.reactDates.mod.DateRangePickerPhrases
import typingsSlinky.reactDates.mod.DayOfWeekShape
import typingsSlinky.reactDates.mod.DisabledShape
import typingsSlinky.reactDates.mod.FocusedInputShape
import typingsSlinky.reactDates.mod.IconPositionShape
import typingsSlinky.reactDates.mod.ModifiersShape
import typingsSlinky.reactDates.mod.NavPositionShape
import typingsSlinky.reactDates.mod.OpenDirectionShape
import typingsSlinky.reactDates.mod.OrientationShape
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorDirection extends StObject {
  
  var anchorDirection: js.UndefOr[AnchorDirectionShape] = js.native
  
  var appendToBody: js.UndefOr[Boolean] = js.native
  
  var block: js.UndefOr[Boolean] = js.native
  
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.native
  
  var customArrowIcon: js.UndefOr[ReactElement] = js.native
  
  var customCloseIcon: js.UndefOr[ReactElement] = js.native
  
  var customInputIcon: js.UndefOr[ReactElement] = js.native
  
  var dayAriaLabelFormat: js.UndefOr[String] = js.native
  
  // navigation related props
  var dayPickerNavigationInlineStyles: js.UndefOr[(Record[String, _]) | Null] = js.native
  
  var daySize: js.UndefOr[Double] = js.native
  
  var disableScroll: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[DisabledShape] = js.native
  
  // internationalization props
  var displayFormat: js.UndefOr[String | js.Function0[String]] = js.native
  
  var enableOutsideDays: js.UndefOr[Boolean] = js.native
  
  var endDate: Moment | Null = js.native
  
  var endDateAriaLabel: js.UndefOr[String] = js.native
  
  var endDateId: String = js.native
  
  var endDateOffset: js.UndefOr[js.Function1[/* day */ Moment, Moment]] = js.native
  
  var endDatePlaceholderText: js.UndefOr[String] = js.native
  
  var firstDayOfWeek: js.UndefOr[DayOfWeekShape | Null] = js.native
  
  var focusedInput: FocusedInputShape | Null = js.native
  
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.native
  
  var horizontalMargin: js.UndefOr[Double] = js.native
  
  var horizontalMonthPadding: js.UndefOr[Double] = js.native
  
  var initialVisibleMonth: js.UndefOr[js.Function0[Moment] | Null] = js.native
  
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.native
  
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var keepFocusOnInput: js.UndefOr[Boolean] = js.native
  
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.native
  
  var maxDate: js.UndefOr[Moment] = js.native
  
  var minDate: js.UndefOr[Moment] = js.native
  
  var minimumNights: js.UndefOr[Double] = js.native
  
  var monthFormat: js.UndefOr[String] = js.native
  
  var navNext: js.UndefOr[ReactElement] = js.native
  
  var navPosition: js.UndefOr[NavPositionShape] = js.native
  
  var navPrev: js.UndefOr[ReactElement] = js.native
  
  var noBorder: js.UndefOr[Boolean] = js.native
  
  var numberOfMonths: js.UndefOr[Double] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* final */ EndDate, Unit]] = js.native
  
  def onDatesChange(arg: EndDate): Unit = js.native
  
  def onFocusChange(): Unit = js.native
  def onFocusChange(arg: FocusedInputShape): Unit = js.native
  
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.native
  
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.native
  
  var openDirection: js.UndefOr[OpenDirectionShape] = js.native
  
  var orientation: js.UndefOr[OrientationShape] = js.native
  
  var phrases: js.UndefOr[DateRangePickerPhrases] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var regular: js.UndefOr[Boolean] = js.native
  
  // day presentation and interaction related props
  var renderCalendarDay: js.UndefOr[js.Function1[/* props */ CalendarDayShape, ReactElement]] = js.native
  
  var renderCalendarInfo: js.UndefOr[js.Function0[ReactElement] | Null] = js.native
  
  var renderDayContents: js.UndefOr[
    (js.Function2[/* day */ Moment, /* modifiers */ ModifiersShape, ReactElement]) | Null
  ] = js.native
  
  var renderNavNextButton: js.UndefOr[(js.Function1[/* props */ AriaLabel, ReactElement]) | Null] = js.native
  
  var renderNavPrevButton: js.UndefOr[(js.Function1[/* props */ AriaLabel, ReactElement]) | Null] = js.native
  
  // calendar presentation and interaction related props
  var renderWeekHeaderElement: js.UndefOr[(js.Function1[/* day */ String, ReactElement]) | Null] = js.native
  
  var reopenPickerOnClearDates: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var screenReaderInputMessage: js.UndefOr[String] = js.native
  
  var showClearDates: js.UndefOr[Boolean] = js.native
  
  var showDefaultInputIcon: js.UndefOr[Boolean] = js.native
  
  var small: js.UndefOr[Boolean] = js.native
  
  // required props for a functional interactive DateRangePicker
  var startDate: Moment | Null = js.native
  
  var startDateAriaLabel: js.UndefOr[String] = js.native
  
  var startDateId: String = js.native
  
  var startDateOffset: js.UndefOr[js.Function1[/* day */ Moment, Moment]] = js.native
  
  // input related props
  var startDatePlaceholderText: js.UndefOr[String] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
  
  var verticalHeight: js.UndefOr[Double | Null] = js.native
  
  var verticalSpacing: js.UndefOr[Double] = js.native
  
  var weekDayFormat: js.UndefOr[String] = js.native
  
  var withFullScreenPortal: js.UndefOr[Boolean] = js.native
  
  var withPortal: js.UndefOr[Boolean] = js.native
}
