package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationSpecification extends js.Object {
  /**
    * Indicates the instance's Capacity Reservation preferences. Possible preferences include:    open - The instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).    none - The instance avoids running in a Capacity Reservation even if one is available. The instance runs as an On-Demand Instance.  
    */
  var CapacityReservationPreference: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CapacityReservationPreference] = js.native
  /**
    * Information about the target Capacity Reservation.
    */
  var CapacityReservationTarget: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CapacityReservationTarget] = js.native
}

object CapacityReservationSpecification {
  @scala.inline
  def apply(): CapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationSpecification]
  }
  @scala.inline
  implicit class CapacityReservationSpecificationOps[Self <: CapacityReservationSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityReservationPreference(value: CapacityReservationPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacityReservationTarget(value: CapacityReservationTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationTarget")(js.undefined)
        ret
    }
  }
  
}

