package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStorediSCSIVolumesInput extends js.Object {
  /**
    * An array of strings where each string represents the Amazon Resource Name (ARN) of a stored volume. All of the specified stored volumes must from the same gateway. Use ListVolumes to get volume ARNs for a gateway.
    */
  var VolumeARNs: typingsSlinky.awsSdk.storagegatewayMod.VolumeARNs = js.native
}

object DescribeStorediSCSIVolumesInput {
  @scala.inline
  def apply(VolumeARNs: VolumeARNs): DescribeStorediSCSIVolumesInput = {
    val __obj = js.Dynamic.literal(VolumeARNs = VolumeARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStorediSCSIVolumesInput]
  }
  @scala.inline
  implicit class DescribeStorediSCSIVolumesInputOps[Self <: DescribeStorediSCSIVolumesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVolumeARNs(value: VolumeARNs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeARNs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

