package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcLinkRequest extends js.Object {
  /**
    * The name of the VPC link.
    */
  var Name: StringWithLengthBetween1And128 = js.native
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.native
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: SubnetIdList = js.native
  /**
    * A list of tags.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.Tags] = js.native
}

object CreateVpcLinkRequest {
  @scala.inline
  def apply(Name: StringWithLengthBetween1And128, SubnetIds: SubnetIdList): CreateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcLinkRequest]
  }
  @scala.inline
  implicit class CreateVpcLinkRequestOps[Self <: CreateVpcLinkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: StringWithLengthBetween1And128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: SecurityGroupIdList): Self = {
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
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

