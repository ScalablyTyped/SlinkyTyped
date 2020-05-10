package typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[GoogleRpcStatus] = js.native
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  /** Label annotations. There is exactly one element for each unique label. */
  var labelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1LabelAnnotation]] = js.native
  /** Safe search annotations. */
  var safeSearchAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation]] = js.native
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]] = js.native
}

object GoogleCloudVideointelligenceV1beta1VideoAnnotationResults {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1VideoAnnotationResults]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1VideoAnnotationResultsOps[Self <: GoogleCloudVideointelligenceV1beta1VideoAnnotationResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: GoogleRpcStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withInputUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUri")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta1LabelAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeSearchAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearchAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeSearchAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearchAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withShotAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShotAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotAnnotations")(js.undefined)
        ret
    }
  }
  
}

