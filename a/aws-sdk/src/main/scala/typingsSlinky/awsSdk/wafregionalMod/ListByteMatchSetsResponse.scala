package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListByteMatchSetsResponse extends StObject {
  
  /**
    * An array of ByteMatchSetSummary objects.
    */
  var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries] = js.native
  
  /**
    * If you have more ByteMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ByteMatchSet objects, submit another ListByteMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
}
object ListByteMatchSetsResponse {
  
  @scala.inline
  def apply(): ListByteMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByteMatchSetsResponse]
  }
  
  @scala.inline
  implicit class ListByteMatchSetsResponseMutableBuilder[Self <: ListByteMatchSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchSets(value: ByteMatchSetSummaries): Self = StObject.set(x, "ByteMatchSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchSetsUndefined: Self = StObject.set(x, "ByteMatchSets", js.undefined)
    
    @scala.inline
    def setByteMatchSetsVarargs(value: ByteMatchSetSummary*): Self = StObject.set(x, "ByteMatchSets", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
