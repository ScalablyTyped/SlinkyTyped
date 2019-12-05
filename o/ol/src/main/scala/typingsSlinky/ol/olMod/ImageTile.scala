package typingsSlinky.ol.olMod

import typingsSlinky.ol.imageTileMod.default
import typingsSlinky.ol.tileMod.LoadFunction
import typingsSlinky.ol.tileMod.Options
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

