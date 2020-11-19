package typingsSlinky.ol.postProcessingPassMod

import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLPostProcessingPass extends js.Object {
  
  @JSName("apply")
  def apply(frameState: FrameState): Unit = js.native
  @JSName("apply")
  def apply(frameState: FrameState, nextPass: WebGLPostProcessingPass): Unit = js.native
  
  def getFrameBuffer(): WebGLFramebuffer = js.native
  
  def getGL(): WebGLRenderingContext = js.native
  
  def init(frameState: FrameState): Unit = js.native
}
