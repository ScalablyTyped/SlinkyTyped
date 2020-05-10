package typingsSlinky.materialDrawer.focusTrapMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Default: `false`. If `true`, a click outside the focus trap will
    * deactivate the focus trap and allow the click event to do its thing.
    */
  var clickOutsideDeactivates: js.UndefOr[Boolean] = js.native
  /**
    * Default: `true`. If `false`, the `Escape` key will not trigger
    * deactivation of the focus trap. This can be useful if you want
    * to force the user to make a decision instead of allowing an easy
    * way out.
    */
  var escapeDeactivates: js.UndefOr[Boolean] = js.native
  /**
    * By default, an error will be thrown if the focus trap contains no
    * elements in its tab order. With this option you can specify a
    * fallback element to programmatically receive focus if no other
    * tabbable elements are found. For example, you may want a popover's
    * `<div>` to receive focus if the popover's content includes no
    * tabbable elements. *Make sure the fallback element has a negative
    * `tabindex` so it can be programmatically focused.*
    */
  var fallbackFocus: js.UndefOr[FocusTarget] = js.native
  /**
    * By default, when a focus trap is activated the first element in the
    * focus trap's tab order will receive focus. With this option you can
    * specify a different element to receive that initial focus.
    */
  var initialFocus: js.UndefOr[FocusTarget] = js.native
  /**
    * A function that will be called when the focus trap activates.
    */
  var onActivate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function that will be called when the focus trap deactivates.
    */
  var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Default: `true`. If `false`, when the trap is deactivated,
    * focus will *not* return to the element that had focus before activation.
    */
  var returnFocusOnDeactivate: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickOutsideDeactivates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutsideDeactivates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOutsideDeactivates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutsideDeactivates")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeDeactivates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeDeactivates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeDeactivates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeDeactivates")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackFocusHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackFocusFunction0(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFallbackFocus(value: FocusTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFocusHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialFocusFunction0(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialFocus(value: FocusTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeactivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnFocusOnDeactivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocusOnDeactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFocusOnDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocusOnDeactivate")(js.undefined)
        ret
    }
  }
  
}

