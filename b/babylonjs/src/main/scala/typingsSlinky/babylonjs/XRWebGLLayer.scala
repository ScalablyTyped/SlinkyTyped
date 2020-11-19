package typingsSlinky.babylonjs

import org.scalajs.dom.raw.WebGLFramebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRWebGLLayer extends js.Object {
  
  var framebuffer: WebGLFramebuffer = js.native
  
  var framebufferHeight: Double = js.native
  
  var framebufferWidth: Double = js.native
  
  var getViewport: js.Function = js.native
}
object XRWebGLLayer {
  
  @scala.inline
  def apply(
    framebuffer: WebGLFramebuffer,
    framebufferHeight: Double,
    framebufferWidth: Double,
    getViewport: js.Function
  ): XRWebGLLayer = {
    val __obj = js.Dynamic.literal(framebuffer = framebuffer.asInstanceOf[js.Any], framebufferHeight = framebufferHeight.asInstanceOf[js.Any], framebufferWidth = framebufferWidth.asInstanceOf[js.Any], getViewport = getViewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRWebGLLayer]
  }
  
  @scala.inline
  implicit class XRWebGLLayerOps[Self <: XRWebGLLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFramebuffer(value: WebGLFramebuffer): Self = this.set("framebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferHeight(value: Double): Self = this.set("framebufferHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferWidth(value: Double): Self = this.set("framebufferWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetViewport(value: js.Function): Self = this.set("getViewport", value.asInstanceOf[js.Any])
  }
}
