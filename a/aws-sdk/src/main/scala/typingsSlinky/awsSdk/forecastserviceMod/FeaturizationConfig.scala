package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeaturizationConfig extends StObject {
  
  /**
    * An array of featurization (transformation) information for the fields of a dataset.
    */
  var Featurizations: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Featurizations] = js.native
  
  /**
    * An array of dimension (field) names that specify how to group the generated forecast. For example, suppose that you are generating a forecast for item sales across all of your stores, and your dataset contains a store_id field. If you want the sales forecast for each item by store, you would specify store_id as the dimension. All forecast dimensions specified in the TARGET_TIME_SERIES dataset don't need to be specified in the CreatePredictor request. All forecast dimensions specified in the RELATED_TIME_SERIES dataset must be specified in the CreatePredictor request.
    */
  var ForecastDimensions: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ForecastDimensions] = js.native
  
  /**
    * The frequency of predictions in a forecast. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min" indicates every five minutes. The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency. When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset frequency.
    */
  var ForecastFrequency: Frequency = js.native
}
object FeaturizationConfig {
  
  @scala.inline
  def apply(ForecastFrequency: Frequency): FeaturizationConfig = {
    val __obj = js.Dynamic.literal(ForecastFrequency = ForecastFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturizationConfig]
  }
  
  @scala.inline
  implicit class FeaturizationConfigMutableBuilder[Self <: FeaturizationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeaturizations(value: Featurizations): Self = StObject.set(x, "Featurizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturizationsUndefined: Self = StObject.set(x, "Featurizations", js.undefined)
    
    @scala.inline
    def setFeaturizationsVarargs(value: Featurization*): Self = StObject.set(x, "Featurizations", js.Array(value :_*))
    
    @scala.inline
    def setForecastDimensions(value: ForecastDimensions): Self = StObject.set(x, "ForecastDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastDimensionsUndefined: Self = StObject.set(x, "ForecastDimensions", js.undefined)
    
    @scala.inline
    def setForecastDimensionsVarargs(value: Name*): Self = StObject.set(x, "ForecastDimensions", js.Array(value :_*))
    
    @scala.inline
    def setForecastFrequency(value: Frequency): Self = StObject.set(x, "ForecastFrequency", value.asInstanceOf[js.Any])
  }
}
