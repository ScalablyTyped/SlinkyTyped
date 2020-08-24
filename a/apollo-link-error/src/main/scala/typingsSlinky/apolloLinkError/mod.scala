package typingsSlinky.apolloLinkError

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.apolloLink.typesMod.NextLink
import typingsSlinky.apolloLink.typesMod.Operation
import typingsSlinky.apolloLinkError.mod.ErrorLink.ErrorHandler
import typingsSlinky.apolloLinkHttpCommon.mod.ServerError
import typingsSlinky.apolloLinkHttpCommon.mod.ServerParseError
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.std.Record
import typingsSlinky.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ErrorLink protected () extends ApolloLink {
    def this(errorHandler: ErrorHandler) = this()
    var link: js.Any = js.native
  }
  
  @js.native
  trait ErrorResponse extends js.Object {
    @JSName("forward")
    var forward_Original: NextLink = js.native
    var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.native
    var networkError: js.UndefOr[js.Error | ServerError | ServerParseError] = js.native
    var operation: Operation = js.native
    var response: js.UndefOr[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
    def forward(operation: Operation): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
  }
  
  def onError(errorHandler: ErrorHandler): ApolloLink = js.native
  @js.native
  object ErrorLink extends js.Object {
    type ErrorHandler = js.Function1[
        /* error */ ErrorResponse, 
        (Observable[
          FetchResult[StringDictionary[js.Any], Record[String, js.Any], Record[String, js.Any]]
        ]) | Unit
      ]
  }
  
}

