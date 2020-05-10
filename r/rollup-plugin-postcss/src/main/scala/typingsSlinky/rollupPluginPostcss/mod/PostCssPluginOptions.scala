package typingsSlinky.rollupPluginPostcss.mod

import typingsSlinky.cssnano.mod.CssNanoOptions
import typingsSlinky.rollupPluginPostcss.AnonCtx
import typingsSlinky.rollupPluginPostcss.AnonInsertAt
import typingsSlinky.rollupPluginPostcss.rollupPluginPostcssStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCssPluginOptions extends js.Object {
  var autoModules: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[Boolean | AnonCtx] = js.native
  var exec: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var extract: js.UndefOr[Boolean | String] = js.native
  var inject: js.UndefOr[Boolean | AnonInsertAt] = js.native
  var loaders: js.UndefOr[js.Array[_]] = js.native
  var minimize: js.UndefOr[Boolean | CssNanoOptions] = js.native
  var modules: js.UndefOr[Boolean | js.Any] = js.native
  var name: js.UndefOr[js.Array[_ | js.Array[_]]] = js.native
  var namedExports: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | Boolean]] = js.native
  var onImport: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.native
  var parser: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.native
  var plugins: js.UndefOr[js.Array[_]] = js.native
  var sourceMap: js.UndefOr[Boolean | `inline`] = js.native
  var stringifier: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.native
  var syntax: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.native
}

object PostCssPluginOptions {
  @scala.inline
  def apply(): PostCssPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCssPluginOptions]
  }
  @scala.inline
  implicit class PostCssPluginOptionsOps[Self <: PostCssPluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoModules")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: Boolean | AnonCtx): Self = {
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
    def withExec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtract(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(js.undefined)
        ret
    }
    @scala.inline
    def withInject(value: Boolean | AnonInsertAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimize(value: Boolean | CssNanoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: Boolean | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: js.Array[_ | js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedExports(value: /* repeated */ js.Any => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNamedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImport(value: /* id */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImport")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: /* repeated */ js.Any => Unit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
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
    def withSourceMap(value: Boolean | `inline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withStringifier(value: /* repeated */ js.Any => Unit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStringifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: /* repeated */ js.Any => Unit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.undefined)
        ret
    }
  }
  
}

