package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewDeviceMetadataType extends js.Object {
  /**
    * The device group key.
    */
  var DeviceGroupKey: js.UndefOr[StringType] = js.native
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.native
}

object NewDeviceMetadataType {
  @scala.inline
  def apply(): NewDeviceMetadataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDeviceMetadataType]
  }
  @scala.inline
  implicit class NewDeviceMetadataTypeOps[Self <: NewDeviceMetadataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceGroupKey(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceGroupKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceGroupKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceGroupKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceKey(value: DeviceKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceKey")(js.undefined)
        ret
    }
  }
  
}

