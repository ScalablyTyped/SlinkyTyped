package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UserProfile extends js.Object {
  /**
    * The user's full name as specified in their Google account.
    * Requires the NAME permission.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The user's last name as specified in their Google account.
    * Note that this field could be empty.
    * Requires the NAME permission.
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * The user's first name as specified in their Google account.
    * Requires the NAME permission.
    */
  var givenName: js.UndefOr[String] = js.native
}

object GoogleActionsV2UserProfile {
  @scala.inline
  def apply(): GoogleActionsV2UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UserProfile]
  }
  @scala.inline
  implicit class GoogleActionsV2UserProfileOps[Self <: GoogleActionsV2UserProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
        ret
    }
  }
  
}

