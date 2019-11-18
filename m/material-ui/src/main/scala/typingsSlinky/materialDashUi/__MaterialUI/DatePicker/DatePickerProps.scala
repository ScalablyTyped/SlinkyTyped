package typingsSlinky.materialDashUi.__MaterialUI.DatePicker

import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.materialDashUi.Anon_Locales
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.utils
import typingsSlinky.materialDashUi.materialDashUiStrings.`inline`
import typingsSlinky.materialDashUi.materialDashUiStrings.dialog
import typingsSlinky.materialDashUi.materialDashUiStrings.landscape
import typingsSlinky.materialDashUi.materialDashUiStrings.portrait
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.FocusEventHandler
import typingsSlinky.react.reactMod.KeyboardEventHandler
import typingsSlinky.react.reactMod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  // <TextField/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[Anon_Locales] = js.undefined
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
  var utils: js.UndefOr[typingsSlinky.materialDashUi.__MaterialUI.propTypes.utils] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    DateTimeFormat: Anon_Locales = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: TagMod[Any] = null,
    className: String = null,
    container: dialog | `inline` = null,
    defaultDate: js.Date = null,
    defaultValue: String = null,
    dialogContainerStyle: CSSProperties = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: TagMod[Any] = null,
    firstDayOfWeek: Int | Double = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: TagMod[Any] = null,
    formatDate: /* date */ js.Date => String = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hideCalendarDate: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: TagMod[Any] = null,
    id: String = null,
    inputStyle: CSSProperties = null,
    locale: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    mode: portrait | landscape = null,
    name: String = null,
    okLabel: TagMod[Any] = null,
    onBlur: SyntheticFocusEvent[js.Object] => Unit = null,
    onChange: (/* e */ js.Any, /* date */ js.Date) => Unit = null,
    onClick: SyntheticTouchEvent[js.Object] => Unit = null,
    onDismiss: () => Unit = null,
    onFocus: SyntheticFocusEvent[js.Object] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[js.Object] => Unit = null,
    onShow: () => Unit = null,
    openToYearSelection: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    rowsMax: Int | Double = null,
    shouldDisableDate: /* day */ js.Date => Boolean = null,
    style: CSSProperties = null,
    textFieldStyle: CSSProperties = null,
    `type`: String = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    utils: utils = null,
    value: js.Date = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dialogContainerStyle != null) __obj.updateDynamic("dialogContainerStyle")(dialogContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle.asInstanceOf[js.Any])
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction1(formatDate))
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCalendarDate)) __obj.updateDynamic("hideCalendarDate")(hideCalendarDate.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(openToYearSelection)) __obj.updateDynamic("openToYearSelection")(openToYearSelection.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1(shouldDisableDate))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (utils != null) __obj.updateDynamic("utils")(utils.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}

