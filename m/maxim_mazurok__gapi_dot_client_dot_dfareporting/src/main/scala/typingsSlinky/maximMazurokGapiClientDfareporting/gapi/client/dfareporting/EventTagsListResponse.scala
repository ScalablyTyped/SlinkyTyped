package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTagsListResponse extends StObject {
  
  /** Event tag collection. */
  var eventTags: js.UndefOr[js.Array[EventTag]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTagsListResponse". */
  var kind: js.UndefOr[String] = js.native
}
object EventTagsListResponse {
  
  @scala.inline
  def apply(): EventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTagsListResponse]
  }
  
  @scala.inline
  implicit class EventTagsListResponseMutableBuilder[Self <: EventTagsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTags(value: js.Array[EventTag]): Self = StObject.set(x, "eventTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTagsUndefined: Self = StObject.set(x, "eventTags", js.undefined)
    
    @scala.inline
    def setEventTagsVarargs(value: EventTag*): Self = StObject.set(x, "eventTags", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
