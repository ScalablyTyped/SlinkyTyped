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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/views/DrawerView.DrawerOptions & {  contentComponent :react.react.ComponentType<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerContentComponentProps> | undefined,   unmountInactiveRoutes :boolean | undefined,   contentOptions :object | undefined} */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDrawerPosition(value: left | right): Self = this.set("drawerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerType(value: front | back | slide): Self = this.set("drawerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerWidthFunction0(value: () => Double): Self = this.set("drawerWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawerWidth(value: Double | js.Function0[Double]): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeWidth(value: Double): Self = this.set("edgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarAnimation(value: slide | none | fade): Self = this.set("statusBarAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentComponentFunctionComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentComponentComponentClass(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentComponent: Self = this.set("contentComponent", js.undefined)
    
    @scala.inline
    def setContentOptions(value: js.Object): Self = this.set("contentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOptions: Self = this.set("contentOptions", js.undefined)
    
    @scala.inline
    def setDrawerBackgroundColor(value: String): Self = this.set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerBackgroundColor: Self = this.set("drawerBackgroundColor", js.undefined)
    
    @scala.inline
    def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = this.set("drawerLockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerLockMode: Self = this.set("drawerLockMode", js.undefined)
    
    @scala.inline
    def setGestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): Self = this.set("gestureHandlerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureHandlerProps: Self = this.set("gestureHandlerProps", js.undefined)
    
    @scala.inline
    def setHideStatusBar(value: Boolean): Self = this.set("hideStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideStatusBar: Self = this.set("hideStatusBar", js.undefined)
    
    @scala.inline
    def setKeyboardDismissMode(value: `on-drag` | none): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardDismissMode: Self = this.set("keyboardDismissMode", js.undefined)
    
    @scala.inline
    def setMinSwipeDistance(value: Double): Self = this.set("minSwipeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSwipeDistance: Self = this.set("minSwipeDistance", js.undefined)
    
    @scala.inline
    def setOnDrawerClose(value: () => Unit): Self = this.set("onDrawerClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDrawerClose: Self = this.set("onDrawerClose", js.undefined)
    
    @scala.inline
    def setOnDrawerOpen(value: () => Unit): Self = this.set("onDrawerOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDrawerOpen: Self = this.set("onDrawerOpen", js.undefined)
    
    @scala.inline
    def setOverlayColor(value: String): Self = this.set("overlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayColor: Self = this.set("overlayColor", js.undefined)
    
    @scala.inline
    def setSceneContainerStyle(value: ViewStyle): Self = this.set("sceneContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneContainerStyle: Self = this.set("sceneContainerStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnmountInactiveRoutes(value: Boolean): Self = this.set("unmountInactiveRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountInactiveRoutes: Self = this.set("unmountInactiveRoutes", js.undefined)
  }
}
