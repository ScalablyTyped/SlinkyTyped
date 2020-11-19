package typingsSlinky.koaRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IMiddleware[StateT, CustomT] = typingsSlinky.koa.mod.Middleware[
    StateT, 
    CustomT with (typingsSlinky.koaRouter.mod.IRouterParamContext[StateT, CustomT])
  ]
  
  type IParamMiddleware[STateT, CustomT] = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ typingsSlinky.koaRouter.mod.RouterContext[STateT, CustomT], 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  
  type RouterContext[StateT, CustomT] = typingsSlinky.koa.mod.ParameterizedContext[
    StateT, 
    CustomT with (typingsSlinky.koaRouter.mod.IRouterParamContext[StateT, CustomT])
  ]
}
