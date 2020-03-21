package typingsSlinky.antd.generateCalendarMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.AnonLang
import typingsSlinky.antd.antdStrings.date
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.time
import typingsSlinky.rcPicker.interfaceMod.Components
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.generateCalendarMod.PickerPanelBaseProps[DateType]
  - typingsSlinky.antd.generateCalendarMod.PickerPanelDateProps[DateType]
  - typingsSlinky.antd.generateCalendarMod.PickerPanelTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object

object PickerProps {
  @scala.inline
  def PickerPanelBaseProps[DateType](
    picker: Exclude[PickerMode, date | time],
    className: String = null,
    components: Components = null,
    dateRender: (DateType, DateType) => TagMod[Any] = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    direction: ltr | rtl = null,
    disabledDate: DateType => Boolean = null,
    hideHeader: js.UndefOr[Boolean] = js.undefined,
    locale: AnonLang = null,
    mode: PanelMode = null,
    monthCellRender: (DateType, /* locale */ Locale) => TagMod[Any] = null,
    onChange: DateType => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onOk: DateType => Unit = null,
    onPanelChange: (DateType, /* mode */ PanelMode) => Unit = null,
    onPickerValueChange: DateType => Unit = null,
    onSelect: DateType => Unit = null,
    pickerValue: DateType = null,
    prefixCls: String = null,
    renderExtraFooter: /* mode */ PanelMode => TagMod[Any] = null,
    size: large | typingsSlinky.antd.antdStrings.default | small = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    value: DateType = null
  ): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (!js.isUndefined(hideHeader)) __obj.updateDynamic("hideHeader")(hideHeader.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2(monthCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onPickerValueChange != null) __obj.updateDynamic("onPickerValueChange")(js.Any.fromFunction1(onPickerValueChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (pickerValue != null) __obj.updateDynamic("pickerValue")(pickerValue.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  @scala.inline
  def PickerPanelDateProps[DateType](
    className: String = null,
    components: Components = null,
    dateRender: (DateType, DateType) => TagMod[Any] = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    direction: ltr | rtl = null,
    disabledDate: DateType => Boolean = null,
    disabledTime: /* date */ DateType | Null => DisabledTimes = null,
    hideHeader: js.UndefOr[Boolean] = js.undefined,
    locale: AnonLang = null,
    mode: PanelMode = null,
    monthCellRender: (DateType, /* locale */ Locale) => TagMod[Any] = null,
    onChange: DateType => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onOk: DateType => Unit = null,
    onPanelChange: (DateType, /* mode */ PanelMode) => Unit = null,
    onPickerValueChange: DateType => Unit = null,
    onSelect: DateType => Unit = null,
    picker: date = null,
    pickerValue: DateType = null,
    prefixCls: String = null,
    renderExtraFooter: /* mode */ PanelMode => TagMod[Any] = null,
    showTime: Boolean | SharedTimeProps[DateType] = null,
    showToday: js.UndefOr[Boolean] = js.undefined,
    size: large | typingsSlinky.antd.antdStrings.default | small = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    value: DateType = null
  ): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1(disabledTime))
    if (!js.isUndefined(hideHeader)) __obj.updateDynamic("hideHeader")(hideHeader.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2(monthCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onPickerValueChange != null) __obj.updateDynamic("onPickerValueChange")(js.Any.fromFunction1(onPickerValueChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (pickerValue != null) __obj.updateDynamic("pickerValue")(pickerValue.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  @scala.inline
  def PickerPanelTimeProps[DateType](
    picker: time,
    className: String = null,
    components: Components = null,
    dateRender: (DateType, DateType) => TagMod[Any] = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    direction: ltr | rtl = null,
    disabledDate: DateType => Boolean = null,
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: /* hour */ Double => js.Array[Double] = null,
    disabledSeconds: (/* hour */ Double, /* minute */ Double) => js.Array[Double] = null,
    format: String = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hideHeader: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    locale: AnonLang = null,
    minuteStep: Int | Double = null,
    mode: PanelMode = null,
    monthCellRender: (DateType, /* locale */ Locale) => TagMod[Any] = null,
    onChange: DateType => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onOk: DateType => Unit = null,
    onPanelChange: (DateType, /* mode */ PanelMode) => Unit = null,
    onPickerValueChange: DateType => Unit = null,
    onSelect: DateType => Unit = null,
    pickerValue: DateType = null,
    prefixCls: String = null,
    renderExtraFooter: /* mode */ PanelMode => TagMod[Any] = null,
    secondStep: Int | Double = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    size: large | typingsSlinky.antd.antdStrings.default | small = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: DateType = null
  ): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2(disabledSeconds))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHeader)) __obj.updateDynamic("hideHeader")(hideHeader.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2(monthCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onPickerValueChange != null) __obj.updateDynamic("onPickerValueChange")(js.Any.fromFunction1(onPickerValueChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (pickerValue != null) __obj.updateDynamic("pickerValue")(pickerValue.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
}

