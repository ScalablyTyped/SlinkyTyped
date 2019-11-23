package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.Anon_Locales
import typingsSlinky.materialDashUi.__MaterialUI.DatePicker.DatePickerProps
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.utils
import typingsSlinky.materialDashUi.datePickerMod.default
import typingsSlinky.materialDashUi.materialDashUiStrings.`inline`
import typingsSlinky.materialDashUi.materialDashUiStrings.dialog
import typingsSlinky.materialDashUi.materialDashUiStrings.landscape
import typingsSlinky.materialDashUi.materialDashUiStrings.portrait
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.datePickerMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, disabled, id, name, onBlur, onClick, onFocus, onKeyDown, rows, type */
  def apply(
    DateTimeFormat: Anon_Locales = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: TagMod[Any] = null,
    container: dialog | `inline` = null,
    defaultDate: js.Date = null,
    defaultValue: String = null,
    dialogContainerStyle: CSSProperties = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
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
    inputStyle: CSSProperties = null,
    locale: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    mode: portrait | landscape = null,
    okLabel: TagMod[Any] = null,
    onChange: (/* e */ js.Any, /* date */ js.Date) => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    openToYearSelection: js.UndefOr[Boolean] = js.undefined,
    rowsMax: Int | Double = null,
    shouldDisableDate: /* day */ js.Date => Boolean = null,
    style: CSSProperties = null,
    textFieldStyle: CSSProperties = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    utils: utils = null,
    value: js.Date = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dialogContainerStyle != null) __obj.updateDynamic("dialogContainerStyle")(dialogContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection.asInstanceOf[js.Any])
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
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(openToYearSelection)) __obj.updateDynamic("openToYearSelection")(openToYearSelection.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1(shouldDisableDate))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle.asInstanceOf[js.Any])
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (utils != null) __obj.updateDynamic("utils")(utils.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DatePickerProps
}

