package typingsSlinky.reactDashNavigation.reactDashNavigationMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.isLandscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withOrientation")
@js.native
object withOrientation extends js.Object {
  def apply[P /* <: NavigationOrientationInjectedProps */](Component: ReactComponentClass[P]): ReactComponentClass[Omit[P, isLandscape]] = js.native
}

