package typingsSlinky.baseui.checkboxMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.toggle
import typingsSlinky.baseui.baseuiStrings.toggle_round
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulCheckboxProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var checkmarkType: js.UndefOr[default_ | toggle | toggle_round] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[typingsSlinky.baseui.checkboxMod.initialState] = js.undefined
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  var isError: js.UndefOr[Boolean] = js.undefined
  var isIndeterminate: js.UndefOr[Boolean] = js.undefined
  var labelPlacement: js.UndefOr[top | right | bottom | left] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
}

object StatefulCheckboxProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    checkmarkType: default_ | toggle | toggle_round = null,
    children: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: initialState = null,
    inputRef: Ref[HTMLInputElement] = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    isIndeterminate: js.UndefOr[Boolean] = js.undefined,
    labelPlacement: top | right | bottom | left = null,
    onBlur: SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with HTMLInputElement, Event_] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    overrides: CheckboxOverrides = null
  ): StatefulCheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (checkmarkType != null) __obj.updateDynamic("checkmarkType")(checkmarkType.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndeterminate)) __obj.updateDynamic("isIndeterminate")(isIndeterminate.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulCheckboxProps]
  }
}

