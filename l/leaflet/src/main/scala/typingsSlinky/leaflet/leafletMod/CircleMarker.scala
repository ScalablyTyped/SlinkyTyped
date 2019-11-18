package typingsSlinky.leaflet.leafletMod

import typingsSlinky.geojson.geojsonMod.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "CircleMarker")
@js.native
class CircleMarker[P] protected () extends Path {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  var feature: js.UndefOr[Feature[typingsSlinky.geojson.geojsonMod.Point, P]] = js.native
  @JSName("options")
  var options_CircleMarker: CircleMarkerOptions = js.native
  def getLatLng(): LatLng = js.native
  def getRadius(): Double = js.native
  def setLatLng(latLng: LatLngExpression): this.type = js.native
  def setRadius(radius: Double): this.type = js.native
  def toGeoJSON(): Feature[typingsSlinky.geojson.geojsonMod.Point, P] = js.native
}

@JSImport("leaflet", "circleMarker")
@js.native
object circleMarker extends js.Object {
  def apply(latlng: LatLngExpression): CircleMarker[_] = js.native
  def apply(latlng: LatLngExpression, options: CircleMarkerOptions): CircleMarker[_] = js.native
}

