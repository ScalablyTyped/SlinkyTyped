package typingsSlinky.pulumiAws.endpointGroupMod

import typingsSlinky.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointGroupArgs extends js.Object {
  /**
    * The list of endpoint objects. Fields documented below.
    */
  val endpointConfigurations: js.UndefOr[Input[js.Array[Input[EndpointGroupEndpointConfiguration]]]] = js.native
  /**
    * The name of the AWS Region where the endpoint group is located.
    */
  val endpointGroupRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  val healthCheckIntervalSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  val healthCheckPath: js.UndefOr[Input[String]] = js.native
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  val healthCheckPort: js.UndefOr[Input[Double]] = js.native
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  val healthCheckProtocol: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  val listenerArn: Input[String] = js.native
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  val thresholdCount: js.UndefOr[Input[Double]] = js.native
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
    */
  val trafficDialPercentage: js.UndefOr[Input[Double]] = js.native
}

object EndpointGroupArgs {
  @scala.inline
  def apply(listenerArn: Input[String]): EndpointGroupArgs = {
    val __obj = js.Dynamic.literal(listenerArn = listenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointGroupArgs]
  }
  @scala.inline
  implicit class EndpointGroupArgsOps[Self <: EndpointGroupArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListenerArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointConfigurations(value: Input[js.Array[Input[EndpointGroupEndpointConfiguration]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointGroupRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointGroupRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointGroupRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointGroupRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckIntervalSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckIntervalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckIntervalSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckIntervalSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckPort")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficDialPercentage(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficDialPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficDialPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficDialPercentage")(js.undefined)
        ret
    }
  }
  
}

