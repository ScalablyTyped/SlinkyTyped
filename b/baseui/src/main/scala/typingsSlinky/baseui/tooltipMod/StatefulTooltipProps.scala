package typingsSlinky.baseui.tooltipMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.AnonClose
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.close
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.open
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.popoverMod.Overrides
import typingsSlinky.baseui.popoverMod.State
import typingsSlinky.baseui.popoverMod.StateReducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.StatefulPopoverProps */
@js.native
trait StatefulTooltipProps extends js.Object {
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
  var animateOutTime: js.UndefOr[Double] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var content: js.UndefOr[TagMod[Any] | (js.Function1[/* args */ AnonClose, TagMod[Any]])] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.native
  var dismissOnEsc: js.UndefOr[Boolean] = js.native
  var focusLock: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var ignoreBoundary: js.UndefOr[Boolean] = js.native
  var initialState: js.UndefOr[State] = js.native
  var mountNode: js.UndefOr[HTMLElement] = js.native
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  var onMouseEnterDelay: js.UndefOr[Double] = js.native
  var onMouseLeaveDelay: js.UndefOr[Double] = js.native
  var onOpen: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[Overrides] = js.native
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  var popperOptions: js.UndefOr[js.Any] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var returnFocus: js.UndefOr[Boolean] = js.native
  var showArrow: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
  var triggerType: js.UndefOr[click | hover] = js.native
}

object StatefulTooltipProps {
  @scala.inline
  def apply(): StatefulTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulTooltipProps]
  }
  @scala.inline
  implicit class StatefulTooltipPropsOps[Self <: StatefulTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
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
    def withContentFunction1(value: /* args */ AnonClose => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContent(value: TagMod[Any] | (js.Function1[/* args */ AnonClose, TagMod[Any]])): Self = {
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
    def withDismissOnClickOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissOnClickOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissOnClickOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissOnClickOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissOnEsc")(js.undefined)
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
    def withInitialState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
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
    def withOnClose(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
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
    def withOnOpen(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
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
    def withStateReducer(
      value: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStateReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.undefined)
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

