package typingsSlinky.koaRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IMiddleware[StateT, CustomT] = typingsSlinky.koa.mod.Middleware[
    StateT, 
    CustomT with (typingsSlinky.koaRouter.mod.IRouterParamContext[StateT, CustomT])
  ]
  type IParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ typingsSlinky.koaRouter.RouterContextany, 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  type RouterContext[StateT, CustomT] = typingsSlinky.koa.mod.ParameterizedContext[
    StateT, 
    CustomT with (typingsSlinky.koaRouter.mod.IRouterParamContext[StateT, CustomT])
  ]
}
