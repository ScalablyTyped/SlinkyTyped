package typingsSlinky.koaGenericSession.mod

import typingsSlinky.koa.mod.Context
import typingsSlinky.koaGenericSession.AnonHttpOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionOptions extends js.Object {
  var allowEmpty: js.UndefOr[Boolean] = js.native
  var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.native
  var cookie: js.UndefOr[AnonHttpOnly] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var errorHandler: js.UndefOr[js.Function3[/* error */ js.Error, /* type */ String, /* ctx */ Context, Unit]] = js.native
  var genSid: js.UndefOr[js.Function1[/* length */ Double, String]] = js.native
  var key: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var reconnectTimeout: js.UndefOr[Double] = js.native
  var rolling: js.UndefOr[Boolean] = js.native
  var sessionIdStore: js.UndefOr[SessionIdStore] = js.native
  var store: js.UndefOr[SessionStore] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Boolean]] = js.native
}

object SessionOptions {
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSave")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: AnonHttpOnly): Self = {
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
    def withDefer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(value: (/* error */ js.Error, /* type */ String, /* ctx */ Context) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withGenSid(value: /* length */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genSid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGenSid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genSid")(js.undefined)
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
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionIdStore(value: SessionIdStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIdStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionIdStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIdStore")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: SessionStore): Self = {
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
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: (/* ctx */ Context, /* session */ Session) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
  }
  
}

