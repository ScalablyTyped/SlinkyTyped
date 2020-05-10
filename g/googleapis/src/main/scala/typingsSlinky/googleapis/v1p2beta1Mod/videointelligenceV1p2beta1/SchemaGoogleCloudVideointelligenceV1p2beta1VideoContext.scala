package typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video context and/or feature-specific parameters.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext extends js.Object {
  /**
    * Config for EXPLICIT_CONTENT_DETECTION.
    */
  var explicitContentDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig] = js.native
  /**
    * Config for LABEL_DETECTION.
    */
  var labelDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig] = js.native
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video is
    * treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment]] = js.native
  /**
    * Config for SHOT_CHANGE_DETECTION.
    */
  var shotChangeDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1ShotChangeDetectionConfig] = js.native
  /**
    * Config for SPEECH_TRANSCRIPTION.
    */
  var speechTranscriptionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscriptionConfig] = js.native
  /**
    * Config for TEXT_DETECTION.
    */
  var textDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1TextDetectionConfig] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1VideoContextOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1VideoContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicitContentDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitContentDetectionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitContentDetectionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitContentDetectionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1LabelDetectionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDetectionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDetectionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDetectionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withShotChangeDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1ShotChangeDetectionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotChangeDetectionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShotChangeDetectionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotChangeDetectionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeechTranscriptionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscriptionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechTranscriptionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechTranscriptionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechTranscriptionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1p2beta1TextDetectionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDetectionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDetectionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDetectionConfig")(js.undefined)
        ret
    }
  }
  
}

