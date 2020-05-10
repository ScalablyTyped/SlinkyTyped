package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointGroupRequest extends js.Object {
  /**
    * The list of endpoint objects.
    */
  var EndpointConfigurations: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.EndpointConfigurations] = js.native
  /**
    * The name of the AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific Region.
    */
  var EndpointGroupRegion: GenericString = js.native
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.HealthCheckIntervalSeconds] = js.native
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.native
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  var HealthCheckPort: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.HealthCheckPort] = js.native
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.HealthCheckProtocol] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.globalacceleratorMod.IdempotencyToken = js.native
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString = js.native
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  var ThresholdCount: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.ThresholdCount] = js.native
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
    */
  var TrafficDialPercentage: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.TrafficDialPercentage] = js.native
}

object CreateEndpointGroupRequest {
  @scala.inline
  def apply(EndpointGroupRegion: GenericString, IdempotencyToken: IdempotencyToken, ListenerArn: GenericString): CreateEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupRegion = EndpointGroupRegion.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointGroupRequest]
  }
  @scala.inline
  implicit class CreateEndpointGroupRequestOps[Self <: CreateEndpointGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointGroupRegion(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointGroupRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdempotencyToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenerArn(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointConfigurations(value: EndpointConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointConfigurations")(js.undefined)
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

