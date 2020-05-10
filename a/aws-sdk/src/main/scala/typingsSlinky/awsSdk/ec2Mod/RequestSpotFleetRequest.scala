package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSpotFleetRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The configuration for the Spot Fleet request.
    */
  var SpotFleetRequestConfig: SpotFleetRequestConfigData = js.native
}

object RequestSpotFleetRequest {
  @scala.inline
  def apply(SpotFleetRequestConfig: SpotFleetRequestConfigData): RequestSpotFleetRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestConfig = SpotFleetRequestConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSpotFleetRequest]
  }
  @scala.inline
  implicit class RequestSpotFleetRequestOps[Self <: RequestSpotFleetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotFleetRequestConfig(value: SpotFleetRequestConfigData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotFleetRequestConfig")(value.asInstanceOf[js.Any])
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

