package typingsSlinky.ol.renderTargetMod

import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderTarget extends js.Object {
  def clearCachedData(): Unit
  def getFramebuffer(): WebGLFramebuffer
  def getSize(): js.Array[Double]
  def getTexture(): WebGLTexture
  def readAll(): scala.scalajs.js.typedarray.Uint8Array
  def readPixel(x: Double, y: Double): scala.scalajs.js.typedarray.Uint8Array
  def setSize(size: js.Array[Double]): Unit
}

object WebGLRenderTarget {
  @scala.inline
  def apply(
    clearCachedData: () => Unit,
    getFramebuffer: () => WebGLFramebuffer,
    getSize: () => js.Array[Double],
    getTexture: () => WebGLTexture,
    readAll: () => scala.scalajs.js.typedarray.Uint8Array,
    readPixel: (Double, Double) => scala.scalajs.js.typedarray.Uint8Array,
    setSize: js.Array[Double] => Unit
  ): WebGLRenderTarget = {
    val __obj = js.Dynamic.literal(clearCachedData = js.Any.fromFunction0(clearCachedData), getFramebuffer = js.Any.fromFunction0(getFramebuffer), getSize = js.Any.fromFunction0(getSize), getTexture = js.Any.fromFunction0(getTexture), readAll = js.Any.fromFunction0(readAll), readPixel = js.Any.fromFunction2(readPixel), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[WebGLRenderTarget]
  }
}

