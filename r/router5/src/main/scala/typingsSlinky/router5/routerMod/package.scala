package typingsSlinky.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routerMod {
  
  type ActivationFn = js.Function3[
    /* toState */ typingsSlinky.router5.baseMod.State, 
    /* fromState */ typingsSlinky.router5.baseMod.State, 
    /* done */ typingsSlinky.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[scala.Boolean] | scala.Unit
  ]
  
  type ActivationFnFactory[Dependencies /* <: typingsSlinky.router5.routerMod.DefaultDependencies */] = js.Function2[
    /* router */ typingsSlinky.router5.routerMod.Router[typingsSlinky.router5.routerMod.DefaultDependencies], 
    /* dependencies */ js.UndefOr[Dependencies], 
    typingsSlinky.router5.routerMod.ActivationFn
  ]
  
  type DefaultDependencies = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type Middleware = js.Function3[
    /* toState */ typingsSlinky.router5.baseMod.State, 
    /* fromState */ typingsSlinky.router5.baseMod.State, 
    /* done */ typingsSlinky.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[js.Any] | scala.Unit
  ]
  
  type MiddlewareFactory[Dependencies /* <: typingsSlinky.router5.routerMod.DefaultDependencies */] = js.Function2[
    /* router */ typingsSlinky.router5.routerMod.Router[typingsSlinky.router5.routerMod.DefaultDependencies], 
    /* dependencies */ Dependencies, 
    typingsSlinky.router5.routerMod.Middleware
  ]
  
  type PluginFactory[Dependencies /* <: typingsSlinky.router5.routerMod.DefaultDependencies */] = js.Function2[
    /* router */ js.UndefOr[
      typingsSlinky.router5.routerMod.Router[typingsSlinky.router5.routerMod.DefaultDependencies]
    ], 
    /* dependencies */ js.UndefOr[Dependencies], 
    typingsSlinky.router5.routerMod.Plugin
  ]
  
  type SubscribeFn = js.Function1[/* state */ typingsSlinky.router5.routerMod.SubscribeState, scala.Unit]
}
