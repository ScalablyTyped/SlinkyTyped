package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2User extends js.Object {
  /**
    * An OAuth2 token that identifies the user in your system. Only
    * available if the user links their account.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * Token representing the user's identity.
    * This is a Json web token including encoded profile. The definition is at
    * https://developers.google.com/identity/protocols/OpenIDConnect#obtainuserinfo.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The timestamp of the last interaction with this user.
    * This field will be omitted if the user has not interacted with the agent
    * before.
    */
  var lastSeen: js.UndefOr[String] = js.native
  /**
    * Primary locale setting of the user making the request.
    * Follows IETF BCP-47 language code
    * http://www.rfc-editor.org/rfc/bcp/bcp47.txt
    * However, the script subtag is not included.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * List of user entitlements for every package name listed in the Action
    * package, if any.
    */
  var packageEntitlements: js.UndefOr[js.Array[GoogleActionsV2PackageEntitlement]] = js.native
  /**
    * Contains permissions granted by user to this Action.
    */
  var permissions: js.UndefOr[js.Array[GoogleActionsV2UserPermissions]] = js.native
  /**
    * Information about the end user. Some fields are only available if the user
    * has given permission to provide this information to the Action.
    */
  var profile: js.UndefOr[GoogleActionsV2UserProfile] = js.native
  /**
    * Unique ID for the end user.
    */
  var userId: js.UndefOr[String] = js.native
  /**
    * An opaque token supplied by the application that is persisted across
    * conversations for a particular user.
    * The maximum size of the string is 10k characters.
    */
  var userStorage: js.UndefOr[String] = js.native
  /**
    * Indicates the verification status of the user.
    */
  var userVerificationStatus: js.UndefOr[GoogleActionsV2UserUserVerificationStatus] = js.native
}

object GoogleActionsV2User {
  @scala.inline
  def apply(): GoogleActionsV2User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2User]
  }
  @scala.inline
  implicit class GoogleActionsV2UserOps[Self <: GoogleActionsV2User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSeen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSeen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSeen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSeen")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageEntitlements(value: js.Array[GoogleActionsV2PackageEntitlement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageEntitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageEntitlements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageEntitlements")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[GoogleActionsV2UserPermissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: GoogleActionsV2UserProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVerificationStatus(value: GoogleActionsV2UserUserVerificationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVerificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVerificationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVerificationStatus")(js.undefined)
        ret
    }
  }
  
}

