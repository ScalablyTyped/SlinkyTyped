package typingsSlinky.ol.renderTargetMod

import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/RenderTarget", JSImport.Default)
@js.native
class default protected () extends WebGLRenderTarget {
  def this(helper: typingsSlinky.ol.helperMod.default) = this()
  def this(helper: typingsSlinky.ol.helperMod.default, opt_size: js.Array[Double]) = this()
  /* CompleteClass */
  override def clearCachedData(): Unit = js.native
  /* CompleteClass */
  override def getFramebuffer(): WebGLFramebuffer = js.native
  /* CompleteClass */
  override def getSize(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getTexture(): WebGLTexture = js.native
  /* CompleteClass */
  override def readAll(): scala.scalajs.js.typedarray.Uint8Array = js.native
  /* CompleteClass */
  override def readPixel(x: Double, y: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  /* CompleteClass */
  override def setSize(size: js.Array[Double]): Unit = js.native
}

