package typingsSlinky.rcPicker.datetimePanelMod

import slinky.core.TagMod
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

/* Inlined parent std.Omit<rc-picker.rc-picker/lib/panels/DatePanel.DatePanelProps<DateType>, 'disabledHours' | 'disabledMinutes' | 'disabledSeconds'> */
@js.native
trait DatetimePanelProps[DateType] extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var dateRender: js.UndefOr[DateRender[DateType]] = js.native
  var defaultPickerValue: js.UndefOr[DateType] = js.native
  var defaultValue: js.UndefOr[DateType] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var keyboardConfig: js.UndefOr[KeyboardConfig] = js.native
  var locale: Locale = js.native
  var nextIcon: js.UndefOr[TagMod[Any]] = js.native
  var onPanelChange: js.Function2[/* mode */ PanelMode | Null, /* viewValue */ DateType, Unit] = js.native
  var onSelect: OnSelect[DateType] = js.native
  var onViewDateChange: js.Function1[/* value */ DateType, Unit] = js.native
  var operationRef: MutableRefObject[PanelRefProps] = js.native
  var panelName: js.UndefOr[String] = js.native
  var prefixCls: String = js.native
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, TagMod[Any]]] = js.native
  var prevIcon: js.UndefOr[TagMod[Any]] = js.native
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
  var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.native
  var superNextIcon: js.UndefOr[TagMod[Any]] = js.native
  var superPrevIcon: js.UndefOr[TagMod[Any]] = js.native
  var value: js.UndefOr[NullableDateType[DateType]] = js.native
  var viewDate: DateType = js.native
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
  implicit class DatetimePanelPropsOps[Self[datetype] <: DatetimePanelProps[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withGenerateConfig(value: GenerateConfig[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPanelChange(value: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanelChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: (DateType, /* type */ key | mouse | submit) => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnViewDateChange(value: /* value */ DateType => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewDateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOperationRef(value: MutableRefObject[PanelRefProps]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewDate(value: DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRender(value: (DateType, DateType) => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDateRender: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPickerValue(value: DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPickerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPickerValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPickerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDate(value: /* date */ DateType => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledDate: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledTime: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardConfig(value: KeyboardConfig): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardConfig: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNextIconReactElement(value: ReactElement): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextIcon(value: TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextIcon: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelName(value: String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelName: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixColumn(value: /* date */ DateType => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrefixColumn: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevIconReactElement(value: ReactElement): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevIcon(value: TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevIcon: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClassName(value: /* date */ DateType => String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowClassName: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTime(value: Boolean | SharedTimeProps[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTime: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperNextIconReactElement(value: ReactElement): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperNextIcon(value: TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperNextIcon: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superNextIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperPrevIconReactElement(value: ReactElement): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperPrevIcon(value: TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperPrevIcon: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superPrevIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: NullableDateType[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

