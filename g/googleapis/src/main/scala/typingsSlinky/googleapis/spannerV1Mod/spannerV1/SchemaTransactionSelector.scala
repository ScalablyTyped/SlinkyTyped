package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message is used to select the transaction in which a Read or
  * ExecuteSql call runs.  See TransactionOptions for more information about
  * transactions.
  */
@js.native
trait SchemaTransactionSelector extends StObject {
  
  /**
    * Begin a new transaction and execute this read or SQL query in it. The
    * transaction ID of the new transaction is returned in
    * ResultSetMetadata.transaction, which is a Transaction.
    */
  var begin: js.UndefOr[SchemaTransactionOptions] = js.native
  
  /**
    * Execute the read or SQL query in a previously-started transaction.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Execute the read or SQL query in a temporary transaction. This is the
    * most efficient way to execute a transaction that consists of a single SQL
    * query.
    */
  var singleUse: js.UndefOr[SchemaTransactionOptions] = js.native
}
object SchemaTransactionSelector {
  
  @scala.inline
  def apply(): SchemaTransactionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionSelector]
  }
  
  @scala.inline
  implicit class SchemaTransactionSelectorMutableBuilder[Self <: SchemaTransactionSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: SchemaTransactionOptions): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSingleUse(value: SchemaTransactionOptions): Self = StObject.set(x, "singleUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUseUndefined: Self = StObject.set(x, "singleUse", js.undefined)
  }
}
