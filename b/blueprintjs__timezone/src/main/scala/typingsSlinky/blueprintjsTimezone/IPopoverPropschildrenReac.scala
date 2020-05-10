package typingsSlinky.blueprintjsTimezone

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.popoverMod.PopoverInteractionKind
import typingsSlinky.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @blueprintjs/core.@blueprintjs/core.IPopoverProps & {  children ? :react.react.ReactNode} */
@js.native
trait IPopoverPropschildrenReac extends js.Object {
  /**
    * Whether the overlay should acquire application focus when it first opens.
    * @default true
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /** HTML props for the backdrop element. Can be combined with `backdropClassName`. */
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  /**
    * Determines the boundary element used by Popper for its `flip` and
    * `preventOverflow` modifiers. Three shorthand keywords are supported;
    * Popper will find the correct DOM element itself.
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[Boundary] = js.native
  /**
    * Whether pressing the `esc` key should invoke `onClose`.
    * @default true
    */
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
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
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[String] = js.native
  /**
    * The content displayed inside the popover. This can instead be provided as
    * the _second_ element in `children` (first is `target`).
    */
  var content: js.UndefOr[String | ReactElement] = js.native
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
    * Whether the overlay should prevent focus from leaving itself. That is, if the user attempts
    * to focus an element outside the overlay and this prop is enabled, then the overlay will
    * immediately bring focus back to itself. If you are nesting overlay components, either disable
    * this prop on the "outermost" overlays or mark the nested ones `usePortal={false}`.
    * @default true
    */
  var enforceFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether the wrapper and target should take up the full width of their container.
    * Note that supplying `true` for this prop will force  `targetTagName="div"` and
    * `wrapperTagName="div"`.
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Enables an invisible overlay beneath the popover that captures clicks and
    * prevents interaction with the rest of the document until the popover is
    * closed. This prop is only available when `interactionKind` is
    * `PopoverInteractionKind.CLICK`. When popovers with backdrop are opened,
    * they become focused.
    * @default false
    */
  var hasBackdrop: js.UndefOr[Boolean] = js.native
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
    * The kind of interaction that triggers the display of the popover.
    * @default PopoverInteractionKind.CLICK
    */
  var interactionKind: js.UndefOr[PopoverInteractionKind] = js.native
  /**
    * Whether the popover is visible. Passing this prop puts the popover in
    * controlled mode, where the only way to change visibility is by updating
    * this property. If `disabled={true}`, this prop will be ignored, and the
    * popover will remain closed.
    * @default undefined
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * If `true` and `usePortal={true}`, the `Portal` containing the children is created and attached
    * to the DOM when the overlay is opened for the first time; otherwise this happens when the
    * component mounts. Lazy mounting provides noticeable performance improvements if you have lots
    * of overlays at once, such as on each row of a table.
    * @default true
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /**
    * Whether to apply minimal styles to this popover, which includes removing
    * the arrow and adding `Classes.MINIMAL` to minimize and accelerate the
    * transitions.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.native
  /**
    * Popper modifier options, passed directly to internal Popper instance. See
    * https://popper.js.org/docs/modifiers/ for complete
    * details.
    */
  var modifiers: js.UndefOr[Modifiers] = js.native
  /**
    * A callback that is invoked when user interaction causes the overlay to close, such as
    * clicking on the overlay or pressing the `esc` key (if enabled).
    *
    * Receives the event from the user's interaction, if there was an event (generally either a
    * mouse or key event). Note that, since this component is controlled by the `isOpen` prop, it
    * will not actually close itself until that prop becomes `false`.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], Unit]] = js.native
  /**
    * Lifecycle method invoked just after the CSS _close_ transition ends but
    * before the child has been removed from the DOM. Receives the DOM element
    * of the child being closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Lifecycle method invoked just before the CSS _close_ transition begins on
    * a child. Receives the DOM element of the child being closed.
    */
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
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
    * Lifecycle method invoked just after the CSS _open_ transition ends.
    * Receives the DOM element of the child being opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Lifecycle method invoked just after mounting the child in the DOM but
    * just before the CSS _open_ transition begins. Receives the DOM element of
    * the child being opened.
    */
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
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
    * Ref supplied to the `Classes.POPOVER` element.
    */
  var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLDivElement | Null, Unit]] = js.native
  /**
    * Space-delimited string of class names applied to the `Portal` element if
    * `usePortal={true}`.
    */
  var portalClassName: js.UndefOr[String] = js.native
  /**
    * The container element into which the overlay renders its contents, when `usePortal` is `true`.
    * This prop is ignored if `usePortal` is `false`.
    * @default document.body
    */
  var portalContainer: js.UndefOr[HTMLElement] = js.native
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
    * The target to which the popover content is attached. This can instead be
    * provided as the _first_ element in `children`.
    */
  var target: js.UndefOr[String | ReactElement] = js.native
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
    * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
    * This is used by React `CSSTransition` to know when a transition completes and must match
    * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
    * transitions with new transitions of a different length.
    * @default 300
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Whether the popover should be rendered inside a `Portal` attached to
    * `portalContainer` prop.
    *
    * Rendering content inside a `Portal` allows the popover content to escape
    * the physical bounds of its parent while still being positioned correctly
    * relative to its target. Using a `Portal` is necessary if any ancestor of
    * the target hides overflow or uses very complex positioning.
    *
    * Not using a `Portal` can result in smoother performance when scrolling
    * and allows the popover content to inherit CSS styles from surrounding
    * elements, but it remains subject to the overflow bounds of its ancestors.
    * @default true
    */
  var usePortal: js.UndefOr[Boolean] = js.native
  /**
    * HTML tag name for the wrapper element, which also receives the
    * `className` prop.
    * @default "span"
    */
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}

object IPopoverPropschildrenReac {
  @scala.inline
  def apply(): IPopoverPropschildrenReac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopoverPropschildrenReac]
  }
  @scala.inline
  implicit class IPopoverPropschildrenReacOps[Self <: IPopoverPropschildrenReac] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBackdropProps(value: HTMLProps[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropProps")(js.undefined)
        ret
    }
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
    def withCanEscapeKeyClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEscapeKeyClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanEscapeKeyClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEscapeKeyClose")(js.undefined)
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | ReactElement): Self = {
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
    def withEnforceFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(js.undefined)
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
    def withInteractionKind(value: PopoverInteractionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionKind")(js.undefined)
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
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(js.undefined)
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
    def withOnClose(value: /* event */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosed(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosing(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(js.undefined)
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
    def withOnOpened(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpening(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(js.undefined)
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
    def withPopoverRef(value: /* ref */ HTMLDivElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopoverRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverRef")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(js.undefined)
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
    def withTargetReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | ReactElement): Self = {
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
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(js.undefined)
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

