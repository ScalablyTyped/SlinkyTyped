package typingsSlinky.rcTimePicker.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.moment.mod.Moment
import typingsSlinky.rcTimePicker.mod.TimePicker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Partial<rc-time-picker.rc-time-picker.TimePickerProps>> */
@js.native
trait ReadonlyPartialTimePicker extends js.Object {
  val addon: js.UndefOr[js.Function1[/* timepicker */ TimePicker, ReactElement]] = js.native
  val allowEmpty: js.UndefOr[Boolean] = js.native
  val className: js.UndefOr[String] = js.native
  val clearIcon: js.UndefOr[TagMod[Any]] = js.native
  val clearText: js.UndefOr[String] = js.native
  val defaultOpenValue: js.UndefOr[Moment] = js.native
  val defaultValue: js.UndefOr[Moment] = js.native
  val disabled: js.UndefOr[Boolean] = js.native
  val disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
  val disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
  val disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
  val focusOnOpen: js.UndefOr[Boolean] = js.native
  val format: js.UndefOr[String] = js.native
  val hideDisabledOptions: js.UndefOr[Boolean] = js.native
  val hourStep: js.UndefOr[Double] = js.native
  val id: js.UndefOr[String] = js.native
  val inputIcon: js.UndefOr[TagMod[Any]] = js.native
  val inputReadOnly: js.UndefOr[Boolean] = js.native
  val minuteStep: js.UndefOr[Double] = js.native
  val onChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.native
  val onClose: js.UndefOr[js.Function1[/* state */ Open, Unit]] = js.native
  val onOpen: js.UndefOr[js.Function1[/* state */ Open, Unit]] = js.native
  val open: js.UndefOr[Boolean] = js.native
  val placeholder: js.UndefOr[String] = js.native
  val placement: js.UndefOr[String] = js.native
  val popupClassName: js.UndefOr[String] = js.native
  val prefixCls: js.UndefOr[String] = js.native
  val secondStep: js.UndefOr[Double] = js.native
  val showHour: js.UndefOr[Boolean] = js.native
  val showMinute: js.UndefOr[Boolean] = js.native
  val showSecond: js.UndefOr[Boolean] = js.native
  val transitionName: js.UndefOr[String] = js.native
  val use12Hours: js.UndefOr[Boolean] = js.native
  val value: js.UndefOr[Moment] = js.native
}

object ReadonlyPartialTimePicker {
  @scala.inline
  def apply(): ReadonlyPartialTimePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPartialTimePicker]
  }
  @scala.inline
  implicit class ReadonlyPartialTimePickerOps[Self <: ReadonlyPartialTimePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddon(value: /* timepicker */ TimePicker => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addon")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClearIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withClearText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearText")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOpenValue(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpenValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledHours(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisabledHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMinutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSeconds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDisabledSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDisabledOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabledOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDisabledOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabledOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHourStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withInputReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* state */ Open => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* state */ Open => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSecond(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withUse12Hours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use12Hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse12Hours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use12Hours")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

