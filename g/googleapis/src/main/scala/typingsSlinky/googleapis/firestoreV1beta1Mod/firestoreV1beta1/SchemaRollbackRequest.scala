package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Firestore.Rollback.
  */
@js.native
trait SchemaRollbackRequest extends StObject {
  
  /**
    * The transaction to roll back.
    */
  var transaction: js.UndefOr[String] = js.native
}
object SchemaRollbackRequest {
  
  @scala.inline
  def apply(): SchemaRollbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRollbackRequest]
  }
  
  @scala.inline
  implicit class SchemaRollbackRequestMutableBuilder[Self <: SchemaRollbackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
