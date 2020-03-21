package typingsSlinky.blueprintjsDatetime.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsDatetime.PartialIPopoverProps
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.dateInputMod.IDateInputProps
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateInput] {
  @JSImport("@blueprintjs/datetime", "DateInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, placeholder */
  def apply(
    formatDate: (js.Date, js.UndefOr[String]) => String,
    parseDate: (String, js.UndefOr[String]) => js.Date | Null | `false`,
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    clearButtonText: String = null,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: js.Date = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    initialMonth: js.Date = null,
    inputProps: HTMLInputProps with IInputGroupProps = null,
    invalidDateMessage: String = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    modifiers: IDatePickerModifiers = null,
    onChange: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit = null,
    onError: /* errorDate */ js.Date => Unit = null,
    outOfRangeMessage: String = null,
    popoverProps: PartialIPopoverProps with js.Object = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    rightElement: ReactElement = null,
    shortcuts: Boolean | js.Array[IDatePickerShortcut] = null,
    showActionsBar: js.UndefOr[Boolean] = js.undefined,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    todayButtonText: String = null,
    value: js.Date = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateInput] = {
    val __obj = js.Dynamic.literal(formatDate = js.Any.fromFunction2(formatDate), parseDate = js.Any.fromFunction2(parseDate))
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (invalidDateMessage != null) __obj.updateDynamic("invalidDateMessage")(invalidDateMessage.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (outOfRangeMessage != null) __obj.updateDynamic("outOfRangeMessage")(outOfRangeMessage.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(showActionsBar)) __obj.updateDynamic("showActionsBar")(showActionsBar.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (todayButtonText != null) __obj.updateDynamic("todayButtonText")(todayButtonText.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDateInputProps
}

