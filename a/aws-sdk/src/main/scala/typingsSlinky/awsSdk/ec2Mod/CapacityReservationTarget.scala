package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationTarget extends js.Object {
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CapacityReservationId] = js.native
}

object CapacityReservationTarget {
  @scala.inline
  def apply(): CapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationTarget]
  }
  @scala.inline
  implicit class CapacityReservationTargetOps[Self <: CapacityReservationTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityReservationId(value: CapacityReservationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationId")(js.undefined)
        ret
    }
  }
  
}

