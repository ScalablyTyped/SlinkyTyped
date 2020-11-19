package typingsSlinky.leaflet.mod

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "polyline")
@js.native
object polyline extends js.Object {
  
  def apply(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]): Polyline_[LineString | MultiLineString, _] = js.native
  def apply(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions): Polyline_[LineString | MultiLineString, _] = js.native
}
