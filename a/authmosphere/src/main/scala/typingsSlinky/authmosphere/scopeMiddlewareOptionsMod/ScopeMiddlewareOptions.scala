package typingsSlinky.authmosphere.scopeMiddlewareOptionsMod

import typingsSlinky.authmosphere.loggerMod.Logger
import typingsSlinky.authmosphere.precedenceMod.PrecedenceOptions
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeMiddlewareOptions extends js.Object {
  var logger: js.UndefOr[Logger] = js.native
  var onAuthorizationFailedHandler: js.UndefOr[
    typingsSlinky.authmosphere.scopeMiddlewareOptionsMod.onAuthorizationFailedHandler
  ] = js.native
  var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.native
}

object ScopeMiddlewareOptions {
  @scala.inline
  def apply(): ScopeMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeMiddlewareOptions]
  }
  @scala.inline
  implicit class ScopeMiddlewareOptionsOps[Self <: ScopeMiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuthorizationFailedHandler(
      value: (/* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* resonse */ Response_[js.Any], /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuthorizationFailedHandler")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnAuthorizationFailedHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuthorizationFailedHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecedenceOptions(value: PrecedenceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedenceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecedenceOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedenceOptions")(js.undefined)
        ret
    }
  }
  
}

