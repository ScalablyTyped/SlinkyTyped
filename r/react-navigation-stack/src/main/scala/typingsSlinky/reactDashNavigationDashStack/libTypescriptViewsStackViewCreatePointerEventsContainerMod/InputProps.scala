package typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsStackViewCreatePointerEventsContainerMod

import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Value
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps extends js.Object {
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var realPosition: Value
  var scene: Scene
}

object InputProps {
  @scala.inline
  def apply(
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    realPosition: Value,
    scene: Scene
  ): InputProps = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputProps]
  }
}

