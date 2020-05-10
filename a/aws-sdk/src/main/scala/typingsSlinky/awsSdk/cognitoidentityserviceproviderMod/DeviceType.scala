package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceType extends js.Object {
  /**
    * The device attributes.
    */
  var DeviceAttributes: js.UndefOr[AttributeListType] = js.native
  /**
    * The creation date of the device.
    */
  var DeviceCreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.native
  /**
    * The date in which the device was last authenticated.
    */
  var DeviceLastAuthenticatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The last modified date of the device.
    */
  var DeviceLastModifiedDate: js.UndefOr[js.Date] = js.native
}

object DeviceType {
  @scala.inline
  def apply(): DeviceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceType]
  }
  @scala.inline
  implicit class DeviceTypeOps[Self <: DeviceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceAttributes(value: AttributeListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceCreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceCreateDate")(js.undefined)
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
    @scala.inline
    def withDeviceLastAuthenticatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceLastAuthenticatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceLastAuthenticatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceLastAuthenticatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceLastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceLastModifiedDate")(js.undefined)
        ret
    }
  }
  
}

