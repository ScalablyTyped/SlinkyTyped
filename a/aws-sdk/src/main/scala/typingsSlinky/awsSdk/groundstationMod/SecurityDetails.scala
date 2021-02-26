package typingsSlinky.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityDetails extends StObject {
  
  /**
    * ARN to a role needed for connecting streams to your instances. 
    */
  var roleArn: RoleArn = js.native
  
  /**
    * The security groups to attach to the elastic network interfaces.
    */
  var securityGroupIds: SecurityGroupIdList = js.native
  
  /**
    * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
    */
  var subnetIds: SubnetList = js.native
}
object SecurityDetails {
  
  @scala.inline
  def apply(roleArn: RoleArn, securityGroupIds: SecurityGroupIdList, subnetIds: SubnetList): SecurityDetails = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDetails]
  }
  
  @scala.inline
  implicit class SecurityDetailsMutableBuilder[Self <: SecurityDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
  }
}
