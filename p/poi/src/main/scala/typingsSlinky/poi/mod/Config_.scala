package typingsSlinky.poi.mod

import typingsSlinky.poi.mod.Config.Assets
import typingsSlinky.poi.mod.Config.Babel
import typingsSlinky.poi.mod.Config.ChainWebpack
import typingsSlinky.poi.mod.Config.ConfigureWebpack
import typingsSlinky.poi.mod.Config.Constants
import typingsSlinky.poi.mod.Config.Css
import typingsSlinky.poi.mod.Config.DevServer
import typingsSlinky.poi.mod.Config.Entry
import typingsSlinky.poi.mod.Config.Envs
import typingsSlinky.poi.mod.Config.Output
import typingsSlinky.poi.mod.Config.Pages
import typingsSlinky.poi.mod.Config.Plugins
import typingsSlinky.poi.mod.Config.PublicFolder
import typingsSlinky.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://poi.js.org/config.html
  */
@js.native
trait Config_ extends js.Object {
  var assets: js.UndefOr[Assets] = js.native
  var babel: js.UndefOr[Babel] = js.native
  var chainWebpack: js.UndefOr[ChainWebpack] = js.native
  var configureWebpack: js.UndefOr[ConfigureWebpack] = js.native
  var constants: js.UndefOr[Constants] = js.native
  var css: js.UndefOr[Css] = js.native
  var devServer: js.UndefOr[DevServer] = js.native
  var entry: js.UndefOr[Entry] = js.native
  var envs: js.UndefOr[Envs] = js.native
  var output: js.UndefOr[Output] = js.native
  var pages: js.UndefOr[Pages] = js.native
  var plugins: js.UndefOr[Plugins] = js.native
  var publicFolder: js.UndefOr[PublicFolder] = js.native
}

object Config_ {
  @scala.inline
  def apply(): Config_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config_]
  }
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: Assets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(js.undefined)
        ret
    }
    @scala.inline
    def withBabel(value: Babel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babel")(js.undefined)
        ret
    }
    @scala.inline
    def withChainWebpack(value: (/* config */ typingsSlinky.webpackChain.mod.^, /* opts */ Opts) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainWebpack")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChainWebpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainWebpack")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigureWebpackFunction2(value: (/* config */ Configuration, /* opts */ Opts) => Unit | Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureWebpack")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConfigureWebpack(value: ConfigureWebpack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureWebpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigureWebpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureWebpack")(js.undefined)
        ret
    }
    @scala.inline
    def withConstants(value: Constants): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: Css): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withDevServer(value: DevServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devServer")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryFunction0(
      value: () => String | js.Array[String] | typingsSlinky.webpack.mod.Entry | (js.Promise[String | js.Array[String] | typingsSlinky.webpack.mod.Entry])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEntry(value: Entry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvs(value: Envs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: Output): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: Pages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: Plugins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicFolder(value: PublicFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicFolder")(js.undefined)
        ret
    }
  }
  
}

