package typingsSlinky.apolloDashServerDashCore.distTypesMod

import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.document
import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.operation
import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.operationName
import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.queryHash
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLExecutionResult
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLExecutor
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.WithRequired
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLServiceConfig extends js.Object {
  @JSName("executor")
  var executor_Original: GraphQLExecutor[Record[String, _]] = js.native
  var schema: GraphQLSchema = js.native
  def executor(
    requestContext: WithRequired[
      GraphQLRequestContext[Record[String, _]], 
      document | operationName | operation | queryHash
    ]
  ): ValueOrPromise[GraphQLExecutionResult] = js.native
}

