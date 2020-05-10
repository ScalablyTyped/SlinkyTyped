package typingsSlinky.authmosphere.authenticationMiddlewareOptionsMod

import typingsSlinky.authmosphere.getTokenInfoMod.GetTokenInfo
import typingsSlinky.authmosphere.loggerMod.Logger
import typingsSlinky.authmosphere.tokenMod.Token
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationMiddlewareOptions extends js.Object {
  var getTokenInfo: js.UndefOr[GetTokenInfo[js.Object]] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var onNotAuthenticatedHandler: js.UndefOr[
    typingsSlinky.authmosphere.authenticationMiddlewareOptionsMod.onNotAuthenticatedHandler
  ] = js.native
  var publicEndpoints: js.UndefOr[js.Array[String]] = js.native
  var tokenInfoEndpoint: String = js.native
}

object AuthenticationMiddlewareOptions {
  @scala.inline
  def apply(tokenInfoEndpoint: String): AuthenticationMiddlewareOptions = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationMiddlewareOptions]
  }
  @scala.inline
  implicit class AuthenticationMiddlewareOptionsOps[Self <: AuthenticationMiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokenInfoEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenInfoEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTokenInfo(
      value: (/* tokenInfoUrl */ String, /* accessToken */ String, /* logger */ js.UndefOr[Logger]) => js.Promise[Token[js.Object]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTokenInfo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetTokenInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTokenInfo")(js.undefined)
        ret
    }
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
    def withOnNotAuthenticatedHandler(
      value: (/* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* resonse */ Response_[js.Any], /* next */ NextFunction, /* logger */ Logger) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotAuthenticatedHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnNotAuthenticatedHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotAuthenticatedHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicEndpoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicEndpoints")(js.undefined)
        ret
    }
  }
  
}

