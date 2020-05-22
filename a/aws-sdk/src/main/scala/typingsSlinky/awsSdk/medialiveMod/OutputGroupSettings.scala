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
  def apply(
    ArchiveGroupSettings: ArchiveGroupSettings = null,
    FrameCaptureGroupSettings: FrameCaptureGroupSettings = null,
    HlsGroupSettings: HlsGroupSettings = null,
    MediaPackageGroupSettings: MediaPackageGroupSettings = null,
    MsSmoothGroupSettings: MsSmoothGroupSettings = null,
    MultiplexGroupSettings: MultiplexGroupSettings = null,
    RtmpGroupSettings: RtmpGroupSettings = null,
    UdpGroupSettings: UdpGroupSettings = null
  ): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (ArchiveGroupSettings != null) __obj.updateDynamic("ArchiveGroupSettings")(ArchiveGroupSettings.asInstanceOf[js.Any])
    if (FrameCaptureGroupSettings != null) __obj.updateDynamic("FrameCaptureGroupSettings")(FrameCaptureGroupSettings.asInstanceOf[js.Any])
    if (HlsGroupSettings != null) __obj.updateDynamic("HlsGroupSettings")(HlsGroupSettings.asInstanceOf[js.Any])
    if (MediaPackageGroupSettings != null) __obj.updateDynamic("MediaPackageGroupSettings")(MediaPackageGroupSettings.asInstanceOf[js.Any])
    if (MsSmoothGroupSettings != null) __obj.updateDynamic("MsSmoothGroupSettings")(MsSmoothGroupSettings.asInstanceOf[js.Any])
    if (MultiplexGroupSettings != null) __obj.updateDynamic("MultiplexGroupSettings")(MultiplexGroupSettings.asInstanceOf[js.Any])
    if (RtmpGroupSettings != null) __obj.updateDynamic("RtmpGroupSettings")(RtmpGroupSettings.asInstanceOf[js.Any])
    if (UdpGroupSettings != null) __obj.updateDynamic("UdpGroupSettings")(UdpGroupSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroupSettings]
  }
}

