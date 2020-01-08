package typingsSlinky.leafletDashDraw.leafletMod.DrawEvents

import typingsSlinky.geojson.geojsonMod.LineString
import typingsSlinky.geojson.geojsonMod.MultiLineString
import typingsSlinky.leaflet.leafletMod.LayerGroup
import typingsSlinky.leaflet.leafletMod.LeafletEvent
import typingsSlinky.leaflet.leafletMod.Polygon
import typingsSlinky.leaflet.leafletMod.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditVertex extends LeafletEvent {
  /**
    * List of all layers just being edited from the map.
    */
  var layers: LayerGroup[_]
  var poly: (Polyline[LineString | MultiLineString, _]) | Polygon[_]
}

object EditVertex {
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup[_],
    poly: (Polyline[LineString | MultiLineString, _]) | Polygon[_],
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

