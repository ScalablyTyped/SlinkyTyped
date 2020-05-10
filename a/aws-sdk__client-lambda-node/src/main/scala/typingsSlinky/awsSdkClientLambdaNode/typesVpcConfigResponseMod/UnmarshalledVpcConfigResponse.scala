package typingsSlinky.awsSdkClientLambdaNode.typesVpcConfigResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
        ret
    }
  }
  
}

