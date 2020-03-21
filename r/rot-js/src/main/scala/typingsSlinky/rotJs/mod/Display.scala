package typingsSlinky.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rotJs.PartialDisplayOptions
import typingsSlinky.rotJs.TypeofRect
import typingsSlinky.rotJs.TypeofTileGL
import typingsSlinky.rotJs.displayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Display")
@js.native
class Display () extends default {
  def this(options: PartialDisplayOptions) = this()
}

/* static members */
@JSImport("rot-js", "Display")
@js.native
object Display extends js.Object {
  var Hex: Instantiable0[typingsSlinky.rotJs.hexMod.default] = js.native
  var Rect: TypeofRect = js.native
  var Term: Instantiable0[typingsSlinky.rotJs.termMod.default] = js.native
  var Tile: Instantiable0[typingsSlinky.rotJs.tileMod.default] = js.native
  var TileGL: TypeofTileGL = js.native
}

