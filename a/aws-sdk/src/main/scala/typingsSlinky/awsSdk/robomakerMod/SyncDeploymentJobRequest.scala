package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncDeploymentJobRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: ClientRequestToken = js.native
  /**
    * The target fleet for the synchronization.
    */
  var fleet: Arn = js.native
}

object SyncDeploymentJobRequest {
  @scala.inline
  def apply(clientRequestToken: ClientRequestToken, fleet: Arn): SyncDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncDeploymentJobRequest]
  }
  @scala.inline
  implicit class SyncDeploymentJobRequestOps[Self <: SyncDeploymentJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFleet(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

