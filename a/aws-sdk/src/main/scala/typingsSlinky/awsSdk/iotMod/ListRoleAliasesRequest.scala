package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRoleAliasesRequest extends StObject {
  
  /**
    * Return the list of role aliases in ascending alphabetical order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  
  /**
    * A marker used to get the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  
  /**
    * The maximum number of results to return at one time.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
}
object ListRoleAliasesRequest {
  
  @scala.inline
  def apply(): ListRoleAliasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoleAliasesRequest]
  }
  
  @scala.inline
  implicit class ListRoleAliasesRequestMutableBuilder[Self <: ListRoleAliasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscendingOrder(value: AscendingOrder): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingOrderUndefined: Self = StObject.set(x, "ascendingOrder", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
