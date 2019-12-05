package typingsSlinky.leafletDashPolylinedecorator.leafletMod.Symbol

import typingsSlinky.geojson.geojsonMod.LineString
import typingsSlinky.geojson.geojsonMod.MultiLineString
import typingsSlinky.leaflet.leafletMod.LatLng
import typingsSlinky.leaflet.leafletMod.Map
import typingsSlinky.leaflet.leafletMod.Point
import typingsSlinky.leaflet.leafletMod.Polygon
import typingsSlinky.leaflet.leafletMod.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Symbol.ArrowHead")
@js.native
class ArrowHead () extends js.Object {
  def this(options: ArrowHeadOptions) = this()
  def buildSymbol(dirPoint: Point, latLngs: js.Array[LatLng], map: Map, index: Double, total: Double): Polygon[_] | (Polyline[LineString | MultiLineString, _]) = js.native
  def initialize(): Unit = js.native
  def initialize(options: ArrowHeadOptions): Unit = js.native
}

@JSImport("leaflet", "Symbol.arrowHead")
@js.native
object arrowHead extends js.Object {
  def apply(): ArrowHead = js.native
  def apply(options: ArrowHeadOptions): ArrowHead = js.native
}

