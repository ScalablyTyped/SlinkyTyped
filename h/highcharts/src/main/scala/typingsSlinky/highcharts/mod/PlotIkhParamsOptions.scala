package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotIkhParamsOptions extends StObject {
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for Senkou Span B calculations
    */
  var periodSenkouSpanB: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for Tenkan calculations.
    */
  var periodTenkan: js.UndefOr[Double] = js.native
}
object PlotIkhParamsOptions {
  
  @scala.inline
  def apply(): PlotIkhParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhParamsOptions]
  }
  
  @scala.inline
  implicit class PlotIkhParamsOptionsMutableBuilder[Self <: PlotIkhParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodSenkouSpanB(value: Double): Self = StObject.set(x, "periodSenkouSpanB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodSenkouSpanBUndefined: Self = StObject.set(x, "periodSenkouSpanB", js.undefined)
    
    @scala.inline
    def setPeriodTenkan(value: Double): Self = StObject.set(x, "periodTenkan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodTenkanUndefined: Self = StObject.set(x, "periodTenkan", js.undefined)
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
