package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/ImageCanvas", JSImport.Namespace)
@js.native
object olImageCanvasMod extends js.Object {
  
  @js.native
  trait ImageCanvas
    extends typingsSlinky.ol.imageBaseMod.default {
    
    /**
      * Get any error associated with asynchronous rendering.
      */
    def getError(): js.Error = js.native
  }
  
  @js.native
  class default protected () extends ImageCanvas {
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      canvas: HTMLCanvasElement,
      opt_loader: Loader
    ) = this()
  }
  
  type Loader = js.Function1[/* p0 */ js.Function1[/* p0 */ js.UndefOr[js.Error], Unit], Unit]
}
