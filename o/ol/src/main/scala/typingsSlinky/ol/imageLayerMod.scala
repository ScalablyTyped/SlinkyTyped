package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/renderer/canvas/ImageLayer", JSImport.Namespace)
@js.native
object imageLayerMod extends js.Object {
  
  @js.native
  trait CanvasImageLayerRenderer
    extends typingsSlinky.ol.canvasLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
    
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    var image_ : typingsSlinky.ol.imageBaseMod.default = js.native
  }
  
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typingsSlinky.ol.imageMod.default) = this()
  }
}
