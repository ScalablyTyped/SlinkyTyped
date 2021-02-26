package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventChild extends StObject {
  
  /** The ID of the child event. */
  var childId: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventChild`. */
  var kind: js.UndefOr[String] = js.native
}
object EventChild {
  
  @scala.inline
  def apply(): EventChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventChild]
  }
  
  @scala.inline
  implicit class EventChildMutableBuilder[Self <: EventChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
