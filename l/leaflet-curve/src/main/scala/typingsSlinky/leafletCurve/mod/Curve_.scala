package typingsSlinky.leafletCurve.mod

import typingsSlinky.leaflet.mod.LatLngBounds_
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Curve")
@js.native
class Curve_ () extends Path {
  
  /*
    * Get bounds
    */
  def getBounds(): LatLngBounds_ = js.native
  
  /*
    * Get center
    */
  def getCenter(): LatLng_ = js.native
  
  /*
    * Return path
    */
  def getPath(): js.Array[String | js.Array[js.Array[js.Any]]] = js.native
  
  /*
    * Set path
    */
  def setPath(): Curve_ = js.native
}
