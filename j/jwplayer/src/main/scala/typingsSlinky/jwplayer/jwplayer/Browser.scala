package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  var chrome: Boolean = js.native
  var edge: Boolean = js.native
  var facebook: Boolean = js.native
  var firefox: Boolean = js.native
  var ie: Boolean = js.native
  var msie: Boolean = js.native
  var safari: Boolean = js.native
  var version: Version = js.native
}

object Browser {
  @scala.inline
  def apply(
    chrome: Boolean,
    edge: Boolean,
    facebook: Boolean,
    firefox: Boolean,
    ie: Boolean,
    msie: Boolean,
    safari: Boolean,
    version: Version
  ): Browser = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], facebook = facebook.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

