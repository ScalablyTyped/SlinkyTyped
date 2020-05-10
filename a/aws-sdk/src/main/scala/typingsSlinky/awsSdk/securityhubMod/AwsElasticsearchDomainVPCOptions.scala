package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainVPCOptions extends js.Object {
  /**
    * The list of Availability Zones associated with the VPC subnets.
    */
  var AvailabilityZones: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * The list of security group IDs associated with the VPC endpoints for the domain.
    */
  var SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * A list of subnet IDs associated with the VPC endpoints for the domain.
    */
  var SubnetIds: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * ID for the VPC.
    */
  var VPCId: js.UndefOr[NonEmptyString] = js.native
}

object AwsElasticsearchDomainVPCOptions {
  @scala.inline
  def apply(): AwsElasticsearchDomainVPCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainVPCOptions]
  }
  @scala.inline
  implicit class AwsElasticsearchDomainVPCOptionsOps[Self <: AwsElasticsearchDomainVPCOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: NonEmptyStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: NonEmptyStringList): Self = {
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
    def withSubnetIds(value: NonEmptyStringList): Self = {
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
    def withVPCId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPCId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCId")(js.undefined)
        ret
    }
  }
  
}

