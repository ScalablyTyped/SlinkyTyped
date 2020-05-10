package typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta2VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[GoogleRpcStatus] = js.native
  /** Explicit content annotation. */
  var explicitAnnotation: js.UndefOr[GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] = js.native
  /**
    * Label annotations on frame level.
    * There is exactly one element for each unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Label annotations on video level or user specified segment level.
    * There is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]] = js.native
  /**
    * Label annotations on shot level.
    * There is exactly one element for each unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
}

object GoogleCloudVideointelligenceV1beta2VideoAnnotationResults {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2VideoAnnotationResults]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2VideoAnnotationResultsOps[Self <: GoogleCloudVideointelligenceV1beta2VideoAnnotationResults] (val x: Self) extends AnyVal {
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
    def withExplicitAnnotation(value: GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameLabelAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameLabelAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameLabelAnnotations")(js.undefined)
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
    def withSegmentLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentLabelAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentLabelAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentLabelAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withShotAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]): Self = {
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
    @scala.inline
    def withShotLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotLabelAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShotLabelAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotLabelAnnotations")(js.undefined)
        ret
    }
  }
  
}

