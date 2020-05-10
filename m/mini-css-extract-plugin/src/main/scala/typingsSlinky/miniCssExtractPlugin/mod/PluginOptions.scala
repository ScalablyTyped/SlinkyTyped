package typingsSlinky.miniCssExtractPlugin.mod

import typingsSlinky.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginOptions extends js.Object {
  var chunkFilename: js.UndefOr[String] = js.native
  /**
    * By default, mini-css-extract-plugin generates JS modules that use the CommonJS
    * modules syntax. There are some cases in which using ES modules is beneficial,
    * like in the case of module concatenation and tree shaking.
    */
  var esModule: js.UndefOr[Boolean] = js.native
  /**
    * Options similar to the same options in webpackOptions.output, both options are optional
    * May contain `[name]`, `[id]`, `hash` and `[chunkhash]`
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * For projects where CSS ordering has been mitigated through consistent
    * use of scoping or naming conventions, the CSS order warnings can be
    * disabled by setting this flag to true for the plugin.
    */
  var ignoreOrder: js.UndefOr[Boolean] = js.native
  /**
    * With the `moduleFilename` option you can use chunk data to customize the filename.
    * This is particularly useful when dealing with multiple entry points
    * and wanting to get more control out of the filename for a given entry point/chunk
    */
  var moduleFilename: js.UndefOr[js.Function1[/* chunk */ Chunk, String]] = js.native
}

object PluginOptions {
  @scala.inline
  def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withEsModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModule")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleFilename(value: /* chunk */ Chunk => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleFilename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModuleFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleFilename")(js.undefined)
        ret
    }
  }
  
}

