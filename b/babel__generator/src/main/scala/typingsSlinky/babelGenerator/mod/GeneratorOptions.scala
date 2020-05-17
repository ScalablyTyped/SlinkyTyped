package typingsSlinky.babelGenerator.mod

import typingsSlinky.babelGenerator.anon.Compact
import typingsSlinky.babelGenerator.babelGeneratorStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorOptions extends js.Object {
  /**
    * Optional string to add as a block comment at the end of the output file.
    */
  var auxiliaryCommentAfter: js.UndefOr[String] = js.native
  /**
    * Optional string to add as a block comment at the start of the output file.
    */
  var auxiliaryCommentBefore: js.UndefOr[String] = js.native
  /**
    * Should comments be included in output? Defaults to `true`.
    */
  var comments: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to avoid adding whitespace for formatting. Defaults to the value of `opts.minified`.
    */
  var compact: js.UndefOr[Boolean | auto] = js.native
  /**
    * Set to true to reduce whitespace (but not as much as opts.compact). Defaults to `false`.
    */
  var concise: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to enable support for experimental decorators syntax before module exports.
    * Defaults to `false`.
    */
  var decoratorsBeforeExport: js.UndefOr[Boolean] = js.native
  /**
    * Used in warning messages
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Options for outputting jsesc representation.
    */
  var jsescOption: js.UndefOr[Compact] = js.native
  /**
    * Set to true to run jsesc with "json": true to print "\\u00A9" vs. "©";
    */
  var jsonCompatibleStrings: js.UndefOr[Boolean] = js.native
  /**
    * Should the output be minified. Defaults to `false`.
    */
  var minified: js.UndefOr[Boolean] = js.native
  /**
    * Retain parens around function expressions (could be used to change engine parsing behavior)
    * Defaults to `false`.
    */
  var retainFunctionParens: js.UndefOr[Boolean] = js.native
  /**
    * Attempt to use the same line numbers in the output code as in the source code (helps preserve stack traces).
    * Defaults to `false`.
    */
  var retainLines: js.UndefOr[Boolean] = js.native
  /**
    * Function that takes a comment (as a string) and returns true if the comment should be included in the output.
    * By default, comments are included if `opts.comments` is `true` or if `opts.minifed` is `false` and the comment
    * contains `@preserve` or `@license`.
    */
  var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.native
  /**
    * The filename for the source code (i.e. the code in the `code` argument).
    * This will only be used if `code` is a string.
    */
  var sourceFileName: js.UndefOr[String] = js.native
  /**
    * Enable generating source maps. Defaults to `false`.
    */
  var sourceMaps: js.UndefOr[Boolean] = js.native
  /**
    * A root for all relative URLs in the source map.
    */
  var sourceRoot: js.UndefOr[String] = js.native
}

object GeneratorOptions {
  @scala.inline
  def apply(): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorOptions]
  }
  @scala.inline
  implicit class GeneratorOptionsOps[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuxiliaryCommentAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryCommentAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withAuxiliaryCommentBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryCommentBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withConcise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concise")(js.undefined)
        ret
    }
    @scala.inline
    def withDecoratorsBeforeExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratorsBeforeExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecoratorsBeforeExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratorsBeforeExport")(js.undefined)
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
    def withJsescOption(value: Compact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsescOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsescOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsescOption")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonCompatibleStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonCompatibleStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonCompatibleStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonCompatibleStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withMinified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minified")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainFunctionParens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainFunctionParens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainFunctionParens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainFunctionParens")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldPrintComment(value: /* comment */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrintComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldPrintComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrintComment")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.undefined)
        ret
    }
  }
  
}

