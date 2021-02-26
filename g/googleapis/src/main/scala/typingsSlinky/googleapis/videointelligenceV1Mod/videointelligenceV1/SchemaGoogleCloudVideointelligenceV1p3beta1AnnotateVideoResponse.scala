package typingsSlinky.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation response. Included in the `response` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse extends StObject {
  
  /**
    * Annotation results for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationResults: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponseMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationResults(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults]): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    @scala.inline
    def setAnnotationResultsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults*): Self = StObject.set(x, "annotationResults", js.Array(value :_*))
  }
}
