package typingsSlinky.rcPicker.datetimePanelMod

import slinky.core.TagMod
import typingsSlinky.rcPicker.dateBodyMod.DateRender
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.DisabledTime
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.NullableDateType
import typingsSlinky.rcPicker.interfaceMod.OnSelect
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PanelRefProps
import typingsSlinky.rcPicker.rcPickerStrings.key
import typingsSlinky.rcPicker.rcPickerStrings.mouse
import typingsSlinky.rcPicker.rcPickerStrings.submit
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import typingsSlinky.rcPicker.uiUtilMod.KeyboardConfig
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-picker.rc-picker/lib/panels/DatePanel.DatePanelProps<DateType>, 'disabledHours' | 'disabledMinutes' | 'disabledSeconds'> */
trait DatetimePanelProps[DateType] extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
  var defaultPickerValue: js.UndefOr[DateType] = js.undefined
  var defaultValue: js.UndefOr[DateType] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var keyboardConfig: js.UndefOr[KeyboardConfig] = js.undefined
  var locale: Locale
  var nextIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var onPanelChange: js.Function2[/* mode */ PanelMode | Null, /* viewValue */ DateType, Unit]
  var onSelect: OnSelect[DateType]
  var onViewDateChange: js.Function1[/* value */ DateType, Unit]
  var operationRef: MutableRefObject[PanelRefProps]
  var panelName: js.UndefOr[String] = js.undefined
  var prefixCls: String
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, TagMod[Any]]] = js.undefined
  var prevIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
  var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.undefined
  var superNextIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var superPrevIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var value: js.UndefOr[NullableDateType[DateType]] = js.undefined
  var viewDate: DateType
}

object DatetimePanelProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onPanelChange: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Unit,
    onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
    onViewDateChange: /* value */ DateType => Unit,
    operationRef: MutableRefObject[PanelRefProps],
    prefixCls: String,
    viewDate: DateType,
    active: js.UndefOr[Boolean] = js.undefined,
    dateRender: (DateType, DateType) => TagMod[Any] = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    disabledDate: /* date */ DateType => Boolean = null,
    disabledTime: /* date */ DateType | Null => DisabledTimes = null,
    keyboardConfig: KeyboardConfig = null,
    nextIcon: TagMod[Any] = null,
    panelName: String = null,
    prefixColumn: /* date */ DateType => TagMod[Any] = null,
    prevIcon: TagMod[Any] = null,
    rowClassName: /* date */ DateType => String = null,
    showTime: Boolean | SharedTimeProps[DateType] = null,
    superNextIcon: TagMod[Any] = null,
    superPrevIcon: TagMod[Any] = null,
    value: js.UndefOr[Null | NullableDateType[DateType]] = js.undefined
  ): DatetimePanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onPanelChange = js.Any.fromFunction2(onPanelChange), onSelect = js.Any.fromFunction2(onSelect), onViewDateChange = js.Any.fromFunction1(onViewDateChange), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1(disabledTime))
    if (keyboardConfig != null) __obj.updateDynamic("keyboardConfig")(keyboardConfig.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (panelName != null) __obj.updateDynamic("panelName")(panelName.asInstanceOf[js.Any])
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1(prefixColumn))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimePanelProps[DateType]]
  }
}

