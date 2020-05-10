package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.reactNativeStrings.Dragging
import typingsSlinky.reactNative.reactNativeStrings.Idle
import typingsSlinky.reactNative.reactNativeStrings.Settling
import typingsSlinky.reactNative.reactNativeStrings.`locked-closed`
import typingsSlinky.reactNative.reactNativeStrings.`locked-open`
import typingsSlinky.reactNative.reactNativeStrings.`on-drag`
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.unlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayoutAndroidProps extends ViewProps {
  /**
    * Specifies the background color of the drawer. The default value
    * is white. If you want to set the opacity of the drawer, use rgba.
    * Example:
    * return (
    *   <DrawerLayoutAndroid drawerBackgroundColor="rgba(0,0,0,0.5)">
    *   </DrawerLayoutAndroid>
    *);
    */
  var drawerBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Specifies the lock mode of the drawer. The drawer can be locked
    * in 3 states:
    *
    * - unlocked (default), meaning that the drawer will respond
    *   (open/close) to touch gestures.
    *
    * - locked-closed, meaning that the drawer will stay closed and not
    *   respond to gestures.
    *
    * - locked-open, meaning that the drawer will stay opened and
    *   not respond to gestures. The drawer may still be opened and
    *   closed programmatically (openDrawer/closeDrawer).
    */
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.native
  /**
    * Specifies the side of the screen from which the drawer will slide in.
    * enum(DrawerLayoutAndroid.positions.Left, DrawerLayoutAndroid.positions.Right)
    */
  var drawerPosition: js.UndefOr[Double] = js.native
  /**
    * Specifies the width of the drawer, more precisely the width of the
    * view that be pulled in from the edge of the window.
    */
  var drawerWidth: js.UndefOr[Double] = js.native
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    * - 'none' (the default), drags do not dismiss the keyboard.
    * - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.native
  /**
    * Function called whenever the navigation view has been closed.
    */
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function called whenever the navigation view has been opened.
    */
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function called whenever there is an interaction with the navigation view.
    */
  var onDrawerSlide: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  /**
    * Function called when the drawer state has changed.
    * The drawer can be in 3 states:
    * - idle, meaning there is no interaction with the navigation
    *   view happening at the time
    * - dragging, meaning there is currently an interaction with the
    *   navigation view
    * - settling, meaning that there was an interaction with the
    *   navigation view, and the navigation view is now finishing
    *   it's closing or opening animation
    */
  var onDrawerStateChanged: js.UndefOr[js.Function1[/* event */ Idle | Dragging | Settling, Unit]] = js.native
  /**
    * Make the drawer take the entire screen and draw the background of
    * the status bar to allow it to open over the status bar. It will
    * only have an effect on API 21+.
    */
  var statusBarBackgroundColor: js.UndefOr[String] = js.native
  /**
    * The navigation view that will be rendered to the side of the
    * screen and can be pulled in.
    */
  def renderNavigationView(): ReactElement = js.native
}

object DrawerLayoutAndroidProps {
  @scala.inline
  def apply(renderNavigationView: () => ReactElement): DrawerLayoutAndroidProps = {
    val __obj = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction0(renderNavigationView))
    __obj.asInstanceOf[DrawerLayoutAndroidProps]
  }
  @scala.inline
  implicit class DrawerLayoutAndroidPropsOps[Self <: DrawerLayoutAndroidProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderNavigationView(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNavigationView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawerBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLockMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerLockMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLockMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardDismissMode(value: none | `on-drag`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardDismissMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrawerClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDrawerClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrawerOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDrawerOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrawerSlide(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerSlide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrawerSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrawerStateChanged(value: /* event */ Idle | Dragging | Settling => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerStateChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrawerStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBarBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBarBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarBackgroundColor")(js.undefined)
        ret
    }
  }
  
}

