package typingsSlinky.plottable

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.plottable.canvasDrawerMod.CanvasDrawStep
import typingsSlinky.plottable.canvasDrawerMod.CanvasDrawer
import typingsSlinky.plottable.svgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleDrawerMod {
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleCanvasDrawStep")
  @js.native
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleCanvasDrawer")
  @js.native
  class RectangleCanvasDrawer protected () extends CanvasDrawer {
    def this(ctx: CanvasRenderingContext2D) = this()
  }
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleSVGDrawer")
  @js.native
  class RectangleSVGDrawer () extends SVGDrawer {
    def this(_rootClassName: String) = this()
    
    var _rootClassName: js.Any = js.native
  }
}
