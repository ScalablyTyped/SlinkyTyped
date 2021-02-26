package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatastoresResponse extends StObject {
  
  /**
    * A list of DatastoreSummary objects.
    */
  var datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.native
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDatastoresResponse {
  
  @scala.inline
  def apply(): ListDatastoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatastoresResponse]
  }
  
  @scala.inline
  implicit class ListDatastoresResponseMutableBuilder[Self <: ListDatastoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatastoreSummaries(value: DatastoreSummaries): Self = StObject.set(x, "datastoreSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreSummariesUndefined: Self = StObject.set(x, "datastoreSummaries", js.undefined)
    
    @scala.inline
    def setDatastoreSummariesVarargs(value: DatastoreSummary*): Self = StObject.set(x, "datastoreSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
