package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputVpcRequest extends StObject {
  
  /**
    * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC network interfaces.
  Requires subnetIds. If none are specified then the VPC default security group will be used.
    */
  var SecurityGroupIds: js.UndefOr[listOfString] = js.native
  
  /**
    * A list of 2 VPC subnet IDs from the same VPC.
  Subnet IDs must be mapped to two unique availability zones (AZ).
    */
  var SubnetIds: listOfString = js.native
}
object InputVpcRequest {
  
  @scala.inline
  def apply(SubnetIds: listOfString): InputVpcRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVpcRequest]
  }
  
  @scala.inline
  implicit class InputVpcRequestMutableBuilder[Self <: InputVpcRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: listOfString): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: listOfString): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
