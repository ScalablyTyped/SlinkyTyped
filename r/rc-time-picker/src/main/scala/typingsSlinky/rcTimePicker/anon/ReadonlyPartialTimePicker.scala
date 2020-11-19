package typingsSlinky.rcTimePicker.anon

import slinky.core.facade.ReactElement
import typingsSlinky.moment.mod.Moment
import typingsSlinky.rcTimePicker.mod.TimePicker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Partial<rc-time-picker.rc-time-picker.TimePickerProps>> */
@js.native
trait ReadonlyPartialTimePicker extends js.Object {
  
  val addon: js.UndefOr[js.Function1[/* timepicker */ TimePicker, ReactElement]] = js.native
  
  val allowEmpty: js.UndefOr[Boolean] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val clearIcon: js.UndefOr[ReactElement] = js.native
  
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
  
  val inputIcon: js.UndefOr[ReactElement] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddon(value: /* timepicker */ TimePicker => ReactElement): Self = this.set("addon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddon: Self = this.set("addon", js.undefined)
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearIconReactElement(value: ReactElement): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIcon(value: ReactElement): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setClearText(value: String): Self = this.set("clearText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearText: Self = this.set("clearText", js.undefined)
    
    @scala.inline
    def setDefaultOpenValue(value: Moment): Self = this.set("defaultOpenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpenValue: Self = this.set("defaultOpenValue", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Moment): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledHours(value: () => js.Array[Double]): Self = this.set("disabledHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    
    @scala.inline
    def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = this.set("disabledMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisabledMinutes: Self = this.set("disabledMinutes", js.undefined)
    
    @scala.inline
    def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = this.set("disabledSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDisabledSeconds: Self = this.set("disabledSeconds", js.undefined)
    
    @scala.inline
    def setFocusOnOpen(value: Boolean): Self = this.set("focusOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnOpen: Self = this.set("focusOnOpen", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHideDisabledOptions(value: Boolean): Self = this.set("hideDisabledOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDisabledOptions: Self = this.set("hideDisabledOptions", js.undefined)
    
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputIconReactElement(value: ReactElement): Self = this.set("inputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIcon(value: ReactElement): Self = this.set("inputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputIcon: Self = this.set("inputIcon", js.undefined)
    
    @scala.inline
    def setInputReadOnly(value: Boolean): Self = this.set("inputReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputReadOnly: Self = this.set("inputReadOnly", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Moment => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* state */ Open => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* state */ Open => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    
    @scala.inline
    def setUse12Hours(value: Boolean): Self = this.set("use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse12Hours: Self = this.set("use12Hours", js.undefined)
    
    @scala.inline
    def setValue(value: Moment): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
