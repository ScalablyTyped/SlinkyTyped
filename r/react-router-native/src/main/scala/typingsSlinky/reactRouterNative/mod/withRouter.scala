package typingsSlinky.reactRouterNative.mod

import slinky.core.ReactComponentClass
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.Omit
import typingsSlinky.reactRouter.mod.RouteComponentProps
import typingsSlinky.reactRouter.mod.StaticContext
import typingsSlinky.reactRouter.mod.WithRouterProps
import typingsSlinky.reactRouter.mod.WithRouterStatics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-native", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[(Omit[P, String]) with WithRouterProps[C]]) with WithRouterStatics[C] = js.native
}

