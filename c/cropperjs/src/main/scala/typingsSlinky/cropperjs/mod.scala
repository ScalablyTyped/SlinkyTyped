package typingsSlinky.cropperjs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.cropperjs.Cropper.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cropperjs", JSImport.Default)
  @js.native
  class default protected () extends Cropper {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: HTMLCanvasElement, options: Options) = this()
    def this(element: HTMLImageElement, options: Options) = this()
  }
  object default {
    
    /* static member */
    @JSImport("cropperjs", "default.noConflict")
    @js.native
    def noConflict(): Cropper = js.native
    
    /* static member */
    @JSImport("cropperjs", "default.setDefaults")
    @js.native
    def setDefaults(options: Options): Unit = js.native
  }
}
