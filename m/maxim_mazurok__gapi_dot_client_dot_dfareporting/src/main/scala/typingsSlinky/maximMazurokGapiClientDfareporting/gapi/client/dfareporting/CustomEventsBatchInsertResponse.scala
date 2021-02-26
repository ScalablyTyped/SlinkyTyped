package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventsBatchInsertResponse extends StObject {
  
  /** Indicates that some or all custom events failed to insert. */
  var hasFailures: js.UndefOr[Boolean] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventsBatchInsertResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The insert status of each custom event. Statuses are returned in the same order that conversions are inserted. */
  var status: js.UndefOr[js.Array[CustomEventStatus]] = js.native
}
object CustomEventsBatchInsertResponse {
  
  @scala.inline
  def apply(): CustomEventsBatchInsertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventsBatchInsertResponse]
  }
  
  @scala.inline
  implicit class CustomEventsBatchInsertResponseMutableBuilder[Self <: CustomEventsBatchInsertResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasFailures(value: Boolean): Self = StObject.set(x, "hasFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFailuresUndefined: Self = StObject.set(x, "hasFailures", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStatus(value: js.Array[CustomEventStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: CustomEventStatus*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}
