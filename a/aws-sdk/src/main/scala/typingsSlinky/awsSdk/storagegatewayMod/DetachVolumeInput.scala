package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachVolumeInput extends js.Object {
  /**
    * Set to true to forcibly remove the iSCSI connection of the target volume and detach the volume. The default is false. If this value is set to false, you must manually disconnect the iSCSI connection from the target volume.
    */
  var ForceDetach: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
    */
  var VolumeARN: typingsSlinky.awsSdk.storagegatewayMod.VolumeARN = js.native
}

object DetachVolumeInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN): DetachVolumeInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachVolumeInput]
  }
  @scala.inline
  implicit class DetachVolumeInputOps[Self <: DetachVolumeInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVolumeARN(value: VolumeARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceDetach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceDetach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDetach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceDetach")(js.undefined)
        ret
    }
  }
  
}

