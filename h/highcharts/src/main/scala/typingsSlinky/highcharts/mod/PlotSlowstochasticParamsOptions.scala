package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSlowstochasticParamsOptions extends StObject {
  
  /**
    * (Highstock) Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].
    */
  var periods: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
}
object PlotSlowstochasticParamsOptions {
  
  @scala.inline
  def apply(): PlotSlowstochasticParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSlowstochasticParamsOptions]
  }
  
  @scala.inline
  implicit class PlotSlowstochasticParamsOptionsMutableBuilder[Self <: PlotSlowstochasticParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriods(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
  }
}
