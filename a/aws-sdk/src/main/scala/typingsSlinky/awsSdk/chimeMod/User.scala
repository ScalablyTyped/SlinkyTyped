package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.native
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.native
  /**
    * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
    */
  var InvitedOn: js.UndefOr[js.Date] = js.native
  /**
    * The license type for the user.
    */
  var LicenseType: js.UndefOr[License] = js.native
  /**
    * The user's personal meeting PIN.
    */
  var PersonalPIN: js.UndefOr[String] = js.native
  /**
    * The primary email address of the user.
    */
  var PrimaryEmail: js.UndefOr[EmailAddress] = js.native
  /**
    * The primary phone number associated with the user.
    */
  var PrimaryProvisionedNumber: js.UndefOr[SensitiveString] = js.native
  /**
    * Date and time when the user is registered, in ISO 8601 format.
    */
  var RegisteredOn: js.UndefOr[js.Date] = js.native
  /**
    * The user ID.
    */
  var UserId: String = js.native
  /**
    * The user invite status.
    */
  var UserInvitationStatus: js.UndefOr[InviteStatus] = js.native
  /**
    * The user registration status.
    */
  var UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.native
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.UserType] = js.native
}

object User {
  @scala.inline
  def apply(UserId: String): User = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlexaForBusinessMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlexaForBusinessMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlexaForBusinessMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseType(value: License): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseType")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalPIN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonalPIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalPIN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonalPIN")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryEmail(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryProvisionedNumber(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryProvisionedNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryProvisionedNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryProvisionedNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredOn")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInvitationStatus(value: InviteStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserInvitationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInvitationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserInvitationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRegistrationStatus(value: RegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserRegistrationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRegistrationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserRegistrationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withUserType(value: UserType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserType")(js.undefined)
        ret
    }
  }
  
}

