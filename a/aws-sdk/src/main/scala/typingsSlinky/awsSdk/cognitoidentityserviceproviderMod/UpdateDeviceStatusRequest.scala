package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceStatusRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  /**
    * The status of whether a device is remembered.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.native
}

object UpdateDeviceStatusRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, DeviceKey: DeviceKeyType): UpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStatusRequest]
  }
  @scala.inline
  implicit class UpdateDeviceStatusRequestOps[Self <: UpdateDeviceStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: TokenModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceKey(value: DeviceKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceRememberedStatus(value: DeviceRememberedStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceRememberedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceRememberedStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceRememberedStatus")(js.undefined)
        ret
    }
  }
  
}

