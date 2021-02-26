package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHostedZonesRequest extends StObject {
  
  /**
    * If you're using reusable delegation sets and you want to list all of the hosted zones that are associated with a reusable delegation set, specify the ID of that reusable delegation set. 
    */
  var DelegationSetId: js.UndefOr[ResourceId] = js.native
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more hosted zones. To get more hosted zones, submit another ListHostedZones request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more hosted zones to get.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  
  /**
    * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more than maxitems hosted zones, the value of IsTruncated in the response is true, and the value of NextMarker is the hosted zone ID of the first hosted zone that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
}
object ListHostedZonesRequest {
  
  @scala.inline
  def apply(): ListHostedZonesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHostedZonesRequest]
  }
  
  @scala.inline
  implicit class ListHostedZonesRequestMutableBuilder[Self <: ListHostedZonesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegationSetId(value: ResourceId): Self = StObject.set(x, "DelegationSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegationSetIdUndefined: Self = StObject.set(x, "DelegationSetId", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
