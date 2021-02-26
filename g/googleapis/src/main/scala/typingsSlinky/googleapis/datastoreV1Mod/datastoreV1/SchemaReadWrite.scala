package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options specific to read / write transactions.
  */
@js.native
trait SchemaReadWrite extends StObject {
  
  /**
    * The transaction identifier of the transaction being retried.
    */
  var previousTransaction: js.UndefOr[String] = js.native
}
object SchemaReadWrite {
  
  @scala.inline
  def apply(): SchemaReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadWrite]
  }
  
  @scala.inline
  implicit class SchemaReadWriteMutableBuilder[Self <: SchemaReadWrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousTransaction(value: String): Self = StObject.set(x, "previousTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTransactionUndefined: Self = StObject.set(x, "previousTransaction", js.undefined)
  }
}
