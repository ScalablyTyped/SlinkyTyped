package typingsSlinky.apolloServerExpress.apolloServerMod

import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.cors.mod.CorsOptions
import typingsSlinky.cors.mod.CorsOptionsDelegate
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMiddlewareOptions extends js.Object {
  var bodyParserConfig: js.UndefOr[OptionsJson | Boolean] = js.undefined
  var cors: js.UndefOr[CorsOptions | CorsOptionsDelegate | Boolean] = js.undefined
  var disableHealthCheck: js.UndefOr[Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Promise[_]]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object GetMiddlewareOptions {
  @scala.inline
  def apply(
    bodyParserConfig: OptionsJson | Boolean = null,
    cors: CorsOptions | CorsOptionsDelegate | Boolean = null,
    disableHealthCheck: js.UndefOr[Boolean] = js.undefined,
    onHealthCheck: /* req */ Request_[ParamsDictionary, _, _, Query] => js.Promise[_] = null,
    path: String = null
  ): GetMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (bodyParserConfig != null) __obj.updateDynamic("bodyParserConfig")(bodyParserConfig.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHealthCheck)) __obj.updateDynamic("disableHealthCheck")(disableHealthCheck.get.asInstanceOf[js.Any])
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(js.Any.fromFunction1(onHealthCheck))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMiddlewareOptions]
  }
}

