package typingsSlinky.reactNativeDrawer.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ScaledSize
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.bottom
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.closed
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.displace
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.left
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.open
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.overlay
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.right
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.static
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerProperties extends js.Object {
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
  var content: js.UndefOr[TagMod[Any]] = js.native
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
  implicit class DrawerPropertiesOps[Self <: DrawerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptDoubleTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptDoubleTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptDoubleTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptDoubleTap")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptPan")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptPanOnDrawer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptPanOnDrawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptPanOnDrawer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptPanOnDrawer")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptTap")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureGestures(value: Boolean | open | closed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureGestures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureGestures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureGestures")(js.undefined)
        ret
    }
    @scala.inline
    def withClosedDrawerOffsetFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedDrawerOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClosedDrawerOffset(value: js.Function0[Double] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedDrawerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosedDrawerOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedDrawerOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: TagMod[Any]): Self = {
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
    def withElevation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
    @scala.inline
    def withInitializeOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializeOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitializeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withNegotiatePan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiatePan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegotiatePan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiatePan")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
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
    def withOnCloseStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCloseStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
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
    def withOnOpenStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpenStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenDrawerOffsetFunction1(value: /* viewport */ ScaledSize => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDrawerOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenDrawerOffset(value: (js.Function1[/* viewport */ ScaledSize, Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDrawerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenDrawerOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDrawerOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPanCloseMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panCloseMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanCloseMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panCloseMask")(js.undefined)
        ret
    }
    @scala.inline
    def withPanOpenMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panOpenMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanOpenMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panOpenMask")(js.undefined)
        ret
    }
    @scala.inline
    def withPanThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: left | right | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: DrawerStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTapToClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToClose")(js.undefined)
        ret
    }
    @scala.inline
    def withTweenDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweenDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTweenEasing(value: TweenFunctions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweenEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withTweenHandler(value: /* ratio */ Double => NestedViewStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTweenHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: displace | overlay | static): Self = {
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
    @scala.inline
    def withUseInteractionManager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInteractionManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseInteractionManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInteractionManager")(js.undefined)
        ret
    }
  }
  
}

