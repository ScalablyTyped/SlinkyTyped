package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebACLsRequest extends StObject {
  
  /**
    * Specifies the number of WebACL objects that you want AWS WAF to return for this request. If you have more WebACL objects than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of WebACL objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  
  /**
    * If you specify a value for Limit and you have more WebACL objects than the number that you specify for Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of WebACL objects. For the second and subsequent ListWebACLs requests, specify the value of NextMarker from the previous response to get information about another batch of WebACL objects.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
}
object ListWebACLsRequest {
  
  @scala.inline
  def apply(): ListWebACLsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebACLsRequest]
  }
  
  @scala.inline
  implicit class ListWebACLsRequestMutableBuilder[Self <: ListWebACLsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PaginationLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
