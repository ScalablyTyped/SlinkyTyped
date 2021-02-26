package typingsSlinky.reactNativeDrawer

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ScaledSize
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.bottom
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.closed
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.displace
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.left
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.open
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.overlay
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.right
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.static
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-drawer", JSImport.Default)
  @js.native
  class default () extends Drawer
  
  @js.native
  trait Drawer
    extends Component[DrawerProperties, js.Object, js.Any] {
    
    /** Close the drawer programmatically. */
    def close(): Unit = js.native
    
    /** Open the drawer programmatically. */
    def open(): Unit = js.native
  }
  
  @js.native
  trait DrawerProperties extends StObject {
    
    /**
      * Toggle drawer when double tap occurs within pan mask?
      */
    var acceptDoubleTap: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow for drawer pan (on touch drag). Set to false to effectively
      * disable the drawer while still allowing programmatic control
      */
    var acceptPan: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow Pan when drawer is 'open'
      */
    var acceptPanOnDrawer: js.UndefOr[Boolean] = js.native
    
    /**
      * Toggle drawer when any tap occurs within pan mask?
      */
    var acceptTap: js.UndefOr[Boolean] = js.native
    
    // Gestures
    /**
      * If true, will capture all gestures inside of the pan mask. If 'open' will
      * only capture when drawer is open
      */
    var captureGestures: js.UndefOr[Boolean | open | closed] = js.native
    
    /**
      * Same as openDrawerOffset, except defines left hand margin when drawer is closed
      */
    var closedDrawerOffset: js.UndefOr[js.Function0[Double] | Double] = js.native
    
    // Important
    /**
      * Menu component
      */
    var content: js.UndefOr[ReactElement] = js.native
    
    /**
      * If true the drawer can not be opened and will not respond to pans
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * (Android-only) Sets the elevation of the drawer using Android's underlying elevation API
      */
    var elevation: js.UndefOr[Double] = js.native
    
    /**
      * Initialize with drawer open
      */
    var initializeOpen: js.UndefOr[Double] = js.native
    
    /**
      * If true, attempts to handle only horizontal swipes, making it play well with a child ScrollView
      */
    var negotiatePan: js.UndefOr[Boolean] = js.native
    
    /**
      * Will be called immediately after the drawer has entered the closed state
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Ccallback fired at the start of a close animation
      */
    var onCloseStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback fired when a drag gesture starts.
      */
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    // Event Handlers
    /**
      * Will be called immediately after the drawer has entered the open state
      */
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback fired at the start of an open animation
      */
    var onOpenStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * If true will trigger drawer open, if false will trigger close.
      */
    var open: js.UndefOr[Boolean] = js.native
    
    /**
      * Can either be a integer (pixel value) or decimal (ratio of screen width). Defines the right hand margin when
      * the drawer is open. Or, can be function which returns offset
      */
    var openDrawerOffset: js.UndefOr[(js.Function1[/* viewport */ ScaledSize, Double]) | Double] = js.native
    
    /**
      * Ratio of screen width that is valid for the start of a pan close action. If null -> defaults to max(.05, openDrawerOffset)
      */
    var panCloseMask: js.UndefOr[Double] = js.native
    
    /**
      * Ratio of screen width that is valid for the start of a pan open action. If null -> defaults to max(.05, closedDrawerOffset)
      */
    var panOpenMask: js.UndefOr[Double] = js.native
    
    // Additional Configurations
    /**
      * Ratio of screen width that must be travelled to trigger a drawer open/close
      */
    var panThreshold: js.UndefOr[Double] = js.native
    
    /**
      * which side the drawer should be on.
      */
    var side: js.UndefOr[left | right | top | bottom] = js.native
    
    /**
      * Styles for the drawer, main, drawerOverlay and mainOverlay container Views
      */
    var styles: js.UndefOr[DrawerStyles] = js.native
    
    /**
      * Same as acceptTap, except only for close
      */
    var tapToClose: js.UndefOr[Boolean] = js.native
    
    /**
      * The duration of the open/close animation
      */
    var tweenDuration: js.UndefOr[Double] = js.native
    
    /**
      *  A easing type supported by tween-functions
      */
    var tweenEasing: js.UndefOr[TweenFunctions] = js.native
    
    // Animation / Tween
    /**
      * Takes in the pan ratio (decimal 0 to 1) that represents the tween percent. Returns an object of
      * native props to be set on the constituent views
      */
    var tweenHandler: js.UndefOr[js.Function1[/* ratio */ Double, NestedViewStyles]] = js.native
    
    /**
      * Type of drawer
      */
    var `type`: js.UndefOr[displace | overlay | static] = js.native
    
    /**
      * if true will run InteractionManager for open/close animations.
      */
    var useInteractionManager: js.UndefOr[Boolean] = js.native
  }
  object DrawerProperties {
    
    @scala.inline
    def apply(): DrawerProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProperties]
    }
    
    @scala.inline
    implicit class DrawerPropertiesMutableBuilder[Self <: DrawerProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptDoubleTap(value: Boolean): Self = StObject.set(x, "acceptDoubleTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptDoubleTapUndefined: Self = StObject.set(x, "acceptDoubleTap", js.undefined)
      
      @scala.inline
      def setAcceptPan(value: Boolean): Self = StObject.set(x, "acceptPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptPanOnDrawer(value: Boolean): Self = StObject.set(x, "acceptPanOnDrawer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptPanOnDrawerUndefined: Self = StObject.set(x, "acceptPanOnDrawer", js.undefined)
      
      @scala.inline
      def setAcceptPanUndefined: Self = StObject.set(x, "acceptPan", js.undefined)
      
      @scala.inline
      def setAcceptTap(value: Boolean): Self = StObject.set(x, "acceptTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptTapUndefined: Self = StObject.set(x, "acceptTap", js.undefined)
      
      @scala.inline
      def setCaptureGestures(value: Boolean | open | closed): Self = StObject.set(x, "captureGestures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureGesturesUndefined: Self = StObject.set(x, "captureGestures", js.undefined)
      
      @scala.inline
      def setClosedDrawerOffset(value: js.Function0[Double] | Double): Self = StObject.set(x, "closedDrawerOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedDrawerOffsetFunction0(value: () => Double): Self = StObject.set(x, "closedDrawerOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClosedDrawerOffsetUndefined: Self = StObject.set(x, "closedDrawerOffset", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setInitializeOpen(value: Double): Self = StObject.set(x, "initializeOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitializeOpenUndefined: Self = StObject.set(x, "initializeOpen", js.undefined)
      
      @scala.inline
      def setNegotiatePan(value: Boolean): Self = StObject.set(x, "negotiatePan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegotiatePanUndefined: Self = StObject.set(x, "negotiatePan", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseStart(value: () => Unit): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenStart(value: () => Unit): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDrawerOffset(value: (js.Function1[/* viewport */ ScaledSize, Double]) | Double): Self = StObject.set(x, "openDrawerOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDrawerOffsetFunction1(value: /* viewport */ ScaledSize => Double): Self = StObject.set(x, "openDrawerOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenDrawerOffsetUndefined: Self = StObject.set(x, "openDrawerOffset", js.undefined)
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPanCloseMask(value: Double): Self = StObject.set(x, "panCloseMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanCloseMaskUndefined: Self = StObject.set(x, "panCloseMask", js.undefined)
      
      @scala.inline
      def setPanOpenMask(value: Double): Self = StObject.set(x, "panOpenMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanOpenMaskUndefined: Self = StObject.set(x, "panOpenMask", js.undefined)
      
      @scala.inline
      def setPanThreshold(value: Double): Self = StObject.set(x, "panThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanThresholdUndefined: Self = StObject.set(x, "panThreshold", js.undefined)
      
      @scala.inline
      def setSide(value: left | right | top | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setStyles(value: DrawerStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTapToClose(value: Boolean): Self = StObject.set(x, "tapToClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTapToCloseUndefined: Self = StObject.set(x, "tapToClose", js.undefined)
      
      @scala.inline
      def setTweenDuration(value: Double): Self = StObject.set(x, "tweenDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTweenDurationUndefined: Self = StObject.set(x, "tweenDuration", js.undefined)
      
      @scala.inline
      def setTweenEasing(value: TweenFunctions): Self = StObject.set(x, "tweenEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTweenEasingUndefined: Self = StObject.set(x, "tweenEasing", js.undefined)
      
      @scala.inline
      def setTweenHandler(value: /* ratio */ Double => NestedViewStyles): Self = StObject.set(x, "tweenHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTweenHandlerUndefined: Self = StObject.set(x, "tweenHandler", js.undefined)
      
      @scala.inline
      def setType(value: displace | overlay | static): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUseInteractionManager(value: Boolean): Self = StObject.set(x, "useInteractionManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseInteractionManagerUndefined: Self = StObject.set(x, "useInteractionManager", js.undefined)
    }
  }
  
  @js.native
  trait DrawerStyles extends NestedViewStyles {
    
    var drawer: js.UndefOr[ViewStyle] = js.native
  }
  object DrawerStyles {
    
    @scala.inline
    def apply(): DrawerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerStyles]
    }
    
    @scala.inline
    implicit class DrawerStylesMutableBuilder[Self <: DrawerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawer(value: ViewStyle): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerUndefined: Self = StObject.set(x, "drawer", js.undefined)
    }
  }
  
  @js.native
  trait NestedViewStyles extends StObject {
    
    var drawerOverlay: js.UndefOr[ViewStyle] = js.native
    
    var main: js.UndefOr[ViewStyle] = js.native
    
    var mainOverlay: js.UndefOr[ViewStyle] = js.native
  }
  object NestedViewStyles {
    
    @scala.inline
    def apply(): NestedViewStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedViewStyles]
    }
    
    @scala.inline
    implicit class NestedViewStylesMutableBuilder[Self <: NestedViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawerOverlay(value: ViewStyle): Self = StObject.set(x, "drawerOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerOverlayUndefined: Self = StObject.set(x, "drawerOverlay", js.undefined)
      
      @scala.inline
      def setMain(value: ViewStyle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainOverlay(value: ViewStyle): Self = StObject.set(x, "mainOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainOverlayUndefined: Self = StObject.set(x, "mainOverlay", js.undefined)
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.linear
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInSine
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInBack
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce
    - typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce
  */
  trait TweenFunctions extends StObject
  object TweenFunctions {
    
    @scala.inline
    def easeInBack: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInBack = "easeInBack".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInBack]
    
    @scala.inline
    def easeInBounce: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce = "easeInBounce".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInBounce]
    
    @scala.inline
    def easeInCirc: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc = "easeInCirc".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInCirc]
    
    @scala.inline
    def easeInCubic: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic = "easeInCubic".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInCubic]
    
    @scala.inline
    def easeInElastic: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic = "easeInElastic".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInElastic]
    
    @scala.inline
    def easeInExpo: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo = "easeInExpo".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInExpo]
    
    @scala.inline
    def easeInOutBack: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBack]
    
    @scala.inline
    def easeInOutBounce: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutBounce]
    
    @scala.inline
    def easeInOutCirc: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCirc]
    
    @scala.inline
    def easeInOutCubic: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutCubic]
    
    @scala.inline
    def easeInOutElastic: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutElastic]
    
    @scala.inline
    def easeInOutExpo: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutExpo]
    
    @scala.inline
    def easeInOutQuad: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuad]
    
    @scala.inline
    def easeInOutQuart: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuart]
    
    @scala.inline
    def easeInOutQuint: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutQuint]
    
    @scala.inline
    def easeInOutSine: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInOutSine]
    
    @scala.inline
    def easeInQuad: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad = "easeInQuad".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuad]
    
    @scala.inline
    def easeInQuart: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart = "easeInQuart".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuart]
    
    @scala.inline
    def easeInQuint: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint = "easeInQuint".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInQuint]
    
    @scala.inline
    def easeInSine: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInSine = "easeInSine".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeInSine]
    
    @scala.inline
    def easeOutBack: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack = "easeOutBack".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutBack]
    
    @scala.inline
    def easeOutBounce: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutBounce]
    
    @scala.inline
    def easeOutCirc: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutCirc]
    
    @scala.inline
    def easeOutCubic: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutCubic]
    
    @scala.inline
    def easeOutElastic: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutElastic]
    
    @scala.inline
    def easeOutExpo: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutExpo]
    
    @scala.inline
    def easeOutQuad: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuad]
    
    @scala.inline
    def easeOutQuart: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuart]
    
    @scala.inline
    def easeOutQuint: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutQuint]
    
    @scala.inline
    def easeOutSine: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine = "easeOutSine".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.easeOutSine]
    
    @scala.inline
    def linear: typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.linear = "linear".asInstanceOf[typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.linear]
  }
}
