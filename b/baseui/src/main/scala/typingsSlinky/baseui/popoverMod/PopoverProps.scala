package typingsSlinky.baseui.popoverMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.BasePopoverProps & {  children  :react.react.ReactNode,   content  :react.react.ReactNode | (): react.react.ReactNode,   isOpen  :boolean, onBlur ? (): any, onClick ? (e : std.Event): any, onClickOutside ? (event : std.MouseEvent): any, onEsc ? (): any, onFocus ? (): any, onMouseEnter ? (): any, onMouseLeave ? (): any} */
@js.native
trait PopoverProps extends js.Object {
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
  var animateOutTime: js.UndefOr[Double] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: TagMod[Any] = js.native
  var content: TagMod[Any] | js.Function0[TagMod[Any]] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var focusLock: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var ignoreBoundary: js.UndefOr[Boolean] = js.native
  var isOpen: Boolean = js.native
  var mountNode: js.UndefOr[HTMLElement] = js.native
  var onBlur: js.UndefOr[js.Function0[_]] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
  var onEsc: js.UndefOr[js.Function0[_]] = js.native
  var onFocus: js.UndefOr[js.Function0[_]] = js.native
  var onMouseEnter: js.UndefOr[js.Function0[_]] = js.native
  var onMouseEnterDelay: js.UndefOr[Double] = js.native
  var onMouseLeave: js.UndefOr[js.Function0[_]] = js.native
  var onMouseLeaveDelay: js.UndefOr[Double] = js.native
  var overrides: js.UndefOr[Overrides] = js.native
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  var popperOptions: js.UndefOr[js.Any] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var returnFocus: js.UndefOr[Boolean] = js.native
  var showArrow: js.UndefOr[Boolean] = js.native
  var triggerType: js.UndefOr[click | hover] = js.native
}

object PopoverProps {
  @scala.inline
  def apply(isOpen: Boolean): PopoverProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessibilityType(value: none | menu | tooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateOutTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateOutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentFunction0(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContent(value: TagMod[Any] | js.Function0[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def `withData-baseweb`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutData-baseweb`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(js.undefined)
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
    def withIgnoreBoundary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withMountNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ Event => _): Self = {
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
    def withOnClickOutside(value: /* event */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickOutside")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEsc(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseEnterDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeaveDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseLeaveDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: Overrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerType(value: click | hover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(js.undefined)
        ret
    }
  }
  
}

