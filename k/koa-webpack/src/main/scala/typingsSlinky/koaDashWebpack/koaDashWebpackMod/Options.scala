package typingsSlinky.koaDashWebpack.koaDashWebpackMod

import typingsSlinky.webpack.webpackMod.Compiler
import typingsSlinky.webpack.webpackMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var compiler: js.UndefOr[Compiler] = js.undefined
  var config: js.UndefOr[Configuration] = js.undefined
  var devMiddleware: js.UndefOr[
    typingsSlinky.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod.Options
  ] = js.undefined
  var hotClient: js.UndefOr[
    typingsSlinky.webpackDashHotDashClient.webpackDashHotDashClientMod.Options | Boolean
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compiler: Compiler = null,
    config: Configuration = null,
    devMiddleware: typingsSlinky.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod.Options = null,
    hotClient: typingsSlinky.webpackDashHotDashClient.webpackDashHotDashClientMod.Options | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compiler != null) __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (devMiddleware != null) __obj.updateDynamic("devMiddleware")(devMiddleware.asInstanceOf[js.Any])
    if (hotClient != null) __obj.updateDynamic("hotClient")(hotClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

