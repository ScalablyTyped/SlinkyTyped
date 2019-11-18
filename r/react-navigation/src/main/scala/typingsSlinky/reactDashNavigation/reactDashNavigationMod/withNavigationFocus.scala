package typingsSlinky.reactDashNavigation.reactDashNavigationMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.reactDashNavigation.Anon_OnRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withNavigationFocus")
@js.native
object withNavigationFocus extends js.Object {
  def apply[P /* <: NavigationFocusInjectedProps[NavigationParams] */](Component: ComponentType[P]): ReactComponentClass[Omit[P, String]] = js.native
  def apply[P /* <: NavigationFocusInjectedProps[NavigationParams] */, T /* <: ReactComponentClass[P] */](Component: T with (ComponentClass[P, ComponentState])): ReactComponentClass[(Omit[P, String]) with Anon_OnRef[T]] = js.native
}

