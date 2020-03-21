package typingsSlinky.graphqlApiKoa.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-api-koa", "errorHandler")
@js.native
object errorHandler extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
}

