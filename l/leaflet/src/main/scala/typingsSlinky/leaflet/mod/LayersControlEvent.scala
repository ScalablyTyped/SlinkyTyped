package typingsSlinky.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersControlEvent extends LayerEvent {
  
  var name: String = js.native
}
object LayersControlEvent {
  
  @scala.inline
  def apply(
    layer: Layer,
    name: String,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): LayersControlEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersControlEvent]
  }
  
  @scala.inline
  implicit class LayersControlEventMutableBuilder[Self <: LayersControlEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
