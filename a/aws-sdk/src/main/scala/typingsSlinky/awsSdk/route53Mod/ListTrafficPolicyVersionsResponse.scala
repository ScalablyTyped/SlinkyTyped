package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrafficPolicyVersionsResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you can get the next group of traffic policies by submitting another ListTrafficPolicyVersions request and specifying the value of NextMarker in the marker parameter.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * The value that you specified for the maxitems parameter in the ListTrafficPolicyVersions request that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * A list that contains one TrafficPolicy element for each traffic policy version that is associated with the specified traffic policy.
    */
  var TrafficPolicies: typingsSlinky.awsSdk.route53Mod.TrafficPolicies = js.native
  
  /**
    * If IsTruncated is true, the value of TrafficPolicyVersionMarker identifies the first traffic policy that Amazon Route 53 will return if you submit another request. Call ListTrafficPolicyVersions again and specify the value of TrafficPolicyVersionMarker in the TrafficPolicyVersionMarker request parameter. This element is present only if IsTruncated is true.
    */
  var TrafficPolicyVersionMarker: typingsSlinky.awsSdk.route53Mod.TrafficPolicyVersionMarker = js.native
}
object ListTrafficPolicyVersionsResponse {
  
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicies: TrafficPolicies,
    TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
  ): ListTrafficPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicies = TrafficPolicies.asInstanceOf[js.Any], TrafficPolicyVersionMarker = TrafficPolicyVersionMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyVersionsResponse]
  }
  
  @scala.inline
  implicit class ListTrafficPolicyVersionsResponseMutableBuilder[Self <: ListTrafficPolicyVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicies(value: TrafficPolicies): Self = StObject.set(x, "TrafficPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPoliciesVarargs(value: TrafficPolicy*): Self = StObject.set(x, "TrafficPolicies", js.Array(value :_*))
    
    @scala.inline
    def setTrafficPolicyVersionMarker(value: TrafficPolicyVersionMarker): Self = StObject.set(x, "TrafficPolicyVersionMarker", value.asInstanceOf[js.Any])
  }
}
