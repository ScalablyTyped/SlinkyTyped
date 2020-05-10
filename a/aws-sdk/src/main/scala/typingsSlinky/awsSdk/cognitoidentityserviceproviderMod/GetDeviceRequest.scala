package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
}

object GetDeviceRequest {
  @scala.inline
  def apply(DeviceKey: DeviceKeyType): GetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceRequest]
  }
  @scala.inline
  implicit class GetDeviceRequestOps[Self <: GetDeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceKey(value: DeviceKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: TokenModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(js.undefined)
        ret
    }
  }
  
}

