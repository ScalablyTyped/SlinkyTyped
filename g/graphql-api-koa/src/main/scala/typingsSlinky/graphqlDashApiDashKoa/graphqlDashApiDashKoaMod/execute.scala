package typingsSlinky.graphqlDashApiDashKoa.graphqlDashApiDashKoaMod

import typingsSlinky.graphqlDashApiDashKoa.Anon_Ctx
import typingsSlinky.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-api-koa", "execute")
@js.native
object execute extends js.Object {
  def apply[StateT, CustomT](options: ExecuteOptions with (Anon_Ctx[StateT, CustomT])): Middleware[StateT, CustomT] = js.native
}

