package typingsSlinky.blueprintjsDatetime.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsSlinky.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsDatetime.mod.DatePicker] {
  @JSImport("@blueprintjs/datetime", "DatePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    clearButtonText: String = null,
    dayPickerProps: DayPickerProps = null,
    defaultValue: js.Date = null,
    highlightCurrentDay: js.UndefOr[Boolean] = js.undefined,
    initialMonth: js.Date = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    modifiers: IDatePickerModifiers = null,
    onChange: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit = null,
    onShortcutChange: (/* shortcut */ IDatePickerShortcut, /* index */ Double) => Unit = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    selectedShortcutIndex: Int | Double = null,
    shortcuts: Boolean | js.Array[IDatePickerShortcut] = null,
    showActionsBar: js.UndefOr[Boolean] = js.undefined,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    todayButtonText: String = null,
    value: js.Date = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DatePicker] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightCurrentDay)) __obj.updateDynamic("highlightCurrentDay")(highlightCurrentDay.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShortcutChange != null) __obj.updateDynamic("onShortcutChange")(js.Any.fromFunction2(onShortcutChange))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(showActionsBar)) __obj.updateDynamic("showActionsBar")(showActionsBar.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (todayButtonText != null) __obj.updateDynamic("todayButtonText")(todayButtonText.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DatePicker] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsDatetime.mod.DatePicker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDatePickerProps
}

