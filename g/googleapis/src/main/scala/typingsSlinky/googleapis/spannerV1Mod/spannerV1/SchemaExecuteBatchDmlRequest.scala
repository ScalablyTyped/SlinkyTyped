package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for ExecuteBatchDml
  */
@js.native
trait SchemaExecuteBatchDmlRequest extends StObject {
  
  /**
    * A per-transaction sequence number used to identify this request. This is
    * used in the same space as the seqno in ExecuteSqlRequest. See more
    * details in ExecuteSqlRequest.
    */
  var seqno: js.UndefOr[String] = js.native
  
  /**
    * The list of statements to execute in this batch. Statements are executed
    * serially, such that the effects of statement i are visible to statement
    * i+1. Each statement must be a DML statement. Execution will stop at the
    * first failed statement; the remaining statements will not run.  REQUIRES:
    * statements_size() &gt; 0.
    */
  var statements: js.UndefOr[js.Array[SchemaStatement]] = js.native
  
  /**
    * The transaction to use. A ReadWrite transaction is required. Single-use
    * transactions are not supported (to avoid replay).  The caller must either
    * supply an existing transaction ID or begin a new transaction.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.native
}
object SchemaExecuteBatchDmlRequest {
  
  @scala.inline
  def apply(): SchemaExecuteBatchDmlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteBatchDmlRequest]
  }
  
  @scala.inline
  implicit class SchemaExecuteBatchDmlRequestMutableBuilder[Self <: SchemaExecuteBatchDmlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeqno(value: String): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
    
    @scala.inline
    def setStatements(value: js.Array[SchemaStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: SchemaStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
    
    @scala.inline
    def setTransaction(value: SchemaTransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
