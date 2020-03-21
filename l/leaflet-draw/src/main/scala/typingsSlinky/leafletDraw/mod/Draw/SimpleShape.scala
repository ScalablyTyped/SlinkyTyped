package typingsSlinky.leafletDraw.mod.Draw

import typingsSlinky.leafletDraw.mod.DrawMap
import typingsSlinky.leafletDraw.mod.DrawOptions.SimpleShapeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draw.SimpleShape")
@js.native
class SimpleShape protected () extends Feature {
  def this(map: DrawMap) = this()
  def this(map: DrawMap, options: SimpleShapeOptions) = this()
}

