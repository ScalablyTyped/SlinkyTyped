package typingsSlinky.googleapis.oauth2V2Mod.oauth2V2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUserinfoplus extends js.Object {
  /**
    * The user&#39;s email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The user&#39;s last name.
    */
  var family_name: js.UndefOr[String] = js.native
  /**
    * The user&#39;s gender.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The user&#39;s first name.
    */
  var given_name: js.UndefOr[String] = js.native
  /**
    * The hosted domain e.g. example.com if the user is Google apps user.
    */
  var hd: js.UndefOr[String] = js.native
  /**
    * The obfuscated ID of the user.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URL of the profile page.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * The user&#39;s preferred locale.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The user&#39;s full name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * URL of the user&#39;s picture image.
    */
  var picture: js.UndefOr[String] = js.native
  /**
    * Boolean flag which is true if the email address is verified. Always
    * verified because we only return the user&#39;s primary email address.
    */
  var verified_email: js.UndefOr[Boolean] = js.native
}

object SchemaUserinfoplus {
  @scala.inline
  def apply(): SchemaUserinfoplus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserinfoplus]
  }
  @scala.inline
  implicit class SchemaUserinfoplusOps[Self <: SchemaUserinfoplus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFamily_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family_name")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withGiven_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("given_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGiven_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("given_name")(js.undefined)
        ret
    }
    @scala.inline
    def withHd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd")(js.undefined)
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
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
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
    def withPicture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(js.undefined)
        ret
    }
    @scala.inline
    def withVerified_email(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerified_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_email")(js.undefined)
        ret
    }
  }
  
}

