package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelSpotInstanceRequestsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more Spot Instance request IDs.
    */
  var SpotInstanceRequestIds: SpotInstanceRequestIdList = js.native
}
object CancelSpotInstanceRequestsRequest {
  
  @scala.inline
  def apply(SpotInstanceRequestIds: SpotInstanceRequestIdList): CancelSpotInstanceRequestsRequest = {
    val __obj = js.Dynamic.literal(SpotInstanceRequestIds = SpotInstanceRequestIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotInstanceRequestsRequest]
  }
  
  @scala.inline
  implicit class CancelSpotInstanceRequestsRequestMutableBuilder[Self <: CancelSpotInstanceRequestsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setSpotInstanceRequestIds(value: SpotInstanceRequestIdList): Self = StObject.set(x, "SpotInstanceRequestIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceRequestIdsVarargs(value: SpotInstanceRequestId*): Self = StObject.set(x, "SpotInstanceRequestIds", js.Array(value :_*))
  }
}
