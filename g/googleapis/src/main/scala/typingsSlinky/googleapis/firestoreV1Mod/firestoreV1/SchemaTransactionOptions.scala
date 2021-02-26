package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a new transaction.
  */
@js.native
trait SchemaTransactionOptions extends StObject {
  
  /**
    * The transaction can only be used for read operations.
    */
  var readOnly: js.UndefOr[SchemaReadOnly] = js.native
  
  /**
    * The transaction can be used for both read and write operations.
    */
  var readWrite: js.UndefOr[SchemaReadWrite] = js.native
}
object SchemaTransactionOptions {
  
  @scala.inline
  def apply(): SchemaTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionOptions]
  }
  
  @scala.inline
  implicit class SchemaTransactionOptionsMutableBuilder[Self <: SchemaTransactionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: SchemaReadOnly): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReadWrite(value: SchemaReadWrite): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
