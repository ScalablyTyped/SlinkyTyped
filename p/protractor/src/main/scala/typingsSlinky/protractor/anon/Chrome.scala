package typingsSlinky.protractor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chrome extends js.Object {
  var chrome: Typeofchrome = js.native
  var firefox: Typeoffirefox = js.native
  var http: Typeofhttp = js.native
  var remote: Typeofremote = js.native
}

object Chrome {
  @scala.inline
  def apply(chrome: Typeofchrome, firefox: Typeoffirefox, http: Typeofhttp, remote: Typeofremote): Chrome = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chrome]
  }
  @scala.inline
  implicit class ChromeOps[Self <: Chrome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome(value: Typeofchrome): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox(value: Typeoffirefox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: Typeofhttp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: Typeofremote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

