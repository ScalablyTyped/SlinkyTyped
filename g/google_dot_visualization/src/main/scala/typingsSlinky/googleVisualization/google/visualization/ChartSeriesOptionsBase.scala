package typingsSlinky.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesOptionsBase extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object ChartSeriesOptionsBase {
  
  @scala.inline
  def apply(): ChartSeriesOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesOptionsBase]
  }
  
  @scala.inline
  implicit class ChartSeriesOptionsBaseMutableBuilder[Self <: ChartSeriesOptionsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
