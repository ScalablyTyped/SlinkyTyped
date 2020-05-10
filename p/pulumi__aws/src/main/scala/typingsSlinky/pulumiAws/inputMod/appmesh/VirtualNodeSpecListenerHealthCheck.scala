package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecListenerHealthCheck extends js.Object {
  /**
    * The number of consecutive successful health checks that must occur before declaring listener healthy.
    * * `intervalMillis`- (Required) The time period in milliseconds between each health check execution.
    */
  var healthyThreshold: Input[Double] = js.native
  var intervalMillis: Input[Double] = js.native
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http`.
    */
  var path: js.UndefOr[Input[String]] = js.native
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: js.UndefOr[Input[Double]] = js.native
  /**
    * The protocol for the health check request. Valid values are `http` and `tcp`.
    */
  var protocol: Input[String] = js.native
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: Input[Double] = js.native
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
    */
  var unhealthyThreshold: Input[Double] = js.native
}

object VirtualNodeSpecListenerHealthCheck {
  @scala.inline
  def apply(
    healthyThreshold: Input[Double],
    intervalMillis: Input[Double],
    protocol: Input[String],
    timeoutMillis: Input[Double],
    unhealthyThreshold: Input[Double]
  ): VirtualNodeSpecListenerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerHealthCheck]
  }
  @scala.inline
  implicit class VirtualNodeSpecListenerHealthCheckOps[Self <: VirtualNodeSpecListenerHealthCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthyThreshold(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntervalMillis(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutMillis(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhealthyThreshold(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhealthyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: Input[String]): Self = {
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
    def withPort(value: Input[Double]): Self = {
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

