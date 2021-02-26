package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateDhcpOptionsRequest extends StObject {
  
  /**
    * The ID of the DHCP options set, or default to associate no DHCP options with the VPC.
    */
  var DhcpOptionsId: DefaultingDhcpOptionsId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typingsSlinky.awsSdk.ec2Mod.VpcId = js.native
}
object AssociateDhcpOptionsRequest {
  
  @scala.inline
  def apply(DhcpOptionsId: DefaultingDhcpOptionsId, VpcId: VpcId): AssociateDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpOptionsId = DhcpOptionsId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDhcpOptionsRequest]
  }
  
  @scala.inline
  implicit class AssociateDhcpOptionsRequestMutableBuilder[Self <: AssociateDhcpOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDhcpOptionsId(value: DefaultingDhcpOptionsId): Self = StObject.set(x, "DhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
