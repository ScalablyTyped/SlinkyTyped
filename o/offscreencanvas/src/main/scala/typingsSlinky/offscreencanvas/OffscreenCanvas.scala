package typingsSlinky.offscreencanvas

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.offscreencanvas.offscreencanvasStrings.`2d`
import typingsSlinky.offscreencanvas.offscreencanvasStrings.bitmaprenderer
import typingsSlinky.offscreencanvas.offscreencanvasStrings.webgl
import typingsSlinky.offscreencanvas.offscreencanvasStrings.webgl2
import typingsSlinky.std.CanvasRenderingContext2DSettings
import typingsSlinky.std.EventTarget
import typingsSlinky.std.ImageBitmap
import typingsSlinky.std.ImageBitmapRenderingContext
import typingsSlinky.std.WebGL2RenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#the-offscreencanvas-interface
// Possible contextId values are defined by the enum OffscreenRenderingContextId { "2d", "bitmaprenderer", "webgl", "webgl2" }
// See also description: https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext
@js.native
trait OffscreenCanvas extends EventTarget {
  var height: Double = js.native
  var width: Double = js.native
  def convertToBlob(): js.Promise[Blob] = js.native
  def convertToBlob(options: AnonQuality): js.Promise[Blob] = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): OffscreenCanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`, contextAttributes: CanvasRenderingContext2DSettings): OffscreenCanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: bitmaprenderer): ImageBitmapRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: bitmaprenderer, contextAttributes: WebGLContextAttributes): ImageBitmapRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl, contextAttributes: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2, contextAttributes: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
  def transferToImageBitmap(): ImageBitmap = js.native
}

@JSGlobal("OffscreenCanvas")
@js.native
object OffscreenCanvas extends Instantiable2[/* width */ Double, /* height */ Double, OffscreenCanvas]

