package typingsSlinky.atBlueprintjsDatetime.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsFormsInputGroupMod.IInputGroupProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typingsSlinky.atBlueprintjsDatetime.atBlueprintjsDatetimeNumbers.`false`
import typingsSlinky.atBlueprintjsDatetime.libEsmCommonDateUtilsMod.DateRange
import typingsSlinky.atBlueprintjsDatetime.libEsmDatePickerCoreMod.IDatePickerModifiers
import typingsSlinky.atBlueprintjsDatetime.libEsmDateRangeInputMod.IDateRangeInputProps
import typingsSlinky.atBlueprintjsDatetime.libEsmShortcutsMod.IDateRangeShortcut
import typingsSlinky.atBlueprintjsDatetime.libEsmTimePickerMod.ITimePickerProps
import typingsSlinky.atBlueprintjsDatetime.libEsmTimePickerMod.TimePrecision
import typingsSlinky.reactDashDayDashPicker.typesPropsMod.DayPickerProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRangeInput
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atBlueprintjsDatetime.libEsmDateRangeInputMod.DateRangeInput
    ] {
  @JSImport("@blueprintjs/datetime/lib/esm/dateRangeInput", "DateRangeInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onChange, onError, placeholder */
  def apply(
    formatDate: (js.Date, js.UndefOr[String]) => String,
    parseDate: (String, js.UndefOr[String]) => js.Date | Null | `false`,
    allowSingleDayRange: js.UndefOr[Boolean] = js.undefined,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: DateRange = null,
    endInputProps: HTMLInputProps with IInputGroupProps = null,
    initialMonth: js.Date = null,
    invalidDateMessage: String = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    modifiers: IDatePickerModifiers = null,
    outOfRangeMessage: String = null,
    overlappingDatesMessage: String = null,
    popoverProps: Partial[IPopoverProps] = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    shortcuts: Boolean | js.Array[IDateRangeShortcut] = null,
    singleMonthOnly: js.UndefOr[Boolean] = js.undefined,
    startInputProps: HTMLInputProps with IInputGroupProps = null,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    value: DateRange = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atBlueprintjsDatetime.libEsmDateRangeInputMod.DateRangeInput
  ] = {
    val __obj = js.Dynamic.literal(formatDate = js.Any.fromFunction2(formatDate), parseDate = js.Any.fromFunction2(parseDate))
    if (!js.isUndefined(allowSingleDayRange)) __obj.updateDynamic("allowSingleDayRange")(allowSingleDayRange.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(contiguousCalendarMonths)) __obj.updateDynamic("contiguousCalendarMonths")(contiguousCalendarMonths.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (endInputProps != null) __obj.updateDynamic("endInputProps")(endInputProps.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (invalidDateMessage != null) __obj.updateDynamic("invalidDateMessage")(invalidDateMessage.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (outOfRangeMessage != null) __obj.updateDynamic("outOfRangeMessage")(outOfRangeMessage.asInstanceOf[js.Any])
    if (overlappingDatesMessage != null) __obj.updateDynamic("overlappingDatesMessage")(overlappingDatesMessage.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(singleMonthOnly)) __obj.updateDynamic("singleMonthOnly")(singleMonthOnly.asInstanceOf[js.Any])
    if (startInputProps != null) __obj.updateDynamic("startInputProps")(startInputProps.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDateRangeInputProps
}

