package typingsSlinky.reactRouterDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.Omit
import typingsSlinky.reactRouter.mod.RouteComponentProps
import typingsSlinky.reactRouter.mod.StaticContext
import typingsSlinky.reactRouter.mod.WithRouterProps
import typingsSlinky.reactRouter.mod.WithRouterStatics
import typingsSlinky.reactRouterDom.reactRouterDomStrings.`match`
import typingsSlinky.reactRouterDom.reactRouterDomStrings.history
import typingsSlinky.reactRouterDom.reactRouterDomStrings.location
import typingsSlinky.reactRouterDom.reactRouterDomStrings.staticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-dom", "withRouter")
@js.native
object withRouter extends js.Object {
  
  def apply[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | `match` | staticContext
    ]) with WithRouterProps[C]
  ]) with WithRouterStatics[C] = js.native
}
