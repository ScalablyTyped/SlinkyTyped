package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceCapacityReservationAttributesRequest extends js.Object {
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: typingsSlinky.awsSdk.ec2Mod.CapacityReservationSpecification = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance to be modified.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
}

object ModifyInstanceCapacityReservationAttributesRequest {
  @scala.inline
  def apply(CapacityReservationSpecification: CapacityReservationSpecification, InstanceId: InstanceId): ModifyInstanceCapacityReservationAttributesRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationSpecification = CapacityReservationSpecification.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCapacityReservationAttributesRequest]
  }
  @scala.inline
  implicit class ModifyInstanceCapacityReservationAttributesRequestOps[Self <: ModifyInstanceCapacityReservationAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityReservationSpecification(value: CapacityReservationSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
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
  }
  
}

