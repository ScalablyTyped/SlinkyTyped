package typingsSlinky.phaser.global.spine.webgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.phaser.spine.ArrayLike
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
  /* CompleteClass */
  override var compile: js.Any = js.native
  /* CompleteClass */
  override var compileProgram: js.Any = js.native
  /* CompleteClass */
  override var compileShader: js.Any = js.native
  /* CompleteClass */
  override var context: js.Any = js.native
  /* CompleteClass */
  override var fragmentShader: js.Any = js.native
  /* CompleteClass */
  override var fs: js.Any = js.native
  /* CompleteClass */
  override var fsSource: js.Any = js.native
  /* CompleteClass */
  override var program: js.Any = js.native
  /* CompleteClass */
  override var tmp2x2: js.Any = js.native
  /* CompleteClass */
  override var tmp3x3: js.Any = js.native
  /* CompleteClass */
  override var tmp4x4: js.Any = js.native
  /* CompleteClass */
  override var vertexShader: js.Any = js.native
  /* CompleteClass */
  override var vs: js.Any = js.native
  /* CompleteClass */
  override var vsSource: js.Any = js.native
  /* CompleteClass */
  override def bind(): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getAttributeLocation(attribute: String): Double = js.native
  /* CompleteClass */
  override def getFragmentShader(): String = js.native
  /* CompleteClass */
  override def getFragmentSource(): String = js.native
  /* CompleteClass */
  override def getProgram(): WebGLProgram = js.native
  /* CompleteClass */
  override def getUniformLocation(uniform: String): WebGLUniformLocation = js.native
  /* CompleteClass */
  override def getVertexShader(): String = js.native
  /* CompleteClass */
  override def getVertexShaderSource(): String = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  /* CompleteClass */
  override def setUniform2f(uniform: String, value: Double, value2: Double): Unit = js.native
  /* CompleteClass */
  override def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  /* CompleteClass */
  override def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit = js.native
  /* CompleteClass */
  override def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  /* CompleteClass */
  override def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit = js.native
  /* CompleteClass */
  override def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit = js.native
  /* CompleteClass */
  override def setUniformf(uniform: String, value: Double): Unit = js.native
  /* CompleteClass */
  override def setUniformi(uniform: String, value: Double): Unit = js.native
  /* CompleteClass */
  override def unbind(): Unit = js.native
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

