package typingsSlinky.reactNativeTabView

import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigationState[T /* <: Route */] extends js.Object {
  var navigationState: NavigationState[T]
}

object AnonNavigationState {
  @scala.inline
  def apply[T /* <: Route */](navigationState: NavigationState[T]): AnonNavigationState[T] = {
    val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNavigationState[T]]
  }
}

