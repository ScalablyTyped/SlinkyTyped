package typingsSlinky.ol.webglContextMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Context", JSImport.Default)
@js.native
class default protected () extends WebGLContext {
  def this(canvas: HTMLCanvasElement, gl: WebGLRenderingContext) = this()
}

