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

@js.native
trait DatePickerProps extends js.Object {
  // <TextField/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[Call] = js.native
  var autoOk: js.UndefOr[Boolean] = js.native
  var cancelLabel: js.UndefOr[TagMod[Any]] = js.native
  // From <TextField />
  var className: js.UndefOr[String] = js.native
  var container: js.UndefOr[dialog | `inline`] = js.native
  var defaultDate: js.UndefOr[js.Date] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var dialogContainerStyle: js.UndefOr[CSSProperties] = js.native
  var disableYearSelection: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var errorStyle: js.UndefOr[CSSProperties] = js.native
  var errorText: js.UndefOr[TagMod[Any]] = js.native
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.native
  var floatingLabelText: js.UndefOr[TagMod[Any]] = js.native
  var formatDate: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var hideCalendarDate: js.UndefOr[Boolean] = js.native
  var hintStyle: js.UndefOr[CSSProperties] = js.native
  var hintText: js.UndefOr[TagMod[Any]] = js.native
  var id: js.UndefOr[String] = js.native
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  var locale: js.UndefOr[String] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var mode: js.UndefOr[portrait | landscape] = js.native
  var name: js.UndefOr[String] = js.native
  var okLabel: js.UndefOr[TagMod[Any]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* date */ js.Date, Unit]] = js.native
  var onClick: js.UndefOr[TouchEventHandler[js.Object]] = js.native
   // e is always null
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var openToYearSelection: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[Double] = js.native
  var rowsMax: js.UndefOr[Double] = js.native
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var textFieldStyle: js.UndefOr[CSSProperties] = js.native
  var `type`: js.UndefOr[String] = js.native
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.native
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.native
  var underlineShow: js.UndefOr[Boolean] = js.native
  var underlineStyle: js.UndefOr[CSSProperties] = js.native
  var utils: js.UndefOr[typingsSlinky.materialUi.MaterialUI.propTypes.utils] = js.native
  var value: js.UndefOr[js.Date] = js.native
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
    def withDateTimeFormat(value: Call): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoOk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOk")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(js.undefined)
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
    def withContainer(value: dialog | `inline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
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
    def withDialogContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableYearSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableYearSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableYearSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableYearSelection")(js.undefined)
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
    def withErrorStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatingLabelText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDate(value: /* date */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCalendarDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCalendarDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCalendarDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCalendarDate")(js.undefined)
        ret
    }
    @scala.inline
    def withHintStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHintTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHintText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(js.undefined)
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
    def withInputStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOkLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOkLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* e */ js.Any, /* date */ js.Date) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticTouchEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenToYearSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openToYearSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenToYearSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openToYearSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsMax")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldDisableDate(value: /* day */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDisableDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldDisableDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDisableDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFieldStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFieldStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFieldStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFieldStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineDisabledStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineDisabledStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineDisabledStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineDisabledStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineFocusStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineFocusStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineFocusStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineFocusStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineShow")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUtils(value: utils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtils: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
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

