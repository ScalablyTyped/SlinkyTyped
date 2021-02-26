package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointPort is a tuple that describes a single port.
  */
@js.native
trait EndpointPort extends StObject {
  
  /**
    * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol. This is a beta field that is guarded by the ServiceAppProtocol feature gate and enabled by default.
    */
  var appProtocol: String = js.native
  
  /**
    * The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
    */
  var name: String = js.native
  
  /**
    * The port number of the endpoint.
    */
  var port: Double = js.native
  
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  var protocol: String = js.native
}
object EndpointPort {
  
  @scala.inline
  def apply(appProtocol: String, name: String, port: Double, protocol: String): EndpointPort = {
    val __obj = js.Dynamic.literal(appProtocol = appProtocol.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPort]
  }
  
  @scala.inline
  implicit class EndpointPortMutableBuilder[Self <: EndpointPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppProtocol(value: String): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
