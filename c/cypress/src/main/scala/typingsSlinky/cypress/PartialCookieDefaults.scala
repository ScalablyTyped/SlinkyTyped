package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.CookieDefaults> */
@js.native
trait PartialCookieDefaults extends js.Object {
  var whitelist: js.UndefOr[
    String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ js.Any, Boolean])
  ] = js.native
}

object PartialCookieDefaults {
  @scala.inline
  def apply(): PartialCookieDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCookieDefaults]
  }
  @scala.inline
  implicit class PartialCookieDefaultsOps[Self <: PartialCookieDefaults] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

