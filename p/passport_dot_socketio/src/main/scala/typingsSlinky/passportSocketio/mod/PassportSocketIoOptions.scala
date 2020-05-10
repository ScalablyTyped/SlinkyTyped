package typingsSlinky.passportSocketio.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.expressSession.mod.Store
import typingsSlinky.passport.mod.PassportStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportSocketIoOptions extends js.Object {
  /**
    * the same middleware you registrer in express.
    */
  var cookieParser: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  /**
    * callback on fail/error.
    */
  var fail: js.UndefOr[
    js.Function4[
      /* data */ js.Any, 
      /* message */ String, 
      /* critical */ String, 
      /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * the name of the cookie where express/connect stores its session_id.
    */
  var key: js.UndefOr[String] = js.native
  var passport: js.UndefOr[PassportStatic] = js.native
  /**
    * the session_secret to parse the cookie.
    */
  var secret: js.UndefOr[String] = js.native
  /**
    * we NEED to use a sessionstore. No MemoryStore please.
    */
  var store: Store = js.native
  /**
    * callback on success.
    */
  var success: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ] = js.native
}

object PassportSocketIoOptions {
  @scala.inline
  def apply(store: Store): PassportSocketIoOptions = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportSocketIoOptions]
  }
  @scala.inline
  implicit class PassportSocketIoOptionsOps[Self <: PassportSocketIoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookieParser(
      value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieParser")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCookieParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieParser")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(
      value: (/* data */ js.Any, /* message */ String, /* critical */ String, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
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
    def withPassport(value: PassportStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passport")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(
      value: (/* data */ js.Any, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

