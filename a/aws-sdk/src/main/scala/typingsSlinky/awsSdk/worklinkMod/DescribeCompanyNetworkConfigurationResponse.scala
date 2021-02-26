package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCompanyNetworkConfigurationResponse extends StObject {
  
  /**
    * The security groups associated with access to the provided subnets.
    */
  var SecurityGroupIds: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.SecurityGroupIds] = js.native
  
  /**
    * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.SubnetIds] = js.native
  
  /**
    * The VPC with connectivity to associated websites.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.VpcId] = js.native
}
object DescribeCompanyNetworkConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeCompanyNetworkConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCompanyNetworkConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeCompanyNetworkConfigurationResponseMutableBuilder[Self <: DescribeCompanyNetworkConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
