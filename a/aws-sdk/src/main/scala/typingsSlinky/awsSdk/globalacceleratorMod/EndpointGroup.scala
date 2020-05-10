package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointGroup extends js.Object {
  /**
    * The list of endpoint objects.
    */
  var EndpointDescriptions: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.EndpointDescriptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region that this endpoint group belongs.
    */
  var EndpointGroupRegion: js.UndefOr[GenericString] = js.native
  /**
    * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.HealthCheckIntervalSeconds] = js.native
  /**
    * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the destination on the endpoints for health checks. The default is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.native
  /**
    * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.  The default port is the port for the listener that this endpoint group is associated with. If the listener port is a list, Global Accelerator uses the first specified port in the list of ports.
    */
  var HealthCheckPort: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.HealthCheckPort] = js.native
  /**
    * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.HealthCheckProtocol] = js.native
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  var ThresholdCount: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.ThresholdCount] = js.native
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
    */
  var TrafficDialPercentage: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.TrafficDialPercentage] = js.native
}

object EndpointGroup {
  @scala.inline
  def apply(): EndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointGroup]
  }
  @scala.inline
  implicit class EndpointGroupOps[Self <: EndpointGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointDescriptions(value: EndpointDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointGroupArn(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointGroupRegion(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointGroupRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointGroupRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointGroupRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckIntervalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckIntervalSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckIntervalSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckPath(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckPort(value: HealthCheckPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPort")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckProtocol(value: HealthCheckProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdCount(value: ThresholdCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficDialPercentage(value: TrafficDialPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficDialPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficDialPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficDialPercentage")(js.undefined)
        ret
    }
  }
  
}

