package typingsSlinky.baseui.pinCodeMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.baseui.AnonValues
import typingsSlinky.baseui.baseuiStrings.both
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.inputMod.InputOverrides
import typingsSlinky.baseui.inputMod.SharedProps
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/pin-code.Omit<baseui.baseui/input.InputProps, 'onChange' | 'value'> & {  overrides ? :baseui.baseui/pin-code.PinCodeOverrides,   values  :std.Array<string>,   manageFocus ? :boolean, onChange (args : {  values  :std.Array<string>,   event  :react.react.FormEvent<std.HTMLInputElement>}): void} */
trait PinCodeProps extends js.Object {
  var adjoined: js.UndefOr[none | left | right | both] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var clearable: js.UndefOr[Boolean] = js.undefined
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  var manageFocus: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[InputOverrides with PinCodeOverrides] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[default_ | compact | large_] = js.undefined
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var values: js.Array[String]
  def onChange(args: AnonValues): Unit
}

object PinCodeProps {
  @scala.inline
  def apply(
    onChange: AnonValues => Unit,
    values: js.Array[String],
    adjoined: none | left | right | both = null,
    `aria-describedby`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    clearable: js.UndefOr[Boolean] = js.undefined,
    `data-baseweb`: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endEnhancer: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any] = null,
    error: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputRef: Ref[HTMLInputElement] = null,
    manageFocus: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    onBlur: SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLInputElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLInputElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLInputElement] => Unit = null,
    overrides: InputOverrides with PinCodeOverrides = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    size: default_ | compact | large_ = null,
    startEnhancer: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any] = null,
    `type`: String = null
  ): PinCodeProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), values = values.asInstanceOf[js.Any])
    if (adjoined != null) __obj.updateDynamic("adjoined")(adjoined.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(manageFocus)) __obj.updateDynamic("manageFocus")(manageFocus.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startEnhancer != null) __obj.updateDynamic("startEnhancer")(startEnhancer.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinCodeProps]
  }
}

