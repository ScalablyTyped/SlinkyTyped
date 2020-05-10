package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserPreference extends js.Object {
  var Chrome: js.UndefOr[String] = js.native
  var Firefox: js.UndefOr[String] = js.native
  var MSIE: js.UndefOr[String] = js.native
  var Opera: js.UndefOr[String] = js.native
  var Safari: js.UndefOr[String] = js.native
  var other: js.UndefOr[String] = js.native
}

object BrowserPreference {
  @scala.inline
  def apply(): BrowserPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserPreference]
  }
  @scala.inline
  implicit class BrowserPreferenceOps[Self <: BrowserPreference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chrome")(js.undefined)
        ret
    }
    @scala.inline
    def withFirefox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirefox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Firefox")(js.undefined)
        ret
    }
    @scala.inline
    def withMSIE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSIE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMSIE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSIE")(js.undefined)
        ret
    }
    @scala.inline
    def withOpera(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Opera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Opera")(js.undefined)
        ret
    }
    @scala.inline
    def withSafari(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Safari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafari: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Safari")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.undefined)
        ret
    }
  }
  
}

