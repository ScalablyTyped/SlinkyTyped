package typingsSlinky.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupEvent extends LeafletEvent {
  
  var popup: Popup_ = js.native
}
object PopupEvent {
  
  @scala.inline
  def apply(
    layer: js.Any,
    popup: Popup_,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): PopupEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupEvent]
  }
  
  @scala.inline
  implicit class PopupEventMutableBuilder[Self <: PopupEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopup(value: Popup_): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
  }
}
