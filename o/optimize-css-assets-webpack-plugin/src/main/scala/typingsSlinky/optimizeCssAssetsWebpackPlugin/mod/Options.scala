package typingsSlinky.optimizeCssAssetsWebpackPlugin.mod

import typingsSlinky.optimizeCssAssetsWebpackPlugin.AnonProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A regular expression that indicates the names of the assets that should
    * be optimized \ minimized. The regular expression provided is run against
    * the filenames of the files exported by the `ExtractTextPlugin` instances
    * in your configuration, not the filenames of your source CSS files
    *
    * @default /\.css$/g
    */
  var assetNameRegExp: js.UndefOr[js.RegExp] = js.native
  /**
    * A boolean indicating if the plugin can print messages to the console.
    *
    * @default true
    */
  var canPrint: js.UndefOr[Boolean] = js.native
  /**
    * The CSS processor used to optimize \ minimize the CSS. This should be a
    * function that follows `cssnano.process` interface (receives a CSS and
    * options parameters and returns a Promise).
    *
    * @default cssnano
    */
  var cssProcessor: js.UndefOr[AnonProcess] = js.native
  /**
    * The options passed to the `cssProcessor`.
    *
    * @default {}
    */
  var cssProcessorOptions: js.UndefOr[js.Object] = js.native
  /**
    * The plugin options passed to the `cssProcessor`.
    *
    * @default {}
    */
  var cssProcessorPluginOptions: js.UndefOr[js.Object] = js.native
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
    def withAssetNameRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetNameRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetNameRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetNameRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withCanPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withCssProcessor(value: AnonProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProcessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withCssProcessorOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProcessorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssProcessorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProcessorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCssProcessorPluginOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProcessorPluginOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssProcessorPluginOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProcessorPluginOptions")(js.undefined)
        ret
    }
  }
  
}

