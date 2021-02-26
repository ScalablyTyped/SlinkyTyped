package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryExecuteCompleteNotificationResult extends StObject {
  
  var batchSummaries: js.Array[BatchSummary] = js.native
  
  var ownerUri: String = js.native
}
object QueryExecuteCompleteNotificationResult {
  
  @scala.inline
  def apply(batchSummaries: js.Array[BatchSummary], ownerUri: String): QueryExecuteCompleteNotificationResult = {
    val __obj = js.Dynamic.literal(batchSummaries = batchSummaries.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteCompleteNotificationResult]
  }
  
  @scala.inline
  implicit class QueryExecuteCompleteNotificationResultMutableBuilder[Self <: QueryExecuteCompleteNotificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSummaries(value: js.Array[BatchSummary]): Self = StObject.set(x, "batchSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSummariesVarargs(value: BatchSummary*): Self = StObject.set(x, "batchSummaries", js.Array(value :_*))
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
