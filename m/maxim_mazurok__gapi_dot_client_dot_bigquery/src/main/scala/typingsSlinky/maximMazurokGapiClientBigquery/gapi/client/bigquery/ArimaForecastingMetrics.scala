package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArimaForecastingMetrics extends StObject {
  
  /** Arima model fitting metrics. */
  var arimaFittingMetrics: js.UndefOr[js.Array[ArimaFittingMetrics]] = js.native
  
  /** Repeated as there can be many metric sets (one for each model) in auto-arima and the large-scale case. */
  var arimaSingleModelForecastingMetrics: js.UndefOr[js.Array[ArimaSingleModelForecastingMetrics]] = js.native
  
  /** Whether Arima model fitted with drift or not. It is always false when d is not 1. */
  var hasDrift: js.UndefOr[js.Array[Boolean]] = js.native
  
  /** Non-seasonal order. */
  var nonSeasonalOrder: js.UndefOr[js.Array[ArimaOrder]] = js.native
  
  /** Seasonal periods. Repeated because multiple periods are supported for one time series. */
  var seasonalPeriods: js.UndefOr[js.Array[String]] = js.native
  
  /** Id to differentiate different time series for the large-scale case. */
  var timeSeriesId: js.UndefOr[js.Array[String]] = js.native
}
object ArimaForecastingMetrics {
  
  @scala.inline
  def apply(): ArimaForecastingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaForecastingMetrics]
  }
  
  @scala.inline
  implicit class ArimaForecastingMetricsMutableBuilder[Self <: ArimaForecastingMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArimaFittingMetrics(value: js.Array[ArimaFittingMetrics]): Self = StObject.set(x, "arimaFittingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArimaFittingMetricsUndefined: Self = StObject.set(x, "arimaFittingMetrics", js.undefined)
    
    @scala.inline
    def setArimaFittingMetricsVarargs(value: ArimaFittingMetrics*): Self = StObject.set(x, "arimaFittingMetrics", js.Array(value :_*))
    
    @scala.inline
    def setArimaSingleModelForecastingMetrics(value: js.Array[ArimaSingleModelForecastingMetrics]): Self = StObject.set(x, "arimaSingleModelForecastingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArimaSingleModelForecastingMetricsUndefined: Self = StObject.set(x, "arimaSingleModelForecastingMetrics", js.undefined)
    
    @scala.inline
    def setArimaSingleModelForecastingMetricsVarargs(value: ArimaSingleModelForecastingMetrics*): Self = StObject.set(x, "arimaSingleModelForecastingMetrics", js.Array(value :_*))
    
    @scala.inline
    def setHasDrift(value: js.Array[Boolean]): Self = StObject.set(x, "hasDrift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDriftUndefined: Self = StObject.set(x, "hasDrift", js.undefined)
    
    @scala.inline
    def setHasDriftVarargs(value: Boolean*): Self = StObject.set(x, "hasDrift", js.Array(value :_*))
    
    @scala.inline
    def setNonSeasonalOrder(value: js.Array[ArimaOrder]): Self = StObject.set(x, "nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSeasonalOrderUndefined: Self = StObject.set(x, "nonSeasonalOrder", js.undefined)
    
    @scala.inline
    def setNonSeasonalOrderVarargs(value: ArimaOrder*): Self = StObject.set(x, "nonSeasonalOrder", js.Array(value :_*))
    
    @scala.inline
    def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    @scala.inline
    def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value :_*))
    
    @scala.inline
    def setTimeSeriesId(value: js.Array[String]): Self = StObject.set(x, "timeSeriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesIdUndefined: Self = StObject.set(x, "timeSeriesId", js.undefined)
    
    @scala.inline
    def setTimeSeriesIdVarargs(value: String*): Self = StObject.set(x, "timeSeriesId", js.Array(value :_*))
  }
}
