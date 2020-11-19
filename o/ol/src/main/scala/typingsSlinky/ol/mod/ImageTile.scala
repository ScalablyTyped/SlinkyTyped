package typingsSlinky.ol.mod

import typingsSlinky.ol.imageTileMod.default
import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Options
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "ImageTile")
@js.native
class ImageTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction,
    opt_options: Options
  ) = this()
}
