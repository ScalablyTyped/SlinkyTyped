package typingsSlinky.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation response. Included in the `response` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse extends js.Object {
  /**
    * Annotation results for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationResults: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponseOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationResults(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationResults")(js.undefined)
        ret
    }
  }
  
}

