package typingsSlinky.ol.mod

import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.vectorRenderTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorRenderTile")
@js.native
class VectorRenderTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    urlTileCoord: TileCoord,
    sourceTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
    getSourceTiles: js.Function1[
        /* p0 */ typingsSlinky.ol.vectorRenderTileMod.VectorRenderTile, 
        js.Array[typingsSlinky.ol.olVectorTileMod.default]
      ],
    removeSourceTiles: js.Function1[/* p0 */ typingsSlinky.ol.vectorRenderTileMod.VectorRenderTile, Unit]
  ) = this()
}

