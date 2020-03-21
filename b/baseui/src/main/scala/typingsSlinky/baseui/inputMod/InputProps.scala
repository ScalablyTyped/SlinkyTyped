package typingsSlinky.baseui.inputMod

import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.baseui.baseuiStrings.both
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Event_
import typingsSlinky.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps extends BaseInputProps[HTMLInputElement] {
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]] = js.undefined
  @JSName("overrides")
  var overrides_InputProps: js.UndefOr[InputOverrides] = js.undefined
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any]] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
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
    inputRef: Ref[org.scalajs.dom.raw.HTMLInputElement] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    onBlur: SyntheticFocusEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with org.scalajs.dom.raw.HTMLInputElement, Event_] => Unit = null,
    onFocus: SyntheticFocusEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    overrides: InputOverrides = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    size: default_ | compact | large_ = null,
    startEnhancer: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any] = null,
    `type`: String = null,
    value: String = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
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
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
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
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps]
  }
}

