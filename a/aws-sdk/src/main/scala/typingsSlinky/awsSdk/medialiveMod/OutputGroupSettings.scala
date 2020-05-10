package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroupSettings extends js.Object {
  var ArchiveGroupSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ArchiveGroupSettings] = js.native
  var FrameCaptureGroupSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FrameCaptureGroupSettings] = js.native
  var HlsGroupSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsGroupSettings] = js.native
  var MediaPackageGroupSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MediaPackageGroupSettings] = js.native
  var MsSmoothGroupSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MsSmoothGroupSettings] = js.native
  var MultiplexGroupSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexGroupSettings] = js.native
  var RtmpGroupSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.RtmpGroupSettings] = js.native
  var UdpGroupSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.UdpGroupSettings] = js.native
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
    def withArchiveGroupSettings(value: ArchiveGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameCaptureGroupSettings(value: FrameCaptureGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameCaptureGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameCaptureGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameCaptureGroupSettings")(js.undefined)
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
    def withMediaPackageGroupSettings(value: MediaPackageGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPackageGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaPackageGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPackageGroupSettings")(js.undefined)
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
    def withMultiplexGroupSettings(value: MultiplexGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRtmpGroupSettings(value: RtmpGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RtmpGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtmpGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RtmpGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withUdpGroupSettings(value: UdpGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UdpGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUdpGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UdpGroupSettings")(js.undefined)
        ret
    }
  }
  
}

