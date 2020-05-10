package typingsSlinky.hapiCookie.mod

import typingsSlinky.hapiCookie.ServerStateCookieOptionsn
import typingsSlinky.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to 'hapi.auth.strategy' when this plugin is used
  */
@js.native
trait Options extends js.Object {
  /**
    * Only works if 'redirectTo' is true
    * If set to true, a string, or an object, appends the current request path to the query component of the 'redirectTo' URI.
    */
  var appendNext: js.UndefOr[Boolean | String] = js.native
  /**
    * Cookie options.
    *
    * @default { name: 'sid', clearInvalid: false, isSameSite: 'Strict', isSecure: true, isHttpOnly: true }
    */
  var cookie: js.UndefOr[ServerStateCookieOptionsn] = js.native
  /**
    * Automatically sets the session cookie after validation to extend the current session for a new TTL duration.
    *
    * @default false
    */
  var keepAlive: js.UndefOr[Boolean] = js.native
  /**
    * Login URI or function that returns a URI to redirect unauthenticated requests to.
    * Note that it will only trigger when the authentication mode is 'required'.
    * Defaults to no redirection.
    */
  var redirectTo: js.UndefOr[String | RedirectToFunction] = js.native
  /**
    * A name to use with decorating the request object.
    * Using multiple decorator names for separate authentication strategies could allow a developer to call the methods for the wrong strategy.
    * Potentially resulting in unintended authorized access.
    *
    * @default 'cookieAuth'
    */
  var requestDecoratorName: js.UndefOr[String] = js.native
  /**
    * An optional session validation function used to validate the content of the session cookie on each request.
    * Used to verify that the internal session state is still valid (e.g. user account still exists).
    */
  var validateFunc: js.UndefOr[ValidateFunction] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendNext(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendNext")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: ServerStateCookieOptionsn): Self = {
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
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectToFunction1(value: /* request */ js.UndefOr[Request] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRedirectTo(value: String | RedirectToFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestDecoratorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDecoratorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDecoratorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDecoratorName")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFunc(
      value: (/* request */ js.UndefOr[Request], /* session */ js.UndefOr[js.Object]) => js.Promise[ValidateResponse]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFunc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidateFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFunc")(js.undefined)
        ret
    }
  }
  
}

