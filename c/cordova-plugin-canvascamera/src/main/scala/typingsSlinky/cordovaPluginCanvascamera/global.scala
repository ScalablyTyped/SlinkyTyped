package typingsSlinky.cordovaPluginCanvascamera

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class CanvasCamera ()
    extends typingsSlinky.cordovaPluginCanvascamera.CanvasCamera
  
  @js.native
  class Frame protected ()
    extends typingsSlinky.cordovaPluginCanvascamera.Frame {
    /* CompleteClass */
    override var dHeight: Double = js.native
    /* CompleteClass */
    override var dWidth: Double = js.native
    /* CompleteClass */
    override var dx: Double = js.native
    /* CompleteClass */
    override var dy: Double = js.native
    /* CompleteClass */
    override var element: HTMLCanvasElement = js.native
    /* CompleteClass */
    override var image: HTMLImageElement = js.native
    /* CompleteClass */
    override var sHeight: Double = js.native
    /* CompleteClass */
    override var sWidth: Double = js.native
    /* CompleteClass */
    override var sx: Double = js.native
    /* CompleteClass */
    override var sy: Double = js.native
    /* CompleteClass */
    override def initialize(): typingsSlinky.cordovaPluginCanvascamera.Frame = js.native
    /* CompleteClass */
    override def recycle(): Unit = js.native
  }
  
  @js.native
  class Renderer protected ()
    extends typingsSlinky.cordovaPluginCanvascamera.Renderer
  
}

