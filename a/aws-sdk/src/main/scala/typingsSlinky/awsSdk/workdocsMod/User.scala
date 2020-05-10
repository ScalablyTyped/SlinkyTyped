package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The time when the user was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.native
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.native
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.native
  /**
    * The time when the user was modified.
    */
  var ModifiedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  /**
    * The ID of the recycle bin folder.
    */
  var RecycleBinFolderId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The ID of the root folder.
    */
  var RootFolderId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The status of the user.
    */
  var Status: js.UndefOr[UserStatusType] = js.native
  /**
    * The storage for the user.
    */
  var Storage: js.UndefOr[UserStorageMetadata] = js.native
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.native
  /**
    * The type of user.
    */
  var Type: js.UndefOr[UserType] = js.native
  /**
    * The login name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: EmailAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(js.undefined)
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
    def withId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
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
    def withModifiedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecycleBinFolderId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecycleBinFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecycleBinFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecycleBinFolderId")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFolderId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootFolderId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: UserStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: UserStorageMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Storage")(js.undefined)
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

