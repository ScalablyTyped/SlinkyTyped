package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableMFADeviceRequest extends js.Object {
  /**
    * An authentication code emitted by the device.  The format for this parameter is a string of six digits.  Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can resync the device. 
    */
  var AuthenticationCode1: authenticationCodeType = js.native
  /**
    * A subsequent authentication code emitted by the device. The format for this parameter is a string of six digits.  Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can resync the device. 
    */
  var AuthenticationCode2: authenticationCodeType = js.native
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
    */
  var SerialNumber: serialNumberType = js.native
  /**
    * The name of the IAM user for whom you want to enable the MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType = js.native
}

object EnableMFADeviceRequest {
  @scala.inline
  def apply(
    AuthenticationCode1: authenticationCodeType,
    AuthenticationCode2: authenticationCodeType,
    SerialNumber: serialNumberType,
    UserName: existingUserNameType
  ): EnableMFADeviceRequest = {
    val __obj = js.Dynamic.literal(AuthenticationCode1 = AuthenticationCode1.asInstanceOf[js.Any], AuthenticationCode2 = AuthenticationCode2.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableMFADeviceRequest]
  }
  @scala.inline
  implicit class EnableMFADeviceRequestOps[Self <: EnableMFADeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationCode1(value: authenticationCodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationCode1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationCode2(value: authenticationCodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationCode2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: serialNumberType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: existingUserNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

