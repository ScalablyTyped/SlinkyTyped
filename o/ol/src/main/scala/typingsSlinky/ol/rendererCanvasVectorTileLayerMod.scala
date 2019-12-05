package typingsSlinky.ol

import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.rendererCanvasVectorTileLayerMod.CanvasVectorTileLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Namespace)
@js.native
object rendererCanvasVectorTileLayerMod extends js.Object {
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typingsSlinky.ol.rendererCanvasTileLayerMod.default {
    def handleFontsChanged_(event: typingsSlinky.ol.eventsEventMod.default): Unit = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typingsSlinky.ol.styleStyleMod.default],
      replayGroup: typingsSlinky.ol.renderCanvasReplayGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typingsSlinky.ol.styleStyleMod.default,
      replayGroup: typingsSlinky.ol.renderCanvasReplayGroupMod.default
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorTileLayerRenderer {
    def this(layer: typingsSlinky.ol.layerVectorTileMod.default) = this()
  }
  
}

