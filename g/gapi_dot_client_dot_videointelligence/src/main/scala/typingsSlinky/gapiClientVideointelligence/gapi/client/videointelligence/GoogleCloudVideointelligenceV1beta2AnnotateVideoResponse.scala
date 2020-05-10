package typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta2AnnotateVideoResponse extends js.Object {
  /** Annotation results for all videos specified in `AnnotateVideoRequest`. */
  var annotationResults: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2VideoAnnotationResults]] = js.native
}

object GoogleCloudVideointelligenceV1beta2AnnotateVideoResponse {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2AnnotateVideoResponse]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2AnnotateVideoResponseOps[Self <: GoogleCloudVideointelligenceV1beta2AnnotateVideoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationResults(value: js.Array[GoogleCloudVideointelligenceV1beta2VideoAnnotationResults]): Self = {
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

