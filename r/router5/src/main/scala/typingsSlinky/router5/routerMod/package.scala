package typingsSlinky.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type ActivationFn = js.Function3[
    /* toState */ typingsSlinky.router5.baseMod.State, 
    /* fromState */ typingsSlinky.router5.baseMod.State, 
    /* done */ typingsSlinky.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[scala.Boolean] | scala.Unit
  ]
  type ActivationFnFactory = js.Function2[
    /* router */ typingsSlinky.router5.routerMod.Router, 
    /* dependencies */ js.UndefOr[typingsSlinky.router5.routerMod.Dependencies], 
    typingsSlinky.router5.routerMod.ActivationFn
  ]
  type CreateRouter = js.Function3[
    /* routes */ js.UndefOr[
      js.Array[typingsSlinky.router5.routerMod.Route] | typingsSlinky.routeNode.mod.default
    ], 
    /* options */ js.UndefOr[typingsSlinky.router5.PartialOptions], 
    /* dependencies */ js.UndefOr[typingsSlinky.router5.routerMod.Dependencies], 
    typingsSlinky.router5.routerMod.Router
  ]
  type Dependencies = typingsSlinky.std.Record[java.lang.String, js.Any]
  type Middleware = js.Function3[
    /* toState */ typingsSlinky.router5.baseMod.State, 
    /* fromState */ typingsSlinky.router5.baseMod.State, 
    /* done */ typingsSlinky.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[js.Any] | scala.Unit
  ]
  type MiddlewareFactory = js.Function2[
    /* router */ typingsSlinky.router5.routerMod.Router, 
    /* dependencies */ typingsSlinky.router5.routerMod.Dependencies, 
    typingsSlinky.router5.routerMod.Middleware
  ]
  type PluginFactory = js.Function2[
    /* router */ js.UndefOr[typingsSlinky.router5.routerMod.Router], 
    /* dependencies */ js.UndefOr[typingsSlinky.router5.routerMod.Dependencies], 
    typingsSlinky.router5.routerMod.Plugin
  ]
  type SubscribeFn = js.Function1[/* state */ typingsSlinky.router5.routerMod.SubscribeState, scala.Unit]
}
