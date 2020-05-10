package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReservationResponse extends js.Object {
  var Reservation: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Reservation] = js.native
}

object UpdateReservationResponse {
  @scala.inline
  def apply(): UpdateReservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReservationResponse]
  }
  @scala.inline
  implicit class UpdateReservationResponseOps[Self <: UpdateReservationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservation(value: Reservation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reservation")(js.undefined)
        ret
    }
  }
  
}

