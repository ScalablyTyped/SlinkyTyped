package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.DomEvent.PropagableEvent because Already inherited */ @js.native
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
  implicit class LeafletMouseEventOps[Self <: LeafletMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerPoint(value: Point_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatlng(value: LatLng_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latlng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerPoint(value: Point_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

