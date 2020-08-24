package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Tile", JSImport.Namespace)
@js.native
object reprojTileMod extends js.Object {
  @js.native
  trait ReprojTile
    extends typingsSlinky.ol.olTileMod.default {
    def getImage(): HTMLCanvasElement = js.native
  }
  
  @js.native
  class default protected () extends ReprojTile {
    def this(
      sourceProj: typingsSlinky.ol.projectionMod.default,
      sourceTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      targetProj: typingsSlinky.ol.projectionMod.default,
      targetTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType
    ) = this()
    def this(
      sourceProj: typingsSlinky.ol.projectionMod.default,
      sourceTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      targetProj: typingsSlinky.ol.projectionMod.default,
      targetTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double
    ) = this()
    def this(
      sourceProj: typingsSlinky.ol.projectionMod.default,
      sourceTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      targetProj: typingsSlinky.ol.projectionMod.default,
      targetTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: js.UndefOr[scala.Nothing],
      opt_renderEdges: Boolean
    ) = this()
    def this(
      sourceProj: typingsSlinky.ol.projectionMod.default,
      sourceTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      targetProj: typingsSlinky.ol.projectionMod.default,
      targetTileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      tileCoord: TileCoord,
      wrappedTileCoord: TileCoord,
      pixelRatio: Double,
      gutter: Double,
      getTileFunction: FunctionType,
      opt_errorThreshold: Double,
      opt_renderEdges: Boolean
    ) = this()
  }
  
  type FunctionType = js.Function4[
    /* p0 */ Double, 
    /* p1 */ Double, 
    /* p2 */ Double, 
    /* p3 */ Double, 
    typingsSlinky.ol.olTileMod.default
  ]
}

