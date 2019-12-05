package typingsSlinky.ol.webglContextMod

import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.std.HTMLCanvasElement
import typingsSlinky.std.HTMLImageElement
import typingsSlinky.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Context", "createTexture")
@js.native
object createTexture extends js.Object {
  def apply(gl: WebGLRenderingContext, image: HTMLCanvasElement): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLCanvasElement, opt_wrapS: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLCanvasElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLImageElement): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLImageElement, opt_wrapS: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLImageElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLVideoElement): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLVideoElement, opt_wrapS: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLVideoElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
}

