package typingsSlinky.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsanaAuthorizeUrlOptions extends js.Object {
  var asanaBaseUrl: js.UndefOr[String] = js.native
  var redirectUri: js.UndefOr[String] = js.native
}

object AsanaAuthorizeUrlOptions {
  @scala.inline
  def apply(): AsanaAuthorizeUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsanaAuthorizeUrlOptions]
  }
  @scala.inline
  implicit class AsanaAuthorizeUrlOptionsOps[Self <: AsanaAuthorizeUrlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsanaBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asanaBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsanaBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asanaBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(js.undefined)
        ret
    }
  }
  
}

