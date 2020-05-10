package typingsSlinky.expressNtlm.mod

import typingsSlinky.express.mod.Handler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var badrequest: js.UndefOr[Handler] = js.native
  var debug: js.UndefOr[js.Function2[/* prefix */ String, /* message */ String, Unit]] = js.native
  var domain: js.UndefOr[String] = js.native
  var domaincontroller: js.UndefOr[String] = js.native
  var forbidden: js.UndefOr[Handler] = js.native
  var internalservererror: js.UndefOr[Handler] = js.native
  var prefix: js.UndefOr[String] = js.native
  var tlsOptions: js.UndefOr[ConnectionOptions] = js.native
  var unauthorized: js.UndefOr[Handler] = js.native
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
    def withBadrequest(
      value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badrequest")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBadrequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badrequest")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: (/* prefix */ String, /* message */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDomaincontroller(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domaincontroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomaincontroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domaincontroller")(js.undefined)
        ret
    }
    @scala.inline
    def withForbidden(
      value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidden")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutForbidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidden")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalservererror(
      value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalservererror")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInternalservererror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalservererror")(js.undefined)
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
    def withTlsOptions(value: ConnectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnauthorized(
      value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unauthorized")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unauthorized")(js.undefined)
        ret
    }
  }
  
}

