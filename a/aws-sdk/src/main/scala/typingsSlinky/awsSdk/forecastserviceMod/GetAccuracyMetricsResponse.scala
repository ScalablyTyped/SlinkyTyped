package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccuracyMetricsResponse extends StObject {
  
  /**
    * An array of results from evaluating the predictor.
    */
  var PredictorEvaluationResults: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.PredictorEvaluationResults] = js.native
}
object GetAccuracyMetricsResponse {
  
  @scala.inline
  def apply(): GetAccuracyMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccuracyMetricsResponse]
  }
  
  @scala.inline
  implicit class GetAccuracyMetricsResponseMutableBuilder[Self <: GetAccuracyMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredictorEvaluationResults(value: PredictorEvaluationResults): Self = StObject.set(x, "PredictorEvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorEvaluationResultsUndefined: Self = StObject.set(x, "PredictorEvaluationResults", js.undefined)
    
    @scala.inline
    def setPredictorEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "PredictorEvaluationResults", js.Array(value :_*))
  }
}
