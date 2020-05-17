package typingsSlinky.koaRoute.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KoaRoute {
  type CreateMethod = js.Function1[/* method */ java.lang.String, typingsSlinky.koaRoute.mod.KoaRoute.Method]
  type CreateRoute = js.Function1[
    /* routeFunc */ typingsSlinky.koaRoute.mod.KoaRoute.Handler, 
    typingsSlinky.koa.mod.Middleware[typingsSlinky.koa.mod.DefaultState, typingsSlinky.koa.mod.DefaultContext]
  ]
  type Handler = js.ThisFunction2[
    /* this */ typingsSlinky.koa.mod.Context, 
    /* ctx */ typingsSlinky.koa.mod.Context, 
    /* repeated */ js.Any, 
    js.Any
  ]
}
