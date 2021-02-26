package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.kendo.dataviz.map.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapPanEvent extends MapEvent {
  
  var center: js.UndefOr[Location] = js.native
  
  var origin: js.UndefOr[Location] = js.native
  
  var originalEvent: js.UndefOr[js.Any] = js.native
}
object MapPanEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Map): MapPanEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanEvent]
  }
  
  @scala.inline
  implicit class MapPanEventMutableBuilder[Self <: MapPanEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Location): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setOrigin(value: Location): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
