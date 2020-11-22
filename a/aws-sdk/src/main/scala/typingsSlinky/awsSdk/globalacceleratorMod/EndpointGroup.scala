package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The AWS Region where the endpoint group is located.
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
    * Allows you to override the destination ports used to route traffic to an endpoint. Using a port override lets you to map a list of external destination ports (that your users send traffic to) to a list of internal destination ports that you want an application endpoint to receive traffic on. 
    */
  var PortOverrides: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.PortOverrides] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointDescriptionsVarargs(value: EndpointDescription*): Self = this.set("EndpointDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setEndpointDescriptions(value: EndpointDescriptions): Self = this.set("EndpointDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointDescriptions: Self = this.set("EndpointDescriptions", js.undefined)
    
    @scala.inline
    def setEndpointGroupArn(value: GenericString): Self = this.set("EndpointGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointGroupArn: Self = this.set("EndpointGroupArn", js.undefined)
    
    @scala.inline
    def setEndpointGroupRegion(value: GenericString): Self = this.set("EndpointGroupRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointGroupRegion: Self = this.set("EndpointGroupRegion", js.undefined)
    
    @scala.inline
    def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = this.set("HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckIntervalSeconds: Self = this.set("HealthCheckIntervalSeconds", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: GenericString): Self = this.set("HealthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPath: Self = this.set("HealthCheckPath", js.undefined)
    
    @scala.inline
    def setHealthCheckPort(value: HealthCheckPort): Self = this.set("HealthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPort: Self = this.set("HealthCheckPort", js.undefined)
    
    @scala.inline
    def setHealthCheckProtocol(value: HealthCheckProtocol): Self = this.set("HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckProtocol: Self = this.set("HealthCheckProtocol", js.undefined)
    
    @scala.inline
    def setPortOverridesVarargs(value: PortOverride*): Self = this.set("PortOverrides", js.Array(value :_*))
    
    @scala.inline
    def setPortOverrides(value: PortOverrides): Self = this.set("PortOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortOverrides: Self = this.set("PortOverrides", js.undefined)
    
    @scala.inline
    def setThresholdCount(value: ThresholdCount): Self = this.set("ThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdCount: Self = this.set("ThresholdCount", js.undefined)
    
    @scala.inline
    def setTrafficDialPercentage(value: TrafficDialPercentage): Self = this.set("TrafficDialPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficDialPercentage: Self = this.set("TrafficDialPercentage", js.undefined)
  }
}
