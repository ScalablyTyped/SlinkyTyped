package typingsSlinky.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of audio data to be recognized.
  */
@js.native
trait SchemaRecognitionMetadata extends js.Object {
  /**
    * Description of the content. Eg. &quot;Recordings of federal supreme court
    * hearings from 2012&quot;.
    */
  var audioTopic: js.UndefOr[String] = js.native
  /**
    * The industry vertical to which this speech recognition request most
    * closely applies. This is most indicative of the topics contained in the
    * audio.  Use the 6-digit NAICS code to identify the industry vertical -
    * see https://www.naics.com/search/.
    */
  var industryNaicsCodeOfAudio: js.UndefOr[Double] = js.native
  /**
    * The use case most closely describing the audio content to be recognized.
    */
  var interactionType: js.UndefOr[String] = js.native
  /**
    * The audio type that most closely describes the audio being recognized.
    */
  var microphoneDistance: js.UndefOr[String] = js.native
  /**
    * Obfuscated (privacy-protected) ID of the user, to identify number of
    * unique users using the service.
    */
  var obfuscatedId: js.UndefOr[String] = js.native
  /**
    * The original media the speech was recorded on.
    */
  var originalMediaType: js.UndefOr[String] = js.native
  /**
    * Mime type of the original audio file.  For example `audio/m4a`,
    * `audio/x-alaw-basic`, `audio/mp3`, `audio/3gpp`. A list of possible audio
    * mime types is maintained at
    * http://www.iana.org/assignments/media-types/media-types.xhtml#audio
    */
  var originalMimeType: js.UndefOr[String] = js.native
  /**
    * The device used to make the recording.  Examples &#39;Nexus 5X&#39; or
    * &#39;Polycom SoundStation IP 6000&#39; or &#39;POTS&#39; or
    * &#39;VoIP&#39; or &#39;Cardioid Microphone&#39;.
    */
  var recordingDeviceName: js.UndefOr[String] = js.native
  /**
    * The type of device the speech was recorded with.
    */
  var recordingDeviceType: js.UndefOr[String] = js.native
}

object SchemaRecognitionMetadata {
  @scala.inline
  def apply(): SchemaRecognitionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognitionMetadata]
  }
  @scala.inline
  implicit class SchemaRecognitionMetadataOps[Self <: SchemaRecognitionMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withIndustryNaicsCodeOfAudio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industryNaicsCodeOfAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndustryNaicsCodeOfAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industryNaicsCodeOfAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionType")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrophoneDistance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphoneDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrophoneDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphoneDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withObfuscatedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscatedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObfuscatedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscatedId")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordingDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordingDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDeviceType")(js.undefined)
        ret
    }
  }
  
}

