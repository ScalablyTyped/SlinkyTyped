package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPoolsAddHealthCheckRequest extends js.Object {
  /** The HttpHealthCheck to add to the target pool. */
  var healthChecks: js.UndefOr[js.Array[HealthCheckReference]] = js.native
}

object TargetPoolsAddHealthCheckRequest {
  @scala.inline
  def apply(): TargetPoolsAddHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsAddHealthCheckRequest]
  }
  @scala.inline
  implicit class TargetPoolsAddHealthCheckRequestOps[Self <: TargetPoolsAddHealthCheckRequest] (val x: Self) extends AnyVal {
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

