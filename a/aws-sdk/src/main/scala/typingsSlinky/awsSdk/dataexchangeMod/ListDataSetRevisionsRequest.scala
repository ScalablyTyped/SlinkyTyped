package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDataSetRevisionsRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  
  /**
    * The maximum number of results returned by a single call.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.MaxResults] = js.native
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListDataSetRevisionsRequest {
  
  @scala.inline
  def apply(DataSetId: string): ListDataSetRevisionsRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSetRevisionsRequest]
  }
  
  @scala.inline
  implicit class ListDataSetRevisionsRequestMutableBuilder[Self <: ListDataSetRevisionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
