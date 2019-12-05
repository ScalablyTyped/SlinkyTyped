package typingsSlinky.leafletDashPolylinedecorator.leafletMod.Symbol

import typingsSlinky.geojson.geojsonMod.LineString
import typingsSlinky.geojson.geojsonMod.MultiLineString
import typingsSlinky.leaflet.leafletMod.LatLng
import typingsSlinky.leaflet.leafletMod.Map
import typingsSlinky.leaflet.leafletMod.Point
import typingsSlinky.leaflet.leafletMod.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Symbol.Dash")
@js.native
class Dash () extends js.Object {
  def this(options: DashOptions) = this()
  def buildSymbol(dirPoint: Point, latLngs: js.Array[LatLng], map: Map, index: Double, total: Double): Polyline[LineString | MultiLineString, _] = js.native
  def initialize(): Unit = js.native
  def initialize(options: DashOptions): Unit = js.native
}

@JSImport("leaflet", "Symbol.dash")
@js.native
object dash extends js.Object {
  def apply(): Dash = js.native
  def apply(options: DashOptions): Dash = js.native
}

