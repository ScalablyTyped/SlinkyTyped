package typingsSlinky.apolloDashClient

import typingsSlinky.apolloDashClient.apolloClientMod.ApolloClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client", JSImport.Namespace)
@js.native
object apolloDashClientMod extends js.Object {
  @js.native
  class ApolloClient[TCacheShape] protected ()
    extends typingsSlinky.apolloDashClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  @js.native
  class ApolloError protected ()
    extends typingsSlinky.apolloDashClient.errorsApolloErrorMod.ApolloError {
    def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: Anon_ErrorMessage) = this()
  }
  
  @js.native
  class ObservableQuery[TData, TVariables] protected ()
    extends typingsSlinky.apolloDashClient.coreObservableQueryMod.ObservableQuery[TData, TVariables] {
    def this(hasQueryManagerOptionsShouldSubscribe: Anon_Options[TVariables]) = this()
  }
  
  @js.native
  class default[TCacheShape] protected ()
    extends typingsSlinky.apolloDashClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  def isApolloError(err: js.Error): /* is apollo-client.apollo-client/errors/ApolloError.ApolloError */ Boolean = js.native
  @js.native
  object FetchType extends js.Object {
    /* 1 */ val normal: typingsSlinky.apolloDashClient.coreTypesMod.FetchType.normal with Double = js.native
    /* 3 */ val poll: typingsSlinky.apolloDashClient.coreTypesMod.FetchType.poll with Double = js.native
    /* 2 */ val refetch: typingsSlinky.apolloDashClient.coreTypesMod.FetchType.refetch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.apolloDashClient.coreTypesMod.FetchType with Double] = js.native
  }
  
  @js.native
  object NetworkStatus extends js.Object {
    /* 8 */ val error: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.error with Double = js.native
    /* 3 */ val fetchMore: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.fetchMore with Double = js.native
    /* 1 */ val loading: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.loading with Double = js.native
    /* 6 */ val poll: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.poll with Double = js.native
    /* 7 */ val ready: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.ready with Double = js.native
    /* 4 */ val refetch: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.refetch with Double = js.native
    /* 2 */ val setVariables: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.setVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus with Double] = js.native
  }
  
}

