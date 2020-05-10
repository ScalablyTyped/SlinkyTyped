package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * A unique identifier you create for this user, such as "user342" or "asset#44418". Do not use personally identifiable information (PII) for this
    * property. Must always be set for EMM-managed users. Not set for Google-managed users.
    */
  var accountIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of account that this user represents. A userAccount can be installed on multiple devices, but a deviceAccount is specific to a single device.
    * An EMM-managed user (emmManaged) can be either type (userAccount, deviceAccount), but a Google-managed user (googleManaged) is always a userAccount.
    */
  var accountType: js.UndefOr[String] = js.native
  /**
    * The name that will appear in user interfaces. Setting this property is optional when creating EMM-managed users. If you do set this property, use
    * something generic about the organization (such as "Example, Inc.") or your name (as EMM). Not used for Google-managed user accounts.
    */
  var displayName: js.UndefOr[String] = js.native
  /** The unique ID for the user. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#user". */
  var kind: js.UndefOr[String] = js.native
  /**
    * The entity that manages the user. With googleManaged users, the source of truth is Google so EMMs have to make sure a Google Account exists for the
    * user. With emmManaged users, the EMM is in charge.
    */
  var managementType: js.UndefOr[String] = js.native
  /** The user's primary email address, for example, "jsmith@example.com". Will always be set for Google managed users and not set for EMM managed users. */
  var primaryEmail: js.UndefOr[String] = js.native
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
    def withAccountIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountType")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withManagementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementType")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryEmail")(js.undefined)
        ret
    }
  }
  
}

