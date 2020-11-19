package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCompanyNetworkConfigurationResponse extends js.Object {
  
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
  implicit class DescribeCompanyNetworkConfigurationResponseOps[Self <: DescribeCompanyNetworkConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
