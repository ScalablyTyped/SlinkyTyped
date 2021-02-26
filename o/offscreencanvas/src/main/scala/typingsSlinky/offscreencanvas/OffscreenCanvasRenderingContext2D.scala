package typingsSlinky.offscreencanvas

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
