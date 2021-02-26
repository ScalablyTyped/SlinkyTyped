package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileLayerMod {
  
  @JSImport("ol/renderer/canvas/TileLayer", JSImport.Default)
  @js.native
  class default protected () extends CanvasTileLayerRenderer {
    def this(tileLayer: typingsSlinky.ol.tileMod.default) = this()
    def this(tileLayer: typingsSlinky.ol.vectorTileMod.default) = this()
  }
  
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
    
    def getImage(): HTMLCanvasElement = js.native
    
    def getTile(z: Double, x: Double, y: Double, frameState: FrameState): typingsSlinky.ol.olTileMod.default = js.native
    
    /**
      * Get the image from a tile.
      */
    /* protected */ def getTileImage(tile: typingsSlinky.ol.imageTileMod.default): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /* protected */ def isDrawableTile(tile: typingsSlinky.ol.olTileMod.default): Boolean = js.native
    
    /**
      * Manage tile pyramid.
      * This function performs a number of functions related to the tiles at the
      * current zoom and lower zoom levels:
      *
      * registers idle tiles in frameState.wantedTiles so that they are not
      * discarded by the tile queue
      * enqueues missing tiles
      *
      */
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
}
