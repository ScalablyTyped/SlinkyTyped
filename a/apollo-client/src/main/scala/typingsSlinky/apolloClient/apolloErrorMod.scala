package typingsSlinky.apolloClient

import typingsSlinky.apolloClient.anon.ErrorMessage
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/errors/ApolloError", JSImport.Namespace)
@js.native
object apolloErrorMod extends js.Object {
  
  def isApolloError(err: js.Error): /* is apollo-client.apollo-client/errors/ApolloError.ApolloError */ Boolean = js.native
  
  @js.native
  class ApolloError protected () extends Error {
    def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: ErrorMessage) = this()
    
    var extraInfo: js.Any = js.native
    
    var graphQLErrors: js.Array[GraphQLError] = js.native
    
    var networkError: js.Error | Null = js.native
  }
}
