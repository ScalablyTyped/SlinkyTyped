package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.TimePickerProps
import typingsSlinky.materialDashUi.materialDashUiStrings.`24hr`
import typingsSlinky.materialDashUi.materialDashUiStrings.ampm
import typingsSlinky.materialDashUi.timePickerMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/TimePicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, defaultValue, disabled, id, name, onBlur, onClick, onFocus, onKeyDown, rows, type */
  def apply(
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: TagMod[Any] = null,
    defaultTime: js.Date = null,
    dialogBodyStyle: CSSProperties = null,
    dialogStyle: CSSProperties = null,
    errorStyle: CSSProperties = null,
    errorText: TagMod[Any] = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFocusStyle: CSSProperties = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: TagMod[Any] = null,
    format: ampm | `24hr` = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: TagMod[Any] = null,
    inputStyle: CSSProperties = null,
    minutesStep: Int | Double = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    okLabel: TagMod[Any] = null,
    onChange: (/* e */ js.Any, /* time */ js.Date) => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    pedantic: js.UndefOr[Boolean] = js.undefined,
    rowsMax: Int | Double = null,
    style: CSSProperties = null,
    textFieldStyle: CSSProperties = null,
    textareaStyle: CSSProperties = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    value: js.Date = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime.asInstanceOf[js.Any])
    if (dialogBodyStyle != null) __obj.updateDynamic("dialogBodyStyle")(dialogBodyStyle.asInstanceOf[js.Any])
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed.asInstanceOf[js.Any])
    if (floatingLabelFocusStyle != null) __obj.updateDynamic("floatingLabelFocusStyle")(floatingLabelFocusStyle.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle.asInstanceOf[js.Any])
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (minutesStep != null) __obj.updateDynamic("minutesStep")(minutesStep.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLine)) __obj.updateDynamic("multiLine")(multiLine.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle.asInstanceOf[js.Any])
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle.asInstanceOf[js.Any])
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TimePickerProps
}

