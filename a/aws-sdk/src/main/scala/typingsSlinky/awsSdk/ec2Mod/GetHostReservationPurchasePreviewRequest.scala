package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostReservationPurchasePreviewRequest extends js.Object {
  /**
    * The IDs of the Dedicated Hosts with which the reservation is associated.
    */
  var HostIdSet: RequestHostIdSet = js.native
  /**
    * The offering ID of the reservation.
    */
  var OfferingId: typingsSlinky.awsSdk.ec2Mod.OfferingId = js.native
}

object GetHostReservationPurchasePreviewRequest {
  @scala.inline
  def apply(HostIdSet: RequestHostIdSet, OfferingId: OfferingId): GetHostReservationPurchasePreviewRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostReservationPurchasePreviewRequest]
  }
  @scala.inline
  implicit class GetHostReservationPurchasePreviewRequestOps[Self <: GetHostReservationPurchasePreviewRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostIdSet(value: RequestHostIdSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostIdSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfferingId(value: OfferingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

