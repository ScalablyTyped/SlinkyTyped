package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSettings extends js.Object {
  var ArchiveOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ArchiveOutputSettings] = js.native
  var FrameCaptureOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FrameCaptureOutputSettings] = js.native
  var HlsOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.HlsOutputSettings] = js.native
  var MediaPackageOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MediaPackageOutputSettings] = js.native
  var MsSmoothOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MsSmoothOutputSettings] = js.native
  var MultiplexOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexOutputSettings] = js.native
  var RtmpOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.RtmpOutputSettings] = js.native
  var UdpOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.UdpOutputSettings] = js.native
}

object OutputSettings {
  @scala.inline
  def apply(): OutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSettings]
  }
  @scala.inline
  implicit class OutputSettingsOps[Self <: OutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchiveOutputSettings(value: ArchiveOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveOutputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameCaptureOutputSettings(value: FrameCaptureOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameCaptureOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameCaptureOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameCaptureOutputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsOutputSettings(value: HlsOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsOutputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaPackageOutputSettings(value: MediaPackageOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPackageOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaPackageOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPackageOutputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMsSmoothOutputSettings(value: MsSmoothOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsSmoothOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsSmoothOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsSmoothOutputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplexOutputSettings(value: MultiplexOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexOutputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRtmpOutputSettings(value: RtmpOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RtmpOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtmpOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RtmpOutputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withUdpOutputSettings(value: UdpOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UdpOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUdpOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UdpOutputSettings")(js.undefined)
        ret
    }
  }
  
}

