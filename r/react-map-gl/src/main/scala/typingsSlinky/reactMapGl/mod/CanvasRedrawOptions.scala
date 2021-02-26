package typingsSlinky.reactMapGl.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRedrawOptions extends HTMLRedrawOptions {
  
  var ctx: CanvasRenderingContext2D = js.native
}
object CanvasRedrawOptions {
  
  @scala.inline
  def apply(
    ctx: CanvasRenderingContext2D,
    height: Double,
    project: js.Array[Double] => js.Array[Double],
    unproject: js.Array[Double] => js.Array[Double],
    width: Double
  ): CanvasRedrawOptions = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], project = js.Any.fromFunction1(project), unproject = js.Any.fromFunction1(unproject), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRedrawOptions]
  }
  
  @scala.inline
  implicit class CanvasRedrawOptionsMutableBuilder[Self <: CanvasRedrawOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
  }
}
