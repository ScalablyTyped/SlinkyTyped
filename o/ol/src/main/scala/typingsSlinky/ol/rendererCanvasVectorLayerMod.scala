package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.rendererCanvasVectorLayerMod.CanvasVectorLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorLayer", JSImport.Namespace)
@js.native
object rendererCanvasVectorLayerMod extends js.Object {
  @js.native
  trait CanvasVectorLayerRenderer
    extends typingsSlinky.ol.rendererCanvasLayerMod.default {
    def compose(context: CanvasRenderingContext2D, frameState: FrameState, layerState: State): Unit = js.native
    def create(
      mapRenderer: typingsSlinky.ol.rendererMapMod.default,
      layer: typingsSlinky.ol.layerLayerMod.default
    ): CanvasVectorLayerRenderer = js.native
    def handleFontsChanged_(event: typingsSlinky.ol.eventsEventMod.default): Unit = js.native
    def handles(layer: typingsSlinky.ol.layerLayerMod.default): Boolean = js.native
    def renderFeature(
      feature: typingsSlinky.ol.featureMod.default,
      resolution: Double,
      pixelRatio: Double,
      styles: js.Array[typingsSlinky.ol.styleStyleMod.default],
      replayGroup: typingsSlinky.ol.renderCanvasReplayGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsSlinky.ol.featureMod.default,
      resolution: Double,
      pixelRatio: Double,
      styles: typingsSlinky.ol.styleStyleMod.default,
      replayGroup: typingsSlinky.ol.renderCanvasReplayGroupMod.default
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorLayerRenderer {
    def this(vectorLayer: typingsSlinky.ol.layerVectorMod.default) = this()
  }
  
}

