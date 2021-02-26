package typingsSlinky.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualInterfaceTestHistoryRequest extends StObject {
  
  /**
    * The BGP peers that were placed in the DOWN state during the virtual interface failover test.
    */
  var bgpPeers: js.UndefOr[BGPPeerIdList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If MaxResults is given a value larger than 100, only 100 results are returned.
    */
  var maxResults: js.UndefOr[MaxResultSetSize] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The status of the virtual interface failover test.
    */
  var status: js.UndefOr[FailureTestHistoryStatus] = js.native
  
  /**
    * The ID of the virtual interface failover test.
    */
  var testId: js.UndefOr[TestId] = js.native
  
  /**
    * The ID of the virtual interface that was tested.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}
object ListVirtualInterfaceTestHistoryRequest {
  
  @scala.inline
  def apply(): ListVirtualInterfaceTestHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualInterfaceTestHistoryRequest]
  }
  
  @scala.inline
  implicit class ListVirtualInterfaceTestHistoryRequestMutableBuilder[Self <: ListVirtualInterfaceTestHistoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgpPeers(value: BGPPeerIdList): Self = StObject.set(x, "bgpPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpPeersUndefined: Self = StObject.set(x, "bgpPeers", js.undefined)
    
    @scala.inline
    def setBgpPeersVarargs(value: BGPPeerId*): Self = StObject.set(x, "bgpPeers", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResultSetSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: FailureTestHistoryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTestId(value: TestId): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
  }
}
