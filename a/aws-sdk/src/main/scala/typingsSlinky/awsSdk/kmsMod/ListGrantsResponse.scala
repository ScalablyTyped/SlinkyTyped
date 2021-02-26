package typingsSlinky.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGrantsResponse extends StObject {
  
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[GrantList] = js.native
  
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.native
  
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.native
}
object ListGrantsResponse {
  
  @scala.inline
  def apply(): ListGrantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGrantsResponse]
  }
  
  @scala.inline
  implicit class ListGrantsResponseMutableBuilder[Self <: ListGrantsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrants(value: GrantList): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
    
    @scala.inline
    def setGrantsVarargs(value: GrantListEntry*): Self = StObject.set(x, "Grants", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: MarkerType): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setTruncated(value: BooleanType): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
