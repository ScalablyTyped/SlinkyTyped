package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelledSpotInstanceRequest extends js.Object {
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Instance request.
    */
  var State: js.UndefOr[CancelSpotInstanceRequestState] = js.native
}

object CancelledSpotInstanceRequest {
  @scala.inline
  def apply(): CancelledSpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelledSpotInstanceRequest]
  }
  @scala.inline
  implicit class CancelledSpotInstanceRequestOps[Self <: CancelledSpotInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotInstanceRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotInstanceRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CancelSpotInstanceRequestState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

