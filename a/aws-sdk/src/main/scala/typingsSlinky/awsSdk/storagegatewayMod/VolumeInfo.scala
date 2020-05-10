package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeInfo extends js.Object {
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var GatewayId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayId] = js.native
  /**
    * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:  arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB   Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume. 
    */
  var VolumeAttachmentStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeAttachmentStatus] = js.native
  /**
    * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN), which you use as input for other operations.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeId] = js.native
  /**
    * The size of the volume in bytes. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
  /**
    * One of the VolumeType enumeration values describing the type of the volume.
    */
  var VolumeType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeType] = js.native
}

object VolumeInfo {
  @scala.inline
  def apply(): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeInfo]
  }
  @scala.inline
  implicit class VolumeInfoOps[Self <: VolumeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayId(value: GatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayId")(js.undefined)
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
    def withVolumeAttachmentStatus(value: VolumeAttachmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeAttachmentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeAttachmentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeAttachmentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: VolumeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeId")(js.undefined)
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
    @scala.inline
    def withVolumeType(value: VolumeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeType")(js.undefined)
        ret
    }
  }
  
}

