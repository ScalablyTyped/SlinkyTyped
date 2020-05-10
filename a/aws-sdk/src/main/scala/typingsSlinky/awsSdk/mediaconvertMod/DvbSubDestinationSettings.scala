package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSubDestinationSettings extends js.Object {
  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var Alignment: js.UndefOr[DvbSubtitleAlignment] = js.native
  /**
    * Specifies the color of the rectangle behind the captions.
  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.native
  /**
    * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundOpacity: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var FontColor: js.UndefOr[DvbSubtitleFontColor] = js.native
  /**
    * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
  All burn-in and DVB-Sub font settings must match.
    */
  var FontOpacity: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Font resolution in DPI (dots per inch); default is 96 dpi.
  All burn-in and DVB-Sub font settings must match.
    */
  var FontResolution: js.UndefOr[integerMin96Max600] = js.native
  /**
    * Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset. This is used to help determine the appropriate font for rendering DVB-Sub captions.
    */
  var FontScript: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.FontScript] = js.native
  /**
    * A positive integer indicates the exact font size in points. Set to 0 for automatic font size selection. All burn-in and DVB-Sub font settings must match.
    */
  var FontSize: js.UndefOr[integerMin0Max96] = js.native
  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.native
  /**
    * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineSize: js.UndefOr[integerMin0Max10] = js.native
  /**
    * Specifies the color of the shadow cast by the captions.
  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.native
  /**
    * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
    */
  var ShadowOpacity: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
    */
  var ShadowXOffset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
    */
  var ShadowYOffset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
    */
  var SubtitlingType: js.UndefOr[DvbSubtitlingType] = js.native
  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.native
  /**
    * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit x_position is provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var XPosition: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is provided, the caption will be positioned towards the bottom of the output. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var YPosition: js.UndefOr[integerMin0Max2147483647] = js.native
}

object DvbSubDestinationSettings {
  @scala.inline
  def apply(): DvbSubDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSubDestinationSettings]
  }
  @scala.inline
  implicit class DvbSubDestinationSettingsOps[Self <: DvbSubDestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: DvbSubtitleAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: DvbSubtitleBackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundOpacity(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackgroundOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackgroundOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFontColor(value: DvbSubtitleFontColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontOpacity(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFontResolution(value: integerMin96Max600): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withFontScript(value: FontScript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontScript")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: integerMin0Max96): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: DvbSubtitleOutlineColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineSize(value: integerMin0Max10): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutlineSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutlineSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: DvbSubtitleShadowColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOpacity(value: integerMin0Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowXOffset(value: integerMinNegative2147483648Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowXOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowXOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowXOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowYOffset(value: integerMinNegative2147483648Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowYOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowYOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowYOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitlingType(value: DvbSubtitlingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubtitlingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitlingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubtitlingType")(js.undefined)
        ret
    }
    @scala.inline
    def withTeletextSpacing(value: DvbSubtitleTeletextSpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeletextSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withXPosition(value: integerMin0Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withYPosition(value: integerMin0Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YPosition")(js.undefined)
        ret
    }
  }
  
}

