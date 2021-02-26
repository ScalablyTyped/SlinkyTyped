package typingsSlinky.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1PredictionOutput extends StObject {
  
  /** The number of data instances which resulted in errors. */
  var errorCount: js.UndefOr[String] = js.native
  
  /** Node hours used by the batch prediction job. */
  var nodeHours: js.UndefOr[Double] = js.native
  
  /** The output Google Cloud Storage location provided at the job creation time. */
  var outputPath: js.UndefOr[String] = js.native
  
  /** The number of generated predictions. */
  var predictionCount: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1PredictionOutput {
  
  @scala.inline
  def apply(): GoogleCloudMlV1PredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1PredictionOutput]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1PredictionOutputMutableBuilder[Self <: GoogleCloudMlV1PredictionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    @scala.inline
    def setNodeHours(value: Double): Self = StObject.set(x, "nodeHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeHoursUndefined: Self = StObject.set(x, "nodeHours", js.undefined)
    
    @scala.inline
    def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    @scala.inline
    def setPredictionCount(value: String): Self = StObject.set(x, "predictionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionCountUndefined: Self = StObject.set(x, "predictionCount", js.undefined)
  }
}
