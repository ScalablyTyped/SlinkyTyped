package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.imageStateMod.ImageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/ImageBase", JSImport.Namespace)
@js.native
object imageBaseMod extends js.Object {
  
  @js.native
  trait ImageBase
    extends typingsSlinky.ol.targetMod.default {
    
    /* protected */ def changed(): Unit = js.native
    
    var extent: Extent = js.native
    
    def getExtent(): Extent = js.native
    
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    def getPixelRatio(): Double = js.native
    
    def getResolution(): Double = js.native
    
    def getState(): ImageState = js.native
    
    /**
      * Load not yet loaded URI.
      */
    def load(): Unit = js.native
    
    var resolution: Double = js.native
    
    var state: ImageState = js.native
  }
  
  @js.native
  abstract class default protected () extends ImageBase {
    def this(extent: Extent, resolution: js.UndefOr[scala.Nothing], pixelRatio: Double, state: ImageState) = this()
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
  }
}
