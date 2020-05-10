package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHealthCheckResponse extends js.Object {
  /**
    * A complex type that contains identifying information about the health check.
    */
  var HealthCheck: typingsSlinky.awsSdk.route53Mod.HealthCheck = js.native
  /**
    * The unique URL representing the new health check.
    */
  var Location: ResourceURI = js.native
}

object CreateHealthCheckResponse {
  @scala.inline
  def apply(HealthCheck: HealthCheck, Location: ResourceURI): CreateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHealthCheckResponse]
  }
  @scala.inline
  implicit class CreateHealthCheckResponseOps[Self <: CreateHealthCheckResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthCheck(value: HealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: ResourceURI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

