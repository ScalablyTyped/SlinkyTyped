package typingsSlinky.rcPicker.datetimePanelMod

import slinky.core.facade.ReactElement
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

/* Inlined parent std.Omit<rc-picker.rc-picker/es/panels/DatePanel.DatePanelProps<DateType>, 'disabledHours' | 'disabledMinutes' | 'disabledSeconds'> */
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
  var nextIcon: js.UndefOr[ReactElement] = js.undefined
  var onPanelChange: js.Function2[/* mode */ PanelMode | Null, /* viewValue */ DateType, Unit]
  var onSelect: OnSelect[DateType]
  var onViewDateChange: js.Function1[/* value */ DateType, Unit]
  var operationRef: MutableRefObject[PanelRefProps]
  var panelName: js.UndefOr[String] = js.undefined
  var prefixCls: String
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.undefined
  var prevIcon: js.UndefOr[ReactElement] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
  var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.undefined
  var superNextIcon: js.UndefOr[ReactElement] = js.undefined
  var superPrevIcon: js.UndefOr[ReactElement] = js.undefined
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
    viewDate: DateType
  ): DatetimePanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onPanelChange = js.Any.fromFunction2(onPanelChange), onSelect = js.Any.fromFunction2(onSelect), onViewDateChange = js.Any.fromFunction1(onViewDateChange), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimePanelProps[DateType]]
  }
  @scala.inline
  implicit class DatetimePanelPropsOps[Self <: DatetimePanelProps[_], DateType] (val x: Self with DatetimePanelProps[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnPanelChange(value: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Unit): Self = this.set("onPanelChange", js.Any.fromFunction2(value))
    @scala.inline
    def setOnSelect(value: (DateType, /* type */ key | mouse | submit) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def setOnViewDateChange(value: /* value */ DateType => Unit): Self = this.set("onViewDateChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOperationRef(value: MutableRefObject[PanelRefProps]): Self = this.set("operationRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewDate(value: DateType): Self = this.set("viewDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setDateRender(value: (DateType, DateType) => ReactElement): Self = this.set("dateRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDateRender: Self = this.set("dateRender", js.undefined)
    @scala.inline
    def setDefaultPickerValue(value: DateType): Self = this.set("defaultPickerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPickerValue: Self = this.set("defaultPickerValue", js.undefined)
    @scala.inline
    def setDefaultValue(value: DateType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = this.set("disabledTime", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledTime: Self = this.set("disabledTime", js.undefined)
    @scala.inline
    def setKeyboardConfig(value: KeyboardConfig): Self = this.set("keyboardConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardConfig: Self = this.set("keyboardConfig", js.undefined)
    @scala.inline
    def setNextIconReactElement(value: ReactElement): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextIcon(value: ReactElement): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextIcon: Self = this.set("nextIcon", js.undefined)
    @scala.inline
    def setPanelName(value: String): Self = this.set("panelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelName: Self = this.set("panelName", js.undefined)
    @scala.inline
    def setPrefixColumn(value: /* date */ DateType => ReactElement): Self = this.set("prefixColumn", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrefixColumn: Self = this.set("prefixColumn", js.undefined)
    @scala.inline
    def setPrevIconReactElement(value: ReactElement): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevIcon(value: ReactElement): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevIcon: Self = this.set("prevIcon", js.undefined)
    @scala.inline
    def setRowClassName(value: /* date */ DateType => String): Self = this.set("rowClassName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowClassName: Self = this.set("rowClassName", js.undefined)
    @scala.inline
    def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = this.set("showTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTime: Self = this.set("showTime", js.undefined)
    @scala.inline
    def setSuperNextIconReactElement(value: ReactElement): Self = this.set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperNextIcon(value: ReactElement): Self = this.set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperNextIcon: Self = this.set("superNextIcon", js.undefined)
    @scala.inline
    def setSuperPrevIconReactElement(value: ReactElement): Self = this.set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperPrevIcon(value: ReactElement): Self = this.set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperPrevIcon: Self = this.set("superPrevIcon", js.undefined)
    @scala.inline
    def setValue(value: NullableDateType[DateType]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

