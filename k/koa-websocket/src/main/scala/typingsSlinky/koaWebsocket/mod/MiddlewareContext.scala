package typingsSlinky.koaWebsocket.mod

import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareContext[StateT] extends Context {
  
  // Limitation: Declaration merging cannot overwrap existing properties.
  // That's why this property is here, not in the merged declaration above.
  @JSName("app")
  var app_MiddlewareContext: App[DefaultState, DefaultContext] = js.native
  
  @JSName("state")
  var state_MiddlewareContext: StateT = js.native
}
