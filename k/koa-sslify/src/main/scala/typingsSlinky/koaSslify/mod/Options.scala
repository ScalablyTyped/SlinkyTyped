package typingsSlinky.koaSslify.mod

import typingsSlinky.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Status returned for disallowed methods
    */
  var disallowStatus: js.UndefOr[Double] = js.native
  /**
    * Hostname for redirect (uses request host if not set)
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * Ignore url path (redirect to domain)
    */
  var ignoreUrl: js.UndefOr[Boolean] = js.native
  /**
    * Port of HTTPS server
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Whitelist methods that should be redirected
    */
  var redirectMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Function used to test if request is secure
    */
  var resolver: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.native
  /**
    * Avoid :443 port in redirect url
    */
  var skipDefaultPort: js.UndefOr[Boolean] = js.native
  /**
    * Temporary mode (use 307 Temporary Redirect)
    */
  var temporary: js.UndefOr[Boolean] = js.native
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
    def withDisallowStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallowStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withResolver(value: /* ctx */ Context => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipDefaultPort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDefaultPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipDefaultPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDefaultPort")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(js.undefined)
        ret
    }
  }
  
}

