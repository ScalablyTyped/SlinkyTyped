package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginUrl extends js.Object {
  var bot_username: js.UndefOr[String] = js.native
  var forward_text: js.UndefOr[String] = js.native
  var request_write_acces: js.UndefOr[Boolean] = js.native
  var url: String = js.native
}

object LoginUrl {
  @scala.inline
  def apply(url: String): LoginUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginUrl]
  }
  @scala.inline
  implicit class LoginUrlOps[Self <: LoginUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBot_username(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bot_username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBot_username: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bot_username")(js.undefined)
        ret
    }
    @scala.inline
    def withForward_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward_text")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_write_acces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_write_acces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_write_acces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_write_acces")(js.undefined)
        ret
    }
  }
  
}

