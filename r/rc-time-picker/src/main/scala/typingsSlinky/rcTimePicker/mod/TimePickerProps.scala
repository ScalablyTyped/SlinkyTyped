package typingsSlinky.rcTimePicker.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.moment.mod.Moment
import typingsSlinky.rcTimePicker.AnonOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerProps extends js.Object {
  var allowEmpty: Boolean = js.native
  var className: String = js.native
  var clearIcon: TagMod[Any] = js.native
  var clearText: String = js.native
  var defaultOpenValue: Moment = js.native
  var defaultValue: Moment = js.native
  var disabled: Boolean = js.native
  var focusOnOpen: Boolean = js.native
  var format: String = js.native
  var hideDisabledOptions: Boolean = js.native
  var hourStep: Double = js.native
  var id: String = js.native
  var inputIcon: TagMod[Any] = js.native
  var inputReadOnly: Boolean = js.native
  var minuteStep: Double = js.native
  var open: Boolean = js.native
  var placeholder: String = js.native
  var placement: String = js.native
  var popupClassName: String = js.native
  var prefixCls: String = js.native
  var secondStep: Double = js.native
  var showHour: Boolean = js.native
  var showMinute: Boolean = js.native
  var showSecond: Boolean = js.native
  var transitionName: String = js.native
  var use12Hours: Boolean = js.native
  var value: Moment = js.native
  def addon(timepicker: TimePicker): ReactElement = js.native
  def disabledHours(): js.Array[Double] = js.native
  def disabledMinutes(hour: Double): js.Array[Double] = js.native
  def disabledSeconds(hour: Double, minute: Double): js.Array[Double] = js.native
  def onChange(value: Moment): Unit = js.native
  def onClose(state: AnonOpen): Unit = js.native
  def onOpen(state: AnonOpen): Unit = js.native
}

object TimePickerProps {
  @scala.inline
  def apply(
    addon: TimePicker => ReactElement,
    allowEmpty: Boolean,
    className: String,
    clearText: String,
    defaultOpenValue: Moment,
    defaultValue: Moment,
    disabled: Boolean,
    disabledHours: () => js.Array[Double],
    disabledMinutes: Double => js.Array[Double],
    disabledSeconds: (Double, Double) => js.Array[Double],
    focusOnOpen: Boolean,
    format: String,
    hideDisabledOptions: Boolean,
    hourStep: Double,
    id: String,
    inputReadOnly: Boolean,
    minuteStep: Double,
    onChange: Moment => Unit,
    onClose: AnonOpen => Unit,
    onOpen: AnonOpen => Unit,
    open: Boolean,
    placeholder: String,
    placement: String,
    popupClassName: String,
    prefixCls: String,
    secondStep: Double,
    showHour: Boolean,
    showMinute: Boolean,
    showSecond: Boolean,
    transitionName: String,
    use12Hours: Boolean,
    value: Moment
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal(addon = js.Any.fromFunction1(addon), allowEmpty = allowEmpty.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clearText = clearText.asInstanceOf[js.Any], defaultOpenValue = defaultOpenValue.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledHours = js.Any.fromFunction0(disabledHours), disabledMinutes = js.Any.fromFunction1(disabledMinutes), disabledSeconds = js.Any.fromFunction2(disabledSeconds), focusOnOpen = focusOnOpen.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hideDisabledOptions = hideDisabledOptions.asInstanceOf[js.Any], hourStep = hourStep.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputReadOnly = inputReadOnly.asInstanceOf[js.Any], minuteStep = minuteStep.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), open = open.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popupClassName = popupClassName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], secondStep = secondStep.asInstanceOf[js.Any], showHour = showHour.asInstanceOf[js.Any], showMinute = showMinute.asInstanceOf[js.Any], showSecond = showSecond.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
  @scala.inline
  implicit class TimePickerPropsOps[Self <: TimePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddon(value: TimePicker => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOpenValue(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledHours(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisabledMinutes(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMinutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisabledSeconds(value: (Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSeconds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFocusOnOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideDisabledOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabledOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinuteStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClose(value: AnonOpen => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: AnonOpen => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMinute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSecond(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse12Hours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use12Hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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
  }
  
}

