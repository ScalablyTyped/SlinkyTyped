package typingsSlinky.blueprintjsDatetime.dateInputMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsDatetime.anon.PartialIPopoverProps
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsDatetime.dateFormatMod.IDateFormatProps because var conflicts: locale. Inlined invalidDateMessage, outOfRangeMessage, placeholder, formatDate, formatDate, parseDate, parseDate */ @js.native
trait IDateInputProps
  extends IDatePickerBaseProps
     with IProps {
  
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * Passed to `DatePicker` component.
    * @default true
    */
  var canClearSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Text for the reset button in the date picker action bar.
    * Passed to `DatePicker` component.
    * @default "Clear"
    */
  var clearButtonText: js.UndefOr[String] = js.native
  
  /**
    * Whether the calendar popover should close when a date is selected.
    * @default true
    */
  var closeOnSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/api/DayPicker).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `fromMonth` (use `minDate`), `month` (use
    * `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  
  /**
    * The default date to be used in the component when uncontrolled.
    */
  var defaultValue: js.UndefOr[js.Date] = js.native
  
  /**
    * Whether the date input is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the component should take up the full width of its container.
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to render a JavaScript `Date` to a string.
    * Optional `locale` argument comes directly from the prop on this component:
    * if the prop is defined, then the argument will be too.
    */
  def formatDate(date: js.Date): String = js.native
  def formatDate(date: js.Date, locale: String): String = js.native
  
  /**
    * Props to pass to the [input group](#core/components/text-inputs.input-group).
    * `disabled` and `value` will be ignored in favor of the top-level props on this component.
    * `type` is fixed to "text" and `ref` is not supported; use `inputRef` instead.
    */
  var inputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
  
  /**
    * The error message to display when the date selected is invalid.
    * @default "Invalid date"
    */
  var invalidDateMessage: js.UndefOr[String] = js.native
  
  /**
    * Called when the user selects a new valid date through the `DatePicker` or by typing
    * in the input. The second argument is true if the user clicked on a date in the
    * calendar, changed the input value, or cleared the selection; it will be false if the date
    * was changed by choosing a new month or year.
    */
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.native
  
  /**
    * Called when the user finishes typing in a new date and the date causes an error state.
    * If the date is invalid, `new Date(undefined)` will be returned. If the date is out of range,
    * the out of range date will be returned (`onChange` is not called in this case).
    */
  var onError: js.UndefOr[js.Function1[/* errorDate */ js.Date, Unit]] = js.native
  
  /**
    * The error message to display when the date selected is out of range.
    * @default "Out of range"
    */
  var outOfRangeMessage: js.UndefOr[String] = js.native
  
  /**
    * Function to deserialize user input text to a JavaScript `Date` object.
    * Return `false` if the string is an invalid date.
    * Return `null` to represent the absence of a date.
    * Optional `locale` argument comes directly from the prop on this component.
    */
  def parseDate(str: String): js.Date | `false` | Null = js.native
  def parseDate(str: String, locale: String): js.Date | `false` | Null = js.native
  
  /**
    * Placeholder text to display in empty input fields.
    * Recommended practice is to indicate the expected date format.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Props to pass to the `Popover`.
    * Note that `content`, `autoFocus`, and `enforceFocus` cannot be changed.
    */
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
  
  /**
    * Element to render on right side of input.
    */
  var rightElement: js.UndefOr[ReactElement] = js.native
  
  /**
    * Whether shortcuts to quickly select a date are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    * @default false
    */
  var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.native
  
  /**
    * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown below the calendar.
    * @default false
    */
  var showActionsBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Text for the today button in the date picker action bar.
    * Passed to `DatePicker` component.
    * @default "Today"
    */
  var todayButtonText: js.UndefOr[String] = js.native
  
  /**
    * The currently selected day. If this prop is provided, the component acts in a controlled manner.
    * To display no date in the input field, pass `null` to the value prop. To display an invalid date error
    * in the input field, pass `new Date(undefined)` to the value prop.
    */
  var value: js.UndefOr[js.Date | Null] = js.native
}
