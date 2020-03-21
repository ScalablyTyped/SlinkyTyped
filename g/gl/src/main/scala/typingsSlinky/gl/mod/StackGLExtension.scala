package typingsSlinky.gl.mod

import typingsSlinky.gl.glStrings.STACKGL_destroy_context
import typingsSlinky.gl.glStrings.STACKGL_resize_drawingbuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackGLExtension extends js.Object {
  @JSName("getExtension")
  def getExtension_STACKGLdestroycontext(extensionName: STACKGL_destroy_context): STACKGLDestroyContext | Null = js.native
  @JSName("getExtension")
  def getExtension_STACKGLresizedrawingbuffer(extensionName: STACKGL_resize_drawingbuffer): STACKGLResizeDrawingbuffer | Null = js.native
}

