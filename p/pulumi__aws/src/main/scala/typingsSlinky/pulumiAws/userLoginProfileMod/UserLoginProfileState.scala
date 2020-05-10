package typingsSlinky.pulumiAws.userLoginProfileMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserLoginProfileState extends js.Object {
  /**
    * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
    */
  val encryptedPassword: js.UndefOr[Input[String]] = js.native
  /**
    * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
    */
  val keyFingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordLength: js.UndefOr[Input[Double]] = js.native
  /**
    * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordResetRequired: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val pgpKey: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM user's name.
    */
  val user: js.UndefOr[Input[String]] = js.native
}

object UserLoginProfileState {
  @scala.inline
  def apply(): UserLoginProfileState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserLoginProfileState]
  }
  @scala.inline
  implicit class UserLoginProfileStateOps[Self <: UserLoginProfileState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptedPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFingerprint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordLength(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordResetRequired(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordResetRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordResetRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordResetRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withPgpKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgpKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPgpKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgpKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

