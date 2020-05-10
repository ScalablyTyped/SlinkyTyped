package typingsSlinky.less.Less_

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.less.lessStrings.`parens-division`
import typingsSlinky.less.lessStrings.`strict-legacy`
import typingsSlinky.less.lessStrings.always
import typingsSlinky.less.lessStrings.comment
import typingsSlinky.less.lessStrings.parens
import typingsSlinky.less.lessStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to:
  * * https://github.com/less/less.js/blob/master/bin/lessc
  * * http://lesscss.org/usage/#less-options
  *
  * @interface Options
  */
@js.native
trait Options extends js.Object {
  /** @deprecated If false, No color in compiling. */
  var color: js.UndefOr[Boolean] = js.native
  /** @deprecated If true, compress using less built-in compression. */
  var compress: js.UndefOr[Boolean] = js.native
  var depends: js.UndefOr[Boolean] = js.native
  /** Whether output file information and line numbers in compiled CSS code. */
  var dumpLineNumbers: js.UndefOr[comment | String] = js.native
  /** Filename of the main file to be passed to less.render() */
  var filename: js.UndefOr[String] = js.native
  /** Defines a variable that can be referenced by the file. */
  var globalVars: js.UndefOr[StringDictionary[String]] = js.native
  /** @deprecated False by default. */
  var ieCompat: js.UndefOr[Boolean] = js.native
  /** If true, allow imports from insecure https hosts. */
  var insecure: js.UndefOr[Boolean] = js.native
  /** @deprecated If true, enable evaluation of JavaScript inline in `.less` files. */
  var javascriptEnabled: js.UndefOr[Boolean] = js.native
  /** True, if run the less parser and just reports errors without any output. */
  var lint: js.UndefOr[Boolean] = js.native
  /** Math mode options for avoiding symbol conficts on math expressions. */
  var math: js.UndefOr[always | strict | `parens-division` | parens | `strict-legacy` | Double] = js.native
  var maxLineLen: js.UndefOr[Double] = js.native
  /** Puts Var declaration at the end of base file. */
  var modifyVars: js.UndefOr[StringDictionary[String]] = js.native
  /** The locations for less looking for files in @import rules */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /** Pre-load global Less.js plugins */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  /** Add a path to every generated import and url in output css files. */
  var rootpath: js.UndefOr[String] = js.native
  /** If true, stops any warnings from being shown. */
  var silent: js.UndefOr[Boolean] = js.native
  var sourceMap: js.UndefOr[SourceMapOption] = js.native
  var strictImports: js.UndefOr[Boolean] = js.native
  /** Without this option, Less attempts to guess at the output unit when it does maths. */
  var strictUnits: js.UndefOr[Boolean] = js.native
  /** Read files synchronously in Node.js */
  var syncImport: js.UndefOr[Boolean] = js.native
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
    def withColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withDepends(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depends")(js.undefined)
        ret
    }
    @scala.inline
    def withDumpLineNumbers(value: comment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpLineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDumpLineNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpLineNumbers")(js.undefined)
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
    def withGlobalVars(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalVars")(js.undefined)
        ret
    }
    @scala.inline
    def withIeCompat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieCompat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeCompat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieCompat")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(js.undefined)
        ret
    }
    @scala.inline
    def withJavascriptEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavascriptEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(js.undefined)
        ret
    }
    @scala.inline
    def withMath(value: always | strict | `parens-division` | parens | `strict-legacy` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("math")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("math")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLineLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLineLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLen")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyVars(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyVars")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin]): Self = {
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
    def withRootpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootpath")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: SourceMapOption): Self = {
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
    def withStrictImports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictImports")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictUnits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncImport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncImport")(js.undefined)
        ret
    }
  }
  
}

