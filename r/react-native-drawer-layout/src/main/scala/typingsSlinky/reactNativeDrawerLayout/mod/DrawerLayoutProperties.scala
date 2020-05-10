package typingsSlinky.reactNativeDrawerLayout.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.`locked-closed`
import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.`locked-open`
import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.`on-drag`
import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.left
import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.none
import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.right
import typingsSlinky.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.unlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayoutProperties extends ViewProps {
  /**
    * Child content.
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Specifies the background color of the drawer. The default value is white. If you want to set
    * the opacity of the drawer, use rgba.
    */
  var drawerBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Specifies the lock mode of the drawer. The drawer can be locked in 3 states:
    *
    * - unlocked (default), meaning that the drawer will respond (open/close) to touch gestures.
    * - locked-closed, meaning that the drawer will stay closed and not respond to gestures.
    * - locked-open, meaning that the drawer will stay opened and not respond to gestures.
    *
    * The drawer may still be opened and closed programmatically (`openDrawer`/`closeDrawer`).
    */
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.native
  /**
    * Specifies the side of the screen from which the drawer will slide in.
    */
  var drawerPosition: left | right = js.native
  /**
    * Specifies the width of the drawer, more precisely the width of the view that be pulled in from
    * the edge of the window.
    */
  var drawerWidth: Double = js.native
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    *
    * - 'none' (the default), drags do not dismiss the keyboard.
    * - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.native
  /**
    * Function called whenever the navigation view has been closed.
    */
  var onDrawerClose: js.UndefOr[DrawerLayoutCloseEventHandler] = js.native
  /**
    * Function called whenever the navigation view has been opened.
    */
  var onDrawerOpen: js.UndefOr[DrawerLayoutOpenEventHandler] = js.native
  /**
    * Function called whenever there is an interaction with the navigation view.
    */
  var onDrawerSlide: js.UndefOr[DrawerLayoutSlideEventHandler] = js.native
  /**
    * Function called when the drawer state has changed. The drawer can be in 3 states:
    *
    * - idle, meaning there is no interaction with the navigation view happening at the time
    * - dragging, meaning there is currently an interaction with the navigation view
    * - settling, meaning that there was an interaction with the navigation view, and the navigation
    *   view is now finishing its closing or opening animation
    */
  var onDrawerStateChanged: js.UndefOr[DrawerLayoutStateChangeEventHandler] = js.native
  /**
    * The navigation view that will be rendered to the side of the screen and can be pulled in.
    */
  var renderNavigationView: TagMod[Any] = js.native
  /**
    * Make the drawer take the entire screen and draw the background of the status bar to allow it
    * to open over the status bar. It will only have an effect on API 21+.
    */
  var statusBarBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Use native driver animations.
    */
  var useNativeAnimations: js.UndefOr[Boolean] = js.native
}

object DrawerLayoutProperties {
  @scala.inline
  def apply(drawerPosition: left | right, drawerWidth: Double): DrawerLayoutProperties = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutProperties]
  }
  @scala.inline
  implicit class DrawerLayoutPropertiesOps[Self <: DrawerLayoutProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawerPosition(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(value.asInstanceOf[js.Any])
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
    def withOnDrawerSlide(value: /* event */ DrawerLayoutSlideEvent => Unit): Self = {
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
    def withOnDrawerStateChanged(value: /* state */ String => Unit): Self = {
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
    def withRenderNavigationView(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNavigationView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderNavigationView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNavigationView")(js.undefined)
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
    @scala.inline
    def withUseNativeAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeAnimations")(js.undefined)
        ret
    }
  }
  
}

