package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSelectorSettings extends js.Object {
  var AribSourceSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AribSourceSettings] = js.native
  var DvbSubSourceSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.DvbSubSourceSettings] = js.native
  var EmbeddedSourceSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.EmbeddedSourceSettings] = js.native
  var Scte20SourceSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Scte20SourceSettings] = js.native
  var Scte27SourceSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Scte27SourceSettings] = js.native
  var TeletextSourceSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.TeletextSourceSettings] = js.native
}

object CaptionSelectorSettings {
  @scala.inline
  def apply(): CaptionSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSelectorSettings]
  }
  @scala.inline
  implicit class CaptionSelectorSettingsOps[Self <: CaptionSelectorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAribSourceSettings(value: AribSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AribSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAribSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AribSourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbSubSourceSettings(value: DvbSubSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSubSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDvbSubSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSubSourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddedSourceSettings(value: EmbeddedSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedSourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScte20SourceSettings(value: Scte20SourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte20SourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte20SourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte20SourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScte27SourceSettings(value: Scte27SourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte27SourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte27SourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte27SourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTeletextSourceSettings(value: TeletextSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeletextSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextSourceSettings")(js.undefined)
        ret
    }
  }
  
}

