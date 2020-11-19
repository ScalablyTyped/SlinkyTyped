package typingsSlinky.leafletDraw.mod.Draw

import typingsSlinky.leaflet.mod.Handler
import typingsSlinky.leafletDraw.mod.DrawMap
import typingsSlinky.leafletDraw.mod.DrawOptions.EditHandlerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.MarkerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.PolygonOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.PolylineOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Draw.Feature")
@js.native
class Feature () extends Handler {
  
  def initialize(map: DrawMap, options: EditHandlerOptions): Unit = js.native
  def initialize(map: DrawMap, options: MarkerOptions): Unit = js.native
  def initialize(map: DrawMap, options: PolygonOptions): Unit = js.native
  def initialize(map: DrawMap, options: PolylineOptions): Unit = js.native
  def initialize(map: DrawMap, options: RectangleOptions): Unit = js.native
  
  def setOptions(options: EditHandlerOptions): Unit = js.native
  def setOptions(options: MarkerOptions): Unit = js.native
  def setOptions(options: PolygonOptions): Unit = js.native
  def setOptions(options: PolylineOptions): Unit = js.native
  def setOptions(options: RectangleOptions): Unit = js.native
}
