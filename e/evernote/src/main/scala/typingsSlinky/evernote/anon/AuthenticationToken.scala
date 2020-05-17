package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.User
import typingsSlinky.evernote.mod.UserStore.PublicUserInfo
import typingsSlinky.evernote.mod.UserStore.UserUrls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationToken extends js.Object {
  var authenticationToken: js.UndefOr[String] = js.native
  var currentTime: js.UndefOr[Timestamp] = js.native
  var expiration: js.UndefOr[Timestamp] = js.native
  var noteStoreUrl: js.UndefOr[String] = js.native
  var publicUserInfo: js.UndefOr[PublicUserInfo] = js.native
  var secondFactorDeliveryHint: js.UndefOr[String] = js.native
  var secondFactorRequired: js.UndefOr[Boolean] = js.native
  var urls: js.UndefOr[UserUrls] = js.native
  var user: js.UndefOr[User] = js.native
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}

object AuthenticationToken {
  @scala.inline
  def apply(): AuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationToken]
  }
  @scala.inline
  implicit class AuthenticationTokenOps[Self <: AuthenticationToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteStoreUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicUserInfo(value: PublicUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicUserInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicUserInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondFactorDeliveryHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondFactorDeliveryHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondFactorDeliveryHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondFactorDeliveryHint")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondFactorRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondFactorRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondFactorRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondFactorRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: UserUrls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withWebApiUrlPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApiUrlPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebApiUrlPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApiUrlPrefix")(js.undefined)
        ret
    }
  }
  
}

