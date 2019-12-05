package typingsSlinky.proj4leaflet.proj4leafletMod.leafletMod.Proj

import typingsSlinky.leaflet.leafletMod.Bounds
import typingsSlinky.leaflet.leafletMod.LatLng
import typingsSlinky.leaflet.leafletMod.LatLngExpression
import typingsSlinky.leaflet.leafletMod.LatLngLiteral
import typingsSlinky.leaflet.leafletMod.Point
import typingsSlinky.leaflet.leafletMod.PointExpression
import typingsSlinky.leaflet.leafletMod.Projection
import typingsSlinky.leaflet.leafletMod.Transformation
import typingsSlinky.proj4.proj4Mod.InterfaceProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Proj.CRS")
@js.native
class CRS protected () extends js.Object {
  def this(projection: InterfaceProjection) = this()
  def this(code: String, proj4def: String) = this()
  def this(projection: InterfaceProjection, options: ProjCRSOptions) = this()
  def this(code: String, proj4def: String, options: ProjCRSOptions) = this()
  var code: js.UndefOr[String] = js.native
  var infinite: Boolean = js.native
  var projection: Projection = js.native
  var transformation: Transformation = js.native
  var wrapLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var wrapLng: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): Double = js.native
  def getProjectedBounds(zoom: Double): Bounds = js.native
  def latLngToPoint(latlng: LatLngExpression, zoom: Double): Point = js.native
  def pointToLatLng(point: PointExpression, zoom: Double): LatLng = js.native
  def project(latlng: LatLng): Point = js.native
  def project(latlng: LatLngLiteral): Point = js.native
  def scale(zoom: Double): Double = js.native
  def unproject(point: PointExpression): LatLng = js.native
  def wrapLatLng(latlng: LatLng): LatLng = js.native
  def wrapLatLng(latlng: LatLngLiteral): LatLng = js.native
  def zoom(scale: Double): Double = js.native
}

