package typingsSlinky.karmaWebpack.mod

import typingsSlinky.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  var webpack: Configuration = js.native
  var webpackMiddleware: KarmaWebpackMiddlewareOptions = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(webpack: Configuration, webpackMiddleware: KarmaWebpackMiddlewareOptions): ConfigOptions = {
    val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackMiddleware = webpackMiddleware.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebpack(value: Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebpackMiddleware(value: KarmaWebpackMiddlewareOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackMiddleware")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

