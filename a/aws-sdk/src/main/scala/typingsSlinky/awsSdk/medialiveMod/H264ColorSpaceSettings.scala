package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H264ColorSpaceSettings extends js.Object {
  var ColorSpacePassthroughSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ColorSpacePassthroughSettings] = js.native
  var Rec601Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Rec601Settings] = js.native
  var Rec709Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Rec709Settings] = js.native
}

object H264ColorSpaceSettings {
  @scala.inline
  def apply(): H264ColorSpaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264ColorSpaceSettings]
  }
  @scala.inline
  implicit class H264ColorSpaceSettingsOps[Self <: H264ColorSpaceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorSpacePassthroughSettings(value: ColorSpacePassthroughSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorSpacePassthroughSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSpacePassthroughSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorSpacePassthroughSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRec601Settings(value: Rec601Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rec601Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRec601Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rec601Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withRec709Settings(value: Rec709Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rec709Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRec709Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rec709Settings")(js.undefined)
        ret
    }
  }
  
}

