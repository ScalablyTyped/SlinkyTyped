package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOriginRequestPoliciesRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of origin request policies. The response includes origin request policies in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of origin request policies that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.native
  
  /**
    * A filter to return only the specified kinds of origin request policies. Valid values are:    managed – Returns only the managed policies created by AWS.    custom – Returns only the custom policies created in your AWS account.  
    */
  var Type: js.UndefOr[OriginRequestPolicyType] = js.native
}
object ListOriginRequestPoliciesRequest {
  
  @scala.inline
  def apply(): ListOriginRequestPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginRequestPoliciesRequest]
  }
  
  @scala.inline
  implicit class ListOriginRequestPoliciesRequestMutableBuilder[Self <: ListOriginRequestPoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setType(value: OriginRequestPolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
