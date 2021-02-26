package typingsSlinky.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointInfo extends StObject {
  
  /** Destination IP address. */
  var destinationIp: js.UndefOr[String] = js.native
  
  /** URI of the network where this packet is sent to. */
  var destinationNetworkUri: js.UndefOr[String] = js.native
  
  /** Destination port. Only valid when protocol is TCP or UDP. */
  var destinationPort: js.UndefOr[Double] = js.native
  
  /** IP protocol in string format, for example: "TCP", "UDP", "ICMP". */
  var protocol: js.UndefOr[String] = js.native
  
  /** Source IP address. */
  var sourceIp: js.UndefOr[String] = js.native
  
  /** URI of the network where this packet originates from. */
  var sourceNetworkUri: js.UndefOr[String] = js.native
  
  /** Source port. Only valid when protocol is TCP or UDP. */
  var sourcePort: js.UndefOr[Double] = js.native
}
object EndpointInfo {
  
  @scala.inline
  def apply(): EndpointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointInfo]
  }
  
  @scala.inline
  implicit class EndpointInfoMutableBuilder[Self <: EndpointInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationIp(value: String): Self = StObject.set(x, "destinationIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIpUndefined: Self = StObject.set(x, "destinationIp", js.undefined)
    
    @scala.inline
    def setDestinationNetworkUri(value: String): Self = StObject.set(x, "destinationNetworkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNetworkUriUndefined: Self = StObject.set(x, "destinationNetworkUri", js.undefined)
    
    @scala.inline
    def setDestinationPort(value: Double): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
    
    @scala.inline
    def setSourceNetworkUri(value: String): Self = StObject.set(x, "sourceNetworkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNetworkUriUndefined: Self = StObject.set(x, "sourceNetworkUri", js.undefined)
    
    @scala.inline
    def setSourcePort(value: Double): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
  }
}
