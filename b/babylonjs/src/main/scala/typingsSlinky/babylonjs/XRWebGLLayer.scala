package typingsSlinky.babylonjs

import org.scalajs.dom.raw.WebGLFramebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withFramebuffer(value: WebGLFramebuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framebuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramebufferHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framebufferHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramebufferWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framebufferWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetViewport(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

