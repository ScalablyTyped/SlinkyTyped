package typingsSlinky.leafletDraw.mod.DrawEvents

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.leaflet.mod.LayerGroup_
import typingsSlinky.leaflet.mod.LeafletEvent
import typingsSlinky.leaflet.mod.Polygon_
import typingsSlinky.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditVertex extends LeafletEvent {
  /**
    * List of all layers just being edited from the map.
    */
  var layers: LayerGroup_[_] = js.native
  var poly: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_] = js.native
}

object EditVertex {
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup_[_],
    poly: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_],
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): EditVertex = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditVertex]
  }
  @scala.inline
  implicit class EditVertexOps[Self <: EditVertex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: LayerGroup_[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoly(value: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

