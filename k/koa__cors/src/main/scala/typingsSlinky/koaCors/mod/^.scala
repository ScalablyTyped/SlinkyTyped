package typingsSlinky.koaCors.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@koa/cors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * CORS middleware factory.
    * @param options - Configuration options.
    * @returns cors middleware
    */
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
}
