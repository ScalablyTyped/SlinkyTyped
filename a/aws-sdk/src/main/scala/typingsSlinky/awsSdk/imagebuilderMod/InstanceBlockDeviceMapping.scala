package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceBlockDeviceMapping extends js.Object {
  /**
    * The device to which these mappings apply.
    */
  var deviceName: js.UndefOr[NonEmptyString] = js.native
  /**
    * Use to manage Amazon EBS-specific configuration for this mapping.
    */
  var ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.native
  /**
    * Use to remove a mapping from the parent image.
    */
  var noDevice: js.UndefOr[EmptyString] = js.native
  /**
    * Use to manage instance ephemeral devices.
    */
  var virtualName: js.UndefOr[NonEmptyString] = js.native
}

object InstanceBlockDeviceMapping {
  @scala.inline
  def apply(): InstanceBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceBlockDeviceMapping]
  }
  @scala.inline
  implicit class InstanceBlockDeviceMappingOps[Self <: InstanceBlockDeviceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withEbs(value: EbsInstanceBlockDeviceSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebs")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDevice(value: EmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualName")(js.undefined)
        ret
    }
  }
  
}

