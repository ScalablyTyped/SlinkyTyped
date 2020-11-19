package typingsSlinky.glTexture2d.mod

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.ndarray.mod.ndarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-texture2d", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(gl: WebGLRenderingContext, array: ndarray[Double]): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double]): Texture = js.native
  def apply(
    gl: WebGLRenderingContext,
    input: js.Tuple2[Double, Double],
    format: js.UndefOr[scala.Nothing],
    `type`: GLenum
  ): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum, `type`: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: InputType): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: InputType, format: js.UndefOr[scala.Nothing], `type`: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum, `type`: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: RawObject): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: RawObject, format: js.UndefOr[scala.Nothing], `type`: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum): Texture = js.native
  def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum, `type`: GLenum): Texture = js.native
}
