package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Score
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchLabelsResponseData extends StObject {
  
  var incomplete_results: Boolean = js.native
  
  var items: js.Array[Score] = js.native
  
  var total_count: Double = js.native
}
object SearchLabelsResponseData {
  
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Score], total_count: Double): SearchLabelsResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLabelsResponseData]
  }
  
  @scala.inline
  implicit class SearchLabelsResponseDataMutableBuilder[Self <: SearchLabelsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Score]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Score*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
