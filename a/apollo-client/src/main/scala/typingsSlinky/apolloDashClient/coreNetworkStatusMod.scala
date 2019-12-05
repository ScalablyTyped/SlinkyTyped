package typingsSlinky.apolloDashClient

import typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/networkStatus", JSImport.Namespace)
@js.native
object coreNetworkStatusMod extends js.Object {
  @js.native
  sealed trait NetworkStatus extends js.Object
  
  def isNetworkRequestInFlight(networkStatus: NetworkStatus): Boolean = js.native
  @js.native
  object NetworkStatus extends js.Object {
    @js.native
    sealed trait error extends NetworkStatus
    
    @js.native
    sealed trait fetchMore extends NetworkStatus
    
    @js.native
    sealed trait loading extends NetworkStatus
    
    @js.native
    sealed trait poll extends NetworkStatus
    
    @js.native
    sealed trait ready extends NetworkStatus
    
    @js.native
    sealed trait refetch extends NetworkStatus
    
    @js.native
    sealed trait setVariables extends NetworkStatus
    
    /* 8 */ val error: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.error with Double = js.native
    /* 3 */ val fetchMore: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.fetchMore with Double = js.native
    /* 1 */ val loading: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.loading with Double = js.native
    /* 6 */ val poll: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.poll with Double = js.native
    /* 7 */ val ready: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.ready with Double = js.native
    /* 4 */ val refetch: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.refetch with Double = js.native
    /* 2 */ val setVariables: typingsSlinky.apolloDashClient.coreNetworkStatusMod.NetworkStatus.setVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NetworkStatus with Double] = js.native
  }
  
}

