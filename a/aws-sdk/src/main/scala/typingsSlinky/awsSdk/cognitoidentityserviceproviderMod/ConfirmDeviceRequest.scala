package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmDeviceRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  /**
    * The device name.
    */
  var DeviceName: js.UndefOr[DeviceNameType] = js.native
  /**
    * The configuration of the device secret verifier.
    */
  var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.native
}

object ConfirmDeviceRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, DeviceKey: DeviceKeyType): ConfirmDeviceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDeviceRequest]
  }
  @scala.inline
  implicit class ConfirmDeviceRequestOps[Self <: ConfirmDeviceRequest] (val x: Self) extends AnyVal {
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
    def withDeviceName(value: DeviceNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSecretVerifierConfig(value: DeviceSecretVerifierConfigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceSecretVerifierConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSecretVerifierConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceSecretVerifierConfig")(js.undefined)
        ret
    }
  }
  
}

