package typingsSlinky.reactDates.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactDates.anon.Date
import typingsSlinky.reactDates.anon.Focused
import typingsSlinky.reactDates.anon.IsVisible
import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// shapes/SingleDatePickerShape.js
@js.native
trait SingleDatePickerShape extends js.Object {
  
  var anchorDirection: js.UndefOr[AnchorDirectionShape] = js.native
  
  var appendToBody: js.UndefOr[Boolean] = js.native
  
  var block: js.UndefOr[Boolean] = js.native
  
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.native
  
  var customCloseIcon: js.UndefOr[String | ReactElement] = js.native
  
  var customInputIcon: js.UndefOr[String | ReactElement] = js.native
  
  // required props for a functional interactive SingleDatePicker
  var date: momentObj | Null = js.native
  
  var dayAriaLabelFormat: js.UndefOr[String] = js.native
  
  var daySize: js.UndefOr[Double] = js.native
  
  var disableScroll: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  // internationalization props
  var displayFormat: js.UndefOr[String | js.Function0[String]] = js.native
  
  var enableOutsideDays: js.UndefOr[Boolean] = js.native
  
  var firstDayOfWeek: js.UndefOr[DayOfWeekShape] = js.native
  
  var focused: Boolean | Null = js.native
  
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.native
  
  var horizontalMargin: js.UndefOr[Double] = js.native
  
  var horizontalMonthPadding: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var initialVisibleMonth: js.UndefOr[js.Function0[momentObj]] = js.native
  
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.native
  
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var keepFocusOnInput: js.UndefOr[Boolean] = js.native
  
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.native
  
  var monthFormat: js.UndefOr[String] = js.native
  
  var navNext: js.UndefOr[String | ReactElement] = js.native
  
  // navigation related props
  var navPrev: js.UndefOr[String | ReactElement] = js.native
  
  var noBorder: js.UndefOr[Boolean] = js.native
  
  var numberOfMonths: js.UndefOr[Double] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* final */ Date, Unit]] = js.native
  
  def onDateChange(): Unit = js.native
  def onDateChange(date: momentObj): Unit = js.native
  
  def onFocusChange(arg: Focused): Unit = js.native
  
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.native
  
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.native
  
  var openDirection: js.UndefOr[OpenDirectionShape] = js.native
  
  var orientation: js.UndefOr[OrientationShape] = js.native
  
  var phrases: js.UndefOr[SingleDatePickerPhrases] = js.native
  
  // input related props
  var placeholder: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var regular: js.UndefOr[Boolean] = js.native
  
  // day presentation and interaction related props
  var renderCalendarDay: js.UndefOr[js.Function1[/* day */ momentObj, String | ReactElement]] = js.native
  
  var renderCalendarInfo: js.UndefOr[js.Function0[String | ReactElement]] = js.native
  
  var renderDayContents: js.UndefOr[js.Function1[/* day */ momentObj, String | ReactElement]] = js.native
  
  var renderMonthElement: js.UndefOr[js.Function1[/* props */ IsVisible, String | ReactElement]] = js.native
  
  // calendar presentation and interaction related props
  var renderMonthText: js.UndefOr[js.Function1[/* day */ momentObj, String | ReactElement]] = js.native
  
  var reopenPickerOnClearDate: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var screenReaderInputMessage: js.UndefOr[String] = js.native
  
  var showClearDate: js.UndefOr[Boolean] = js.native
  
  var showDefaultInputIcon: js.UndefOr[Boolean] = js.native
  
  var small: js.UndefOr[Boolean] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
  
  var verticalHeight: js.UndefOr[Double | Null] = js.native
  
  var verticalSpacing: js.UndefOr[Double] = js.native
  
  var weekDayFormat: js.UndefOr[String] = js.native
  
  var withFullScreenPortal: js.UndefOr[Boolean] = js.native
  
  var withPortal: js.UndefOr[Boolean] = js.native
}
