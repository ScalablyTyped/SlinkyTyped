package typingsSlinky.koaWebpack.mod

import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var compiler: js.UndefOr[Compiler_] = js.native
  var config: js.UndefOr[Configuration] = js.native
  var devMiddleware: js.UndefOr[typingsSlinky.webpackDevMiddleware.mod.Options] = js.native
  var hotClient: js.UndefOr[typingsSlinky.webpackHotClient.mod.Options | Boolean] = js.native
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
    def withCompiler(value: Compiler_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompiler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDevMiddleware(value: typingsSlinky.webpackDevMiddleware.mod.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMiddleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMiddleware")(js.undefined)
        ret
    }
    @scala.inline
    def withHotClient(value: typingsSlinky.webpackHotClient.mod.Options | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotClient")(js.undefined)
        ret
    }
  }
  
}

