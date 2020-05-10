package typingsSlinky.firefoxWebextBrowser.browser.privacy.websites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The settings for cookies. */
@js.native
trait CookieConfig_ extends js.Object {
  /** The type of cookies to allow. */
  var behavior: js.UndefOr[CookieConfigBehavior] = js.native
  /** Whether to create all cookies as nonPersistent (i.e., session) cookies. */
  var nonPersistentCookies: js.UndefOr[Boolean] = js.native
}

object CookieConfig_ {
  @scala.inline
  def apply(): CookieConfig_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieConfig_]
  }
  @scala.inline
  implicit class CookieConfig_Ops[Self <: CookieConfig_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: CookieConfigBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withNonPersistentCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPersistentCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonPersistentCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPersistentCookies")(js.undefined)
        ret
    }
  }
  
}

