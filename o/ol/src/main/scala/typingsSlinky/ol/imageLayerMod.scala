package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageLayerMod {
  
  @JSImport("ol/renderer/canvas/ImageLayer", JSImport.Default)
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typingsSlinky.ol.imageMod.default) = this()
  }
  
  @js.native
  trait CanvasImageLayerRenderer
    extends typingsSlinky.ol.canvasLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
    
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    var image_ : typingsSlinky.ol.imageBaseMod.default = js.native
  }
}
