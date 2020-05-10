package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionDescriptionPreset extends js.Object {
  /**
    * Specify the language for this captions output track. For most captions output formats, the encoder puts this language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information when automatically selecting the font script for rendering the captions text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
    */
  var CustomLanguageCode: js.UndefOr[stringPatternAZaZ23AZaZ] = js.native
  /**
    * Specific settings required by destination type. Note that burnin_destination_settings are not available if the source of the caption data is Embedded or Teletext.
    */
  var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.native
  /**
    * Specify the language of this captions output track. For most captions output formats, the encoder puts this language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font language for rendering the captions text.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.LanguageCode] = js.native
  /**
    * Specify a label for this set of output captions. For example, "English", "Director commentary", or "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for display on the end-viewer's player device. For outputs in other output groups, the service ignores this setting.
    */
  var LanguageDescription: js.UndefOr[string] = js.native
}

object CaptionDescriptionPreset {
  @scala.inline
  def apply(): CaptionDescriptionPreset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionDescriptionPreset]
  }
  @scala.inline
  implicit class CaptionDescriptionPresetOps[Self <: CaptionDescriptionPreset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomLanguageCode(value: stringPatternAZaZ23AZaZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationSettings(value: CaptionDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
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
    def withLanguageDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageDescription")(js.undefined)
        ret
    }
  }
  
}

