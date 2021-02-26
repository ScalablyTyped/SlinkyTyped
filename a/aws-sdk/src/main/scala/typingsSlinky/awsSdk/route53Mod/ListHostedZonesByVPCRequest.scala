package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHostedZonesByVPCRequest extends StObject {
  
  /**
    * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified VPC is associated with more than MaxItems hosted zones, the response includes a NextToken element. NextToken contains an encrypted token that identifies the first hosted zone that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  
  /**
    * If the previous response included a NextToken element, the specified VPC is associated with more hosted zones. To get more hosted zones, submit another ListHostedZonesByVPC request.  For the value of NextToken, specify the value of NextToken from the previous response. If the previous response didn't include a NextToken element, there are no more hosted zones to get.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the Amazon VPC that you want to list hosted zones for.
    */
  var VPCId: typingsSlinky.awsSdk.route53Mod.VPCId = js.native
  
  /**
    * For the Amazon VPC that you specified for VPCId, the AWS Region that you created the VPC in. 
    */
  var VPCRegion: typingsSlinky.awsSdk.route53Mod.VPCRegion = js.native
}
object ListHostedZonesByVPCRequest {
  
  @scala.inline
  def apply(VPCId: VPCId, VPCRegion: VPCRegion): ListHostedZonesByVPCRequest = {
    val __obj = js.Dynamic.literal(VPCId = VPCId.asInstanceOf[js.Any], VPCRegion = VPCRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByVPCRequest]
  }
  
  @scala.inline
  implicit class ListHostedZonesByVPCRequestMutableBuilder[Self <: ListHostedZonesByVPCRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVPCId(value: VPCId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCRegion(value: VPCRegion): Self = StObject.set(x, "VPCRegion", value.asInstanceOf[js.Any])
  }
}
