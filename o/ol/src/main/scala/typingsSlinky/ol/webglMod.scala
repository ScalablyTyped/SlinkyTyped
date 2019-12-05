package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl", JSImport.Namespace)
@js.native
object webglMod extends js.Object {
  val HAS: Boolean = js.native
  def getContext(canvas: HTMLCanvasElement): WebGLRenderingContext = js.native
  def getContext(canvas: HTMLCanvasElement, opt_attributes: js.Any): WebGLRenderingContext = js.native
}

