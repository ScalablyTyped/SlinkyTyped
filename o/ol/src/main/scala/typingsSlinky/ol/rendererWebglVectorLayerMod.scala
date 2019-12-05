package typingsSlinky.ol

import typingsSlinky.ol.rendererWebglVectorLayerMod.WebGLVectorLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/webgl/VectorLayer", JSImport.Namespace)
@js.native
object rendererWebglVectorLayerMod extends js.Object {
  @js.native
  trait WebGLVectorLayerRenderer
    extends typingsSlinky.ol.rendererWebglLayerMod.default {
    def create(
      mapRenderer: typingsSlinky.ol.rendererMapMod.default,
      layer: typingsSlinky.ol.layerLayerMod.default
    ): WebGLVectorLayerRenderer = js.native
    def handles(layer: typingsSlinky.ol.layerLayerMod.default): Boolean = js.native
    def renderFeature(
      feature: typingsSlinky.ol.featureMod.default,
      resolution: Double,
      pixelRatio: Double,
      styles: js.Array[typingsSlinky.ol.styleStyleMod.default],
      replayGroup: typingsSlinky.ol.renderWebglReplayGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsSlinky.ol.featureMod.default,
      resolution: Double,
      pixelRatio: Double,
      styles: typingsSlinky.ol.styleStyleMod.default,
      replayGroup: typingsSlinky.ol.renderWebglReplayGroupMod.default
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends WebGLVectorLayerRenderer {
    def this(
      mapRenderer: typingsSlinky.ol.rendererWebglMapMod.default,
      vectorLayer: typingsSlinky.ol.layerVectorMod.default
    ) = this()
  }
  
}

