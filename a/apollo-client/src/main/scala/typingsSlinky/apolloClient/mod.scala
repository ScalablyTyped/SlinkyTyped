package typingsSlinky.apolloClient

import typingsSlinky.apolloClient.anon.ErrorMessage
import typingsSlinky.apolloClient.anon.Options
import typingsSlinky.apolloClient.apolloClientMod.ApolloClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isApolloError(err: js.Error): /* is apollo-client.apollo-client/errors/ApolloError.ApolloError */ Boolean = js.native
  
  @js.native
  class ApolloClient[TCacheShape] protected ()
    extends typingsSlinky.apolloClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  @js.native
  class ApolloError protected ()
    extends typingsSlinky.apolloClient.apolloErrorMod.ApolloError {
    def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: ErrorMessage) = this()
  }
  
  @js.native
  object FetchType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.apolloClient.typesMod.FetchType with Double] = js.native
    
    /* 1 */ val normal: typingsSlinky.apolloClient.typesMod.FetchType.normal with Double = js.native
    
    /* 3 */ val poll: typingsSlinky.apolloClient.typesMod.FetchType.poll with Double = js.native
    
    /* 2 */ val refetch: typingsSlinky.apolloClient.typesMod.FetchType.refetch with Double = js.native
  }
  
  @js.native
  object NetworkStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.apolloClient.networkStatusMod.NetworkStatus with Double] = js.native
    
    /* 8 */ val error: typingsSlinky.apolloClient.networkStatusMod.NetworkStatus.error with Double = js.native
    
    /* 3 */ val fetchMore: typingsSlinky.apolloClient.networkStatusMod.NetworkStatus.fetchMore with Double = js.native
    
    /* 1 */ val loading: typingsSlinky.apolloClient.networkStatusMod.NetworkStatus.loading with Double = js.native
    
    /* 6 */ val poll: typingsSlinky.apolloClient.networkStatusMod.NetworkStatus.poll with Double = js.native
    
    /* 7 */ val ready: typingsSlinky.apolloClient.networkStatusMod.NetworkStatus.ready with Double = js.native
    
    /* 4 */ val refetch: typingsSlinky.apolloClient.networkStatusMod.NetworkStatus.refetch with Double = js.native
    
    /* 2 */ val setVariables: typingsSlinky.apolloClient.networkStatusMod.NetworkStatus.setVariables with Double = js.native
  }
  
  @js.native
  class ObservableQuery[TData, TVariables] protected ()
    extends typingsSlinky.apolloClient.observableQueryMod.ObservableQuery[TData, TVariables] {
    def this(hasQueryManagerOptionsShouldSubscribe: Options[TVariables]) = this()
  }
  
  @js.native
  class default[TCacheShape] protected ()
    extends typingsSlinky.apolloClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
}
