package typingsSlinky.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotation results for a single video.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.native
  /**
    * Explicit content annotation.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] = js.native
  /**
    * Label annotations on frame level. There is exactly one element for each
    * unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  /**
    * Video file location in [Google Cloud
    * Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Annotations for list of objects detected and tracked in video.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation]] = js.native
  /**
    * Label annotations on video level or user specified segment level. There
    * is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  /**
    * Shot annotations. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]] = js.native
  /**
    * Label annotations on shot level. There is exactly one element for each
    * unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  /**
    * Speech transcription.
    */
  var speechTranscriptions: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscription]] = js.native
  /**
    * OCR text detection and tracking. Annotations for list of detected text
    * snippets. Each will have list of frame information associated with it.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2TextAnnotation]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResultsOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: SchemaGoogleRpcStatus): Self = {
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
    def withExplicitAnnotation(value: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation): Self = {
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
    def withFrameLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = {
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
    def withObjectAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = {
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
    def withShotAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]): Self = {
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
    def withShotLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = {
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
    @scala.inline
    def withSpeechTranscriptions(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechTranscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechTranscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechTranscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2TextAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnnotations")(js.undefined)
        ret
    }
  }
  
}

