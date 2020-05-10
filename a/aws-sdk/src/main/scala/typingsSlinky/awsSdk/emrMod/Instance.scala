package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The list of EBS volumes that are attached to this instance.
    */
  var EbsVolumes: js.UndefOr[EbsVolumeList] = js.native
  /**
    * The unique identifier of the instance in Amazon EC2.
    */
  var Ec2InstanceId: js.UndefOr[InstanceId] = js.native
  /**
    * The unique identifier for the instance in Amazon EMR.
    */
  var Id: js.UndefOr[InstanceId] = js.native
  /**
    * The unique identifier of the instance fleet to which an EC2 instance belongs.
    */
  var InstanceFleetId: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceFleetId] = js.native
  /**
    * The identifier of the instance group to which this instance belongs.
    */
  var InstanceGroupId: js.UndefOr[String] = js.native
  /**
    * The EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceType] = js.native
  /**
    * The instance purchasing option. Valid values are ON_DEMAND or SPOT. 
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * The private DNS name of the instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IP address of the instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The public DNS name of the instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The public IP address of the instance.
    */
  var PublicIpAddress: js.UndefOr[String] = js.native
  /**
    * The current status of the instance.
    */
  var Status: js.UndefOr[InstanceStatus] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEbsVolumes(value: EbsVolumeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsVolumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsVolumes")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2InstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceFleetId(value: InstanceFleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMarket(value: MarketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicDnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: InstanceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

