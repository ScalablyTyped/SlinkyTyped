package typingsSlinky.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQueryExecutionInput extends StObject {
  
  /**
    * The unique ID of the query execution.
    */
  var QueryExecutionId: typingsSlinky.awsSdk.athenaMod.QueryExecutionId = js.native
}
object GetQueryExecutionInput {
  
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId): GetQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryExecutionInput]
  }
  
  @scala.inline
  implicit class GetQueryExecutionInputMutableBuilder[Self <: GetQueryExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
  }
}
