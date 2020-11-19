package typingsSlinky.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExplicitContentDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig): Self = this.set("explicitContentDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitContentDetectionConfig: Self = this.set("explicitContentDetectionConfig", js.undefined)
    
    @scala.inline
    def setLabelDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2LabelDetectionConfig): Self = this.set("labelDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDetectionConfig: Self = this.set("labelDetectionConfig", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setShotChangeDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig): Self = this.set("shotChangeDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotChangeDetectionConfig: Self = this.set("shotChangeDetectionConfig", js.undefined)
    
    @scala.inline
    def setSpeechTranscriptionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig): Self = this.set("speechTranscriptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechTranscriptionConfig: Self = this.set("speechTranscriptionConfig", js.undefined)
    
    @scala.inline
    def setTextDetectionConfig(value: SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig): Self = this.set("textDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDetectionConfig: Self = this.set("textDetectionConfig", js.undefined)
  }
}
