package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListXssMatchSetsResponse extends StObject {
  
  /**
    * If you have more XssMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more XssMatchSet objects, submit another ListXssMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
  
  /**
    * An array of XssMatchSetSummary objects.
    */
  var XssMatchSets: js.UndefOr[XssMatchSetSummaries] = js.native
}
object ListXssMatchSetsResponse {
  
  @scala.inline
  def apply(): ListXssMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListXssMatchSetsResponse]
  }
  
  @scala.inline
  implicit class ListXssMatchSetsResponseMutableBuilder[Self <: ListXssMatchSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setXssMatchSets(value: XssMatchSetSummaries): Self = StObject.set(x, "XssMatchSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchSetsUndefined: Self = StObject.set(x, "XssMatchSets", js.undefined)
    
    @scala.inline
    def setXssMatchSetsVarargs(value: XssMatchSetSummary*): Self = StObject.set(x, "XssMatchSets", js.Array(value :_*))
  }
}
