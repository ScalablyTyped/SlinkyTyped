package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotInstanceRequestsResult extends js.Object {
  /**
    * One or more Spot Instance requests.
    */
  var CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList] = js.native
}

object CancelSpotInstanceRequestsResult {
  @scala.inline
  def apply(): CancelSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotInstanceRequestsResult]
  }
  @scala.inline
  implicit class CancelSpotInstanceRequestsResultOps[Self <: CancelSpotInstanceRequestsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelledSpotInstanceRequests(value: CancelledSpotInstanceRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelledSpotInstanceRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelledSpotInstanceRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelledSpotInstanceRequests")(js.undefined)
        ret
    }
  }
  
}

