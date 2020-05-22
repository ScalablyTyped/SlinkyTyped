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

trait EditVertex extends LeafletEvent {
  /**
    * List of all layers just being edited from the map.
    */
  var layers: LayerGroup_[_]
  var poly: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_]
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
}

