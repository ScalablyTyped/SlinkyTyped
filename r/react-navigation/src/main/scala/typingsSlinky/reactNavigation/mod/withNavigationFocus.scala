package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.reactNavigation.AnonOnRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withNavigationFocus")
@js.native
object withNavigationFocus extends js.Object {
  def apply[P /* <: NavigationFocusInjectedProps[NavigationParams] */](Component: ComponentType[P]): ReactComponentClass[Omit[P, String]] = js.native
  def apply[P /* <: NavigationFocusInjectedProps[NavigationParams] */, T /* <: ReactComponentClass[P] */](Component: T with (ComponentClass[P, ComponentState])): ReactComponentClass[(Omit[P, String]) with AnonOnRef[T]] = js.native
}

