package typingsSlinky.leafletPolylinedecorator.mod.Symbol

import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.Map_
import typingsSlinky.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Symbol.Marker")
@js.native
class Marker_ () extends js.Object {
  def this(options: MarkerOptions) = this()
  
  def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Marker_ = js.native
  
  def initialize(): Unit = js.native
  def initialize(options: MarkerOptions): Unit = js.native
}
