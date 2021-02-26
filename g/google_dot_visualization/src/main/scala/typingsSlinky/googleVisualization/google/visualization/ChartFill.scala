package typingsSlinky.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartFill extends StObject {
  
  var fill: js.UndefOr[String] = js.native
}
object ChartFill {
  
  @scala.inline
  def apply(): ChartFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFill]
  }
  
  @scala.inline
  implicit class ChartFillMutableBuilder[Self <: ChartFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
