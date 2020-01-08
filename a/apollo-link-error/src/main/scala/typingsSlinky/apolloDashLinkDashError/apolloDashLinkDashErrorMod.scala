package typingsSlinky.apolloDashLinkDashError

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashLink.apolloDashLinkMod.ApolloLink
import typingsSlinky.apolloDashLink.libTypesMod.FetchResult
import typingsSlinky.apolloDashLink.libTypesMod.NextLink
import typingsSlinky.apolloDashLink.libTypesMod.Operation
import typingsSlinky.apolloDashLinkDashError.apolloDashLinkDashErrorMod.ErrorLink.ErrorHandler
import typingsSlinky.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod.ServerError
import typingsSlinky.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod.ServerParseError
import typingsSlinky.graphql.executionExecuteMod.ExecutionResult
import typingsSlinky.graphql.executionExecuteMod.ExecutionResultDataDefault
import typingsSlinky.graphql.graphqlMod.GraphQLError
import typingsSlinky.std.Record
import typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-error", JSImport.Namespace)
@js.native
object apolloDashLinkDashErrorMod extends js.Object {
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
    var response: js.UndefOr[ExecutionResult[ExecutionResultDataDefault]] = js.native
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

