package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetSecurityGroupsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArn = js.native
  
  /**
    * The IDs of the security groups.
    */
  var SecurityGroups: typingsSlinky.awsSdk.elbv2Mod.SecurityGroups = js.native
}
object SetSecurityGroupsInput {
  
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn, SecurityGroups: SecurityGroups): SetSecurityGroupsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any], SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSecurityGroupsInput]
  }
  
  @scala.inline
  implicit class SetSecurityGroupsInputMutableBuilder[Self <: SetSecurityGroupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
  }
}
