package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.renderWebglImageReplayMod.WebGLImageReplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/ImageReplay", JSImport.Namespace)
@js.native
object renderWebglImageReplayMod extends js.Object {
  @js.native
  trait WebGLImageReplay
    extends typingsSlinky.ol.renderWebglTextureReplayMod.default {
    var hitDetectionImages_ : js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement] = js.native
    var images_ : js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement] = js.native
  }
  
  @js.native
  class default protected () extends WebGLImageReplay {
    def this(tolerance: Double, maxExtent: Extent) = this()
  }
  
}

