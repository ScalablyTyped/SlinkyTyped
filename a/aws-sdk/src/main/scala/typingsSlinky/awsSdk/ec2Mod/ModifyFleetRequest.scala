package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyFleetRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: typingsSlinky.awsSdk.ec2Mod.FleetId = js.native
  /**
    * The size of the EC2 Fleet.
    */
  var TargetCapacitySpecification: TargetCapacitySpecificationRequest = js.native
}

object ModifyFleetRequest {
  @scala.inline
  def apply(FleetId: FleetId, TargetCapacitySpecification: TargetCapacitySpecificationRequest): ModifyFleetRequest = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], TargetCapacitySpecification = TargetCapacitySpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFleetRequest]
  }
  @scala.inline
  implicit class ModifyFleetRequestOps[Self <: ModifyFleetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCapacitySpecification(value: TargetCapacitySpecificationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCapacitySpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = {
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
  }
  
}

