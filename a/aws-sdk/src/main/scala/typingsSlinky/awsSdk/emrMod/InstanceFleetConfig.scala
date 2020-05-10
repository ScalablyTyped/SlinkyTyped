package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetConfig extends js.Object {
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
    */
  var InstanceFleetType: typingsSlinky.awsSdk.emrMod.InstanceFleetType = js.native
  /**
    * The instance type configurations that define the EC2 instances in the instance fleet.
    */
  var InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList] = js.native
  /**
    * The launch specification for the instance fleet.
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.native
  /**
    * The friendly name of the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceFleetConfig {
  @scala.inline
  def apply(InstanceFleetType: InstanceFleetType): InstanceFleetConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetType = InstanceFleetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetConfig]
  }
  @scala.inline
  implicit class InstanceFleetConfigOps[Self <: InstanceFleetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceFleetType(value: InstanceFleetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceTypeConfigs(value: InstanceTypeConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTypeConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTypeConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTypeConfigs")(js.undefined)
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

