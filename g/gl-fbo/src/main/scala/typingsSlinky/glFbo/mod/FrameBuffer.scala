package typingsSlinky.glFbo.mod

import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameBuffer extends js.Object {
  var color: js.Array[Texture] = js.native
  var depth: Texture | Null = js.native
  var gl: WebGLRenderingContext = js.native
  var handle: WebGLFramebuffer = js.native
  var shape: js.Tuple2[Double, Double] = js.native
  def bind(): Unit = js.native
  def dispose(): Unit = js.native
}

object FrameBuffer {
  @scala.inline
  def apply(
    bind: () => Unit,
    color: js.Array[Texture],
    dispose: () => Unit,
    gl: WebGLRenderingContext,
    handle: WebGLFramebuffer,
    shape: js.Tuple2[Double, Double]
  ): FrameBuffer = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gl = gl.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBuffer]
  }
  @scala.inline
  implicit class FrameBufferOps[Self <: FrameBuffer] (val x: Self) extends AnyVal {
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
    def withColor(value: js.Array[Texture]): Self = {
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
    def withGl(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: WebGLFramebuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(null)
        ret
    }
  }
  
}

