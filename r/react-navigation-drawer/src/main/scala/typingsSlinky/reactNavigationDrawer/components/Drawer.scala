package typingsSlinky.reactNavigationDrawer.components

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNavigationDrawer.anon.Progress
import typingsSlinky.reactNavigationDrawer.drawerMod.Props
import typingsSlinky.reactNavigationDrawer.drawerMod.default
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer {
  @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def drawerStyle(value: ViewStyle): this.type = set("drawerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def gestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): this.type = set("gestureHandlerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onGestureRef(value: /* ref */ PanGestureHandler | Null => Unit): this.type = set("onGestureRef", js.Any.fromFunction1(value))
    @scala.inline
    def overlayStyle(value: ViewStyle): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def sceneContainerStyle(value: ViewStyle): this.type = set("sceneContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeDistanceThreshold(value: Double): this.type = set("swipeDistanceThreshold", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    gestureEnabled: Boolean,
    hideStatusBar: Boolean,
    keyboardDismissMode: none | `on-drag`,
    onClose: () => Unit,
    onOpen: () => Unit,
    open: Boolean,
    renderDrawerContent: /* props */ Progress => TagMod[Any],
    renderSceneContent: /* props */ Progress => TagMod[Any],
    statusBarAnimation: slide | none | fade,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double
  ): Builder = {
    val __props = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), open = open.asInstanceOf[js.Any], renderDrawerContent = js.Any.fromFunction1(renderDrawerContent), renderSceneContent = js.Any.fromFunction1(renderSceneContent), statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

