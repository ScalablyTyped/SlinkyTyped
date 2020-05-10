package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusItem extends js.Object {
  /**
    * The details of the operation.
    */
  var Actions: js.UndefOr[VolumeStatusActionsList] = js.native
  /**
    * Information about the instances to which the volume is attached.
    */
  var AttachmentStatuses: js.UndefOr[VolumeStatusAttachmentStatusList] = js.native
  /**
    * The Availability Zone of the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * A list of events associated with the volume.
    */
  var Events: js.UndefOr[VolumeStatusEventsList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.native
  /**
    * The volume status.
    */
  var VolumeStatus: js.UndefOr[VolumeStatusInfo] = js.native
}

object VolumeStatusItem {
  @scala.inline
  def apply(): VolumeStatusItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusItem]
  }
  @scala.inline
  implicit class VolumeStatusItemOps[Self <: VolumeStatusItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: VolumeStatusActionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentStatuses(value: VolumeStatusAttachmentStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: VolumeStatusEventsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(js.undefined)
        ret
    }
    @scala.inline
    def withOutpostArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
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
    def withVolumeStatus(value: VolumeStatusInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeStatus")(js.undefined)
        ret
    }
  }
  
}

