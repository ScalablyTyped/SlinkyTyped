package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioDescription extends js.Object {
  /**
    * Advanced audio normalization settings.
    */
  var AudioNormalizationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioNormalizationSettings] = js.native
  /**
    * The name of the AudioSelector used as the source for this AudioDescription.
    */
  var AudioSelectorName: string = js.native
  /**
    * Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
    */
  var AudioType: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioType] = js.native
  /**
    * Determines how audio type is determined.
    followInput: If the input contains an ISO 639 audioType, then that value is passed through to the output. If the input contains no ISO 639 audioType, the value in Audio Type is included in the output.
    useConfigured: The value in Audio Type is included in the output.
  Note that this field and audioType are both ignored if inputType is broadcasterMixedAd.
    */
  var AudioTypeControl: js.UndefOr[AudioDescriptionAudioTypeControl] = js.native
  /**
    * Audio codec settings.
    */
  var CodecSettings: js.UndefOr[AudioCodecSettings] = js.native
  /**
    * Indicates the language of the audio output track. Only used if languageControlMode is useConfigured, or there is no ISO 639 language code specified in the input.
    */
  var LanguageCode: js.UndefOr[stringMin3Max3] = js.native
  /**
    * Choosing followInput will cause the ISO 639 language code of the output to follow the ISO 639 language code of the input. The languageCode will be used when useConfigured is set, or when followInput is selected but there is no ISO 639 language code specified by the input.
    */
  var LanguageCodeControl: js.UndefOr[AudioDescriptionLanguageCodeControl] = js.native
  /**
    * The name of this AudioDescription. Outputs will use this name to uniquely identify this AudioDescription.  Description names should be unique within this Live Event.
    */
  var Name: string = js.native
  /**
    * Settings that control how input audio channels are remixed into the output audio channels.
    */
  var RemixSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.RemixSettings] = js.native
  /**
    * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director Commentary).
    */
  var StreamName: js.UndefOr[string] = js.native
}

object AudioDescription {
  @scala.inline
  def apply(AudioSelectorName: string, Name: string): AudioDescription = {
    val __obj = js.Dynamic.literal(AudioSelectorName = AudioSelectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDescription]
  }
  @scala.inline
  implicit class AudioDescriptionOps[Self <: AudioDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioSelectorName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioSelectorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioNormalizationSettings(value: AudioNormalizationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioNormalizationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioNormalizationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioNormalizationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioType(value: AudioType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioType")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioTypeControl(value: AudioDescriptionAudioTypeControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioTypeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTypeControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioTypeControl")(js.undefined)
        ret
    }
    @scala.inline
    def withCodecSettings(value: AudioCodecSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodecSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodecSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: stringMin3Max3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCodeControl(value: AudioDescriptionLanguageCodeControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCodeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCodeControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCodeControl")(js.undefined)
        ret
    }
    @scala.inline
    def withRemixSettings(value: RemixSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemixSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemixSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemixSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(js.undefined)
        ret
    }
  }
  
}

