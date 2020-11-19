package typingsSlinky.leafletPolylinedecorator.mod.Symbol

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.Map_
import typingsSlinky.leaflet.mod.Point_
import typingsSlinky.leaflet.mod.Polygon_
import typingsSlinky.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Symbol.ArrowHead")
@js.native
class ArrowHead_ () extends js.Object {
  def this(options: ArrowHeadOptions) = this()
  
  def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) = js.native
  
  def initialize(): Unit = js.native
  def initialize(options: ArrowHeadOptions): Unit = js.native
}
