package typingsSlinky.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountstatusesCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaAccountstatusesCustomBatchRequestEntry]] = js.native
}
object SchemaAccountstatusesCustomBatchRequest {
  
  @scala.inline
  def apply(): SchemaAccountstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountstatusesCustomBatchRequest]
  }
  
  @scala.inline
  implicit class SchemaAccountstatusesCustomBatchRequestMutableBuilder[Self <: SchemaAccountstatusesCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaAccountstatusesCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaAccountstatusesCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
