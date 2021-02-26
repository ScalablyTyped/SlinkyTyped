package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UptimeCheckIp extends StObject {
  
  /**
    * The IP address from which the Uptime check originates. This is a fully specified IP address (not an IP address range). Most IP addresses, as of this publication, are in IPv4 format;
    * however, one should not rely on the IP addresses being in IPv4 format indefinitely, and should support interpreting this field in either IPv4 or IPv6 format.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * A more specific location within the region that typically encodes a particular city/town/metro (and its containing state/province or country) within the broader umbrella region
    * category.
    */
  var location: js.UndefOr[String] = js.native
  
  /** A broad region category in which the IP address is located. */
  var region: js.UndefOr[String] = js.native
}
object UptimeCheckIp {
  
  @scala.inline
  def apply(): UptimeCheckIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UptimeCheckIp]
  }
  
  @scala.inline
  implicit class UptimeCheckIpMutableBuilder[Self <: UptimeCheckIp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
