package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.canvas
import typingsSlinky.plottable.plottableStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas extends StObject {
  
  var canvas: typingsSlinky.plottable.plottableStrings.canvas = js.native
  
  var svg: typingsSlinky.plottable.plottableStrings.svg = js.native
}
object Canvas {
  
  @scala.inline
  def apply(canvas: canvas, svg: svg): Canvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  @scala.inline
  implicit class CanvasMutableBuilder[Self <: Canvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas(value: canvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvg(value: svg): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
  }
}
