package typingsSlinky.instagramPrivateApi.accountTwoFactorLoginOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTwoFactorLoginOptions extends js.Object {
  var trustThisDevice: js.UndefOr[`1` | `0`] = js.native
  var twoFactorIdentifier: String = js.native
  var username: String = js.native
  var verificationCode: String = js.native
  var verificationMethod: js.UndefOr[String] = js.native
}

object AccountTwoFactorLoginOptions {
  @scala.inline
  def apply(twoFactorIdentifier: String, username: String, verificationCode: String): AccountTwoFactorLoginOptions = {
    val __obj = js.Dynamic.literal(twoFactorIdentifier = twoFactorIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTwoFactorLoginOptions]
  }
  @scala.inline
  implicit class AccountTwoFactorLoginOptionsOps[Self <: AccountTwoFactorLoginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTwoFactorIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoFactorIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerificationCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustThisDevice(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustThisDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustThisDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustThisDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMethod")(js.undefined)
        ret
    }
  }
  
}

