package typingsSlinky.leafletDraw.mod.Draw

import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leafletDraw.mod.DrawMap
import typingsSlinky.leafletDraw.mod.DrawOptions.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Draw.Polyline")
@js.native
class Polyline protected () extends Feature {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: PolylineOptions) = this()
  
  def addVertex(latlng: LatLng_): Unit = js.native
  
  def completeShape(): Unit = js.native
  
  def deleteLastVertex(): Unit = js.native
}
