package typingsSlinky.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation progress. Included in the `metadata` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress extends js.Object {
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationProgress]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgressOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationProgress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationProgress")(js.undefined)
        ret
    }
  }
  
}

