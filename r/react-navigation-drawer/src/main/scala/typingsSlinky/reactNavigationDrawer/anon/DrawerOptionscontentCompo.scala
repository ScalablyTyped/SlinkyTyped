package typingsSlinky.reactNavigationDrawer.anon

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed`
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open`
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked
import typingsSlinky.reactNavigationDrawer.typesMod.DrawerContentComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/views/DrawerView.DrawerOptions & {  contentComponent ? :react.react.ComponentType<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerContentComponentProps>,   unmountInactiveRoutes ? :boolean,   contentOptions ? :object} */
@js.native
trait DrawerOptionscontentCompo extends js.Object {
  var contentComponent: js.UndefOr[ReactComponentClass[DrawerContentComponentProps]] = js.native
  var contentOptions: js.UndefOr[js.Object] = js.native
  var drawerBackgroundColor: js.UndefOr[String] = js.native
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.native
  var drawerPosition: left | right = js.native
  var drawerType: front | back | slide = js.native
  var drawerWidth: Double | js.Function0[Double] = js.native
  var edgeWidth: Double = js.native
  var gestureHandlerProps: js.UndefOr[ComponentProps[Instantiable0[PanGestureHandler]]] = js.native
  var hideStatusBar: js.UndefOr[Boolean] = js.native
  var keyboardDismissMode: js.UndefOr[`on-drag` | none] = js.native
  var minSwipeDistance: js.UndefOr[Double] = js.native
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var overlayColor: js.UndefOr[String] = js.native
  var sceneContainerStyle: js.UndefOr[ViewStyle] = js.native
  var statusBarAnimation: slide | none | fade = js.native
  var style: js.UndefOr[ViewStyle] = js.native
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.native
}

object DrawerOptionscontentCompo {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    drawerWidth: Double | js.Function0[Double],
    edgeWidth: Double,
    statusBarAnimation: slide | none | fade
  ): DrawerOptionscontentCompo = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptionscontentCompo]
  }
  @scala.inline
  implicit class DrawerOptionscontentCompoOps[Self <: DrawerOptionscontentCompo] (val x: Self) extends AnyVal {
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
    def withDrawerType(value: front | back | slide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawerWidthFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawerWidth(value: Double | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusBarAnimation(value: slide | none | fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentComponentFunctionComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentComponentComponentClass(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withContentOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOptions")(js.undefined)
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
    def withGestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureHandlerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureHandlerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureHandlerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHideStatusBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideStatusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideStatusBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideStatusBar")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardDismissMode(value: `on-drag` | none): Self = {
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
    def withMinSwipeDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSwipeDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSwipeDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSwipeDistance")(js.undefined)
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
    def withOverlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneContainerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmountInactiveRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountInactiveRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountInactiveRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountInactiveRoutes")(js.undefined)
        ret
    }
  }
  
}

