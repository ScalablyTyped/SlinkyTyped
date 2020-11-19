package typingsSlinky.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation progress. Included in the `metadata` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress extends js.Object {
  
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgressOps[Self <: SchemaGoogleCloudVideointelligenceV1p1beta1AnnotateVideoProgress] (val x: Self) extends AnyVal {
    
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
    def setAnnotationProgressVarargs(value: SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress*): Self = this.set("annotationProgress", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress]): Self = this.set("annotationProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationProgress: Self = this.set("annotationProgress", js.undefined)
  }
}
