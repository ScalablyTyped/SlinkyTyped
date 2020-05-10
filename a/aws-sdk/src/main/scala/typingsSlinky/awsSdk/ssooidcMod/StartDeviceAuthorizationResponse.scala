package typingsSlinky.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeviceAuthorizationResponse extends js.Object {
  /**
    * The short-lived code that is used by the device when polling for a session token.
    */
  var deviceCode: js.UndefOr[DeviceCode] = js.native
  /**
    * Indicates the number of seconds in which the verification code will become invalid.
    */
  var expiresIn: js.UndefOr[ExpirationInSeconds] = js.native
  /**
    * Indicates the number of seconds the client must wait between attempts when polling for a session.
    */
  var interval: js.UndefOr[IntervalInSeconds] = js.native
  /**
    * A one-time user verification code. This is needed to authorize an in-use device.
    */
  var userCode: js.UndefOr[UserCode] = js.native
  /**
    * The URI of the verification page that takes the userCode to authorize the device.
    */
  var verificationUri: js.UndefOr[URI] = js.native
  /**
    * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in which the user visits the verification page and enters their code.
    */
  var verificationUriComplete: js.UndefOr[URI] = js.native
}

object StartDeviceAuthorizationResponse {
  @scala.inline
  def apply(): StartDeviceAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDeviceAuthorizationResponse]
  }
  @scala.inline
  implicit class StartDeviceAuthorizationResponseOps[Self <: StartDeviceAuthorizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceCode(value: DeviceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCode")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresIn(value: ExpirationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: IntervalInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCode(value: UserCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCode")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationUri(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationUriComplete(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationUriComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationUriComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationUriComplete")(js.undefined)
        ret
    }
  }
  
}

