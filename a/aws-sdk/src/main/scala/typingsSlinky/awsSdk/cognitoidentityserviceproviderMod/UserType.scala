package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserType extends js.Object {
  /**
    * A container with information about the user type attributes.
    */
  var Attributes: js.UndefOr[AttributeListType] = js.native
  /**
    * Specifies whether the user is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  /**
    * The MFA options for the user.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.native
  /**
    * The creation date of the user.
    */
  var UserCreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The last modified date of the user.
    */
  var UserLastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or she can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change his or her password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.native
  /**
    * The user name of the user you wish to describe.
    */
  var Username: js.UndefOr[UsernameType] = js.native
}

object UserType {
  @scala.inline
  def apply(): UserType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserType]
  }
  @scala.inline
  implicit class UserTypeOps[Self <: UserType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: AttributeListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMFAOptions(value: MFAOptionListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFAOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMFAOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFAOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserLastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserLastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStatus(value: UserStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: UsernameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

