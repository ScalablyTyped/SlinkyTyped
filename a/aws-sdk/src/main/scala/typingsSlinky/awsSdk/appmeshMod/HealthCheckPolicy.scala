package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheckPolicy extends js.Object {
  /**
    * The number of consecutive successful health checks that must occur before declaring
    listener healthy.
    */
  var healthyThreshold: HealthCheckThreshold = js.native
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: HealthCheckIntervalMillis = js.native
  /**
    * The destination path for the health check request. This value is only used if the specified 
    protocol is HTTP or HTTP/2. For any other protocol, this value is ignored.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The destination port for the health check request. This port must match the port defined
    in the PortMapping for the listener.
    */
  var port: js.UndefOr[PortNumber] = js.native
  /**
    * The protocol for the health check request. If you specify grpc, then your service must conform to the GRPC Health Checking Protocol.
    */
  var protocol: PortProtocol = js.native
  /**
    * The amount of time to wait when receiving a response from the health check, in
    milliseconds.
    */
  var timeoutMillis: HealthCheckTimeoutMillis = js.native
  /**
    * The number of consecutive failed health checks that must occur before declaring a
    virtual node unhealthy. 
    */
  var unhealthyThreshold: HealthCheckThreshold = js.native
}

object HealthCheckPolicy {
  @scala.inline
  def apply(
    healthyThreshold: HealthCheckThreshold,
    intervalMillis: HealthCheckIntervalMillis,
    protocol: PortProtocol,
    timeoutMillis: HealthCheckTimeoutMillis,
    unhealthyThreshold: HealthCheckThreshold
  ): HealthCheckPolicy = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckPolicy]
  }
  @scala.inline
  implicit class HealthCheckPolicyOps[Self <: HealthCheckPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthyThreshold(value: HealthCheckThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntervalMillis(value: HealthCheckIntervalMillis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: PortProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutMillis(value: HealthCheckTimeoutMillis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhealthyThreshold(value: HealthCheckThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhealthyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: PortNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

