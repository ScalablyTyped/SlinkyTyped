package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverPollEndpointResponse extends js.Object {
  /**
    * The endpoint for the Amazon ECS agent to poll.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The telemetry endpoint for the Amazon ECS agent.
    */
  var telemetryEndpoint: js.UndefOr[String] = js.native
}

object DiscoverPollEndpointResponse {
  @scala.inline
  def apply(): DiscoverPollEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverPollEndpointResponse]
  }
  @scala.inline
  implicit class DiscoverPollEndpointResponseOps[Self <: DiscoverPollEndpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTelemetryEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetryEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelemetryEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetryEndpoint")(js.undefined)
        ret
    }
  }
  
}

