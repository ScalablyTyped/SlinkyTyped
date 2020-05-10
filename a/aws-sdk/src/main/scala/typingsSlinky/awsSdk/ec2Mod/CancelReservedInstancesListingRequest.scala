package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelReservedInstancesListingRequest extends js.Object {
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: typingsSlinky.awsSdk.ec2Mod.ReservedInstancesListingId = js.native
}

object CancelReservedInstancesListingRequest {
  @scala.inline
  def apply(ReservedInstancesListingId: ReservedInstancesListingId): CancelReservedInstancesListingRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesListingId = ReservedInstancesListingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReservedInstancesListingRequest]
  }
  @scala.inline
  implicit class CancelReservedInstancesListingRequestOps[Self <: CancelReservedInstancesListingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedInstancesListingId(value: ReservedInstancesListingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesListingId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

