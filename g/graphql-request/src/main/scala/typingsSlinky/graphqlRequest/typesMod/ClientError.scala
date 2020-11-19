package typingsSlinky.graphqlRequest.typesMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-request/dist/src/types", "ClientError")
@js.native
class ClientError protected () extends Error {
  def this(response: GraphQLResponse, request: GraphQLRequestContext) = this()
  
  var request: GraphQLRequestContext = js.native
  
  var response: GraphQLResponse = js.native
}
/* static members */
@JSImport("graphql-request/dist/src/types", "ClientError")
@js.native
object ClientError extends js.Object {
  
  /* private */ def extractMessage(response: js.Any): js.Any = js.native
}
