package typingsSlinky.reactRouter.mod

import slinky.core.ReactComponentClass
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.reactRouterStrings.history
import typingsSlinky.reactRouter.reactRouterStrings.location
import typingsSlinky.reactRouter.reactRouterStrings.staticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typingsSlinky.reactRouter.reactRouterStrings.`match` | staticContext
    ]) with WithRouterProps[C]
  ]) with WithRouterStatics[C] = js.native
}

