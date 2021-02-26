package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrafficPolicyInstancesRequest extends StObject {
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of HostedZoneId, specify the value of HostedZoneIdMarker from the previous response, which is the hosted zone ID of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.native
  
  /**
    * The maximum number of traffic policy instances that you want Amazon Route 53 to return in response to a ListTrafficPolicyInstances request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance in the next group of MaxItems traffic policy instances.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the type of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
}
object ListTrafficPolicyInstancesRequest {
  
  @scala.inline
  def apply(): ListTrafficPolicyInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrafficPolicyInstancesRequest]
  }
  
  @scala.inline
  implicit class ListTrafficPolicyInstancesRequestMutableBuilder[Self <: ListTrafficPolicyInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZoneIdMarker(value: ResourceId): Self = StObject.set(x, "HostedZoneIdMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdMarkerUndefined: Self = StObject.set(x, "HostedZoneIdMarker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setTrafficPolicyInstanceNameMarker(value: DNSName): Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstanceNameMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", js.undefined)
    
    @scala.inline
    def setTrafficPolicyInstanceTypeMarker(value: RRType): Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyInstanceTypeMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", js.undefined)
  }
}
