package typingsSlinky.leaflet.mod

import typingsSlinky.geojson.mod.MultiPolygon
import typingsSlinky.geojson.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Polygon")
@js.native
class Polygon_[P] protected () extends Polyline_[Polygon | MultiPolygon, P] {
  def this(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]) = this()
  def this(
    latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
    options: PolylineOptions
  ) = this()
}
