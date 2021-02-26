package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions extends StObject {
  
  /**
    * Minimum [intersection-over-union (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union) required for 2 bounding boxes to be considered a match. This must be a
    * number between 0 and 1.
    */
  var iouThreshold: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIouThreshold(value: Double): Self = StObject.set(x, "iouThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIouThresholdUndefined: Self = StObject.set(x, "iouThreshold", js.undefined)
  }
}
