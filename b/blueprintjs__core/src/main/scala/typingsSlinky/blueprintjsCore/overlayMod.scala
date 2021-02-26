package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.blueprintjsCore.anon.HasEverOpened
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay")
  @js.native
  class Overlay protected ()
    extends AbstractPureComponent2[IOverlayProps, IOverlayState, js.Object] {
    def this(props: IOverlayProps) = this()
    def this(props: IOverlayProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MOverlay(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MOverlay(prevProps: IOverlayProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MOverlay(): Unit = js.native
    
    var containerElement: HTMLElement | Null = js.native
    
    var handleBackdropMouseDown: js.Any = js.native
    
    var handleDocumentClick: js.Any = js.native
    
    var handleDocumentFocus: js.Any = js.native
    
    var handleKeyDown: js.Any = js.native
    
    var handleTransitionAddEnd: js.Any = js.native
    
    var maybeRenderBackdrop: js.Any = js.native
    
    var maybeRenderChild: js.Any = js.native
    
    var overlayWillClose: js.Any = js.native
    
    var overlayWillOpen: js.Any = js.native
    
    var refHandlers: js.Any = js.native
  }
  /* static members */
  object Overlay {
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.defaultProps")
    @js.native
    def defaultProps: IOverlayProps = js.native
    @scala.inline
    def defaultProps_=(x: IOverlayProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(hasIsOpen: IOverlayProps): HasEverOpened | Null = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.getLastOpened")
    @js.native
    def getLastOpened: js.Any = js.native
    @scala.inline
    def getLastOpened_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLastOpened")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.openStack")
    @js.native
    def openStack: js.Any = js.native
    @scala.inline
    def openStack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openStack")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IBackdropProps extends StObject {
    
    /** CSS class names to apply to backdrop element. */
    var backdropClassName: js.UndefOr[String] = js.native
    
    /** HTML props for the backdrop element. */
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
    
    /**
      * Whether clicking outside the overlay element (either on backdrop when present or on document)
      * should invoke `onClose`.
      * @default true
      */
    var canOutsideClickClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether a container-spanning backdrop element should be rendered behind the contents.
      * @default true
      */
    var hasBackdrop: js.UndefOr[Boolean] = js.native
  }
  object IBackdropProps {
    
    @scala.inline
    def apply(): IBackdropProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBackdropProps]
    }
    
    @scala.inline
    implicit class IBackdropPropsMutableBuilder[Self <: IBackdropProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      @scala.inline
      def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      @scala.inline
      def setCanOutsideClickClose(value: Boolean): Self = StObject.set(x, "canOutsideClickClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanOutsideClickCloseUndefined: Self = StObject.set(x, "canOutsideClickClose", js.undefined)
      
      @scala.inline
      def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    }
  }
  
  @js.native
  trait IOverlayLifecycleProps extends StObject {
    
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
  }
  object IOverlayLifecycleProps {
    
    @scala.inline
    def apply(): IOverlayLifecycleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayLifecycleProps]
    }
    
    @scala.inline
    implicit class IOverlayLifecyclePropsMutableBuilder[Self <: IOverlayLifecycleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClosed(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      @scala.inline
      def setOnClosing(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      @scala.inline
      def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
    }
  }
  
  @js.native
  trait IOverlayProps
    extends IOverlayableProps
       with IBackdropProps
       with IProps {
    
    /**
      * Toggles the visibility of the overlay and its children.
      * This prop is required because the component is controlled.
      */
    var isOpen: Boolean = js.native
    
    /**
      * Name of the transition for internal `CSSTransition`.
      * Providing your own name here will require defining new CSS transition properties.
      * @default Classes.OVERLAY
      */
    var transitionName: js.UndefOr[String] = js.native
  }
  object IOverlayProps {
    
    @scala.inline
    def apply(isOpen: Boolean): IOverlayProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayProps]
    }
    
    @scala.inline
    implicit class IOverlayPropsMutableBuilder[Self <: IOverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  @js.native
  trait IOverlayState extends StObject {
    
    var hasEverOpened: js.UndefOr[Boolean] = js.native
  }
  object IOverlayState {
    
    @scala.inline
    def apply(): IOverlayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayState]
    }
    
    @scala.inline
    implicit class IOverlayStateMutableBuilder[Self <: IOverlayState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasEverOpened(value: Boolean): Self = StObject.set(x, "hasEverOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasEverOpenedUndefined: Self = StObject.set(x, "hasEverOpened", js.undefined)
    }
  }
  
  @js.native
  trait IOverlayableProps extends IOverlayLifecycleProps {
    
    /**
      * Whether the overlay should acquire application focus when it first opens.
      * @default true
      */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether pressing the `esc` key should invoke `onClose`.
      * @default true
      */
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the overlay should prevent focus from leaving itself. That is, if the user attempts
      * to focus an element outside the overlay and this prop is enabled, then the overlay will
      * immediately bring focus back to itself. If you are nesting overlay components, either disable
      * this prop on the "outermost" overlays or mark the nested ones `usePortal={false}`.
      * @default true
      */
    var enforceFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true` and `usePortal={true}`, the `Portal` containing the children is created and attached
      * to the DOM when the overlay is opened for the first time; otherwise this happens when the
      * component mounts. Lazy mounting provides noticeable performance improvements if you have lots
      * of overlays at once, such as on each row of a table.
      * @default true
      */
    var `lazy`: js.UndefOr[Boolean] = js.native
    
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
      * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
      * This is used by React `CSSTransition` to know when a transition completes and must match
      * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
      * transitions with new transitions of a different length.
      * @default 300
      */
    var transitionDuration: js.UndefOr[Double] = js.native
    
    /**
      * Whether the overlay should be wrapped in a `Portal`, which renders its contents in a new
      * element attached to `portalContainer` prop.
      *
      * This prop essentially determines which element is covered by the backdrop: if `false`,
      * then only its parent is covered; otherwise, the entire page is covered (because the parent
      * of the `Portal` is the `<body>` itself).
      *
      * Set this prop to `false` on nested overlays (such as `Dialog` or `Popover`) to ensure that they
      * are rendered above their parents.
      * @default true
      */
    var usePortal: js.UndefOr[Boolean] = js.native
  }
  object IOverlayableProps {
    
    @scala.inline
    def apply(): IOverlayableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayableProps]
    }
    
    @scala.inline
    implicit class IOverlayablePropsMutableBuilder[Self <: IOverlayableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      @scala.inline
      def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      @scala.inline
      def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
}
