package typingsSlinky.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecondaryIpRangeSpec extends StObject {
  
  /**
    * Required. The prefix length of the secondary IP range. Use CIDR range notation, such as `30` to provision a secondary IP range with an `x.x.x.x/30` CIDR range. The IP address range
    * is drawn from a pool of available ranges in the service consumer's allocated range.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  
  /** Required. A name for the secondary IP range. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork. */
  var rangeName: js.UndefOr[String] = js.native
  
  /**
    * Optional. The starting address of a range. The address must be a valid IPv4 address in the x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the
    * secondary IP range. The range must be within the allocated range that is assigned to the private connection. If the CIDR range isn't available, the call fails.
    */
  var requestedAddress: js.UndefOr[String] = js.native
}
object SecondaryIpRangeSpec {
  
  @scala.inline
  def apply(): SecondaryIpRangeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecondaryIpRangeSpec]
  }
  
  @scala.inline
  implicit class SecondaryIpRangeSpecMutableBuilder[Self <: SecondaryIpRangeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpPrefixLength(value: Double): Self = StObject.set(x, "ipPrefixLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPrefixLengthUndefined: Self = StObject.set(x, "ipPrefixLength", js.undefined)
    
    @scala.inline
    def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
    
    @scala.inline
    def setRequestedAddress(value: String): Self = StObject.set(x, "requestedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedAddressUndefined: Self = StObject.set(x, "requestedAddress", js.undefined)
  }
}
