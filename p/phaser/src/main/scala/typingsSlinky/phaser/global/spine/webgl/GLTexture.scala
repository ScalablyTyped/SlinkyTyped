package typingsSlinky.phaser.global.spine.webgl

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.WebGLRenderingContext
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
}

