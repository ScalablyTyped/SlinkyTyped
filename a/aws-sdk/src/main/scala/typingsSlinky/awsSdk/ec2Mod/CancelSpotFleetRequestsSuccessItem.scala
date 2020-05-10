package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotFleetRequestsSuccessItem extends js.Object {
  /**
    * The current state of the Spot Fleet request.
    */
  var CurrentSpotFleetRequestState: js.UndefOr[BatchState] = js.native
  /**
    * The previous state of the Spot Fleet request.
    */
  var PreviousSpotFleetRequestState: js.UndefOr[BatchState] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
}

object CancelSpotFleetRequestsSuccessItem {
  @scala.inline
  def apply(): CancelSpotFleetRequestsSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsSuccessItem]
  }
  @scala.inline
  implicit class CancelSpotFleetRequestsSuccessItemOps[Self <: CancelSpotFleetRequestsSuccessItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSpotFleetRequestState(value: BatchState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSpotFleetRequestState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSpotFleetRequestState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSpotFleetRequestState")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSpotFleetRequestState(value: BatchState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousSpotFleetRequestState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSpotFleetRequestState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousSpotFleetRequestState")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotFleetRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotFleetRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestId")(js.undefined)
        ret
    }
  }
  
}

