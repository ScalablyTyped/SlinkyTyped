package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionDestinationSettings extends js.Object {
  /**
    * Burn-In Destination Settings.
    */
  var BurninDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.BurninDestinationSettings] = js.native
  /**
    * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
    */
  var DestinationType: js.UndefOr[CaptionDestinationType] = js.native
  /**
    * DVB-Sub Destination Settings
    */
  var DvbSubDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DvbSubDestinationSettings] = js.native
  /**
    * Settings specific to embedded/ancillary caption outputs, including 608/708 Channel destination number.
    */
  var EmbeddedDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.EmbeddedDestinationSettings] = js.native
  /**
    * Settings specific to IMSC caption outputs.
    */
  var ImscDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ImscDestinationSettings] = js.native
  /**
    * Settings for SCC caption output.
    */
  var SccDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.SccDestinationSettings] = js.native
  /**
    * Settings for Teletext caption output
    */
  var TeletextDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.TeletextDestinationSettings] = js.native
  /**
    * Settings specific to TTML caption outputs, including Pass style information (TtmlStylePassthrough).
    */
  var TtmlDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.TtmlDestinationSettings] = js.native
}

object CaptionDestinationSettings {
  @scala.inline
  def apply(): CaptionDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionDestinationSettings]
  }
  @scala.inline
  implicit class CaptionDestinationSettingsOps[Self <: CaptionDestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBurninDestinationSettings(value: BurninDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BurninDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBurninDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BurninDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationType(value: CaptionDestinationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationType")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbSubDestinationSettings(value: DvbSubDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSubDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDvbSubDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSubDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddedDestinationSettings(value: EmbeddedDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withImscDestinationSettings(value: ImscDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImscDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImscDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImscDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSccDestinationSettings(value: SccDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SccDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSccDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SccDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTeletextDestinationSettings(value: TeletextDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeletextDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTtmlDestinationSettings(value: TtmlDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TtmlDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtmlDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TtmlDestinationSettings")(js.undefined)
        ret
    }
  }
  
}

