package typingsSlinky.ol.olTileMod

import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/Tile", JSImport.Default)
@js.native
abstract class default protected () extends Tile {
  def this(tileCoord: TileCoord, state: TileState) = this()
  def this(tileCoord: TileCoord, state: TileState, opt_options: Options) = this()
}
