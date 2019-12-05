package typingsSlinky.ol

import typingsSlinky.ol.rendererWebglImageLayerMod.WebGLImageLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/webgl/ImageLayer", JSImport.Namespace)
@js.native
object rendererWebglImageLayerMod extends js.Object {
  @js.native
  trait WebGLImageLayerRenderer
    extends typingsSlinky.ol.rendererWebglLayerMod.default {
    def create(
      mapRenderer: typingsSlinky.ol.rendererMapMod.default,
      layer: typingsSlinky.ol.layerLayerMod.default
    ): WebGLImageLayerRenderer = js.native
    def handles(layer: typingsSlinky.ol.layerLayerMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends WebGLImageLayerRenderer {
    def this(
      mapRenderer: typingsSlinky.ol.rendererWebglMapMod.default,
      imageLayer: typingsSlinky.ol.layerImageMod.default
    ) = this()
  }
  
}

