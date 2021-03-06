package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ec2Config extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList = js.native
  
  /**
    * The ARN of the subnet and the security group that DataSync uses to access the target EFS file system.
    */
  var SubnetArn: Ec2SubnetArn = js.native
}
object Ec2Config {
  
  @scala.inline
  def apply(SecurityGroupArns: Ec2SecurityGroupArnList, SubnetArn: Ec2SubnetArn): Ec2Config = {
    val __obj = js.Dynamic.literal(SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], SubnetArn = SubnetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2Config]
  }
  
  @scala.inline
  implicit class Ec2ConfigMutableBuilder[Self <: Ec2Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value :_*))
    
    @scala.inline
    def setSubnetArn(value: Ec2SubnetArn): Self = StObject.set(x, "SubnetArn", value.asInstanceOf[js.Any])
  }
}
