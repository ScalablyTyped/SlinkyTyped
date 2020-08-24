package typingsSlinky.phaser.global.spine.webgl

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Shader")
@js.native
class Shader protected ()
  extends typingsSlinky.phaser.spine.webgl.Shader {
  def this(
    context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext,
    vertexShader: String,
    fragmentShader: String
  ) = this()
  def this(context: WebGLRenderingContext, vertexShader: String, fragmentShader: String) = this()
}

/* static members */
@JSGlobal("spine.webgl.Shader")
@js.native
object Shader extends js.Object {
  var COLOR: String = js.native
  var COLOR2: String = js.native
  var MVP_MATRIX: String = js.native
  var POSITION: String = js.native
  var SAMPLER: String = js.native
  var TEXCOORDS: String = js.native
  def newColored(context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext): typingsSlinky.phaser.spine.webgl.Shader = js.native
  def newColored(context: WebGLRenderingContext): typingsSlinky.phaser.spine.webgl.Shader = js.native
  def newColoredTextured(context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext): typingsSlinky.phaser.spine.webgl.Shader = js.native
  def newColoredTextured(context: WebGLRenderingContext): typingsSlinky.phaser.spine.webgl.Shader = js.native
  def newTwoColoredTextured(context: typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext): typingsSlinky.phaser.spine.webgl.Shader = js.native
  def newTwoColoredTextured(context: WebGLRenderingContext): typingsSlinky.phaser.spine.webgl.Shader = js.native
}

