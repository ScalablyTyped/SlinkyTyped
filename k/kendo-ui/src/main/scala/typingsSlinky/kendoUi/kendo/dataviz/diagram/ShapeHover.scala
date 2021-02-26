package typingsSlinky.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeHover extends StObject {
  
  var fill: js.UndefOr[String | ShapeHoverFill] = js.native
}
object ShapeHover {
  
  @scala.inline
  def apply(): ShapeHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeHover]
  }
  
  @scala.inline
  implicit class ShapeHoverMutableBuilder[Self <: ShapeHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | ShapeHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
