package typingsSlinky.reactDashNavigationDashDrawer.components

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
import typingsSlinky.reactDashNavigationDashDrawer.Anon_Progress
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerMod.default
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`on-drag`
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.back
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.fade
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.front
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.none
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: open */
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    hideStatusBar: Boolean,
    keyboardDismissMode: none | `on-drag`,
    locked: Boolean,
    onClose: () => Unit,
    onOpen: () => Unit,
    renderDrawerContent: /* props */ Anon_Progress => TagMod[Any],
    renderSceneContent: /* props */ Anon_Progress => TagMod[Any],
    statusBarAnimation: slide | none | fade,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double,
    drawerStyle: ViewStyle = null,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = null,
    onGestureRef: /* ref */ PanGestureHandler | Null => Unit = null,
    overlayStyle: ViewStyle = null,
    sceneContainerStyle: ViewStyle = null,
    swipeDistanceThreshold: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), renderDrawerContent = js.Any.fromFunction1(renderDrawerContent), renderSceneContent = js.Any.fromFunction1(renderSceneContent), statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
    if (drawerStyle != null) __obj.updateDynamic("drawerStyle")(drawerStyle.asInstanceOf[js.Any])
    if (gestureHandlerProps != null) __obj.updateDynamic("gestureHandlerProps")(gestureHandlerProps.asInstanceOf[js.Any])
    if (onGestureRef != null) __obj.updateDynamic("onGestureRef")(js.Any.fromFunction1(onGestureRef))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerMod.Props
}

