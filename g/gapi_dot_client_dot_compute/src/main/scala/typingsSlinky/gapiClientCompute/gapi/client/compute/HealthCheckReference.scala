package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheckReference extends js.Object {
  var healthCheck: js.UndefOr[String] = js.native
}

object HealthCheckReference {
  @scala.inline
  def apply(): HealthCheckReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckReference]
  }
  @scala.inline
  implicit class HealthCheckReferenceOps[Self <: HealthCheckReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthCheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(js.undefined)
        ret
    }
  }
  
}

