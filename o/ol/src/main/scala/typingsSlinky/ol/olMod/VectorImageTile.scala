package typingsSlinky.ol.olMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.tileMod.LoadFunction
import typingsSlinky.ol.tileMod.UrlFunction
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.vectorImageTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorImageTile")
@js.native
class VectorImageTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    sourceRevision: Double,
    format: typingsSlinky.ol.formatFeatureMod.default,
    tileLoadFunction: LoadFunction,
    urlTileCoord: TileCoord,
    tileUrlFunction: UrlFunction,
    sourceTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
    tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
    sourceTiles: StringDictionary[typingsSlinky.ol.vectorTileMod.default],
    pixelRatio: Double,
    projection: typingsSlinky.ol.projProjectionMod.default,
    tileClass: typingsSlinky.ol.vectorTileMod.default,
    handleTileChange: js.ThisFunction1[
        /* this */ typingsSlinky.ol.sourceVectorTileMod.default, 
        /* p0 */ typingsSlinky.ol.eventsEventMod.default, 
        Unit
      ],
    zoom: Double
  ) = this()
}

