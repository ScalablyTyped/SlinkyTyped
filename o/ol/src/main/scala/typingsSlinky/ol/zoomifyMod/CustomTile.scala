package typingsSlinky.ol.zoomifyMod

import typingsSlinky.ol.olTileMod.LoadFunction
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
    tilePixelRatio: Double,
    tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tilePixelRatio: Double,
    tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction,
    opt_options: typingsSlinky.ol.olTileMod.Options
  ) = this()
}

