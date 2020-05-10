package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorediSCSIVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
    */
  var TargetARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetARN] = js.native
  /**
    * The Amazon Resource Name (ARN) of the configured volume.
    */
  var VolumeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
}

object CreateStorediSCSIVolumeOutput {
  @scala.inline
  def apply(): CreateStorediSCSIVolumeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorediSCSIVolumeOutput]
  }
  @scala.inline
  implicit class CreateStorediSCSIVolumeOutputOps[Self <: CreateStorediSCSIVolumeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetARN(value: TargetARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeARN(value: VolumeARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeARN")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeSizeInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSizeInBytes")(js.undefined)
        ret
    }
  }
  
}

