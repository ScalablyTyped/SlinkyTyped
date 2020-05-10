package typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress extends js.Object {
  /** Progress metadata for all videos specified in `AnnotateVideoRequest`. */
  var annotationProgress: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1VideoAnnotationProgress]] = js.native
}

object GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1AnnotateVideoProgressOps[Self <: GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationProgress(value: js.Array[GoogleCloudVideointelligenceV1beta1VideoAnnotationProgress]): Self = {
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

