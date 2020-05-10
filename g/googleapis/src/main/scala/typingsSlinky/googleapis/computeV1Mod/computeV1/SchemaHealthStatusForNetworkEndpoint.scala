package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHealthStatusForNetworkEndpoint extends js.Object {
  /**
    * URL of the backend service associated with the health state of the
    * network endpoint.
    */
  var backendService: js.UndefOr[SchemaBackendServiceReference] = js.native
  /**
    * URL of the forwarding rule associated with the health state of the
    * network endpoint.
    */
  var forwardingRule: js.UndefOr[SchemaForwardingRuleReference] = js.native
  /**
    * URL of the health check associated with the health state of the network
    * endpoint.
    */
  var healthCheck: js.UndefOr[SchemaHealthCheckReference] = js.native
  /**
    * Health state of the network endpoint determined based on the health
    * checks configured.
    */
  var healthState: js.UndefOr[String] = js.native
}

object SchemaHealthStatusForNetworkEndpoint {
  @scala.inline
  def apply(): SchemaHealthStatusForNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthStatusForNetworkEndpoint]
  }
  @scala.inline
  implicit class SchemaHealthStatusForNetworkEndpointOps[Self <: SchemaHealthStatusForNetworkEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendService(value: SchemaBackendServiceReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendService")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardingRule(value: SchemaForwardingRuleReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingRule")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheck(value: SchemaHealthCheckReference): Self = {
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
    @scala.inline
    def withHealthState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthState")(js.undefined)
        ret
    }
  }
  
}

