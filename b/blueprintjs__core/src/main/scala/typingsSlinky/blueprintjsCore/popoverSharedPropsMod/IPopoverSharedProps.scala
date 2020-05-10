package typingsSlinky.blueprintjsCore.popoverSharedPropsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayableProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopoverSharedProps
  extends IOverlayableProps
     with IProps {
  /**
    * Determines the boundary element used by Popper for its `flip` and
    * `preventOverflow` modifiers. Three shorthand keywords are supported;
    * Popper will find the correct DOM element itself.
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[Boundary] = js.native
  /**
    * When enabled, `preventDefault()` is invoked on `click` events that close
    * this popover, which will prevent those clicks from closing outer
    * popovers. When disabled, clicking inside a `Classes.POPOVER_DISMISS`
    * element will close the parent popover.
    *
    * See http://blueprintjs.com/docs/#core/components/popover.closing-on-click
    * @default false
    */
  var captureDismiss: js.UndefOr[Boolean] = js.native
  /**
    * Initial opened state when uncontrolled.
    * @default false
    */
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  /**
    * Prevents the popover from appearing when `true`.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The amount of time in milliseconds the popover should remain open after
    * the user hovers off the trigger. The timer is canceled if the user mouses
    * over the target before it expires.
    * @default 300
    */
  var hoverCloseDelay: js.UndefOr[Double] = js.native
  /**
    * The amount of time in milliseconds the popover should wait before opening
    * after the user hovers over the trigger. The timer is canceled if the user
    * mouses away from the target before it expires.
    * @default 150
    */
  var hoverOpenDelay: js.UndefOr[Double] = js.native
  /**
    * Whether a popover that uses a `Portal` should automatically inherit the
    * dark theme from its parent.
    * @default true
    */
  var inheritDarkTheme: js.UndefOr[Boolean] = js.native
  /**
    * Whether the popover is visible. Passing this prop puts the popover in
    * controlled mode, where the only way to change visibility is by updating
    * this property. If `disabled={true}`, this prop will be ignored, and the
    * popover will remain closed.
    * @default undefined
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Popper modifier options, passed directly to internal Popper instance. See
    * https://popper.js.org/docs/modifiers/ for complete
    * details.
    */
  var modifiers: js.UndefOr[Modifiers] = js.native
  /**
    * Callback invoked in controlled mode when the popover open state *would*
    * change due to user interaction.
    */
  var onInteraction: js.UndefOr[
    js.Function2[
      /* nextOpenState */ Boolean, 
      /* e */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], 
      Unit
    ]
  ] = js.native
  /**
    * Whether the popover should open when its target is focused. If `true`,
    * target will render with `tabindex="0"` to make it focusable via keyboard
    * navigation.
    * @default true
    */
  var openOnTargetFocus: js.UndefOr[Boolean] = js.native
  /**
    * A space-delimited string of class names applied to the popover element.
    */
  var popoverClassName: js.UndefOr[String] = js.native
  /**
    * The position (relative to the target) at which the popover should appear.
    *
    * The default value of `"auto"` will choose the best position when opened
    * and will allow the popover to reposition itself to remain onscreen as the
    * user scrolls around.
    * @default "auto"
    */
  var position: js.UndefOr[PopoverPosition] = js.native
  /**
    * Space-delimited string of class names applied to the target element.
    */
  var targetClassName: js.UndefOr[String] = js.native
  /**
    * HTML props to spread to target element. Use `targetTagName` to change
    * the type of element rendered. Note that `ref` is not supported.
    */
  var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
  /**
    * HTML tag name for the target element. This must be an HTML element to
    * ensure that it supports the necessary DOM event handlers.
    *
    * By default, a `<span>` tag is used so popovers appear as inline-block
    * elements and can be nested in text. Use `<div>` tag for a block element.
    * @default "span"
    */
  var targetTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  /**
    * HTML tag name for the wrapper element, which also receives the
    * `className` prop.
    * @default "span"
    */
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}

object IPopoverSharedProps {
  @scala.inline
  def apply(): IPopoverSharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopoverSharedProps]
  }
  @scala.inline
  implicit class IPopoverSharedPropsOps[Self <: IPopoverSharedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundary(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIsOpen")(js.undefined)
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
    def withHoverCloseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCloseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverCloseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCloseDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverOpenDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOpenDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritDarkTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritDarkTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritDarkTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritDarkTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: Modifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInteraction(
      value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInteraction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnTargetFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTargetFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnTargetFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTargetFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PopoverPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetProps(value: HTMLAttributes[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTagName")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperTagName")(js.undefined)
        ret
    }
  }
  
}

