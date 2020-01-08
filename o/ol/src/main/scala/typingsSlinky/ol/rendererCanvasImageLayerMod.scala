package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/ImageLayer", JSImport.Namespace)
@js.native
object rendererCanvasImageLayerMod extends js.Object {
  @js.native
  trait CanvasImageLayerRenderer
    extends typingsSlinky.ol.rendererCanvasIntermediateCanvasMod.default {
    def create(
      mapRenderer: typingsSlinky.ol.rendererMapMod.default,
      layer: typingsSlinky.ol.layerLayerMod.default
    ): CanvasImageLayerRenderer = js.native
    def handles(layer: typingsSlinky.ol.layerLayerMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typingsSlinky.ol.layerImageMod.default) = this()
    def this(imageLayer: typingsSlinky.ol.layerVectorMod.default) = this()
  }
  
}

