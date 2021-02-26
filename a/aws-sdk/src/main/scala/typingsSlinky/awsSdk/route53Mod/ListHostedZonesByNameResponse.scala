package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHostedZonesByNameResponse extends StObject {
  
  /**
    * For the second and subsequent calls to ListHostedZonesByName, DNSName is the value that you specified for the dnsname parameter in the request that produced the current response.
    */
  var DNSName: js.UndefOr[typingsSlinky.awsSdk.route53Mod.DNSName] = js.native
  
  /**
    * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
  
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZones: typingsSlinky.awsSdk.route53Mod.HostedZones = js.native
  
  /**
    * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can get the next group of maxitems hosted zones by calling ListHostedZonesByName again and specifying the values of NextDNSName and NextHostedZoneId elements in the dnsname and hostedzoneid parameters.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * The value that you specified for the maxitems parameter in the call to ListHostedZonesByName that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * If IsTruncated is true, the value of NextDNSName is the name of the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextDNSName: js.UndefOr[DNSName] = js.native
  
  /**
    * If IsTruncated is true, the value of NextHostedZoneId identifies the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextHostedZoneId: js.UndefOr[ResourceId] = js.native
}
object ListHostedZonesByNameResponse {
  
  @scala.inline
  def apply(HostedZones: HostedZones, IsTruncated: PageTruncated, MaxItems: PageMaxItems): ListHostedZonesByNameResponse = {
    val __obj = js.Dynamic.literal(HostedZones = HostedZones.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByNameResponse]
  }
  
  @scala.inline
  implicit class ListHostedZonesByNameResponseMutableBuilder[Self <: ListHostedZonesByNameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    @scala.inline
    def setHostedZones(value: HostedZones): Self = StObject.set(x, "HostedZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZonesVarargs(value: HostedZone*): Self = StObject.set(x, "HostedZones", js.Array(value :_*))
    
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextDNSName(value: DNSName): Self = StObject.set(x, "NextDNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextDNSNameUndefined: Self = StObject.set(x, "NextDNSName", js.undefined)
    
    @scala.inline
    def setNextHostedZoneId(value: ResourceId): Self = StObject.set(x, "NextHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHostedZoneIdUndefined: Self = StObject.set(x, "NextHostedZoneId", js.undefined)
  }
}
