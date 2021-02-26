package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network extends StObject {
  
  /**
    * The destination domain of network-related information about a finding.
    */
  var DestinationDomain: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var DestinationIpV4: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var DestinationIpV6: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The destination port of network-related information about a finding.
    */
  var DestinationPort: js.UndefOr[Integer] = js.native
  
  /**
    * The direction of network traffic associated with a finding.
    */
  var Direction: js.UndefOr[NetworkDirection] = js.native
  
  /**
    * The range of open ports that is present on the network.
    */
  var OpenPortRange: js.UndefOr[PortRange] = js.native
  
  /**
    * The protocol of network-related information about a finding.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source domain of network-related information about a finding.
    */
  var SourceDomain: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var SourceIpV4: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var SourceIpV6: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var SourceMac: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source port of network-related information about a finding.
    */
  var SourcePort: js.UndefOr[Integer] = js.native
}
object Network {
  
  @scala.inline
  def apply(): Network = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Network]
  }
  
  @scala.inline
  implicit class NetworkMutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationDomain(value: NonEmptyString): Self = StObject.set(x, "DestinationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDomainUndefined: Self = StObject.set(x, "DestinationDomain", js.undefined)
    
    @scala.inline
    def setDestinationIpV4(value: NonEmptyString): Self = StObject.set(x, "DestinationIpV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIpV4Undefined: Self = StObject.set(x, "DestinationIpV4", js.undefined)
    
    @scala.inline
    def setDestinationIpV6(value: NonEmptyString): Self = StObject.set(x, "DestinationIpV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIpV6Undefined: Self = StObject.set(x, "DestinationIpV6", js.undefined)
    
    @scala.inline
    def setDestinationPort(value: Integer): Self = StObject.set(x, "DestinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortUndefined: Self = StObject.set(x, "DestinationPort", js.undefined)
    
    @scala.inline
    def setDirection(value: NetworkDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "Direction", js.undefined)
    
    @scala.inline
    def setOpenPortRange(value: PortRange): Self = StObject.set(x, "OpenPortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenPortRangeUndefined: Self = StObject.set(x, "OpenPortRange", js.undefined)
    
    @scala.inline
    def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setSourceDomain(value: NonEmptyString): Self = StObject.set(x, "SourceDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDomainUndefined: Self = StObject.set(x, "SourceDomain", js.undefined)
    
    @scala.inline
    def setSourceIpV4(value: NonEmptyString): Self = StObject.set(x, "SourceIpV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpV4Undefined: Self = StObject.set(x, "SourceIpV4", js.undefined)
    
    @scala.inline
    def setSourceIpV6(value: NonEmptyString): Self = StObject.set(x, "SourceIpV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpV6Undefined: Self = StObject.set(x, "SourceIpV6", js.undefined)
    
    @scala.inline
    def setSourceMac(value: NonEmptyString): Self = StObject.set(x, "SourceMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMacUndefined: Self = StObject.set(x, "SourceMac", js.undefined)
    
    @scala.inline
    def setSourcePort(value: Integer): Self = StObject.set(x, "SourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortUndefined: Self = StObject.set(x, "SourcePort", js.undefined)
  }
}
