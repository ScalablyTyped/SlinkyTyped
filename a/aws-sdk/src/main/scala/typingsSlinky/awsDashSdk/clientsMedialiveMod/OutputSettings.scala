package typingsSlinky.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSettings extends js.Object {
  var ArchiveOutputSettings: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.ArchiveOutputSettings] = js.native
  var FrameCaptureOutputSettings: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.FrameCaptureOutputSettings] = js.native
  var HlsOutputSettings: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.HlsOutputSettings] = js.native
  var MediaPackageOutputSettings: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.MediaPackageOutputSettings] = js.native
  var MsSmoothOutputSettings: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.MsSmoothOutputSettings] = js.native
  var MultiplexOutputSettings: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.MultiplexOutputSettings] = js.native
  var RtmpOutputSettings: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.RtmpOutputSettings] = js.native
  var UdpOutputSettings: js.UndefOr[typingsSlinky.awsDashSdk.clientsMedialiveMod.UdpOutputSettings] = js.native
}

object OutputSettings {
  @scala.inline
  def apply(
    ArchiveOutputSettings: ArchiveOutputSettings = null,
    FrameCaptureOutputSettings: FrameCaptureOutputSettings = null,
    HlsOutputSettings: HlsOutputSettings = null,
    MediaPackageOutputSettings: MediaPackageOutputSettings = null,
    MsSmoothOutputSettings: MsSmoothOutputSettings = null,
    MultiplexOutputSettings: MultiplexOutputSettings = null,
    RtmpOutputSettings: RtmpOutputSettings = null,
    UdpOutputSettings: UdpOutputSettings = null
  ): OutputSettings = {
    val __obj = js.Dynamic.literal()
    if (ArchiveOutputSettings != null) __obj.updateDynamic("ArchiveOutputSettings")(ArchiveOutputSettings.asInstanceOf[js.Any])
    if (FrameCaptureOutputSettings != null) __obj.updateDynamic("FrameCaptureOutputSettings")(FrameCaptureOutputSettings.asInstanceOf[js.Any])
    if (HlsOutputSettings != null) __obj.updateDynamic("HlsOutputSettings")(HlsOutputSettings.asInstanceOf[js.Any])
    if (MediaPackageOutputSettings != null) __obj.updateDynamic("MediaPackageOutputSettings")(MediaPackageOutputSettings.asInstanceOf[js.Any])
    if (MsSmoothOutputSettings != null) __obj.updateDynamic("MsSmoothOutputSettings")(MsSmoothOutputSettings.asInstanceOf[js.Any])
    if (MultiplexOutputSettings != null) __obj.updateDynamic("MultiplexOutputSettings")(MultiplexOutputSettings.asInstanceOf[js.Any])
    if (RtmpOutputSettings != null) __obj.updateDynamic("RtmpOutputSettings")(RtmpOutputSettings.asInstanceOf[js.Any])
    if (UdpOutputSettings != null) __obj.updateDynamic("UdpOutputSettings")(UdpOutputSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSettings]
  }
}

