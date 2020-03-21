package typingsSlinky.ol.mod

import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Options
import typingsSlinky.ol.olVectorTileMod.default
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
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
    format: typingsSlinky.ol.featureMod.default,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typingsSlinky.ol.featureMod.default,
    tileLoadFunction: LoadFunction,
    opt_options: Options
  ) = this()
}

