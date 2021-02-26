package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionAfterAddEvent extends StObject {
  
  var item: js.Any = js.native
}
object CollectionAfterAddEvent {
  
  @scala.inline
  def apply(item: js.Any): CollectionAfterAddEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAfterAddEvent]
  }
  
  @scala.inline
  implicit class CollectionAfterAddEventMutableBuilder[Self <: CollectionAfterAddEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
