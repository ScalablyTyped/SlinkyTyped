package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNavigation.reactNavigationStrings.isLandscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation", "withOrientation")
@js.native
object withOrientation extends js.Object {
  
  def apply[P /* <: NavigationOrientationInjectedProps */](Component: ReactComponentClass[P]): ReactComponentClass[Omit[P, isLandscape]] = js.native
}
