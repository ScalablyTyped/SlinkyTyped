package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNavigation.anon.OnRef
import typingsSlinky.reactNavigation.reactNavigationStrings.navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation", "withNavigation")
@js.native
object withNavigation extends js.Object {
  
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */](Component: ReactComponentClass[P]): ReactComponentClass[Omit[P, navigation]] = js.native
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */, T /* <: ReactComponentClass[P] */](Component: T with ReactComponentClass[P]): ReactComponentClass[(Omit[P, navigation]) with (OnRef[T, P])] = js.native
}
