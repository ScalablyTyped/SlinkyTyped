package typingsSlinky.koaRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Middleware[StateT, CustomT] = typingsSlinky.koa.mod.Middleware[
    StateT, 
    CustomT with (typingsSlinky.koaRouter.mod.RouterParamContext[StateT, CustomT])
  ]
  
  type ParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ typingsSlinky.koaRouter.anon.RouterContextany, 
    /* next */ typingsSlinky.koa.mod.Next, 
    js.Any
  ]
  
  type RouterContext[StateT, CustomT] = typingsSlinky.koa.mod.ParameterizedContext[
    StateT, 
    CustomT with (typingsSlinky.koaRouter.mod.RouterParamContext[StateT, CustomT])
  ]
}
