package typingsSlinky.ol.renderTargetMod

import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLRenderTarget extends js.Object {
  def clearCachedData(): Unit = js.native
  def getFramebuffer(): WebGLFramebuffer = js.native
  def getSize(): js.Array[Double] = js.native
  def getTexture(): WebGLTexture = js.native
  def readAll(): js.typedarray.Uint8Array = js.native
  def readPixel(x: Double, y: Double): js.typedarray.Uint8Array = js.native
  def setSize(size: js.Array[Double]): Unit = js.native
}

object WebGLRenderTarget {
  @scala.inline
  def apply(
    clearCachedData: () => Unit,
    getFramebuffer: () => WebGLFramebuffer,
    getSize: () => js.Array[Double],
    getTexture: () => WebGLTexture,
    readAll: () => js.typedarray.Uint8Array,
    readPixel: (Double, Double) => js.typedarray.Uint8Array,
    setSize: js.Array[Double] => Unit
  ): WebGLRenderTarget = {
    val __obj = js.Dynamic.literal(clearCachedData = js.Any.fromFunction0(clearCachedData), getFramebuffer = js.Any.fromFunction0(getFramebuffer), getSize = js.Any.fromFunction0(getSize), getTexture = js.Any.fromFunction0(getTexture), readAll = js.Any.fromFunction0(readAll), readPixel = js.Any.fromFunction2(readPixel), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[WebGLRenderTarget]
  }
  @scala.inline
  implicit class WebGLRenderTargetOps[Self <: WebGLRenderTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearCachedData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCachedData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFramebuffer(value: () => WebGLFramebuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFramebuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTexture(value: () => WebGLTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTexture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadAll(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadPixel(value: (Double, Double) => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPixel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSize(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

