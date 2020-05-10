package typingsSlinky.escodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOptions extends js.Object {
  /**
    * If comments are attached to AST, escodegen is going to emit comments to output code. Default is false.
    */
  var comment: js.UndefOr[Boolean] = js.native
  /**
    * Recognize DirectiveStatement and distinguish it from ExpressionStatement. Default: false
    */
  var directive: js.UndefOr[Boolean] = js.native
  /**
    * If file is provided, it will be used as file property of generated source map.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * The format options
    */
  var format: js.UndefOr[FormatOptions] = js.native
  var moz: js.UndefOr[MozillaOptions] = js.native
  /**
    * Mozilla Parser API compatible parse function, e.g., the parse function exported by esprima. If it is provided, generator tries to use the 'raw' representation. See esprima raw information. Default is null.
    */
  var parse: js.UndefOr[js.Function] = js.native
  var sourceCode: js.UndefOr[String] = js.native
  /**
    * Optionally option.sourceContent string can be passed (which represents original source of the file, for example it could be a source of coffeescript from which JS is being generated), if provided generated source map will have original source embedded in it.
    */
  var sourceContent: js.UndefOr[String] = js.native
  /**
    * sourceMap is the source maps's source filename, that's a name that will show up in the browser debugger for the generated source (if source-maps is enabled).
    * If a non-empty string value is provided, generate a source map.
    */
  var sourceMap: js.UndefOr[String] = js.native
  /**
    * Optionally option.sourceMapRoot can be provided, in which case option.sourceMap will be treated as relative to it. For more information about source map itself, see source map library document, V3 draft and HTML5Rocks introduction. Default is undefined
    * sourceMapRoot is the source root for the source map (see the Mozilla documentation). If sourceMapWithCode is truthy, an object is returned from generate() of the form: { code: .. , map: .. }. If file is provided, it will be used as file property of generated source map.
    */
  var sourceMapRoot: js.UndefOr[String] = js.native
  /**
    * . If sourceMapWithCode is true generator returns output hash, where output.map is a source-map representation, which can be serialized as output.map.toString(). output.code is a string with generated JS code (note that it's not going to have //@ sourceMappingURL comment in it).
    */
  var sourceMapWithCode: js.UndefOr[Boolean] = js.native
  /**
    * Providing verbatim code generation option to Expression nodes.
    * verbatim option is provided by user as string. When generating Expression code,
    * looking up node[option.verbatim] value and dump it instead of normal code generation.
    *
    * @example
    *
    */
  var verbatim: js.UndefOr[String] = js.native
}

object GenerateOptions {
  @scala.inline
  def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  @scala.inline
  implicit class GenerateOptionsOps[Self <: GenerateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDirective(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(js.undefined)
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
    def withFormat(value: FormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withMoz(value: MozillaOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moz")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: js.Function): Self = {
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
    def withSourceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: String): Self = {
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
    @scala.inline
    def withSourceMapWithCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapWithCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapWithCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapWithCode")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbatim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbatim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbatim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbatim")(js.undefined)
        ret
    }
  }
  
}

