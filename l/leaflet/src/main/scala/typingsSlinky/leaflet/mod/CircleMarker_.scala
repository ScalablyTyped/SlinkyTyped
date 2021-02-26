package typingsSlinky.leaflet.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "CircleMarker")
@js.native
class CircleMarker_[P] protected () extends Path {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  
  var feature: js.UndefOr[Feature[Point, P]] = js.native
  
  def getLatLng(): LatLng_ = js.native
  
  def getRadius(): Double = js.native
  
  @JSName("options")
  var options_CircleMarker_ : CircleMarkerOptions = js.native
  
  def setLatLng(latLng: LatLngExpression): this.type = js.native
  
  def setRadius(radius: Double): this.type = js.native
  
  def toGeoJSON(): Feature[Point, P] = js.native
}
