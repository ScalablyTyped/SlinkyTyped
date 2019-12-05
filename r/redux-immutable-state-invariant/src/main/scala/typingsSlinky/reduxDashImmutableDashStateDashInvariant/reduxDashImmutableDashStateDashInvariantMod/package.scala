package typingsSlinky.reduxDashImmutableDashStateDashInvariant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashImmutableDashStateDashInvariantMod {
  import typingsSlinky.redux.reduxMod.AnyAction
  import typingsSlinky.redux.reduxMod.Dispatch
  import typingsSlinky.redux.reduxMod.Middleware

  type immutableStateInvariantMiddlewareInterface = js.Function1[
    /* options */ js.UndefOr[immutableStateInvariantMiddlewareOptions], 
    Middleware[js.Object, js.Any, Dispatch[AnyAction]]
  ]
}
