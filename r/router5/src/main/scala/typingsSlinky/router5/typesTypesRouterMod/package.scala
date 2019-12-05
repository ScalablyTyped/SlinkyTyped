package typingsSlinky.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesTypesRouterMod {
  import typingsSlinky.routeDashNode.routeDashNodeMod.default
  import typingsSlinky.router5.typesTypesBaseMod.DoneFn
  import typingsSlinky.router5.typesTypesBaseMod.State
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record

  type ActivationFn = js.Function3[
    /* toState */ State, 
    /* fromState */ State, 
    /* done */ DoneFn, 
    Boolean | js.Promise[Boolean] | Unit
  ]
  type ActivationFnFactory = js.Function2[/* router */ Router, /* dependencies */ js.UndefOr[Dependencies], ActivationFn]
  type CreateRouter = js.Function3[
    /* routes */ js.UndefOr[js.Array[Route] | default], 
    /* options */ js.UndefOr[Partial[Options]], 
    /* dependencies */ js.UndefOr[Dependencies], 
    Router
  ]
  type Dependencies = Record[String, js.Any]
  type Middleware = js.Function3[
    /* toState */ State, 
    /* fromState */ State, 
    /* done */ DoneFn, 
    Boolean | js.Promise[js.Any] | Unit
  ]
  type MiddlewareFactory = js.Function2[/* router */ Router, /* dependencies */ Dependencies, Middleware]
  type PluginFactory = js.Function2[/* router */ js.UndefOr[Router], /* dependencies */ js.UndefOr[Dependencies], Plugin]
  type SubscribeFn = js.Function1[/* state */ SubscribeState, Unit]
}
