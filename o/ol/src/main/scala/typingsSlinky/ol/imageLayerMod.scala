package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/ImageLayer", JSImport.Namespace)
@js.native
object imageLayerMod extends js.Object {
  @js.native
  trait CanvasImageLayerRenderer
    extends typingsSlinky.ol.canvasLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
    var image_ : typingsSlinky.ol.imageBaseMod.default = js.native
  }
  
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typingsSlinky.ol.imageMod.default) = this()
  }
  
}

