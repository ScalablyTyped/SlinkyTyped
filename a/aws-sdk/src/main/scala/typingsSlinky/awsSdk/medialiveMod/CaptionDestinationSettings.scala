package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionDestinationSettings extends js.Object {
  var AribDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AribDestinationSettings] = js.native
  var BurnInDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.BurnInDestinationSettings] = js.native
  var DvbSubDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.DvbSubDestinationSettings] = js.native
  var EmbeddedDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.EmbeddedDestinationSettings] = js.native
  var EmbeddedPlusScte20DestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.EmbeddedPlusScte20DestinationSettings] = js.native
  var RtmpCaptionInfoDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.RtmpCaptionInfoDestinationSettings] = js.native
  var Scte20PlusEmbeddedDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Scte20PlusEmbeddedDestinationSettings] = js.native
  var Scte27DestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Scte27DestinationSettings] = js.native
  var SmpteTtDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.SmpteTtDestinationSettings] = js.native
  var TeletextDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.TeletextDestinationSettings] = js.native
  var TtmlDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.TtmlDestinationSettings] = js.native
  var WebvttDestinationSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.WebvttDestinationSettings] = js.native
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
    def withAribDestinationSettings(value: AribDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AribDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAribDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AribDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withBurnInDestinationSettings(value: BurnInDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BurnInDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBurnInDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BurnInDestinationSettings")(js.undefined)
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
    def withEmbeddedPlusScte20DestinationSettings(value: EmbeddedPlusScte20DestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedPlusScte20DestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedPlusScte20DestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedPlusScte20DestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRtmpCaptionInfoDestinationSettings(value: RtmpCaptionInfoDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RtmpCaptionInfoDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtmpCaptionInfoDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RtmpCaptionInfoDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScte20PlusEmbeddedDestinationSettings(value: Scte20PlusEmbeddedDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte20PlusEmbeddedDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte20PlusEmbeddedDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte20PlusEmbeddedDestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScte27DestinationSettings(value: Scte27DestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte27DestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte27DestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte27DestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSmpteTtDestinationSettings(value: SmpteTtDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmpteTtDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmpteTtDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmpteTtDestinationSettings")(js.undefined)
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
    @scala.inline
    def withWebvttDestinationSettings(value: WebvttDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebvttDestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebvttDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebvttDestinationSettings")(js.undefined)
        ret
    }
  }
  
}

