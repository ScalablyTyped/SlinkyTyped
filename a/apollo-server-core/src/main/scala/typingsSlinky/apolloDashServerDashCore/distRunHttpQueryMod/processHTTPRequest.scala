package typingsSlinky.apolloDashServerDashCore.distRunHttpQueryMod

import typingsSlinky.apolloDashServerDashCore.Anon_Context
import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.cache
import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.plugins
import typingsSlinky.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.WithRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "processHTTPRequest")
@js.native
object processHTTPRequest extends js.Object {
  def apply[TContext](
    options: (WithRequired[GraphQLServerOptions[TContext, _], cache | plugins]) with Anon_Context[TContext],
    httpRequest: HttpQueryRequest
  ): js.Promise[HttpQueryResponse] = js.native
}

