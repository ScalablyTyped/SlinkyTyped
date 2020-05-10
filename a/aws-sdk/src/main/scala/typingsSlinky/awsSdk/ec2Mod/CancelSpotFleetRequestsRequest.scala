package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotFleetRequestsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the Spot Fleet requests.
    */
  var SpotFleetRequestIds: SpotFleetRequestIdList = js.native
  /**
    * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
    */
  var TerminateInstances: Boolean = js.native
}

object CancelSpotFleetRequestsRequest {
  @scala.inline
  def apply(SpotFleetRequestIds: SpotFleetRequestIdList, TerminateInstances: Boolean): CancelSpotFleetRequestsRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestIds = SpotFleetRequestIds.asInstanceOf[js.Any], TerminateInstances = TerminateInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotFleetRequestsRequest]
  }
  @scala.inline
  implicit class CancelSpotFleetRequestsRequestOps[Self <: CancelSpotFleetRequestsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotFleetRequestIds(value: SpotFleetRequestIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminateInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateInstances")(value.asInstanceOf[js.Any])
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

