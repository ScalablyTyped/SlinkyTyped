package typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation response. Included in the `response` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse extends js.Object {
  
  /**
    * Annotation results for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationResults: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationResults]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponseOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationResultsVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationResults*): Self = this.set("annotationResults", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationResults(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationResults]): Self = this.set("annotationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationResults: Self = this.set("annotationResults", js.undefined)
  }
}
