package typingsSlinky.glShader.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLShader
import typingsSlinky.glShader.anon.Fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader extends js.Object {
  val attributes: StringDictionary[Attribute with js.Array[_]] = js.native
  val fragShader: WebGLShader = js.native
  val gl: WebGLRenderingContext = js.native
  val program: WebGLProgram = js.native
  var uniforms: StringDictionary[js.Any] = js.native
  val vertShader: WebGLShader = js.native
  def bind(): Unit = js.native
  def dispose(): Unit = js.native
  def update(obj: Fragment): Unit = js.native
  def update(vertex: String, fragment: String): Unit = js.native
  def update(vertex: String, fragment: String, uniforms: js.Array[Parameter]): Unit = js.native
  def update(vertex: String, fragment: String, uniforms: js.Array[Parameter], attributes: js.Array[Parameter]): Unit = js.native
}

