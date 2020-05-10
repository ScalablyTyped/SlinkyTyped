package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupDetails extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The inbound rules associated with the security group.
    */
  var IpPermissions: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.native
  /**
    * [VPC only] The outbound rules associated with the security group.
    */
  var IpPermissionsEgress: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.native
  /**
    * The AWS account ID of the owner of the security group.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.native
  /**
    * [VPC only] The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2SecurityGroupDetails {
  @scala.inline
  def apply(): AwsEc2SecurityGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupDetails]
  }
  @scala.inline
  implicit class AwsEc2SecurityGroupDetailsOps[Self <: AwsEc2SecurityGroupDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpPermissions(value: AwsEc2SecurityGroupIpPermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withIpPermissionsEgress(value: AwsEc2SecurityGroupIpPermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpPermissionsEgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpPermissionsEgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpPermissionsEgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

