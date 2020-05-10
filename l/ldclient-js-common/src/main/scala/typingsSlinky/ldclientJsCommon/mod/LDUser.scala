package typingsSlinky.ldclientJsCommon.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDUser extends js.Object {
  /**
    * Whether to show the user on the Users page in LaunchDarkly.
    */
  var anonymous: js.UndefOr[Boolean] = js.native
  /**
    * An absolute URL to an avatar image for the user.
    */
  var avatar: js.UndefOr[String] = js.native
  /**
    * The country associated with the user.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Any additional attributes associated with the user.
    */
  var custom: js.UndefOr[
    StringDictionary[String | Boolean | Double | (js.Array[String | Boolean | Double])]
  ] = js.native
  /**
    * The user's email address.
    *
    * If an `avatar` URL is not provided, LaunchDarkly will use Gravatar
    * to try to display an avatar for the user on the Users page.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The user's first name.
    */
  var firstName: js.UndefOr[String] = js.native
  /**
    * The user's IP address.
    */
  var ip: js.UndefOr[String] = js.native
  /**
    * A unique string identifying a user.
    *
    * If you omit this property, and also set `anonymous` to `true`, the SDK will generate a UUID string
    * and use that as the key; it will attempt to persist that value in local storage if possible so the
    * next anonymous user will get the same key, but if local storage is unavailable then it will
    * generate a new key each time you specify the user.
    *
    * It is an error to omit the `key` property if `anonymous` is not set.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The user's last name.
    */
  var lastName: js.UndefOr[String] = js.native
  /**
    * The user's name.
    *
    * You can search for users on the User page by name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies a list of attribute names (either built-in or custom) which should be
    * marked as private, and not sent to LaunchDarkly in analytics events. This is in
    * addition to any private attributes designated in the global configuration
    * with [[LDOptions.privateAttributeNames]] or [[LDOptions.allAttributesPrivate]].
    */
  var privateAttributeNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional secondary key for a user. This affects
    * [feature flag targeting](https://docs.launchdarkly.com/docs/targeting-users#section-targeting-rules-based-on-user-attributes)
    * as follows: if you have chosen to bucket users by a specific attribute, the secondary key (if set)
    * is used to further distinguish between users who are otherwise identical according to that attribute.
    */
  var secondary: js.UndefOr[String] = js.native
}

object LDUser {
  @scala.inline
  def apply(): LDUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LDUser]
  }
  @scala.inline
  implicit class LDUserOps[Self <: LDUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: StringDictionary[String | Boolean | Double | (js.Array[String | Boolean | Double])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateAttributeNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(js.undefined)
        ret
    }
  }
  
}

