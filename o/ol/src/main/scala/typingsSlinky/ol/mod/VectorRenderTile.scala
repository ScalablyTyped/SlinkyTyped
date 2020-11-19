package typingsSlinky.ol.mod

import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.vectorRenderTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "VectorRenderTile")
@js.native
class VectorRenderTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    urlTileCoord: TileCoord,
    getSourceTiles: js.Function1[
        /* p0 */ typingsSlinky.ol.vectorRenderTileMod.VectorRenderTile, 
        js.Array[typingsSlinky.ol.olVectorTileMod.default]
      ]
  ) = this()
}
