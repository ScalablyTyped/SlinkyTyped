package typingsSlinky.reactDashNavigationDashStack

import slinky.core.TagMod
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Value
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/StackViewCard.Props, 'style' | 'children' | 'scene' | 'navigation' | 'realPosition' | 'animatedStyle' | 'position' | 'transparent'> */
trait PickPropsstylechildrenscenenavigationrealPositiona extends js.Object {
  var animatedStyle: js.Any
  var children: TagMod[Any]
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: AnimatedInterpolation
  var realPosition: Value
  var scene: Scene
  var style: StyleProp[ViewStyle]
  var transparent: js.UndefOr[Boolean] = js.undefined
}

object PickPropsstylechildrenscenenavigationrealPositiona {
  @scala.inline
  def apply(
    animatedStyle: js.Any,
    children: TagMod[Any],
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: AnimatedInterpolation,
    realPosition: Value,
    scene: Scene,
    style: StyleProp[ViewStyle] = null,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): PickPropsstylechildrenscenenavigationrealPositiona = {
    val __obj = js.Dynamic.literal(animatedStyle = animatedStyle.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsstylechildrenscenenavigationrealPositiona]
  }
}

