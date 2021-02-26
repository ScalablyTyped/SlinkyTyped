package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnaddressCustomBatchResponse extends StObject {
  
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[ReturnaddressCustomBatchResponseEntry]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#returnaddressCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.native
}
object ReturnaddressCustomBatchResponse {
  
  @scala.inline
  def apply(): ReturnaddressCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressCustomBatchResponse]
  }
  
  @scala.inline
  implicit class ReturnaddressCustomBatchResponseMutableBuilder[Self <: ReturnaddressCustomBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ReturnaddressCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: ReturnaddressCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
