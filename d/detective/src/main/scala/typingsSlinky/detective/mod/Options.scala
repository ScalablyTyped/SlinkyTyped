package typingsSlinky.detective.mod

import typingsSlinky.detective.detectiveStrings.module
import typingsSlinky.detective.detectiveStrings.never
import typingsSlinky.detective.detectiveStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * When this is enabled (off by default), if the code starts with the
    * characters #! (as in a shellscript), the first line will be treated as a comment.
    */
  var allowHashBang: js.UndefOr[Boolean] = js.native
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
  /**
    * If false, using a reserved word will generate an error. Defaults to true for ecmaVersion 3,
    * false for higher versions. When given the value "never", reserved words and keywords can
    * also not be used as property names (as in Internet Explorer's old parser).
    */
  var allowReserved: js.UndefOr[Boolean | never] = js.native
  /**
    * By default, a return statement at the top level raises an error. Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the ECMAScript version to parse. Must be either 3, 5, 6 (2015),
    * 7 (2016), 8 (2017), 9 (2018) or 10 (2019, partial support). This influences
    * support for strict mode, the set of reserved words, and support for new syntax features.
    * Default is 9.
    */
  var ecmaVersion: js.UndefOr[String | Double] = js.native
  /**
    * a function returning whether an AST CallExpression node is a require call
    */
  var isRequire: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.native
  /**
    * When true, each node has a loc object attached with start and end subobjects, each of which
    * contains the one-based line and zero-based column numbers in {line, column} form. Default is false.
    */
  var locations: js.UndefOr[Boolean] = js.native
  /**
    * when true, populate found.nodes
    */
  var nodes: js.UndefOr[String] = js.native
  /**
    * supply options directly to acorn with some support for esprima-style options range and loc
    */
  var parse: js.UndefOr[typingsSlinky.acorn.mod.Options] = js.native
  /**
    * Nodes have their start and end characters offsets recorded in start and end properties
    * (directly on the node, rather than the loc object, which holds line/column data.
    * To also add a semi-standardized range property holding a [start, end] array with
    * the same numbers, set the ranges option to true.
    */
  var ranges: js.UndefOr[String] = js.native
  /**
    * Indicate the mode the code should be parsed in. Can be either "script" or "module".
    * This influences global strict mode and parsing of import and export declarations.
    */
  var sourceType: js.UndefOr[script | module] = js.native
  /**
    * specify a different function name instead of "require"
    */
  var word: js.UndefOr[String] = js.native
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
    def withAllowHashBang(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHashBang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHashBang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHashBang")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowImportExportEverywhere(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImportExportEverywhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowImportExportEverywhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImportExportEverywhere")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReserved(value: Boolean | never): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReserved")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReturnOutsideFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReturnOutsideFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReturnOutsideFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReturnOutsideFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withEcmaVersion(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcmaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequire(value: /* node */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequire")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequire")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: typingsSlinky.acorn.mod.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: script | module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(js.undefined)
        ret
    }
  }
  
}

