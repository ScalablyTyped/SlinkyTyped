package typingsSlinky.graphqlApiKoa.mod

import typingsSlinky.graphqlApiKoa.anon.Override
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-api-koa", "execute")
@js.native
object execute extends js.Object {
  
  def apply[StateT, CustomT](options: ExecuteOptions with (Override[StateT, CustomT])): Middleware[StateT, CustomT] = js.native
}
