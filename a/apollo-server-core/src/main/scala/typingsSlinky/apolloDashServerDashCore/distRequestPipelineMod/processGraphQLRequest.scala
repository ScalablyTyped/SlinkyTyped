package typingsSlinky.apolloDashServerDashCore.distRequestPipelineMod

import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLResponse
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

