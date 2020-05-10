package typingsSlinky.materialUi.MaterialUI

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.materialUi.MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ @js.native
trait EnhancedButtonProps
  extends HTMLAttributes[js.Object] {
  var centerRipple: js.UndefOr[Boolean] = js.native
  // container element, <button/>, or <span/>(if disabled link) is the element that get the 'other' properties
  var containerElement: js.UndefOr[TagMod[Any] | String] = js.native
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.native
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var focusRippleColor: js.UndefOr[String] = js.native
  var focusRippleOpacity: js.UndefOr[Double] = js.native
  var href: js.UndefOr[String] = js.native
  var keyboardFocused: js.UndefOr[Boolean] = js.native
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  var target: js.UndefOr[String] = js.native
  var touchRippleColor: js.UndefOr[String] = js.native
  var touchRippleOpacity: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object EnhancedButtonProps {
  @scala.inline
  def apply(): EnhancedButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedButtonProps]
  }
  @scala.inline
  implicit class EnhancedButtonPropsOps[Self <: EnhancedButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterRipple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerRipple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerRipple")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerElement(value: TagMod[Any] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFocusRipple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocusRipple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFocusRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocusRipple")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableKeyboardFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableKeyboardFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTouchRipple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouchRipple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTouchRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouchRipple")(js.undefined)
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
    def withFocusRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRippleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusRippleOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRippleOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusRippleOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRippleOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeyboardFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRippleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchRippleOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRippleOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchRippleOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRippleOpacity")(js.undefined)
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
  }
  
}

