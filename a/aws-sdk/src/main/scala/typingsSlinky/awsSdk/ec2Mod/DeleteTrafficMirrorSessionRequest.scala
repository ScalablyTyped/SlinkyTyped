package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorSessionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: typingsSlinky.awsSdk.ec2Mod.TrafficMirrorSessionId = js.native
}

object DeleteTrafficMirrorSessionRequest {
  @scala.inline
  def apply(TrafficMirrorSessionId: TrafficMirrorSessionId): DeleteTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorSessionId = TrafficMirrorSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorSessionRequest]
  }
  @scala.inline
  implicit class DeleteTrafficMirrorSessionRequestOps[Self <: DeleteTrafficMirrorSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficMirrorSessionId(value: TrafficMirrorSessionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorSessionId")(value.asInstanceOf[js.Any])
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

