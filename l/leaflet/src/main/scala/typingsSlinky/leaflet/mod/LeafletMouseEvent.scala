package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.DomEvent._PropagableEvent because Already inherited */ @js.native
trait LeafletMouseEvent extends LeafletEvent {
  
  var containerPoint: Point_ = js.native
  
  var latlng: LatLng_ = js.native
  
  var layerPoint: Point_ = js.native
  
  var originalEvent: MouseEvent = js.native
}
object LeafletMouseEvent {
  
  @scala.inline
  def apply(
    containerPoint: Point_,
    latlng: LatLng_,
    layer: js.Any,
    layerPoint: Point_,
    originalEvent: MouseEvent,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): LeafletMouseEvent = {
    val __obj = js.Dynamic.literal(containerPoint = containerPoint.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], layerPoint = layerPoint.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletMouseEvent]
  }
  
  @scala.inline
  implicit class LeafletMouseEventMutableBuilder[Self <: LeafletMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPoint(value: Point_): Self = StObject.set(x, "containerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatlng(value: LatLng_): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerPoint(value: Point_): Self = StObject.set(x, "layerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
