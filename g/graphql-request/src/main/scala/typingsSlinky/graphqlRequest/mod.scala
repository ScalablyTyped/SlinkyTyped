package typingsSlinky.graphqlRequest

import typingsSlinky.graphqlRequest.typesMod.GraphQLRequestContext
import typingsSlinky.graphqlRequest.typesMod.GraphQLResponse
import typingsSlinky.graphqlRequest.typesMod.Headers
import typingsSlinky.graphqlRequest.typesMod.Options
import typingsSlinky.graphqlRequest.typesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ClientError protected ()
    extends typingsSlinky.graphqlRequest.typesMod.ClientError {
    def this(response: GraphQLResponse, request: GraphQLRequestContext) = this()
  }
  
  @js.native
  class GraphQLClient protected () extends js.Object {
    def this(url: String) = this()
    def this(url: String, options: Options) = this()
    var options: js.Any = js.native
    var url: js.Any = js.native
    def rawRequest[T /* <: js.Any */](query: String): js.Promise[AnonData[T]] = js.native
    def rawRequest[T /* <: js.Any */](query: String, variables: Variables): js.Promise[AnonData[T]] = js.native
    def request[T /* <: js.Any */](query: String): js.Promise[T] = js.native
    def request[T /* <: js.Any */](query: String, variables: Variables): js.Promise[T] = js.native
    def setHeader(key: String, value: String): GraphQLClient = js.native
    def setHeaders(headers: Headers): GraphQLClient = js.native
  }
  
  def default[T /* <: js.Any */](url: String, query: String): js.Promise[T] = js.native
  def default[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[T] = js.native
  def rawRequest[T /* <: js.Any */](url: String, query: String): js.Promise[AnonData[T]] = js.native
  def rawRequest[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[AnonData[T]] = js.native
  def request[T /* <: js.Any */](url: String, query: String): js.Promise[T] = js.native
  def request[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[T] = js.native
  /* static members */
  @js.native
  object ClientError extends js.Object {
    /* private */ def extractMessage(response: js.Any): js.Any = js.native
  }
  
}

