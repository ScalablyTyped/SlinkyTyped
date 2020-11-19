package typingsSlinky.apolloClient

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/core/networkStatus", JSImport.Namespace)
@js.native
object networkStatusMod extends js.Object {
  
  def isNetworkRequestInFlight(networkStatus: NetworkStatus): Boolean = js.native
  
  @js.native
  sealed trait NetworkStatus extends js.Object
  @js.native
  object NetworkStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NetworkStatus with Double] = js.native
    
    @js.native
    sealed trait error extends NetworkStatus
    /* 8 */ @js.native
    object error extends TopLevel[error with Double]
    
    @js.native
    sealed trait fetchMore extends NetworkStatus
    /* 3 */ @js.native
    object fetchMore extends TopLevel[fetchMore with Double]
    
    @js.native
    sealed trait loading extends NetworkStatus
    /* 1 */ @js.native
    object loading extends TopLevel[loading with Double]
    
    @js.native
    sealed trait poll extends NetworkStatus
    /* 6 */ @js.native
    object poll extends TopLevel[poll with Double]
    
    @js.native
    sealed trait ready extends NetworkStatus
    /* 7 */ @js.native
    object ready extends TopLevel[ready with Double]
    
    @js.native
    sealed trait refetch extends NetworkStatus
    /* 4 */ @js.native
    object refetch extends TopLevel[refetch with Double]
    
    @js.native
    sealed trait setVariables extends NetworkStatus
    /* 2 */ @js.native
    object setVariables extends TopLevel[setVariables with Double]
  }
}
