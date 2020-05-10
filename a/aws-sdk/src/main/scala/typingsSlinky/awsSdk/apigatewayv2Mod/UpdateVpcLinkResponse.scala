package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVpcLinkResponse extends js.Object {
  /**
    * The timestamp when the VPC link was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the VPC link.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.native
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: js.UndefOr[SubnetIdList] = js.native
  /**
    * Tags for the VPC link.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.Tags] = js.native
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: js.UndefOr[Id] = js.native
  /**
    * The status of the VPC link.
    */
  var VpcLinkStatus: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.VpcLinkStatus] = js.native
  /**
    * A message summarizing the cause of the status of the VPC link.
    */
  var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * The version of the VPC link.
    */
  var VpcLinkVersion: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.VpcLinkVersion] = js.native
}

object UpdateVpcLinkResponse {
  @scala.inline
  def apply(): UpdateVpcLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVpcLinkResponse]
  }
  @scala.inline
  implicit class UpdateVpcLinkResponseOps[Self <: UpdateVpcLinkResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: StringWithLengthBetween1And128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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
    def withSubnetIds(value: SubnetIdList): Self = {
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
    @scala.inline
    def withVpcLinkId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcLinkStatus(value: VpcLinkStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcLinkStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcLinkStatusMessage(value: StringWithLengthBetween0And1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcLinkStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcLinkVersion(value: VpcLinkVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcLinkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkVersion")(js.undefined)
        ret
    }
  }
  
}

