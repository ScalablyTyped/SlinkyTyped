package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSecretVerifierConfigType extends js.Object {
  /**
    * The password verifier.
    */
  var PasswordVerifier: js.UndefOr[StringType] = js.native
  /**
    * The salt.
    */
  var Salt: js.UndefOr[StringType] = js.native
}

object DeviceSecretVerifierConfigType {
  @scala.inline
  def apply(): DeviceSecretVerifierConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSecretVerifierConfigType]
  }
  @scala.inline
  implicit class DeviceSecretVerifierConfigTypeOps[Self <: DeviceSecretVerifierConfigType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPasswordVerifier(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordVerifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordVerifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordVerifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Salt")(js.undefined)
        ret
    }
  }
  
}

