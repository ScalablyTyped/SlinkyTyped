package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotScatterJitterOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) The maximal X offset for the random jitter
    * effect.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The maximal Y offset for the random jitter
    * effect.
    */
  var y: js.UndefOr[Double] = js.native
}
object PlotScatterJitterOptions {
  
  @scala.inline
  def apply(): PlotScatterJitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatterJitterOptions]
  }
  
  @scala.inline
  implicit class PlotScatterJitterOptionsMutableBuilder[Self <: PlotScatterJitterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
