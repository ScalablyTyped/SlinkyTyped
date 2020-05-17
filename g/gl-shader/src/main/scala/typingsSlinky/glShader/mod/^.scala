package typingsSlinky.glShader.mod

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.glShader.anon.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-shader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(gl: WebGLRenderingContext, options: Attributes): Shader = js.native
  def apply(gl: WebGLRenderingContext, vertex: String, fragment: String): Shader = js.native
  def apply(gl: WebGLRenderingContext, vertex: String, fragment: String, uniforms: js.Array[Parameter]): Shader = js.native
  def apply(
    gl: WebGLRenderingContext,
    vertex: String,
    fragment: String,
    uniforms: js.Array[Parameter],
    attributes: js.Array[Parameter]
  ): Shader = js.native
}

