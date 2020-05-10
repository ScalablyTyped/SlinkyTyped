package typingsSlinky.htmlWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.htmlWebpackPlugin.htmlWebpackPluginBooleans.`false`
import typingsSlinky.htmlWebpackPlugin.htmlWebpackPluginStrings.all
import typingsSlinky.htmlWebpackPlugin.htmlWebpackPluginStrings.auto
import typingsSlinky.htmlWebpackPlugin.htmlWebpackPluginStrings.body
import typingsSlinky.htmlWebpackPlugin.htmlWebpackPluginStrings.dependency
import typingsSlinky.htmlWebpackPlugin.htmlWebpackPluginStrings.head
import typingsSlinky.htmlWebpackPlugin.htmlWebpackPluginStrings.manual
import typingsSlinky.htmlWebpackPlugin.htmlWebpackPluginStrings.none
import typingsSlinky.webpack.mod.compilation.Chunk
import typingsSlinky.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /**
		 * In addition to the options actually used by this plugin, you can use this hash to pass arbitrary data through
		 * to your template.
		 */
/* option */ StringDictionary[js.Any] {
  /**
  		 * Emit the file only if it was changed.
  		 * Default: `true`.
  		 */
  var cache: js.UndefOr[Boolean] = js.native
  /**
  		 * Allows you to add only some chunks (e.g. only the unit-test chunk).
  		 * Default: 'all'.
  		 */
  var chunks: js.UndefOr[all | js.Array[String]] = js.native
  /**
  		 * Allows to control how chunks should be sorted before they are included to the html.
  		 * Default: `'auto'`.
  		 */
  var chunksSortMode: js.UndefOr[
    none | auto | dependency | manual | (js.Function2[/* a */ Chunk, /* b */ Chunk, Double])
  ] = js.native
  /**
  		 * Allows you to skip some chunks (e.g. don't add the unit-test chunk).
  		 * Default: `[]`.
  		 */
  var excludeChunks: js.UndefOr[js.Array[String]] = js.native
  /**
  		 * Adds the given favicon path to the output html.
  		 * Default: `false`.
  		 */
  var favicon: js.UndefOr[`false` | String] = js.native
  /**
  		 * The file to write the HTML to.
  		 * You can specify a subdirectory here too (eg: `assets/admin.html`).
  		 * Default: `'index.html'`.
  		 */
  var filename: js.UndefOr[String] = js.native
  /**
  		 * If true then append a unique webpack compilation hash to all included scripts and CSS files.
  		 * This is useful for cache busting.
  		 * Default: `false`.
  		 */
  var hash: js.UndefOr[Boolean] = js.native
  /**
  		 * Inject all assets into the given template or templateContent.
  		 * When passing true or 'body' all javascript resources will be placed at the bottom of the body element.
  		 * 'head' will place the scripts in the head element.
  		 * Default: `true`.
  		 */
  var inject: js.UndefOr[body | head | Boolean] = js.native
  /**
  		 * Allows to inject meta-tags, e.g. meta: `{viewport: 'width=device-width, initial-scale=1, shrink-to-fit=no'}`.
  		 * Default: `{}`.
  		 */
  var meta: js.UndefOr[`false` | StringDictionary[js.Any]] = js.native
  /**
  		 * Pass a html-minifier options object to minify the output.
  		 * https://github.com/kangax/html-minifier#options-quick-reference
  		 * Default: `false`.
  		 */
  var minify: js.UndefOr[`false` | MinifyOptions] = js.native
  /**
  		 * Errors details will be written into the HTML page.
  		 * Default: `true`.
  		 */
  var showErrors: js.UndefOr[Boolean] = js.native
  /**
  		 * The `webpack` require path to the template.
  		 * @see https://github.com/jantimon/html-webpack-plugin/blob/master/docs/template-option.md
  		 */
  var template: js.UndefOr[String] = js.native
  /**
  		 * Allow to use a html string instead of reading from a file.
  		 * Default: `false`, meaning the `template` option should be used instead.
  		 */
  var templateContent: js.UndefOr[`false` | String | js.Promise[String]] = js.native
  /**
  		 * Allows to overwrite the parameters used in the template.
  		 */
  var templateParameters: js.UndefOr[
    `false` | (js.Function3[
      /* compilation */ Compilation, 
      /* assets */ TemplateParametersAssets, 
      /* options */ this.type, 
      _
    ]) | StringDictionary[js.Any]
  ] = js.native
  /**
  		 * The title to use for the generated HTML document.
  		 * Default: `'Webpack App'`.
  		 */
  var title: js.UndefOr[String] = js.native
  /**
  		 * If true render the link tags as self-closing (XHTML compliant).
  		 * Default: `false`.
  		 */
  var xhtml: js.UndefOr[Boolean] = js.native
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
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withChunks(value: all | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(js.undefined)
        ret
    }
    @scala.inline
    def withChunksSortModeFunction2(value: (/* a */ Chunk, /* b */ Chunk) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksSortMode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChunksSortMode(value: none | auto | dependency | manual | (js.Function2[/* a */ Chunk, /* b */ Chunk, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksSortMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunksSortMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksSortMode")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeChunks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withFavicon(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavicon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicon")(js.undefined)
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
    def withHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withInject(value: body | head | Boolean): Self = {
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
    def withMeta(value: `false` | StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: `false` | MinifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withShowErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateContent(value: `false` | String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateParametersFunction3(value: (/* compilation */ Compilation, /* assets */ TemplateParametersAssets, Options) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateParameters")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTemplateParameters(
      value: `false` | (js.Function3[/* compilation */ Compilation, /* assets */ TemplateParametersAssets, Options, _]) | StringDictionary[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withXhtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtml")(js.undefined)
        ret
    }
  }
  
}

