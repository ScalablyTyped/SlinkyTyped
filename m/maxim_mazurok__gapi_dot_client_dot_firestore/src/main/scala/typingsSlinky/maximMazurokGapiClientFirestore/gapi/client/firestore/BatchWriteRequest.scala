package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchWriteRequest extends StObject {
  
  /** Labels associated with this batch write. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.BatchWriteRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The writes to apply. Method does not apply writes atomically and does not guarantee ordering. Each write succeeds or fails independently. You cannot write to the same document more
    * than once per request.
    */
  var writes: js.UndefOr[js.Array[Write]] = js.native
}
object BatchWriteRequest {
  
  @scala.inline
  def apply(): BatchWriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteRequest]
  }
  
  @scala.inline
  implicit class BatchWriteRequestMutableBuilder[Self <: BatchWriteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.BatchWriteRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setWrites(value: js.Array[Write]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    @scala.inline
    def setWritesVarargs(value: Write*): Self = StObject.set(x, "writes", js.Array(value :_*))
  }
}
