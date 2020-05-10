package typingsSlinky.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video context and/or feature-specific parameters.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2VideoContext extends js.Object {
  /**
    * Config for EXPLICIT_CONTENT_DETECTION.
    */
  var explicitContentDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig] = js.native
  /**
    * Config for LABEL_DETECTION.
    */
  var labelDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2LabelDetectionConfig] = js.native
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video is
    * treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]] = js.native
  /**
    * Config for SHOT_CHANGE_DETECTION.
    */
  var shotChangeDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig] = js.native
  /**
    * Config for SPEECH_TRANSCRIPTION.
    */
  var speechTranscriptionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig] = js.native
  /**
    * Config for TEXT_DETECTION.
    */
  var textDetectionConfig: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2VideoContext {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2VideoContext]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2VideoContextOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2VideoContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicitContentDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig): Self = {
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
    def withLabelDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2LabelDetectionConfig): Self = {
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
    def withSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]): Self = {
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
    def withShotChangeDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig): Self = {
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
    def withSpeechTranscriptionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig): Self = {
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
    def withTextDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig): Self = {
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

