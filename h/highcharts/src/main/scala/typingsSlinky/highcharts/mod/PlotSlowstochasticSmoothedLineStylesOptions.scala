package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSlowstochasticSmoothedLineStylesOptions extends StObject {
  
  /**
    * (Highstock) Color of the line. If not set, it's inherited from
    * plotOptions.stochastic.color.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.native
}
object PlotSlowstochasticSmoothedLineStylesOptions {
  
  @scala.inline
  def apply(): PlotSlowstochasticSmoothedLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSlowstochasticSmoothedLineStylesOptions]
  }
  
  @scala.inline
  implicit class PlotSlowstochasticSmoothedLineStylesOptionsMutableBuilder[Self <: PlotSlowstochasticSmoothedLineStylesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
