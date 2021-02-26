package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrafficPolicyInstancesByHostedZoneResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get the next group of traffic policy instances by submitting another ListTrafficPolicyInstancesByHostedZone request and specifying the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * The value that you specified for the MaxItems parameter in the ListTrafficPolicyInstancesByHostedZone request that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance in the next group of traffic policy instances.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance in the next group of traffic policy instances.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
  
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request. 
    */
  var TrafficPolicyInstances: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstances = js.native
}
object ListTrafficPolicyInstancesByHostedZoneResponse {
  
  @scala.inline
  def apply(IsTruncated: PageTruncated, MaxItems: PageMaxItems, TrafficPolicyInstances: TrafficPolicyInstances): ListTrafficPolicyInstancesByHostedZoneResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyInstances = TrafficPolicyInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByHostedZoneResponse]
  }
  
  @scala.inline
  implicit class ListTrafficPolicyInstancesByHostedZoneResponseMutableBuilder[Self <: ListTrafficPolicyInstancesByHostedZoneResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstanceNameMarker(value: DNSName): Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstanceNameMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", js.undefined)
    
    @scala.inline
    def setTrafficPolicyInstanceTypeMarker(value: RRType): Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstanceTypeMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", js.undefined)
    
    @scala.inline
    def setTrafficPolicyInstances(value: TrafficPolicyInstances): Self = StObject.set(x, "TrafficPolicyInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstancesVarargs(value: TrafficPolicyInstance*): Self = StObject.set(x, "TrafficPolicyInstances", js.Array(value :_*))
  }
}
