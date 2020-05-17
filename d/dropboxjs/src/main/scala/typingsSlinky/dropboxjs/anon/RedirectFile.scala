package typingsSlinky.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectFile extends js.Object {
  var redirectFile: String = js.native
  var redirectUrl: String = js.native
  var rememberUser: Boolean = js.native
  var scope: String = js.native
}

object RedirectFile {
  @scala.inline
  def apply(redirectFile: String, redirectUrl: String, rememberUser: Boolean, scope: String): RedirectFile = {
    val __obj = js.Dynamic.literal(redirectFile = redirectFile.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectFile]
  }
  @scala.inline
  implicit class RedirectFileOps[Self <: RedirectFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirectFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRememberUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

