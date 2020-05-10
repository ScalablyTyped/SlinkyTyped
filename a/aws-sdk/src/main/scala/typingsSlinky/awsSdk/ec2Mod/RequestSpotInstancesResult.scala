package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSpotInstancesResult extends js.Object {
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.native
}

object RequestSpotInstancesResult {
  @scala.inline
  def apply(): RequestSpotInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotInstancesResult]
  }
  @scala.inline
  implicit class RequestSpotInstancesResultOps[Self <: RequestSpotInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotInstanceRequests(value: SpotInstanceRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotInstanceRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceRequests")(js.undefined)
        ret
    }
  }
  
}

