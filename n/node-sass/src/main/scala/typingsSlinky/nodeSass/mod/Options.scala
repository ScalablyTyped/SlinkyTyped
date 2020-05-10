package typingsSlinky.nodeSass.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeSass.nodeSassStrings.compact
import typingsSlinky.nodeSass.nodeSassStrings.compressed
import typingsSlinky.nodeSass.nodeSassStrings.expanded
import typingsSlinky.nodeSass.nodeSassStrings.nested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
  var functions: js.UndefOr[FunctionDeclarations[SassFunction]] = js.native
  var importer: js.UndefOr[Importer | js.Array[Importer]] = js.native
  var includePaths: js.UndefOr[js.Array[String]] = js.native
  var indentType: js.UndefOr[String] = js.native
  var indentWidth: js.UndefOr[Double] = js.native
  var indentedSyntax: js.UndefOr[Boolean] = js.native
  var linefeed: js.UndefOr[String] = js.native
  var omitSourceMapUrl: js.UndefOr[Boolean] = js.native
  var outFile: js.UndefOr[String] = js.native
  var outputStyle: js.UndefOr[compact | compressed | expanded | nested] = js.native
  var precision: js.UndefOr[Double] = js.native
  var sourceComments: js.UndefOr[Boolean] = js.native
  var sourceMap: js.UndefOr[Boolean | String] = js.native
  var sourceMapContents: js.UndefOr[Boolean] = js.native
  var sourceMapEmbed: js.UndefOr[Boolean] = js.native
  var sourceMapRoot: js.UndefOr[String] = js.native
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
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctions(value: FunctionDeclarations[SassFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(js.undefined)
        ret
    }
    @scala.inline
    def withImporter(value: Importer | js.Array[Importer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importer")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentedSyntax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentedSyntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentedSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentedSyntax")(js.undefined)
        ret
    }
    @scala.inline
    def withLinefeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linefeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinefeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linefeed")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitSourceMapUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitSourceMapUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitSourceMapUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitSourceMapUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withoutOutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputStyle(value: compact | compressed | expanded | nested): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceComments")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean | String): Self = {
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
    def withSourceMapContents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapContents")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapEmbed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapEmbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapEmbed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapEmbed")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapRoot")(js.undefined)
        ret
    }
  }
  
}

