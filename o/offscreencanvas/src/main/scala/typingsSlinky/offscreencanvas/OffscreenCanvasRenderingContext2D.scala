package typingsSlinky.offscreencanvas

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.CanvasCompositing
import typingsSlinky.std.CanvasDrawPath
import typingsSlinky.std.CanvasFillStrokeStyles
import typingsSlinky.std.CanvasFilters
import typingsSlinky.std.CanvasImageData
import typingsSlinky.std.CanvasImageSmoothing
import typingsSlinky.std.CanvasPath
import typingsSlinky.std.CanvasPathDrawingStyles
import typingsSlinky.std.CanvasRect
import typingsSlinky.std.CanvasShadowStyles
import typingsSlinky.std.CanvasState
import typingsSlinky.std.CanvasText
import typingsSlinky.std.CanvasTextDrawingStyles
import typingsSlinky.std.CanvasTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#offscreencanvasrenderingcontext2d
@js.native
trait OffscreenCanvasRenderingContext2D
  extends CanvasState
     with CanvasTransform
     with CanvasCompositing
     with CanvasImageSmoothing
     with CanvasFillStrokeStyles
     with CanvasShadowStyles
     with CanvasFilters
     with CanvasRect
     with CanvasDrawPath
     with CanvasText
     with CanvasDrawImage
     with CanvasImageData
     with CanvasPathDrawingStyles
     with CanvasTextDrawingStyles
     with CanvasPath {
  val canvas: OffscreenCanvas = js.native
}

@JSGlobal("OffscreenCanvasRenderingContext2D")
@js.native
object OffscreenCanvasRenderingContext2D extends Instantiable0[OffscreenCanvasRenderingContext2D]

