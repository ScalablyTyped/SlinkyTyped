package typingsSlinky.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Measurement extends StObject {
  
  /** Output only. Time that the trial has been running at the point of this measurement. */
  var elapsedTime: js.UndefOr[String] = js.native
  
  /** Provides a list of metrics that act as inputs into the objective function. */
  var metrics: js.UndefOr[js.Array[GoogleCloudMlV1MeasurementMetric]] = js.native
  
  /** The number of steps a machine learning model has been trained for. Must be non-negative. */
  var stepCount: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1Measurement {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Measurement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Measurement]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1MeasurementMutableBuilder[Self <: GoogleCloudMlV1Measurement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElapsedTime(value: String): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[GoogleCloudMlV1MeasurementMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: GoogleCloudMlV1MeasurementMetric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setStepCount(value: String): Self = StObject.set(x, "stepCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepCountUndefined: Self = StObject.set(x, "stepCount", js.undefined)
  }
}
