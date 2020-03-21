package typingsSlinky.apolloServerCore.requestPipelineMod

import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/requestPipeline", "processGraphQLRequest")
@js.native
object processGraphQLRequest extends js.Object {
  def apply[TContext](
    config: GraphQLRequestPipelineConfig[TContext],
    requestContext: Mutable[GraphQLRequestContext[TContext]]
  ): js.Promise[GraphQLResponse] = js.native
}

