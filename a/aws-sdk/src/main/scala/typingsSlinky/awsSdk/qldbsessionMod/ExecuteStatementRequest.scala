package typingsSlinky.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteStatementRequest extends StObject {
  
  /**
    * Specifies the parameters for the parameterized statement in the request.
    */
  var Parameters: js.UndefOr[StatementParameters] = js.native
  
  /**
    * Specifies the statement of the request.
    */
  var Statement: typingsSlinky.awsSdk.qldbsessionMod.Statement = js.native
  
  /**
    * Specifies the transaction ID of the request.
    */
  var TransactionId: typingsSlinky.awsSdk.qldbsessionMod.TransactionId = js.native
}
object ExecuteStatementRequest {
  
  @scala.inline
  def apply(Statement: Statement, TransactionId: TransactionId): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
  
  @scala.inline
  implicit class ExecuteStatementRequestMutableBuilder[Self <: ExecuteStatementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: StatementParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ValueHolder*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setStatement(value: Statement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
