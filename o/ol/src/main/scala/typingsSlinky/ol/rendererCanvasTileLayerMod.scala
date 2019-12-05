package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.rendererCanvasTileLayerMod.CanvasTileLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/TileLayer", JSImport.Namespace)
@js.native
object rendererCanvasTileLayerMod extends js.Object {
  @js.native
  trait CanvasTileLayerRenderer
    extends typingsSlinky.ol.rendererCanvasIntermediateCanvasMod.default {
    var context: CanvasRenderingContext2D = js.native
    var renderedRevision: Double = js.native
    var renderedTiles: js.Array[typingsSlinky.ol.tileMod.default] = js.native
    var tmpExtent: Extent = js.native
    var zDirection: Double = js.native
    def create(
      mapRenderer: typingsSlinky.ol.rendererMapMod.default,
      layer: typingsSlinky.ol.layerLayerMod.default
    ): CanvasTileLayerRenderer = js.native
    def drawTileImage(
      tile: typingsSlinky.ol.tileMod.default,
      frameState: FrameState,
      layerState: State,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      gutter: Double,
      transition: Boolean
    ): Unit = js.native
    def getTile(
      z: Double,
      x: Double,
      y: Double,
      pixelRatio: Double,
      projection: typingsSlinky.ol.projProjectionMod.default
    ): typingsSlinky.ol.tileMod.default = js.native
    /* protected */ def getTileImage(tile: typingsSlinky.ol.tileMod.default): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    def handles(layer: typingsSlinky.ol.layerLayerMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasTileLayerRenderer {
    def this(tileLayer: typingsSlinky.ol.layerTileMod.default) = this()
    def this(tileLayer: typingsSlinky.ol.layerVectorTileMod.default) = this()
    def this(tileLayer: typingsSlinky.ol.layerTileMod.default, opt_noContext: Boolean) = this()
    def this(tileLayer: typingsSlinky.ol.layerVectorTileMod.default, opt_noContext: Boolean) = this()
  }
  
}

