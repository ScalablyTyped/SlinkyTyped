package typingsSlinky.ol.sourceZoomifyMod

import typingsSlinky.ol.tileMod.LoadFunction
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Zoomify", "CustomTile")
@js.native
class CustomTile protected ()
  extends typingsSlinky.ol.imageTileMod.default {
  def this(
    tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction,
    opt_options: typingsSlinky.ol.tileMod.Options
  ) = this()
}

