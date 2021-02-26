package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterface extends StObject {
  
  /**
    * The Internet Protocol version 4 (IPv4) address of the interface.
    */
  var Ipv4Address: js.UndefOr[String] = js.native
  
  /**
    * The Internet Protocol version 6 (IPv6) address of the interface. Currently not supported.
    */
  var Ipv6Address: js.UndefOr[String] = js.native
  
  /**
    * The Media Access Control (MAC) address of the interface.  This is currently unsupported and will not be returned in output. 
    */
  var MacAddress: js.UndefOr[String] = js.native
}
object NetworkInterface {
  
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  @scala.inline
  implicit class NetworkInterfaceMutableBuilder[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpv4Address(value: String): Self = StObject.set(x, "Ipv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressUndefined: Self = StObject.set(x, "Ipv4Address", js.undefined)
    
    @scala.inline
    def setIpv6Address(value: String): Self = StObject.set(x, "Ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressUndefined: Self = StObject.set(x, "Ipv6Address", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
  }
}
