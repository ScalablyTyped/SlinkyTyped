package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateListenerRequest extends StObject {
  
  /**
    * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications, regardless of the port and protocol of the client request. Client affinity gives you control over whether to always route each client to the same specific endpoint. AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection. If client affinity is NONE, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address, destination port, and protocol—to select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.  If you want a given client to always be routed to the same endpoint, set client affinity to SOURCE_IP instead. When you use the SOURCE_IP setting, Global Accelerator uses the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value. The default value is NONE.
    */
  var ClientAffinity: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.ClientAffinity] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the listener to update.
    */
  var ListenerArn: GenericString = js.native
  
  /**
    * The updated list of port ranges for the connections from clients to the accelerator.
    */
  var PortRanges: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.PortRanges] = js.native
  
  /**
    * The updated protocol for the connections from clients to the accelerator.
    */
  var Protocol: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.Protocol] = js.native
}
object UpdateListenerRequest {
  
  @scala.inline
  def apply(ListenerArn: GenericString): UpdateListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateListenerRequest]
  }
  
  @scala.inline
  implicit class UpdateListenerRequestMutableBuilder[Self <: UpdateListenerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAffinity(value: ClientAffinity): Self = StObject.set(x, "ClientAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAffinityUndefined: Self = StObject.set(x, "ClientAffinity", js.undefined)
    
    @scala.inline
    def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortRanges(value: PortRanges): Self = StObject.set(x, "PortRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortRangesUndefined: Self = StObject.set(x, "PortRanges", js.undefined)
    
    @scala.inline
    def setPortRangesVarargs(value: PortRange*): Self = StObject.set(x, "PortRanges", js.Array(value :_*))
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
