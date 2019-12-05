package typingsSlinky.leafletDashRastercoords

import typingsSlinky.leaflet.leafletMod.LatLng
import typingsSlinky.leaflet.leafletMod.LatLngExpression
import typingsSlinky.leaflet.leafletMod.Map
import typingsSlinky.leaflet.leafletMod.Point
import typingsSlinky.leaflet.leafletMod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object leafletMod extends js.Object {
  @js.native
  class RasterCoords protected () extends js.Object {
    def this(map: Map, imgsize: js.Array[Double]) = this()
    def this(map: Map, imgsize: js.Array[Double], tilesize: Double) = this()
    def project(coords: LatLngExpression): Point = js.native
    def setMaxBounds(): Unit = js.native
    def unproject(coords: PointExpression): LatLng = js.native
    def zoomLevel(): Double = js.native
  }
  
}

