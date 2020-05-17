package typingsSlinky.koaSessionMinimal.anon

import typingsSlinky.cookies.mod.IOptions
import typingsSlinky.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  /**
    * cookie options
    */
  var cookie: js.UndefOr[IOptions | (js.Function1[/* ctx */ js.UndefOr[Context], IOptions])] = js.native
  /**
    * session cookie name and store key prefix. Default is 'koa:sess'
    */
  var key: js.UndefOr[String] = js.native
  /**
    * session store
    */
  var store: js.UndefOr[js.Any] = js.native
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
    def withCookieFunction1(value: /* ctx */ js.UndefOr[Context] => IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCookie(value: IOptions | (js.Function1[/* ctx */ js.UndefOr[Context], IOptions])): Self = {
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
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
  }
  
}

