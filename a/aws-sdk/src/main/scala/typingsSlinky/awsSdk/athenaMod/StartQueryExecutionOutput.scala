package typingsSlinky.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartQueryExecutionOutput extends StObject {
  
  /**
    * The unique ID of the query that ran as a result of this request.
    */
  var QueryExecutionId: js.UndefOr[typingsSlinky.awsSdk.athenaMod.QueryExecutionId] = js.native
}
object StartQueryExecutionOutput {
  
  @scala.inline
  def apply(): StartQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryExecutionOutput]
  }
  
  @scala.inline
  implicit class StartQueryExecutionOutputMutableBuilder[Self <: StartQueryExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryExecutionIdUndefined: Self = StObject.set(x, "QueryExecutionId", js.undefined)
  }
}
