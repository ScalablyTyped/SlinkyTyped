package typingsSlinky.blueprintjsTimezone

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.alignmentMod.Alignment
import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.popoverMod.PopoverInteractionKind
import typingsSlinky.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsCore.refsMod.IRef
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.button
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.reset
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.submit
import typingsSlinky.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @blueprintjs/core.@blueprintjs/core.IPopoverProps & {  children :react.react.ReactNode | undefined} */
  @js.native
  trait IPopoverPropschildrenReac extends StObject {
    
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
      * When enabled, clicks inside a `Classes.POPOVER_DISMISS` element
      * will only close the current popover and not outer popovers.
      * When disabled, the current popover and any ancestor popovers will be closed.
      * @see http://blueprintjs.com/docs/#core/components/popover.closing-on-click
      * @default false
      */
    var captureDismiss: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
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
      * Whether to apply minimal styling to this popover or tooltip. Minimal popovers
      * do not have an arrow pointing to their target and use a subtler animation.
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
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
    
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
          /* e */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], 
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
    var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
    
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
    implicit class IPopoverPropschildrenReacMutableBuilder[Self <: IPopoverPropschildrenReac] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      @scala.inline
      def setCaptureDismiss(value: Boolean): Self = StObject.set(x, "captureDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureDismissUndefined: Self = StObject.set(x, "captureDismiss", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: String | ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      @scala.inline
      def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      @scala.inline
      def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      @scala.inline
      def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      @scala.inline
      def setInteractionKind(value: PopoverInteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnClosed(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      @scala.inline
      def setOnClosing(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      @scala.inline
      def setOnInteraction(
        value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit
      ): Self = StObject.set(x, "onInteraction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInteractionUndefined: Self = StObject.set(x, "onInteraction", js.undefined)
      
      @scala.inline
      def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      @scala.inline
      def setOpenOnTargetFocus(value: Boolean): Self = StObject.set(x, "openOnTargetFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnTargetFocusUndefined: Self = StObject.set(x, "openOnTargetFocus", js.undefined)
      
      @scala.inline
      def setPopoverClassName(value: String): Self = StObject.set(x, "popoverClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverClassNameUndefined: Self = StObject.set(x, "popoverClassName", js.undefined)
      
      @scala.inline
      def setPopoverRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "popoverRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      @scala.inline
      def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      @scala.inline
      def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      @scala.inline
      def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTarget(value: String | ReactElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetClassName(value: String): Self = StObject.set(x, "targetClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetClassNameUndefined: Self = StObject.set(x, "targetClassName", js.undefined)
      
      @scala.inline
      def setTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "targetProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPropsUndefined: Self = StObject.set(x, "targetProps", js.undefined)
      
      @scala.inline
      def setTargetReactElement(value: ReactElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
      
      @scala.inline
      def setWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "wrapperTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperTagNameUndefined: Self = StObject.set(x, "wrapperTagName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IButtonProps> */
  @js.native
  trait PartialIButtonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var alignText: js.UndefOr[Alignment] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var elementRef: js.UndefOr[IRef[_]] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
    
    var intent: js.UndefOr[Intent] = js.native
    
    var large: js.UndefOr[Boolean] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var minimal: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
    
    var outlined: js.UndefOr[Boolean] = js.native
    
    var rightIcon: js.UndefOr[IconName | MaybeElement] = js.native
    
    var small: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[ReactElement] = js.native
    
    var `type`: js.UndefOr[submit | reset | button] = js.native
  }
  object PartialIButtonProps {
    
    @scala.inline
    def apply(): PartialIButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIButtonProps]
    }
    
    @scala.inline
    implicit class PartialIButtonPropsMutableBuilder[Self <: PartialIButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAlignText(value: Alignment): Self = StObject.set(x, "alignText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignTextUndefined: Self = StObject.set(x, "alignText", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setElementRef(value: IRef[_]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementRefFunction1(value: /* ref */ _ | Null => js.Any): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOutlined(value: Boolean): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedUndefined: Self = StObject.set(x, "outlined", js.undefined)
      
      @scala.inline
      def setRightIcon(value: IconName | MaybeElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconNull: Self = StObject.set(x, "rightIcon", null)
      
      @scala.inline
      def setRightIconReactElement(value: ReactElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      @scala.inline
      def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextReactElement(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IPopoverProps> */
  @js.native
  trait PartialIPopoverProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
    
    var boundary: js.UndefOr[Boundary] = js.native
    
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
    
    var captureDismiss: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String | ReactElement] = js.native
    
    var defaultIsOpen: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var enforceFocus: js.UndefOr[Boolean] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var hasBackdrop: js.UndefOr[Boolean] = js.native
    
    var hoverCloseDelay: js.UndefOr[Double] = js.native
    
    var hoverOpenDelay: js.UndefOr[Double] = js.native
    
    var inheritDarkTheme: js.UndefOr[Boolean] = js.native
    
    var interactionKind: js.UndefOr[PopoverInteractionKind] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var minimal: js.UndefOr[Boolean] = js.native
    
    var modifiers: js.UndefOr[Modifiers] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
    
    var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onInteraction: js.UndefOr[
        js.Function2[
          /* nextOpenState */ Boolean, 
          /* e */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], 
          Unit
        ]
      ] = js.native
    
    var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var openOnTargetFocus: js.UndefOr[Boolean] = js.native
    
    var popoverClassName: js.UndefOr[String] = js.native
    
    var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
    
    var portalClassName: js.UndefOr[String] = js.native
    
    var portalContainer: js.UndefOr[HTMLElement] = js.native
    
    var position: js.UndefOr[PopoverPosition] = js.native
    
    var target: js.UndefOr[String | ReactElement] = js.native
    
    var targetClassName: js.UndefOr[String] = js.native
    
    var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
    
    var targetTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
    
    var transitionDuration: js.UndefOr[Double] = js.native
    
    var usePortal: js.UndefOr[Boolean] = js.native
    
    var wrapperTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
  }
  object PartialIPopoverProps {
    
    @scala.inline
    def apply(): PartialIPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIPopoverProps]
    }
    
    @scala.inline
    implicit class PartialIPopoverPropsMutableBuilder[Self <: PartialIPopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      @scala.inline
      def setCaptureDismiss(value: Boolean): Self = StObject.set(x, "captureDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureDismissUndefined: Self = StObject.set(x, "captureDismiss", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: String | ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      @scala.inline
      def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      @scala.inline
      def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      @scala.inline
      def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      @scala.inline
      def setInteractionKind(value: PopoverInteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnClosed(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      @scala.inline
      def setOnClosing(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      @scala.inline
      def setOnInteraction(
        value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit
      ): Self = StObject.set(x, "onInteraction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInteractionUndefined: Self = StObject.set(x, "onInteraction", js.undefined)
      
      @scala.inline
      def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      @scala.inline
      def setOpenOnTargetFocus(value: Boolean): Self = StObject.set(x, "openOnTargetFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnTargetFocusUndefined: Self = StObject.set(x, "openOnTargetFocus", js.undefined)
      
      @scala.inline
      def setPopoverClassName(value: String): Self = StObject.set(x, "popoverClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverClassNameUndefined: Self = StObject.set(x, "popoverClassName", js.undefined)
      
      @scala.inline
      def setPopoverRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "popoverRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      @scala.inline
      def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      @scala.inline
      def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      @scala.inline
      def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTarget(value: String | ReactElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetClassName(value: String): Self = StObject.set(x, "targetClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetClassNameUndefined: Self = StObject.set(x, "targetClassName", js.undefined)
      
      @scala.inline
      def setTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "targetProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPropsUndefined: Self = StObject.set(x, "targetProps", js.undefined)
      
      @scala.inline
      def setTargetReactElement(value: ReactElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
      
      @scala.inline
      def setWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "wrapperTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperTagNameUndefined: Self = StObject.set(x, "wrapperTagName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/timezone.@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker.ITimezonePickerProps> */
  @js.native
  trait PartialITimezonePickerPro extends StObject {
    
    var buttonProps: js.UndefOr[PartialIButtonProps] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var date: js.UndefOr[js.Date] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* timezone */ String, Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
    
    var showLocalTimezone: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
    
    var valueDisplayFormat: js.UndefOr[TimezoneDisplayFormat] = js.native
  }
  object PartialITimezonePickerPro {
    
    @scala.inline
    def apply(): PartialITimezonePickerPro = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialITimezonePickerPro]
    }
    
    @scala.inline
    implicit class PartialITimezonePickerProMutableBuilder[Self <: PartialITimezonePickerPro] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonProps(value: PartialIButtonProps): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInputProps(value: IInputGroupProps with HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* timezone */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: PartialIPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setShowLocalTimezone(value: Boolean): Self = StObject.set(x, "showLocalTimezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLocalTimezoneUndefined: Self = StObject.set(x, "showLocalTimezone", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueDisplayFormat(value: TimezoneDisplayFormat): Self = StObject.set(x, "valueDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueDisplayFormatUndefined: Self = StObject.set(x, "valueDisplayFormat", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
