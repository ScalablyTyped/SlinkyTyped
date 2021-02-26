package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrafficPolicyInstancesResponse extends StObject {
  
  /**
    * If IsTruncated is true, HostedZoneIdMarker is the ID of the hosted zone of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.native
  
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get more traffic policy instances by calling ListTrafficPolicyInstances again and specifying the values of the HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * The value that you specified for the MaxItems parameter in the call to ListTrafficPolicyInstances that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance that Amazon Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
  
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request.
    */
  var TrafficPolicyInstances: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstances = js.native
}
object ListTrafficPolicyInstancesResponse {
  
  @scala.inline
  def apply(IsTruncated: PageTruncated, MaxItems: PageMaxItems, TrafficPolicyInstances: TrafficPolicyInstances): ListTrafficPolicyInstancesResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyInstances = TrafficPolicyInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesResponse]
  }
  
  @scala.inline
  implicit class ListTrafficPolicyInstancesResponseMutableBuilder[Self <: ListTrafficPolicyInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZoneIdMarker(value: ResourceId): Self = StObject.set(x, "HostedZoneIdMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdMarkerUndefined: Self = StObject.set(x, "HostedZoneIdMarker", js.undefined)
    
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
