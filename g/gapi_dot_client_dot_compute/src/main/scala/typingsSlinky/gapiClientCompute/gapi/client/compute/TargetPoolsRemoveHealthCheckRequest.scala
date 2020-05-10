package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPoolsRemoveHealthCheckRequest extends js.Object {
  /**
    * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs:
    * - https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
    * - projects/project/global/httpHealthChecks/health-check
    * - global/httpHealthChecks/health-check
    */
  var healthChecks: js.UndefOr[js.Array[HealthCheckReference]] = js.native
}

object TargetPoolsRemoveHealthCheckRequest {
  @scala.inline
  def apply(): TargetPoolsRemoveHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsRemoveHealthCheckRequest]
  }
  @scala.inline
  implicit class TargetPoolsRemoveHealthCheckRequestOps[Self <: TargetPoolsRemoveHealthCheckRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthChecks(value: js.Array[HealthCheckReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthChecks")(js.undefined)
        ret
    }
  }
  
}

