package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35DescriptorSettings extends js.Object {
  /**
    * SCTE-35 Segmentation Descriptor.
    */
  var SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor = js.native
}

object Scte35DescriptorSettings {
  @scala.inline
  def apply(SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor): Scte35DescriptorSettings = {
    val __obj = js.Dynamic.literal(SegmentationDescriptorScte35DescriptorSettings = SegmentationDescriptorScte35DescriptorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35DescriptorSettings]
  }
  @scala.inline
  implicit class Scte35DescriptorSettingsOps[Self <: Scte35DescriptorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentationDescriptorScte35DescriptorSettings(value: Scte35SegmentationDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentationDescriptorScte35DescriptorSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

