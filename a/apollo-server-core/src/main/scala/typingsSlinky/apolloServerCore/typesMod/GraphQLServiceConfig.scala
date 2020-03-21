package typingsSlinky.apolloServerCore.typesMod

import typingsSlinky.apolloServerCore.apolloServerCoreStrings.document
import typingsSlinky.apolloServerCore.apolloServerCoreStrings.operation
import typingsSlinky.apolloServerCore.apolloServerCoreStrings.operationName
import typingsSlinky.apolloServerCore.apolloServerCoreStrings.queryHash
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutor
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.apolloServerTypes.mod.WithRequired
import typingsSlinky.graphql.mod.GraphQLSchema
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

