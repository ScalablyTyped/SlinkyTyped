package typingsSlinky.expressWechatAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessTokenUrl extends js.Object {
  var accessTokenUrl: js.UndefOr[String] = js.native
  var appId: String = js.native
  var appSecret: String = js.native
  var https: js.UndefOr[Boolean] = js.native
  var ticketUrl: js.UndefOr[String] = js.native
}

object AccessTokenUrl {
  @scala.inline
  def apply(appId: String, appSecret: String): AccessTokenUrl = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appSecret = appSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenUrl]
  }
  @scala.inline
  implicit class AccessTokenUrlOps[Self <: AccessTokenUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessTokenUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessTokenUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(js.undefined)
        ret
    }
    @scala.inline
    def withTicketUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticketUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicketUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticketUrl")(js.undefined)
        ret
    }
  }
  
}

