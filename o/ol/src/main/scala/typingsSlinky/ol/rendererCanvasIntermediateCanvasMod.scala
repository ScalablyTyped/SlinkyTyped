package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/IntermediateCanvas", JSImport.Namespace)
@js.native
object rendererCanvasIntermediateCanvasMod extends js.Object {
  @js.native
  trait IntermediateCanvasRenderer
    extends typingsSlinky.ol.rendererCanvasLayerMod.default {
    var coordinateToCanvasPixelTransform: Transform = js.native
    def getImage(): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
    def getImageTransform(): Transform = js.native
  }
  
  @js.native
  class default protected () extends IntermediateCanvasRenderer {
    def this(layer: typingsSlinky.ol.layerLayerMod.default) = this()
  }
  
}

