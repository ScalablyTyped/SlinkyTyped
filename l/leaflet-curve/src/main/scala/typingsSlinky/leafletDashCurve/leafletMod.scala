package typingsSlinky.leafletDashCurve

import typingsSlinky.leaflet.leafletMod.LatLng
import typingsSlinky.leaflet.leafletMod.LatLngBounds
import typingsSlinky.leaflet.leafletMod.Path
import typingsSlinky.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("leaflet", JSImport.Namespace)
@js.native
object leafletMod extends js.Object {
  @js.native
  class Curve () extends Path {
    /*
      * Get bounds
      */
    def getBounds(): LatLngBounds = js.native
    /*
      * Get center
      */
    def getCenter(): LatLng = js.native
    /*
      * Return path
      */
    def getPath(): js.Array[String | js.Array[js.Array[js.Any]]] = js.native
    /*
      * Set path
      */
    def setPath(): Curve = js.native
  }
  
  /*
    * Drawing Bezier curves and other complex shapes.
    */
  def curve(path: js.Array[_]): Curve = js.native
  def curve(path: js.Array[_], options: PathOptions): Curve = js.native
}

