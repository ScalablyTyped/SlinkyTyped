package typingsSlinky.sass.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sass.mod.types.SassType
import typingsSlinky.sass.sassStrings.compressed
import typingsSlinky.sass.sassStrings.cr
import typingsSlinky.sass.sassStrings.crlf
import typingsSlinky.sass.sassStrings.expanded
import typingsSlinky.sass.sassStrings.lf
import typingsSlinky.sass.sassStrings.lfcr
import typingsSlinky.sass.sassStrings.space
import typingsSlinky.sass.sassStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A string to pass to compile.
    *
    * It is recommended that you use `includePaths` in conjunction with this so that sass can find files when using the @import directive.
    *
    * @default null
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Path to a file to compile.
    *
    * @default null
    */
  var file: js.UndefOr[String] = js.native
  /**
    * Holds a collection of custom functions that may be invoked by the sass files being compiled.
    *
    * @default undefined
    */
  var functions: js.UndefOr[StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]] = js.native
  /**
    * Handles when the @import directive is encountered.
    *
    * A custom importer allows extension of the sass engine in both a synchronous and asynchronous manner.
    *
    * @default undefined
    */
  var importer: js.UndefOr[Importer | js.Array[Importer]] = js.native
  /**
    * An array of paths that should be looked in to attempt to resolve your @import declarations.
    * When using `data`, it is recommended that you use this.
    *
    * @default []
    */
  var includePaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Used to determine whether to use space or tab character for indentation.
    *
    * @default 'space'
    */
  var indentType: js.UndefOr[space | tab] = js.native
  /**
    * Used to determine the number of spaces or tabs to be used for indentation.
    *
    * @default 2
    */
  var indentWidth: js.UndefOr[Double] = js.native
  /**
    * Enable Sass Indented Syntax for parsing the data string or file.
    *
    * @default false
    */
  var indentedSyntax: js.UndefOr[Boolean] = js.native
  /**
    * Used to determine which sequence to use for line breaks.
    *
    * @default 'lf'
    */
  var linefeed: js.UndefOr[cr | crlf | lf | lfcr] = js.native
  /**
    * Disable the inclusion of source map information in the output file.
    *
    * @default false
    */
  var omitSourceMapUrl: js.UndefOr[Boolean] = js.native
  /**
    * Specify the intended location of the output file.
    * Strongly recommended when outputting source maps so that they can properly refer back to their intended files.
    *
    * @default null
    */
  var outFile: js.UndefOr[String] = js.native
  /**
    * Determines the output format of the final CSS style.
    *
    * @default 'expanded'
    */
  var outputStyle: js.UndefOr[compressed | expanded] = js.native
  /**
    * Enables the outputting of a source map.
    *
    * @default undefined
    */
  var sourceMap: js.UndefOr[Boolean | String] = js.native
  /**
    * Includes the contents in the source map information.
    *
    * @default false
    */
  var sourceMapContents: js.UndefOr[Boolean] = js.native
  /**
    * Embeds the source map as a data URI.
    *
    * @default false
    */
  var sourceMapEmbed: js.UndefOr[Boolean] = js.native
  /**
    * The value will be emitted as `sourceRoot` in the source map information.
    *
    * @default undefined
    */
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
    def withFunctions(value: StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]): Self = {
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
    def withImporterFunction3(
      value: (/* url */ String, /* prev */ String, /* done */ js.Function1[/* data */ ImporterReturnType, Unit]) => ImporterReturnType | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importer")(js.Any.fromFunction3(value))
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
    def withIndentType(value: space | tab): Self = {
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
    def withLinefeed(value: cr | crlf | lf | lfcr): Self = {
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
    def withOutputStyle(value: compressed | expanded): Self = {
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

