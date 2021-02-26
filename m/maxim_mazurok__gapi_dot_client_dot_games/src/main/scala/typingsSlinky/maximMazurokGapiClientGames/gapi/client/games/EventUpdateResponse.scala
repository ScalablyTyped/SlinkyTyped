package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventUpdateResponse extends StObject {
  
  /** Any batch-wide failures which occurred applying updates. */
  var batchFailures: js.UndefOr[js.Array[EventBatchRecordFailure]] = js.native
  
  /** Any failures updating a particular event. */
  var eventFailures: js.UndefOr[js.Array[EventRecordFailure]] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventUpdateResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The current status of any updated events */
  var playerEvents: js.UndefOr[js.Array[PlayerEvent]] = js.native
}
object EventUpdateResponse {
  
  @scala.inline
  def apply(): EventUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventUpdateResponse]
  }
  
  @scala.inline
  implicit class EventUpdateResponseMutableBuilder[Self <: EventUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchFailures(value: js.Array[EventBatchRecordFailure]): Self = StObject.set(x, "batchFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchFailuresUndefined: Self = StObject.set(x, "batchFailures", js.undefined)
    
    @scala.inline
    def setBatchFailuresVarargs(value: EventBatchRecordFailure*): Self = StObject.set(x, "batchFailures", js.Array(value :_*))
    
    @scala.inline
    def setEventFailures(value: js.Array[EventRecordFailure]): Self = StObject.set(x, "eventFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFailuresUndefined: Self = StObject.set(x, "eventFailures", js.undefined)
    
    @scala.inline
    def setEventFailuresVarargs(value: EventRecordFailure*): Self = StObject.set(x, "eventFailures", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlayerEvents(value: js.Array[PlayerEvent]): Self = StObject.set(x, "playerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerEventsUndefined: Self = StObject.set(x, "playerEvents", js.undefined)
    
    @scala.inline
    def setPlayerEventsVarargs(value: PlayerEvent*): Self = StObject.set(x, "playerEvents", js.Array(value :_*))
  }
}
