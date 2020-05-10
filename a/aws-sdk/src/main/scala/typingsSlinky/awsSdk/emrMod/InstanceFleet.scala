package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleet extends js.Object {
  /**
    * The unique identifier of the instance fleet.
    */
  var Id: js.UndefOr[InstanceFleetId] = js.native
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK. 
    */
  var InstanceFleetType: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceFleetType] = js.native
  /**
    * The specification for the instance types that comprise an instance fleet. Up to five unique instance specifications may be defined for each instance fleet. 
    */
  var InstanceTypeSpecifications: js.UndefOr[InstanceTypeSpecificationList] = js.native
  /**
    * Describes the launch specification for an instance fleet. 
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.native
  /**
    * A friendly name for the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The number of On-Demand units that have been provisioned for the instance fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
    */
  var ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The number of Spot units that have been provisioned for this instance fleet to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
    */
  var ProvisionedSpotCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The current status of the instance fleet. 
    */
  var Status: js.UndefOr[InstanceFleetStatus] = js.native
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedOnDemandCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedSpotCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceFleet {
  @scala.inline
  def apply(): InstanceFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleet]
  }
  @scala.inline
  implicit class InstanceFleetOps[Self <: InstanceFleet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: InstanceFleetId): Self = {
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
    def withInstanceFleetType(value: InstanceFleetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFleetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTypeSpecifications(value: InstanceTypeSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTypeSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTypeSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTypeSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchSpecifications(value: InstanceFleetProvisioningSpecifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: XmlStringMaxLen256): Self = {
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
    def withProvisionedOnDemandCapacity(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedOnDemandCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedOnDemandCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedOnDemandCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedSpotCapacity(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedSpotCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedSpotCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedSpotCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: InstanceFleetStatus): Self = {
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
    @scala.inline
    def withTargetOnDemandCapacity(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetOnDemandCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetOnDemandCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetOnDemandCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSpotCapacity(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSpotCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSpotCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSpotCapacity")(js.undefined)
        ret
    }
  }
  
}

