package typingsSlinky.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridLineOptionsWithAxis extends GridLineOptions {
  
  var axis: js.UndefOr[AxisName] = js.native
}
object GridLineOptionsWithAxis {
  
  @scala.inline
  def apply(value: String | Double | js.Date): GridLineOptionsWithAxis = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptionsWithAxis]
  }
  
  @scala.inline
  implicit class GridLineOptionsWithAxisMutableBuilder[Self <: GridLineOptionsWithAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: AxisName): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
  }
}
