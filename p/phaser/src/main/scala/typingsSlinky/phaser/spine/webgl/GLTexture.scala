package typingsSlinky.phaser.spine.webgl

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.spine.Disposable
import typingsSlinky.phaser.spine.Restorable
import typingsSlinky.phaser.spine.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.GLTexture")
@js.native
class GLTexture protected ()
  extends Texture
     with Disposable
     with Restorable {
  def this(context: ManagedWebGLRenderingContext, image: HTMLImageElement) = this()
  def this(context: WebGLRenderingContext, image: HTMLImageElement) = this()
  def this(context: ManagedWebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean) = this()
  def this(context: WebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean) = this()
  var boundUnit: js.Any = js.native
  var context: js.Any = js.native
  var texture: js.Any = js.native
  var useMipMaps: js.Any = js.native
  def bind(): Unit = js.native
  def bind(unit: Double): Unit = js.native
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  def unbind(): Unit = js.native
  def update(useMipMaps: Boolean): Unit = js.native
}

