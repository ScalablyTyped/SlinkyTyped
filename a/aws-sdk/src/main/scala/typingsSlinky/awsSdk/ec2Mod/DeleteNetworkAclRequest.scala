package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNetworkAclRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: typingsSlinky.awsSdk.ec2Mod.NetworkAclId = js.native
}
object DeleteNetworkAclRequest {
  
  @scala.inline
  def apply(NetworkAclId: NetworkAclId): DeleteNetworkAclRequest = {
    val __obj = js.Dynamic.literal(NetworkAclId = NetworkAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkAclRequest]
  }
  
  @scala.inline
  implicit class DeleteNetworkAclRequestMutableBuilder[Self <: DeleteNetworkAclRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setNetworkAclId(value: NetworkAclId): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
  }
}
