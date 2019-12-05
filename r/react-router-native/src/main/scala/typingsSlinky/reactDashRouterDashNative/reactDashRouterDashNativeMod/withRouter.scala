package typingsSlinky.reactDashRouterDashNative.reactDashRouterDashNativeMod

import slinky.core.ReactComponentClass
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.Omit
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.StaticContext
import typingsSlinky.reactDashRouter.reactDashRouterMod.WithRouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.WithRouterStatics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-native", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[(Omit[P, String]) with WithRouterProps[C]]) with WithRouterStatics[C] = js.native
}

