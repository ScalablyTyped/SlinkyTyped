package typingsSlinky.phaser.global.spine.webgl

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.spine.TextureFilter
import typingsSlinky.phaser.spine.TextureWrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.GLTexture")
@js.native
class GLTexture protected ()
  extends typingsSlinky.phaser.spine.webgl.GLTexture {
  def this(context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext, image: HTMLImageElement) = this()
  def this(context: WebGLRenderingContext, image: HTMLImageElement) = this()
  def this(
    context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext,
    image: HTMLImageElement,
    useMipMaps: Boolean
  ) = this()
  def this(context: WebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean) = this()
  /* CompleteClass */
  override var _image: HTMLImageElement = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  /* CompleteClass */
  override def setFilters(minFilter: TextureFilter, magFilter: TextureFilter): Unit = js.native
  /* CompleteClass */
  override def setWraps(uWrap: TextureWrap, vWrap: TextureWrap): Unit = js.native
}

