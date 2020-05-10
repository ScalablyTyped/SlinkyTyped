package typingsSlinky.ol

import typingsSlinky.ol.projMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorLayer", JSImport.Namespace)
@js.native
object vectorLayerMod extends js.Object {
  @js.native
  trait CanvasVectorLayerRenderer
    extends typingsSlinky.ol.canvasLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
    def renderFeature(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typingsSlinky.ol.styleStyleMod.default],
      builderGroup: typingsSlinky.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typingsSlinky.ol.styleStyleMod.default],
      builderGroup: typingsSlinky.ol.builderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
    def renderFeature(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: typingsSlinky.ol.styleStyleMod.default,
      builderGroup: typingsSlinky.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: typingsSlinky.ol.styleStyleMod.default,
      builderGroup: typingsSlinky.ol.builderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorLayerRenderer {
    def this(vectorLayer: typingsSlinky.ol.vectorMod.default) = this()
  }
  
}

