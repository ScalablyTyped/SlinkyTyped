package typingsSlinky.awsSdkClientLambdaNode.typesVpcConfigResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledVpcConfigResponse extends VpcConfigResponse {
  
  /**
    * <p>A list of VPC security groups IDs.</p>
    */
  @JSName("SecurityGroupIds")
  var SecurityGroupIds_UnmarshalledVpcConfigResponse: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>A list of VPC subnet IDs.</p>
    */
  @JSName("SubnetIds")
  var SubnetIds_UnmarshalledVpcConfigResponse: js.UndefOr[js.Array[String]] = js.native
}
object UnmarshalledVpcConfigResponse {
  
  @scala.inline
  def apply(): UnmarshalledVpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledVpcConfigResponse]
  }
  
  @scala.inline
  implicit class UnmarshalledVpcConfigResponseOps[Self <: UnmarshalledVpcConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
  }
}
