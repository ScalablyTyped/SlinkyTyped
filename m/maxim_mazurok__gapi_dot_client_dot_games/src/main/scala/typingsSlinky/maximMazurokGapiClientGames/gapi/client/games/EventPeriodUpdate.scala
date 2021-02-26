package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPeriodUpdate extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventPeriodUpdate`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The time period being covered by this update. */
  var timePeriod: js.UndefOr[EventPeriodRange] = js.native
  
  /** The updates being made for this time period. */
  var updates: js.UndefOr[js.Array[EventUpdateRequest]] = js.native
}
object EventPeriodUpdate {
  
  @scala.inline
  def apply(): EventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPeriodUpdate]
  }
  
  @scala.inline
  implicit class EventPeriodUpdateMutableBuilder[Self <: EventPeriodUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: EventPeriodRange): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    @scala.inline
    def setUpdates(value: js.Array[EventUpdateRequest]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: EventUpdateRequest*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
