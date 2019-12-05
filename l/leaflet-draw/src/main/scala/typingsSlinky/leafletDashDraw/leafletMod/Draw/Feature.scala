package typingsSlinky.leafletDashDraw.leafletMod.Draw

import typingsSlinky.leaflet.leafletMod.Handler
import typingsSlinky.leafletDashDraw.leafletMod.DrawMap
import typingsSlinky.leafletDashDraw.leafletMod.DrawOptions.EditHandlerOptions
import typingsSlinky.leafletDashDraw.leafletMod.DrawOptions.MarkerOptions
import typingsSlinky.leafletDashDraw.leafletMod.DrawOptions.PolygonOptions
import typingsSlinky.leafletDashDraw.leafletMod.DrawOptions.PolylineOptions
import typingsSlinky.leafletDashDraw.leafletMod.DrawOptions.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

