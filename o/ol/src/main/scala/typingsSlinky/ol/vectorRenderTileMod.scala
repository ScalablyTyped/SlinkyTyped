package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.renderMod.OrderFunction
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/VectorRenderTile", JSImport.Namespace)
@js.native
object vectorRenderTileMod extends js.Object {
  
  @js.native
  trait ReplayState extends js.Object {
    
    var dirty: Boolean = js.native
    
    def renderedRenderOrder(p0: FeatureLike, p1: FeatureLike): Double = js.native
    @JSName("renderedRenderOrder")
    var renderedRenderOrder_Original: OrderFunction = js.native
    
    var renderedResolution: Double = js.native
    
    var renderedRevision: Double = js.native
    
    var renderedTileResolution: Double = js.native
    
    var renderedTileRevision: Double = js.native
    
    var renderedTileZ: Double = js.native
    
    var renderedZ: Double = js.native
  }
  
  @js.native
  trait VectorRenderTile
    extends typingsSlinky.ol.olTileMod.default {
    
    def getContext(layer: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]): CanvasRenderingContext2D = js.native
    
    /**
      * Get the Canvas for this tile.
      */
    def getImage(layer: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]): HTMLCanvasElement = js.native
    
    def getReplayState(layer: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]): ReplayState = js.native
    
    def hasContext(layer: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]): Boolean = js.native
  }
  
  @js.native
  class default protected () extends VectorRenderTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      urlTileCoord: TileCoord,
      getSourceTiles: js.Function1[/* p0 */ VectorRenderTile, js.Array[typingsSlinky.ol.olVectorTileMod.default]]
    ) = this()
  }
}
