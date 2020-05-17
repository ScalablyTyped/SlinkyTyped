package typingsSlinky.apolloServerCore.runHttpQueryMod

import typingsSlinky.apolloServerCore.anon.Context
import typingsSlinky.apolloServerCore.apolloServerCoreStrings.cache
import typingsSlinky.apolloServerCore.apolloServerCoreStrings.plugins
import typingsSlinky.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloServerTypes.mod.WithRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "processHTTPRequest")
@js.native
object processHTTPRequest extends js.Object {
  def apply[TContext](
    options: (WithRequired[GraphQLServerOptions[TContext, _], cache | plugins]) with Context[TContext],
    httpRequest: HttpQueryRequest
  ): js.Promise[HttpQueryResponse] = js.native
}

