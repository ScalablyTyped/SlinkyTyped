package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the PullBatch method.
  */
@js.native
trait SchemaPullBatchResponse extends StObject {
  
  /**
    * Received Pub/Sub messages or status events. The Pub/Sub system will
    * return zero messages if there are no more messages available in the
    * backlog. The Pub/Sub system may return fewer than the max_events
    * requested even if there are more messages available in the backlog.
    */
  var pullResponses: js.UndefOr[js.Array[SchemaPullResponse]] = js.native
}
object SchemaPullBatchResponse {
  
  @scala.inline
  def apply(): SchemaPullBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullBatchResponse]
  }
  
  @scala.inline
  implicit class SchemaPullBatchResponseMutableBuilder[Self <: SchemaPullBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullResponses(value: js.Array[SchemaPullResponse]): Self = StObject.set(x, "pullResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullResponsesUndefined: Self = StObject.set(x, "pullResponses", js.undefined)
    
    @scala.inline
    def setPullResponsesVarargs(value: SchemaPullResponse*): Self = StObject.set(x, "pullResponses", js.Array(value :_*))
  }
}
