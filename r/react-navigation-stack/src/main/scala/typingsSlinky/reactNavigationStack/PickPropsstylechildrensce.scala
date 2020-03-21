package typingsSlinky.reactNavigationStack

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/StackViewCard.Props, 'style' | 'children' | 'scene' | 'navigation' | 'realPosition' | 'animatedStyle' | 'position' | 'transparent'> */
trait PickPropsstylechildrensce extends js.Object {
  var animatedStyle: js.Any
  var children: TagMod[Any]
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: AnimatedInterpolation
  var realPosition: Value
  var scene: Scene
  var style: StyleProp[ViewStyle]
  var transparent: js.UndefOr[Boolean] = js.undefined
}

object PickPropsstylechildrensce {
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
  ): PickPropsstylechildrensce = {
    val __obj = js.Dynamic.literal(animatedStyle = animatedStyle.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsstylechildrensce]
  }
}

