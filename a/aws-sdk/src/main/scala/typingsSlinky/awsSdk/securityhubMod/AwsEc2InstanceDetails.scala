package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2InstanceDetails extends js.Object {
  /**
    * The IAM profile ARN of the instance.
    */
  var IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The IPv4 addresses associated with the instance.
    */
  var IpV4Addresses: js.UndefOr[StringList] = js.native
  /**
    * The IPv6 addresses associated with the instance.
    */
  var IpV6Addresses: js.UndefOr[StringList] = js.native
  /**
    * The key name associated with the instance.
    */
  var KeyName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date/time the instance was launched.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance type of the instance. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2InstanceDetails {
  @scala.inline
  def apply(): AwsEc2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceDetails]
  }
  @scala.inline
  implicit class AwsEc2InstanceDetailsOps[Self <: AwsEc2InstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamInstanceProfileArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withImageId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpV4Addresses(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpV4Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpV4Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpV4Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withIpV6Addresses(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpV6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpV6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpV6Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchedAt(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
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

