package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserInfo extends js.Object {
  var isChrome: js.UndefOr[Boolean] = js.native
  /*These are true when the browser is the indicated one, and false otherwise.*/
  var isFirefox: js.UndefOr[Boolean] = js.native
  var isKonqueror: js.UndefOr[Boolean] = js.native
  var isMSIE: js.UndefOr[Boolean] = js.native
  /*These are boolean values that indicate whether the browser is running on a Macintosh computer or a Windows
    * computer. They will both be false for a Linux computer.
    */
  var isMac: js.UndefOr[Boolean] = js.native
  /*This is true when MathJax is running a mobile version of a WebKit or Gecko-based browser.*/
  var isMobile: js.UndefOr[Boolean] = js.native
  var isOpera: js.UndefOr[Boolean] = js.native
  var isPC: js.UndefOr[Boolean] = js.native
  var isSafari: js.UndefOr[Boolean] = js.native
  /*The browser version number, e.g., "4.0"*/
  var version: String = js.native
  /* This lets you perform browser-specific functions. Here, choices is an object whose properties are the names of the browsers and whose values are the functions to be performed. Each function is passed one parameter, which is the MathJax.Hub.Browser object. You do not need to include every browser as one of your choices — only those for which you need to do special processing. For example:
    *MathJax.Hub.Browser.Select({
    *    MSIE: function (browser) {
    *    if (browser.versionAtLeast("8.0")) {... do version 8 stuff ... }
    *        ... do general MSIE stuff ...
    *    },
    *    Firefox: function (browser) {
    *    if (browser.isMac) {... do Mac stuff ... }
    *        ... do general Firefox stuff
    *    }
    *});*/
  def Select(choices: js.Any): Unit = js.native
  /*This tests whether the browser version is at least that given in the version string. Note that you can not
    * simply do a numeric comparison, as version 4.10 should be considered later than 4.9, for example. Similarly,
    * 4.10 is different from 4.1, for instance.*/
  def versionAtLeast(version: String): Unit = js.native
}

object BrowserInfo {
  @scala.inline
  def apply(Select: js.Any => Unit, version: String, versionAtLeast: String => Unit): BrowserInfo = {
    val __obj = js.Dynamic.literal(Select = js.Any.fromFunction1(Select), version = version.asInstanceOf[js.Any], versionAtLeast = js.Any.fromFunction1(versionAtLeast))
    __obj.asInstanceOf[BrowserInfo]
  }
  @scala.inline
  implicit class BrowserInfoOps[Self <: BrowserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelect(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionAtLeast(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionAtLeast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChrome")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFirefox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirefox")(js.undefined)
        ret
    }
    @scala.inline
    def withIsKonqueror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKonqueror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsKonqueror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKonqueror")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMSIE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMSIE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMSIE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMSIE")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMac")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpera")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPC")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSafari: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(js.undefined)
        ret
    }
  }
  
}

