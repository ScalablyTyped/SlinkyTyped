package typingsSlinky.reactNavigationDrawer.drawerMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNavigationDrawer.AnonProgress
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

trait Props extends js.Object {
  var drawerPosition: left | right
  var drawerStyle: js.UndefOr[ViewStyle] = js.undefined
  var drawerType: front | back | slide
  var gestureEnabled: Boolean
  var gestureHandlerProps: js.UndefOr[ComponentProps[Instantiable0[PanGestureHandler]]] = js.undefined
  var hideStatusBar: Boolean
  var keyboardDismissMode: none | `on-drag`
  var onGestureRef: js.UndefOr[js.Function1[/* ref */ PanGestureHandler | Null, Unit]] = js.undefined
  var open: Boolean
  var overlayStyle: js.UndefOr[ViewStyle] = js.undefined
  var renderDrawerContent: Renderer
  var renderSceneContent: Renderer
  var sceneContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  var statusBarAnimation: slide | none | fade
  var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
  var swipeEdgeWidth: Double
  var swipeVelocityThreshold: Double
  def onClose(): Unit
  def onOpen(): Unit
}

object Props {
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
    renderDrawerContent: /* props */ AnonProgress => TagMod[Any],
    renderSceneContent: /* props */ AnonProgress => TagMod[Any],
    statusBarAnimation: slide | none | fade,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double,
    drawerStyle: ViewStyle = null,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = null,
    onGestureRef: /* ref */ PanGestureHandler | Null => Unit = null,
    overlayStyle: ViewStyle = null,
    sceneContainerStyle: ViewStyle = null,
    swipeDistanceThreshold: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), open = open.asInstanceOf[js.Any], renderDrawerContent = js.Any.fromFunction1(renderDrawerContent), renderSceneContent = js.Any.fromFunction1(renderSceneContent), statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
    if (drawerStyle != null) __obj.updateDynamic("drawerStyle")(drawerStyle.asInstanceOf[js.Any])
    if (gestureHandlerProps != null) __obj.updateDynamic("gestureHandlerProps")(gestureHandlerProps.asInstanceOf[js.Any])
    if (onGestureRef != null) __obj.updateDynamic("onGestureRef")(js.Any.fromFunction1(onGestureRef))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

