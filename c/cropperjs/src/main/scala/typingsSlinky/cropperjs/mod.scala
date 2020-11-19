package typingsSlinky.cropperjs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.cropperjs.Cropper.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cropperjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected () extends Cropper {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: HTMLCanvasElement, options: Options) = this()
    def this(element: HTMLImageElement, options: Options) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def noConflict(): Cropper = js.native
    
    def setDefaults(options: Options): Unit = js.native
  }
}
