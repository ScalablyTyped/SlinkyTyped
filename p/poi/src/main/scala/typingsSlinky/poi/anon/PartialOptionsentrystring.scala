package typingsSlinky.poi.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.htmlWebpackPlugin.mod.MinifyOptions
import typingsSlinky.htmlWebpackPlugin.mod.TemplateParametersAssets
import typingsSlinky.poi.poiBooleans.`false`
import typingsSlinky.poi.poiStrings.all
import typingsSlinky.poi.poiStrings.auto
import typingsSlinky.poi.poiStrings.body
import typingsSlinky.poi.poiStrings.dependency
import typingsSlinky.poi.poiStrings.head
import typingsSlinky.poi.poiStrings.manual
import typingsSlinky.poi.poiStrings.none
import typingsSlinky.webpack.mod.compilation.Chunk
import typingsSlinky.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<html-webpack-plugin.html-webpack-plugin.Options> & {  entry  :string,   chunks ? :std.Array<string>} */
@js.native
trait PartialOptionsentrystring extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var chunks: js.UndefOr[(all | js.Array[String]) with js.Array[String]] = js.native
  var chunksSortMode: js.UndefOr[
    none | auto | dependency | manual | (js.Function2[/* a */ Chunk, /* b */ Chunk, Double])
  ] = js.native
  var entry: String = js.native
  var excludeChunks: js.UndefOr[js.Array[String]] = js.native
  var favicon: js.UndefOr[`false` | String] = js.native
  var filename: js.UndefOr[String] = js.native
  var hash: js.UndefOr[Boolean] = js.native
  var inject: js.UndefOr[body | head | Boolean] = js.native
  var meta: js.UndefOr[`false` | StringDictionary[js.Any]] = js.native
  var minify: js.UndefOr[`false` | MinifyOptions] = js.native
  var showErrors: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var templateContent: js.UndefOr[`false` | String | js.Promise[String]] = js.native
  var templateParameters: js.UndefOr[
    `false` | (js.Function3[
      /* compilation */ Compilation, 
      /* assets */ TemplateParametersAssets, 
      /* options */ this.type, 
      _
    ]) | StringDictionary[js.Any]
  ] = js.native
  var title: js.UndefOr[String] = js.native
  var xhtml: js.UndefOr[Boolean] = js.native
}

object PartialOptionsentrystring {
  @scala.inline
  def apply(entry: String): PartialOptionsentrystring = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsentrystring]
  }
  @scala.inline
  implicit class PartialOptionsentrystringOps[Self <: PartialOptionsentrystring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withChunks(value: (all | js.Array[String]) with js.Array[String]): Self = {
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
    def withTemplateParametersFunction3(
      value: (/* compilation */ Compilation, /* assets */ TemplateParametersAssets, PartialOptionsentrystring) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateParameters")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTemplateParameters(
      value: `false` | (js.Function3[
          /* compilation */ Compilation, 
          /* assets */ TemplateParametersAssets, 
          PartialOptionsentrystring, 
          _
        ]) | StringDictionary[js.Any]
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

