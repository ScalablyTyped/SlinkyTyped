package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionOptions extends StObject {
  
  /** Partitioned DML transaction. Authorization to begin a Partitioned DML transaction requires `spanner.databases.beginPartitionedDmlTransaction` permission on the `session` resource. */
  var partitionedDml: js.UndefOr[js.Any] = js.native
  
  /** Transaction will not write. Authorization to begin a read-only transaction requires `spanner.databases.beginReadOnlyTransaction` permission on the `session` resource. */
  var readOnly: js.UndefOr[ReadOnly] = js.native
  
  /** Transaction may write. Authorization to begin a read-write transaction requires `spanner.databases.beginOrRollbackReadWriteTransaction` permission on the `session` resource. */
  var readWrite: js.UndefOr[js.Any] = js.native
}
object TransactionOptions {
  
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  @scala.inline
  implicit class TransactionOptionsMutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionedDml(value: js.Any): Self = StObject.set(x, "partitionedDml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionedDmlUndefined: Self = StObject.set(x, "partitionedDml", js.undefined)
    
    @scala.inline
    def setReadOnly(value: ReadOnly): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReadWrite(value: js.Any): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
