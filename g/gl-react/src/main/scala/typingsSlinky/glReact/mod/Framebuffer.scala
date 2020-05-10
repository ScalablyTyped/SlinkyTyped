package typingsSlinky.glReact.mod

import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Framebuffer extends js.Object {
  var color: WebGLTexture = js.native
  var handle: WebGLFramebuffer = js.native
  def bind(): Unit = js.native
  def dispose(): Unit = js.native
  def syncSize(w: Double, h: Double): Unit = js.native
}

object Framebuffer {
  @scala.inline
  def apply(
    bind: () => Unit,
    color: WebGLTexture,
    dispose: () => Unit,
    handle: WebGLFramebuffer,
    syncSize: (Double, Double) => Unit
  ): Framebuffer = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), handle = handle.asInstanceOf[js.Any], syncSize = js.Any.fromFunction2(syncSize))
    __obj.asInstanceOf[Framebuffer]
  }
  @scala.inline
  implicit class FramebufferOps[Self <: Framebuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColor(value: WebGLTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandle(value: WebGLFramebuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncSize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncSize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

