package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/renderer/canvas/TileLayer", JSImport.Namespace)
@js.native
object tileLayerMod extends js.Object {
  
  @js.native
  trait CanvasTileLayerRenderer
    extends typingsSlinky.ol.canvasLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
    
    def drawTileImage(
      tile: typingsSlinky.ol.imageTileMod.default,
      frameState: FrameState,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      gutter: Double,
      transition: Boolean,
      opacity: Double
    ): Unit = js.native
    
    def getTile(z: Double, x: Double, y: Double, frameState: FrameState): typingsSlinky.ol.olTileMod.default = js.native
    
    /* protected */ def getTileImage(tile: typingsSlinky.ol.imageTileMod.default): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /* protected */ def isDrawableTile(tile: typingsSlinky.ol.olTileMod.default): Boolean = js.native
    
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typingsSlinky.ol.sourceTileMod.default,
      tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double
    ): Unit = js.native
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typingsSlinky.ol.sourceTileMod.default,
      tileGrid: typingsSlinky.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      opt_tileCallback: js.Function0[Unit]
    ): Unit = js.native
    
    var renderedPixelRatio: Double = js.native
    
    var renderedProjection: typingsSlinky.ol.projectionMod.default = js.native
    
    var renderedRevision: Double = js.native
    
    var renderedTiles: js.Array[typingsSlinky.ol.olTileMod.default] = js.native
    
    /* protected */ def scheduleExpireCache(frameState: FrameState, tileSource: typingsSlinky.ol.sourceTileMod.default): Unit = js.native
    
    var tmpExtent: Extent = js.native
    
    /* protected */ def updateUsedTiles(
      usedTiles: StringDictionary[StringDictionary[Boolean]],
      tileSource: typingsSlinky.ol.sourceTileMod.default,
      tile: typingsSlinky.ol.olTileMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasTileLayerRenderer {
    def this(tileLayer: typingsSlinky.ol.tileMod.default) = this()
    def this(tileLayer: typingsSlinky.ol.vectorTileMod.default) = this()
  }
}
