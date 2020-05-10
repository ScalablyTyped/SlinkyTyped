package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySpotFleetRequestRequest extends js.Object {
  /**
    * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is decreased below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ExcessCapacityTerminationPolicy] = js.native
  /**
    * The number of On-Demand Instances in the fleet.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: typingsSlinky.awsSdk.ec2Mod.SpotFleetRequestId = js.native
  /**
    * The size of the fleet.
    */
  var TargetCapacity: js.UndefOr[Integer] = js.native
}

object ModifySpotFleetRequestRequest {
  @scala.inline
  def apply(SpotFleetRequestId: SpotFleetRequestId): ModifySpotFleetRequestRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestId = SpotFleetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySpotFleetRequestRequest]
  }
  @scala.inline
  implicit class ModifySpotFleetRequestRequestOps[Self <: ModifySpotFleetRequestRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotFleetRequestId(value: SpotFleetRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcessCapacityTerminationPolicy(value: ExcessCapacityTerminationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcessCapacityTerminationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcessCapacityTerminationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcessCapacityTerminationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandTargetCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandTargetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandTargetCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandTargetCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCapacity")(js.undefined)
        ret
    }
  }
  
}

