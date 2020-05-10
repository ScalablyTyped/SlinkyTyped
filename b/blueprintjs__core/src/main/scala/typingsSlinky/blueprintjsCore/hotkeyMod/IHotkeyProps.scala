package typingsSlinky.blueprintjsCore.hotkeyMod

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotkeyProps extends IProps {
  /**
    * Whether the hotkey should be triggerable when focused in a text input.
    * @default false
    */
  var allowInInput: js.UndefOr[Boolean] = js.native
  /**
    * Hotkey combination string, such as "space" or "cmd+n".
    */
  var combo: String = js.native
  /**
    * Whether the hotkey cannot be triggered.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, the hotkey is active only when the target is focused. If
    * `true`, the hotkey can be triggered regardless of what component is
    * focused.
    * @default false
    */
  var global: js.UndefOr[Boolean] = js.native
  /**
    * Unless the hotkey is global, you must specify a group where the hotkey
    * will be displayed in the hotkeys dialog. This string will be displayed
    * in a header at the start of the group of hotkeys.
    */
  var group: js.UndefOr[String] = js.native
  /**
    * Human-friendly label for the hotkey.
    */
  var label: String = js.native
  /**
    * `keydown` event handler.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
  /**
    * `keyup` event handler.
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
  /**
    * When `true`, invokes `event.preventDefault()` before the respective `onKeyDown` and
    * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
    * @default false
    */
  var preventDefault: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, invokes `event.stopPropagation()` before the respective `onKeyDown` and
    * `onKeyUp` callbacks are invoked. Enabling this can simplify handler implementations.
    * @default false
    */
  var stopPropagation: js.UndefOr[Boolean] = js.native
}

object IHotkeyProps {
  @scala.inline
  def apply(combo: String, label: String): IHotkeyProps = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeyProps]
  }
  @scala.inline
  implicit class IHotkeyPropsOps[Self <: IHotkeyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowInInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInInput")(js.undefined)
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
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ KeyboardEvent => _): Self = {
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
    def withOnKeyUp(value: /* e */ KeyboardEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
  }
  
}

