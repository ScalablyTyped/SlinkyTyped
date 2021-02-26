package typingsSlinky.maximMazurokGapiClientCompute.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPProtocol extends StObject {
  
  /**
    * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol
    * strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
    */
  var IPProtocol: js.UndefOr[String] = js.native
  
  /**
    * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not
    * specified, this rule applies to connections through any port.
    *
    * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
}
object IPProtocol {
  
  @scala.inline
  def apply(): IPProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPProtocol]
  }
  
  @scala.inline
  implicit class IPProtocolMutableBuilder[Self <: IPProtocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPProtocol(value: String): Self = StObject.set(x, "IPProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPProtocolUndefined: Self = StObject.set(x, "IPProtocol", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
