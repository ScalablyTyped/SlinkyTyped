package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * Boolean value to determine whether the user is granted Poweruser privileges.
    */
  var GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType] = js.native
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.native
  /**
    * The amount of storage for the user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.native
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.native
  /**
    * The type of the user.
    */
  var Type: js.UndefOr[UserType] = js.native
  /**
    * The ID of the user.
    */
  var UserId: IdType = js.native
}

object UpdateUserRequest {
  @scala.inline
  def apply(UserId: IdType): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  @scala.inline
  implicit class UpdateUserRequestOps[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationToken(value: AuthenticationHeaderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: UserAttributeValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GivenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GivenName")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantPoweruserPrivileges(value: BooleanEnumType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantPoweruserPrivileges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantPoweruserPrivileges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantPoweruserPrivileges")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: LocaleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locale")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageRule(value: StorageRuleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageRule")(js.undefined)
        ret
    }
    @scala.inline
    def withSurname(value: UserAttributeValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Surname")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneId(value: TimeZoneIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: UserType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

