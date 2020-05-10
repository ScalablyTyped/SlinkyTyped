package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotFleetRequestsResponse extends js.Object {
  /**
    * Information about the Spot Fleet requests that are successfully canceled.
    */
  var SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet] = js.native
  /**
    * Information about the Spot Fleet requests that are not successfully canceled.
    */
  var UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet] = js.native
}

object CancelSpotFleetRequestsResponse {
  @scala.inline
  def apply(): CancelSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsResponse]
  }
  @scala.inline
  implicit class CancelSpotFleetRequestsResponseOps[Self <: CancelSpotFleetRequestsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccessfulFleetRequests(value: CancelSpotFleetRequestsSuccessSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulFleetRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulFleetRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulFleetRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsuccessfulFleetRequests(value: CancelSpotFleetRequestsErrorSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsuccessfulFleetRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsuccessfulFleetRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsuccessfulFleetRequests")(js.undefined)
        ret
    }
  }
  
}

