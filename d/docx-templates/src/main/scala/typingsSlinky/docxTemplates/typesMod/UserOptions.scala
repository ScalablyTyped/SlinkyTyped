package typingsSlinky.docxTemplates.typesMod

import typingsSlinky.docxTemplates.AnonCtx
import typingsSlinky.docxTemplates.AnonModifiedSandbox
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserOptions extends js.Object {
  /**
    * Add functions or other static data to this option to have access to it in your commands.
    *
    * ```js
    * additionalJsContext: {
    *   qrCode: url => {
    *     const dataUrl = createQrImage(url, { size: 500 });
    *     const data = dataUrl.slice('data:image/gif;base64,'.length);
    *     return { width: 6, height: 6, data, extension: '.gif' };
    *   },
    * }
    * ```
    */
  var additionalJsContext: js.UndefOr[js.Object] = js.native
  /**
    * Defines a custom command delimiter. This can be a String e.g. '+++' or an Array of Strings with length 2: ['{', '}'] in which the first element serves as the start delimiter and the second as the end delimiter.
    */
  var cmdDelimiter: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  /**
    * Object of data to be injected or a (async) function that resolves to the data. The function gets as an argument the contents of the QUERY command as a string.
    */
  var data: js.UndefOr[ReportData | QueryResolver] = js.native
  /**
    * Whether to fail on the first error encountered in the template. Defaults to true. Can be used to collect all errors in a template (e.g. misspelled commands) before failing.
    */
  var failFast: js.UndefOr[Boolean] = js.native
  /**
    * Can be used to change the delimiter in generated XML.
    */
  var literalXmlDelimiter: js.UndefOr[String] = js.native
  /**
    * INSECURE: Set this option to true to disable running all commands in a new JS-VM. USE ONLY WITH TRUSTED TEMPLATES. Beware of arbitrary code injection risks. Can slightly improve performance on complex templates.
    */
  var noSandbox: js.UndefOr[Boolean] = js.native
  /**
    * Handle linebreaks in result of commands as actual linebreaks (Default: true)
    */
  var processLineBreaks: js.UndefOr[Boolean] = js.native
  /**
    * Gets injected into data function as second argument.
    */
  var queryVars: js.UndefOr[js.Any] = js.native
  /**
    * Custom sandbox. See documentation for details.
    */
  var runJs: js.UndefOr[RunJSFunc] = js.native
  /**
    * Docx file template as a NodeJS Buffer or Buffer-like object in Browsers.
    */
  var template: Buffer = js.native
}

object UserOptions {
  @scala.inline
  def apply(template: Buffer): UserOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOptions]
  }
  @scala.inline
  implicit class UserOptionsOps[Self <: UserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalJsContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalJsContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalJsContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalJsContext")(js.undefined)
        ret
    }
    @scala.inline
    def withCmdDelimiter(value: String | (js.Tuple2[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmdDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFunction2(
      value: (/* query */ js.UndefOr[Query], /* queryVars */ js.Any) => ReportData | js.Promise[ReportData]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withData(value: ReportData | QueryResolver): Self = {
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
    def withFailFast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failFast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailFast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failFast")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteralXmlDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalXmlDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteralXmlDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalXmlDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessLineBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processLineBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessLineBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processLineBreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryVars(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryVars")(js.undefined)
        ret
    }
    @scala.inline
    def withRunJs(value: /* o */ AnonCtx => AnonModifiedSandbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runJs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRunJs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runJs")(js.undefined)
        ret
    }
  }
  
}

