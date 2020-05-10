package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCapacityReservationResult extends js.Object {
  /**
    * Information about the Capacity Reservation.
    */
  var CapacityReservation: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CapacityReservation] = js.native
}

object CreateCapacityReservationResult {
  @scala.inline
  def apply(): CreateCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCapacityReservationResult]
  }
  @scala.inline
  implicit class CreateCapacityReservationResultOps[Self <: CreateCapacityReservationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityReservation(value: CapacityReservation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservation")(js.undefined)
        ret
    }
  }
  
}

