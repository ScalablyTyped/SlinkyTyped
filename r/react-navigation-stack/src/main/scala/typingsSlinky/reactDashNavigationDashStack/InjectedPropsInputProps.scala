package typingsSlinky.reactDashNavigationDashStack

import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Value
import typingsSlinky.reactDashNative.reactDashNativeMod.View
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsStackViewCreatePointerEventsContainerMod.PointerEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InjectedProps & react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InputProps */
@js.native
trait InjectedPropsInputProps extends js.Object {
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  var pointerEvents: PointerEvents = js.native
  var realPosition: Value = js.native
  var scene: Scene = js.native
  def onComponentRef(): Unit = js.native
  def onComponentRef(ref: View): Unit = js.native
}

