package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroupSettings extends js.Object {
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
    */
  var CmafGroupSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.CmafGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
    */
  var DashIsoGroupSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DashIsoGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
    */
  var FileGroupSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.FileGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
    */
  var HlsGroupSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.HlsGroupSettings] = js.native
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
    */
  var MsSmoothGroupSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.MsSmoothGroupSettings] = js.native
  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  var Type: js.UndefOr[OutputGroupType] = js.native
}

object OutputGroupSettings {
  @scala.inline
  def apply(): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupSettings]
  }
  @scala.inline
  implicit class OutputGroupSettingsOps[Self <: OutputGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmafGroupSettings(value: CmafGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmafGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmafGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmafGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDashIsoGroupSettings(value: DashIsoGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashIsoGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashIsoGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashIsoGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFileGroupSettings(value: FileGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsGroupSettings(value: HlsGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMsSmoothGroupSettings(value: MsSmoothGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsSmoothGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsSmoothGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsSmoothGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: OutputGroupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

