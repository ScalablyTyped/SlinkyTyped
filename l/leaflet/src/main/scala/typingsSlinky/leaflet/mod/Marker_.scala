package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Marker")
@js.native
class Marker_[P] protected () extends Layer {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: MarkerOptions) = this()
  
  var _shadow: js.UndefOr[HTMLElement] = js.native
  
  var dragging: js.UndefOr[Handler] = js.native
  
  var feature: js.UndefOr[Feature[Point, P]] = js.native
  
  def getElement(): js.UndefOr[HTMLElement] = js.native
  
  def getIcon(): Icon_[IconOptions] | DivIcon_ = js.native
  
  def getLatLng(): LatLng_ = js.native
  
  // Properties
  var options: MarkerOptions = js.native
  
  def setIcon(icon: DivIcon_): this.type = js.native
  def setIcon(icon: Icon_[IconOptions]): this.type = js.native
  
  def setLatLng(latlng: LatLngExpression): this.type = js.native
  
  def setOpacity(opacity: Double): this.type = js.native
  
  def setZIndexOffset(offset: Double): this.type = js.native
  
  def toGeoJSON(): Feature[Point, P] = js.native
}
