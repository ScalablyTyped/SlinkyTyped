package typingsSlinky.authmosphere.libSrcTypesScopeMiddlewareOptionsMod

import typingsSlinky.authmosphere.libSrcTypesLoggerMod.Logger
import typingsSlinky.authmosphere.libSrcTypesPrecedenceMod.PrecedenceOptions
import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeMiddlewareOptions extends js.Object {
  var logger: js.UndefOr[Logger] = js.undefined
  var onAuthorizationFailedHandler: js.UndefOr[
    typingsSlinky.authmosphere.libSrcTypesScopeMiddlewareOptionsMod.onAuthorizationFailedHandler
  ] = js.undefined
  var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.undefined
}

object ScopeMiddlewareOptions {
  @scala.inline
  def apply(
    logger: Logger = null,
    onAuthorizationFailedHandler: (/* request */ Request[ParamsDictionary], /* resonse */ Response, /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Unit = null,
    precedenceOptions: PrecedenceOptions = null
  ): ScopeMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (onAuthorizationFailedHandler != null) __obj.updateDynamic("onAuthorizationFailedHandler")(js.Any.fromFunction5(onAuthorizationFailedHandler))
    if (precedenceOptions != null) __obj.updateDynamic("precedenceOptions")(precedenceOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeMiddlewareOptions]
  }
}

