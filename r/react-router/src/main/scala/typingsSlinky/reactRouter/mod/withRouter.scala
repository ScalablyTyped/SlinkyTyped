package typingsSlinky.reactRouter.mod

import slinky.core.ReactComponentClass
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[(Omit[P, String]) with WithRouterProps[C]]) with WithRouterStatics[C] = js.native
}

