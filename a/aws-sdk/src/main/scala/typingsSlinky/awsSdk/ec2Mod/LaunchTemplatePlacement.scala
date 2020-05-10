package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplatePlacement extends js.Object {
  /**
    * The affinity setting for the instance on the Dedicated Host.
    */
  var Affinity: js.UndefOr[String] = js.native
  /**
    * The Availability Zone of the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The name of the placement group for the instance.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var HostId: js.UndefOr[String] = js.native
  /**
    * The ARN of the host resource group in which to launch the instances. 
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.native
  /**
    * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.native
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.native
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. 
    */
  var Tenancy: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Tenancy] = js.native
}

object LaunchTemplatePlacement {
  @scala.inline
  def apply(): LaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatePlacement]
  }
  @scala.inline
  implicit class LaunchTemplatePlacementOps[Self <: LaunchTemplatePlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffinity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Affinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Affinity")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
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
    def withHostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostId")(js.undefined)
        ret
    }
    @scala.inline
    def withHostResourceGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostResourceGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostResourceGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostResourceGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withTenancy(value: Tenancy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(js.undefined)
        ret
    }
  }
  
}

