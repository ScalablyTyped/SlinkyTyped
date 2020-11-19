package typingsSlinky.apolloServerCore.typesMod

import typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutor
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLServiceConfig extends js.Object {
  
  def executor(requestContext: GraphQLRequestContextExecutionDidStart[Record[String, _]]): ValueOrPromise[GraphQLExecutionResult] = js.native
  @JSName("executor")
  var executor_Original: GraphQLExecutor[Record[String, _]] = js.native
  
  var schema: GraphQLSchema = js.native
}
