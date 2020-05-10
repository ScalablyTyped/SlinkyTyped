package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSubDestinationSettings extends js.Object {
  /**
    * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live subtitles and center-justify pre-recorded subtitles.  This option is not valid for source captions that are STL or 608/embedded.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var Alignment: js.UndefOr[DvbSubDestinationAlignment] = js.native
  /**
    * Specifies the color of the rectangle behind the captions.  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundColor: js.UndefOr[DvbSubDestinationBackgroundColor] = js.native
  /**
    * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundOpacity: js.UndefOr[integerMin0Max255] = js.native
  /**
    * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'.  Although the user can select output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid system. Using external fonts with these caption sources could cause unexpected display of proportional fonts.  All burn-in and DVB-Sub font settings must match.
    */
  var Font: js.UndefOr[InputLocation] = js.native
  /**
    * Specifies the color of the burned-in captions.  This option is not valid for source captions that are STL, 608/embedded or teletext.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var FontColor: js.UndefOr[DvbSubDestinationFontColor] = js.native
  /**
    * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.  All burn-in and DVB-Sub font settings must match.
    */
  var FontOpacity: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Font resolution in DPI (dots per inch); default is 96 dpi.  All burn-in and DVB-Sub font settings must match.
    */
  var FontResolution: js.UndefOr[integerMin96Max600] = js.native
  /**
    * When set to auto fontSize will scale depending on the size of the output.  Giving a positive integer will specify the exact font size in points.  All burn-in and DVB-Sub font settings must match.
    */
  var FontSize: js.UndefOr[string] = js.native
  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineColor: js.UndefOr[DvbSubDestinationOutlineColor] = js.native
  /**
    * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineSize: js.UndefOr[integerMin0Max10] = js.native
  /**
    * Specifies the color of the shadow cast by the captions.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowColor: js.UndefOr[DvbSubDestinationShadowColor] = js.native
  /**
    * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowOpacity: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowXOffset: js.UndefOr[integer] = js.native
  /**
    * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowYOffset: js.UndefOr[integer] = js.native
  /**
    * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in outputs.
    */
  var TeletextGridControl: js.UndefOr[DvbSubDestinationTeletextGridControl] = js.native
  /**
    * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is provided, the horizontal caption position will be determined by the alignment parameter.  This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var XPosition: js.UndefOr[integerMin0] = js.native
  /**
    * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the caption will be positioned towards the bottom of the output.  This option is not valid for source captions that are STL, 608/embedded or teletext.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var YPosition: js.UndefOr[integerMin0] = js.native
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
    def withAlignment(value: DvbSubDestinationAlignment): Self = {
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
    def withBackgroundColor(value: DvbSubDestinationBackgroundColor): Self = {
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
    def withFont(value: InputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontColor(value: DvbSubDestinationFontColor): Self = {
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
    def withFontSize(value: string): Self = {
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
    def withOutlineColor(value: DvbSubDestinationOutlineColor): Self = {
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
    def withShadowColor(value: DvbSubDestinationShadowColor): Self = {
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
    def withShadowXOffset(value: integer): Self = {
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
    def withShadowYOffset(value: integer): Self = {
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
    def withTeletextGridControl(value: DvbSubDestinationTeletextGridControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextGridControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeletextGridControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextGridControl")(js.undefined)
        ret
    }
    @scala.inline
    def withXPosition(value: integerMin0): Self = {
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
    def withYPosition(value: integerMin0): Self = {
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

