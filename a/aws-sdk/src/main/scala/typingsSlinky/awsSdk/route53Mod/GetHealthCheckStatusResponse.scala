package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHealthCheckStatusResponse extends js.Object {
  /**
    * A list that contains one HealthCheckObservation element for each Amazon Route 53 health checker that is reporting a status about the health check endpoint.
    */
  var HealthCheckObservations: typingsSlinky.awsSdk.route53Mod.HealthCheckObservations = js.native
}

object GetHealthCheckStatusResponse {
  @scala.inline
  def apply(HealthCheckObservations: HealthCheckObservations): GetHealthCheckStatusResponse = {
    val __obj = js.Dynamic.literal(HealthCheckObservations = HealthCheckObservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckStatusResponse]
  }
  @scala.inline
  implicit class GetHealthCheckStatusResponseOps[Self <: GetHealthCheckStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthCheckObservations(value: HealthCheckObservations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckObservations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

