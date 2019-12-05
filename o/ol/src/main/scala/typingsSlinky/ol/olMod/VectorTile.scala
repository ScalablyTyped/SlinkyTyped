package typingsSlinky.ol.olMod

import typingsSlinky.ol.tileMod.LoadFunction
import typingsSlinky.ol.tileMod.Options
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.vectorTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorTile")
@js.native
class VectorTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typingsSlinky.ol.formatFeatureMod.default,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typingsSlinky.ol.formatFeatureMod.default,
    tileLoadFunction: LoadFunction,
    opt_options: Options
  ) = this()
}

