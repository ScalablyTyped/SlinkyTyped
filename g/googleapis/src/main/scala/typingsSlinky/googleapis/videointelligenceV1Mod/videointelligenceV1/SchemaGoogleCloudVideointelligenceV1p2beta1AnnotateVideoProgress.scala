package typingsSlinky.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation progress. Included in the `metadata` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress extends js.Object {
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgressOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1AnnotateVideoProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationProgress(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]): Self = {
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

