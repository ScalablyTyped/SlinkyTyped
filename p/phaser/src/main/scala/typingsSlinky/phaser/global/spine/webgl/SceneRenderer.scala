package typingsSlinky.phaser.global.spine.webgl

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.SceneRenderer")
@js.native
class SceneRenderer protected ()
  extends typingsSlinky.phaser.spine.webgl.SceneRenderer {
  def this(canvas: HTMLCanvasElement, context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
  def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext) = this()
  def this(
    canvas: HTMLCanvasElement,
    context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext,
    twoColorTint: Boolean
  ) = this()
  def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext, twoColorTint: Boolean) = this()
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

