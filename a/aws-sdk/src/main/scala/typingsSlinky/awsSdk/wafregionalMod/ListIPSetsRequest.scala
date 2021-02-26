package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIPSetsRequest extends StObject {
  
  /**
    * Specifies the number of IPSet objects that you want AWS WAF to return for this request. If you have more IPSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of IPSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  
  /**
    * AWS WAF returns a NextMarker value in the response that allows you to list another group of IPSets. For the second and subsequent ListIPSets requests, specify the value of NextMarker from the previous response to get information about another batch of IPSets.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
}
object ListIPSetsRequest {
  
  @scala.inline
  def apply(): ListIPSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIPSetsRequest]
  }
  
  @scala.inline
  implicit class ListIPSetsRequestMutableBuilder[Self <: ListIPSetsRequest] (val x: Self) extends AnyVal {
    
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
