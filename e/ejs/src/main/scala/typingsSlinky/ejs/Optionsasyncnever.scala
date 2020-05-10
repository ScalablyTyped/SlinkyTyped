package typingsSlinky.ejs

import typingsSlinky.ejs.mod.EscapeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ejs.ejs.Options & {  async ? :never} */
@js.native
trait Optionsasyncnever extends js.Object {
  /**
  	 * Whether or not to use `with () {}` construct in the generated template
  	 * functions. If set to `false`, data is still accessible through the object
  	 * whose name is specified by `ejs.localsName` (defaults to `locals`).
  	 *
  	 * @default true
  	 */
  var _with: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether or not to create an async function instead of a regular function.
  	 * This requires language support.
  	 *
  	 * @default false
  	 */
  var async: js.UndefOr[Boolean] = js.native
  /**
  	 * Make sure to set this to 'false' in order to skip UglifyJS parsing,
  	 * when using ES6 features (`const`, etc) as UglifyJS doesn't understand them.
  	 * @default true
  	 */
  var beautify: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether or not to enable caching of template functions. Beware that
  	 * the options of compilation are not checked as being the same, so
  	 * special handling is required if, for example, you want to cache client
  	 * and regular functions of the same file.
  	 *
  	 * Requires `filename` to be set. Only works with rendering function.
  	 *
  	 * @default false
  	 */
  var cache: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether or not to compile a `ClientFunction` that can be rendered
  	 * in the browser without depending on ejs.js. Otherwise, a `TemplateFunction`
  	 * will be compiled.
  	 *
  	 * @default false
  	 */
  var client: js.UndefOr[Boolean] = js.native
  /**
  	 * The closing delimiter for all statements. This allows to to clearly delinate
  	 * the difference between template code and existing delimiters. (It is recommended
  	 * to synchronize this with the openDelimiter property.)
  	 *
  	 * @default ejs.closeDelimiter
  	 */
  var closeDelimiter: js.UndefOr[String] = js.native
  /**
  	 * Include additional runtime debugging information in generated template
  	 * functions.
  	 *
  	 * @default true
  	 */
  var compileDebug: js.UndefOr[Boolean] = js.native
  /**
  	 * The Object to which `this` is set during rendering.
  	 *
  	 * @default this
  	 */
  var context: js.UndefOr[js.Any] = js.native
  /**
  	 * Log the generated JavaScript source for the EJS template to the console.
  	 *
  	 * @default false
  	 */
  var debug: js.UndefOr[Boolean] = js.native
  /**
  	 * Character to use with angle brackets for open/close
  	 * @default '%'
  	 */
  var delimiter: js.UndefOr[String] = js.native
  /**
  	 * An array of local variables that are always destructured from `localsName`,
  	 * available even in strict mode.
  	 *
  	 * @default []
  	 */
  var destructuredLocals: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * The escaping function used with `<%=` construct. It is used in rendering
  	 * and is `.toString()`ed in the generation of client functions.
  	 *
  	 * @default ejs.escapeXML
  	 */
  var escape: js.UndefOr[EscapeCallback] = js.native
  /**
  	 * The filename of the template. Required for inclusion and caching unless
  	 * you are using `renderFile`. Also used for error reporting.
  	 *
  	 * @default undefined
  	 */
  var filename: js.UndefOr[String] = js.native
  /**
  	 * Name to use for the object storing local variables when not using `with` or destructuring.
  	 *
  	 * @default ejs.localsName
  	 */
  var localsName: js.UndefOr[String] = js.native
  /**
  	 * The opening delimiter for all statements. This allows you to clearly delinate
  	 * the difference between template code and existing delimiters. (It is recommended
  	 * to synchronize this with the closeDelimiter property.)
  	 *
  	 * @default ejs.openDelimiter
  	 */
  var openDelimiter: js.UndefOr[String] = js.native
  /** Set to a string (e.g., 'echo' or 'print') for a function to print output inside scriptlet tags. */
  var outputFunctionName: js.UndefOr[String] = js.native
  /**
  	 * Remove all safe-to-remove whitespace, including leading and trailing
  	 * whitespace. It also enables a safer version of `-%>` line slurping for all
  	 * scriptlet tags (it does not strip new lines of tags in the middle of a
  	 * line).
  	 *
  	 * @default false
  	 */
  var rmWhitespace: js.UndefOr[Boolean] = js.native
  /**
  	 * The path to the project root. When this is set, absolute paths for includes
  	 * (/filename.ejs) will be relative to the project root.
  	 *
  	 * @default undefined
  	 */
  var root: js.UndefOr[String] = js.native
  /**
  	 * Whether to run in strict mode or not.
  	 * Enforces `_with=false`.
  	 *
  	 * @default false
  	 */
  var strict: js.UndefOr[Boolean] = js.native
}

object Optionsasyncnever {
  @scala.inline
  def apply(): Optionsasyncnever = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsasyncnever]
  }
  @scala.inline
  implicit class OptionsasyncneverOps[Self <: Optionsasyncnever] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_with(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_with")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_with: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_with")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withBeautify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeautify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautify")(js.undefined)
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
    def withClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withCompileDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompileDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileDebug")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDestructuredLocals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructuredLocals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestructuredLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructuredLocals")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
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
    def withLocalsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localsName")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFunctionName")(js.undefined)
        ret
    }
    @scala.inline
    def withRmWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRmWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

