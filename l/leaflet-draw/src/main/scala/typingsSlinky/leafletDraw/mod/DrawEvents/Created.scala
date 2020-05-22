package typingsSlinky.leafletDraw.mod.DrawEvents

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.leaflet.mod.CircleMarker_
import typingsSlinky.leaflet.mod.Circle_
import typingsSlinky.leaflet.mod.LeafletEvent
import typingsSlinky.leaflet.mod.Marker_
import typingsSlinky.leaflet.mod.Polygon_
import typingsSlinky.leaflet.mod.Polyline_
import typingsSlinky.leaflet.mod.Rectangle_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends LeafletEvent {
  /**
    * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
    */
  var layerType: String
  /**
    * Layer that was just created.
    */
  @JSName("layer")
  var layer_Created: Circle_[_] | CircleMarker_[_] | Marker_[_] | Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) | Rectangle_[_]
}

object Created {
  @scala.inline
  def apply(
    layer: Circle_[_] | CircleMarker_[_] | Marker_[_] | Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) | Rectangle_[_],
    layerType: String,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): Created = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
}

