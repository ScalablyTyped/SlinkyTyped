package typingsSlinky.materialUi.MaterialUI.DatePicker

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.materialUi.MaterialUI.propTypes.utils
import typingsSlinky.materialUi.anon.Call
import typingsSlinky.materialUi.materialUiStrings.`inline`
import typingsSlinky.materialUi.materialUiStrings.dialog
import typingsSlinky.materialUi.materialUiStrings.landscape
import typingsSlinky.materialUi.materialUiStrings.portrait
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  // <TextField/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[Call] = js.undefined
  var autoOk: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[TagMod[Any]] = js.undefined
  // From <TextField />
  var className: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[dialog | `inline`] = js.undefined
  var defaultDate: js.UndefOr[js.Date] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var dialogContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var disableYearSelection: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorStyle: js.UndefOr[CSSProperties] = js.undefined
  var errorText: js.UndefOr[TagMod[Any]] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.undefined
  var floatingLabelText: js.UndefOr[TagMod[Any]] = js.undefined
  var formatDate: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var hideCalendarDate: js.UndefOr[Boolean] = js.undefined
  var hintStyle: js.UndefOr[CSSProperties] = js.undefined
  var hintText: js.UndefOr[TagMod[Any]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var mode: js.UndefOr[portrait | landscape] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var okLabel: js.UndefOr[TagMod[Any]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* date */ js.Date, Unit]] = js.undefined
  var onClick: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
   // e is always null
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var openToYearSelection: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsMax: js.UndefOr[Double] = js.undefined
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textFieldStyle: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineShow: js.UndefOr[Boolean] = js.undefined
  var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
  var utils: js.UndefOr[typingsSlinky.materialUi.MaterialUI.propTypes.utils] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
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
    def setDateTimeFormat(value: Call): Self = this.set("DateTimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTimeFormat: Self = this.set("DateTimeFormat", js.undefined)
    @scala.inline
    def setAutoOk(value: Boolean): Self = this.set("autoOk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOk: Self = this.set("autoOk", js.undefined)
    @scala.inline
    def setCancelLabelReactElement(value: ReactElement): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelLabel(value: TagMod[Any]): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContainer(value: dialog | `inline`): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDefaultDate(value: js.Date): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDialogContainerStyle(value: CSSProperties): Self = this.set("dialogContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogContainerStyle: Self = this.set("dialogContainerStyle", js.undefined)
    @scala.inline
    def setDisableYearSelection(value: Boolean): Self = this.set("disableYearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableYearSelection: Self = this.set("disableYearSelection", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setErrorStyle(value: CSSProperties): Self = this.set("errorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorStyle: Self = this.set("errorStyle", js.undefined)
    @scala.inline
    def setErrorTextReactElement(value: ReactElement): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorText(value: TagMod[Any]): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorText: Self = this.set("errorText", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setFloatingLabelStyle(value: CSSProperties): Self = this.set("floatingLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelStyle: Self = this.set("floatingLabelStyle", js.undefined)
    @scala.inline
    def setFloatingLabelTextReactElement(value: ReactElement): Self = this.set("floatingLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloatingLabelText(value: TagMod[Any]): Self = this.set("floatingLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelText: Self = this.set("floatingLabelText", js.undefined)
    @scala.inline
    def setFormatDate(value: /* date */ js.Date => String): Self = this.set("formatDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatDate: Self = this.set("formatDate", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setHideCalendarDate(value: Boolean): Self = this.set("hideCalendarDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCalendarDate: Self = this.set("hideCalendarDate", js.undefined)
    @scala.inline
    def setHintStyle(value: CSSProperties): Self = this.set("hintStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHintStyle: Self = this.set("hintStyle", js.undefined)
    @scala.inline
    def setHintTextReactElement(value: ReactElement): Self = this.set("hintText", value.asInstanceOf[js.Any])
    @scala.inline
    def setHintText(value: TagMod[Any]): Self = this.set("hintText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHintText: Self = this.set("hintText", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMode(value: portrait | landscape): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOkLabelReactElement(value: ReactElement): Self = this.set("okLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOkLabel(value: TagMod[Any]): Self = this.set("okLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkLabel: Self = this.set("okLabel", js.undefined)
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[js.Object] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: (/* e */ js.Any, /* date */ js.Date) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: SyntheticTouchEvent[js.Object] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[js.Object] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOpenToYearSelection(value: Boolean): Self = this.set("openToYearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenToYearSelection: Self = this.set("openToYearSelection", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRowsMax(value: Double): Self = this.set("rowsMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsMax: Self = this.set("rowsMax", js.undefined)
    @scala.inline
    def setShouldDisableDate(value: /* day */ js.Date => Boolean): Self = this.set("shouldDisableDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldDisableDate: Self = this.set("shouldDisableDate", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTextFieldStyle(value: CSSProperties): Self = this.set("textFieldStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFieldStyle: Self = this.set("textFieldStyle", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnderlineDisabledStyle(value: CSSProperties): Self = this.set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineDisabledStyle: Self = this.set("underlineDisabledStyle", js.undefined)
    @scala.inline
    def setUnderlineFocusStyle(value: CSSProperties): Self = this.set("underlineFocusStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineFocusStyle: Self = this.set("underlineFocusStyle", js.undefined)
    @scala.inline
    def setUnderlineShow(value: Boolean): Self = this.set("underlineShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineShow: Self = this.set("underlineShow", js.undefined)
    @scala.inline
    def setUnderlineStyle(value: CSSProperties): Self = this.set("underlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineStyle: Self = this.set("underlineStyle", js.undefined)
    @scala.inline
    def setUtils(value: utils): Self = this.set("utils", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtils: Self = this.set("utils", js.undefined)
    @scala.inline
    def setValue(value: js.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

