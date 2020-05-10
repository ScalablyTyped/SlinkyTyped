package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieDefaults extends js.Object {
  var whitelist: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ js.Any, Boolean]) = js.native
}

object CookieDefaults {
  @scala.inline
  def apply(whitelist: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ js.Any, Boolean])): CookieDefaults = {
    val __obj = js.Dynamic.literal(whitelist = whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieDefaults]
  }
  @scala.inline
  implicit class CookieDefaultsOps[Self <: CookieDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWhitelistFunction1(value: /* cookie */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhitelistRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitelist(value: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

