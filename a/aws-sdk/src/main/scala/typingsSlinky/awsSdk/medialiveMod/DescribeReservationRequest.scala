package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservationRequest extends js.Object {
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: string = js.native
}

object DescribeReservationRequest {
  @scala.inline
  def apply(ReservationId: string): DescribeReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservationRequest]
  }
  @scala.inline
  implicit class DescribeReservationRequestOps[Self <: DescribeReservationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

