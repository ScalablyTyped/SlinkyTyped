package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.renderMod.OrderFunction
import typingsSlinky.ol.tileMod.LoadFunction
import typingsSlinky.ol.tileMod.UrlFunction
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.vectorImageTileMod.ReplayState
import typingsSlinky.ol.vectorImageTileMod.VectorImageTile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorImageTile", JSImport.Namespace)
@js.native
object vectorImageTileMod extends js.Object {
  @js.native
  trait ReplayState extends js.Object {
    var dirty: Boolean = js.native
    @JSName("renderedRenderOrder")
    var renderedRenderOrder_Original: OrderFunction = js.native
    var renderedRevision: Double = js.native
    var renderedTileRevision: Double = js.native
    def renderedRenderOrder(p0: FeatureLike, p1: FeatureLike): Double = js.native
  }
  
  @js.native
  trait VectorImageTile
    extends typingsSlinky.ol.tileMod.default {
    def getContext(layer: typingsSlinky.ol.layerLayerMod.default): CanvasRenderingContext2D = js.native
    def getImage(layer: typingsSlinky.ol.layerLayerMod.default): HTMLCanvasElement = js.native
    def getReplayState(layer: typingsSlinky.ol.layerLayerMod.default): ReplayState = js.native
    def getTile(tileKey: String): typingsSlinky.ol.vectorTileMod.default = js.native
  }
  
  @js.native
  class default protected () extends VectorImageTile {
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
  
  def defaultLoadFunction(tile: typingsSlinky.ol.vectorTileMod.default, url: String): Unit = js.native
}

