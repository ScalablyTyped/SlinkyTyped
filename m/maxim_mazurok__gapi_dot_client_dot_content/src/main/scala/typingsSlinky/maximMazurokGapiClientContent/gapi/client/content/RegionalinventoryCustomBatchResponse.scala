package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionalinventoryCustomBatchResponse extends StObject {
  
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[RegionalinventoryCustomBatchResponseEntry]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#regionalinventoryCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.native
}
object RegionalinventoryCustomBatchResponse {
  
  @scala.inline
  def apply(): RegionalinventoryCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalinventoryCustomBatchResponse]
  }
  
  @scala.inline
  implicit class RegionalinventoryCustomBatchResponseMutableBuilder[Self <: RegionalinventoryCustomBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[RegionalinventoryCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: RegionalinventoryCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
