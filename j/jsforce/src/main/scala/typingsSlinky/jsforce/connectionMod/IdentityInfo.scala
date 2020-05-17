package typingsSlinky.jsforce.connectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsforce.anon.Body
import typingsSlinky.jsforce.anon.Customdomain
import typingsSlinky.jsforce.anon.Picture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityInfo
  extends // And possible other attributes.
/* key */ StringDictionary[js.Any] {
  var active: Boolean = js.native
  var addr_city: String | Null = js.native
  var addr_country: String | Null = js.native
  var addr_state: String | Null = js.native
  var addr_street: String | Null = js.native
  var addr_zip: String | Null = js.native
  var asserted_user: Boolean = js.native
  var display_name: String = js.native
  var email: String = js.native
  var email_verified: Boolean = js.native
  var first_name: String | Null = js.native
  var id: String = js.native
  var is_app_installed: Boolean = js.native
  var is_lightning_login_user: Boolean = js.native
  var language: String = js.native
  var last_modified_date: js.Date = js.native
  var last_name: String = js.native
  var locale: String = js.native
  var mobile_phone: String | Null = js.native
  var mobile_phone_verified: Boolean = js.native
  var nick_name: String = js.native
  var organization_id: String = js.native
  var photos: Picture = js.native
  var status: Body = js.native
  var timezone: String = js.native
  var urls: Customdomain = js.native
  var user_id: String = js.native
  var user_type: String = js.native
  var username: String = js.native
  var utcOffset: Double = js.native
}

object IdentityInfo {
  @scala.inline
  def apply(
    active: Boolean,
    asserted_user: Boolean,
    display_name: String,
    email: String,
    email_verified: Boolean,
    id: String,
    is_app_installed: Boolean,
    is_lightning_login_user: Boolean,
    language: String,
    last_modified_date: js.Date,
    last_name: String,
    locale: String,
    mobile_phone_verified: Boolean,
    nick_name: String,
    organization_id: String,
    photos: Picture,
    status: Body,
    timezone: String,
    urls: Customdomain,
    user_id: String,
    user_type: String,
    username: String,
    utcOffset: Double
  ): IdentityInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], asserted_user = asserted_user.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_app_installed = is_app_installed.asInstanceOf[js.Any], is_lightning_login_user = is_lightning_login_user.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], last_modified_date = last_modified_date.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mobile_phone_verified = mobile_phone_verified.asInstanceOf[js.Any], nick_name = nick_name.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], user_type = user_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityInfo]
  }
  @scala.inline
  implicit class IdentityInfoOps[Self <: IdentityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsserted_user(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asserted_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_app_installed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_app_installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_lightning_login_user(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_lightning_login_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_modified_date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_modified_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile_phone_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile_phone_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNick_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nick_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotos(value: Picture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: Customdomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtcOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddr_city(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddr_cityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_city")(null)
        ret
    }
    @scala.inline
    def withAddr_country(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddr_countryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_country")(null)
        ret
    }
    @scala.inline
    def withAddr_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddr_stateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_state")(null)
        ret
    }
    @scala.inline
    def withAddr_street(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddr_streetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_street")(null)
        ret
    }
    @scala.inline
    def withAddr_zip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddr_zipNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addr_zip")(null)
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_nameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(null)
        ret
    }
    @scala.inline
    def withMobile_phone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile_phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile_phoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile_phone")(null)
        ret
    }
  }
  
}

