package typingsSlinky.csurf.anon

import typingsSlinky.csurf.mod.CookieOptions
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  var cookie: js.UndefOr[CookieOptions | Boolean] = js.native
  var ignoreMethods: js.UndefOr[js.Array[String]] = js.native
  var sessionKey: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary, _, _, Query], String]] = js.native
}

object Cookie {
  @scala.inline
  def apply(): Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cookie]
  }
  @scala.inline
  implicit class CookieOps[Self <: Cookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: CookieOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: /* req */ Request[ParamsDictionary, _, _, Query] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

