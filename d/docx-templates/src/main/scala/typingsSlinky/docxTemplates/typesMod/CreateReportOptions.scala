package typingsSlinky.docxTemplates.typesMod

import typingsSlinky.docxTemplates.AnonCtx
import typingsSlinky.docxTemplates.AnonModifiedSandbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReportOptions extends js.Object {
  var additionalJsContext: js.Object = js.native
  var cmdDelimiter: js.Tuple2[String, String] = js.native
  var failFast: Boolean = js.native
  var literalXmlDelimiter: String = js.native
  var noSandbox: Boolean = js.native
  var processLineBreaks: Boolean = js.native
  var runJs: js.UndefOr[RunJSFunc] = js.native
}

object CreateReportOptions {
  @scala.inline
  def apply(
    additionalJsContext: js.Object,
    cmdDelimiter: js.Tuple2[String, String],
    failFast: Boolean,
    literalXmlDelimiter: String,
    noSandbox: Boolean,
    processLineBreaks: Boolean
  ): CreateReportOptions = {
    val __obj = js.Dynamic.literal(additionalJsContext = additionalJsContext.asInstanceOf[js.Any], cmdDelimiter = cmdDelimiter.asInstanceOf[js.Any], failFast = failFast.asInstanceOf[js.Any], literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any], noSandbox = noSandbox.asInstanceOf[js.Any], processLineBreaks = processLineBreaks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportOptions]
  }
  @scala.inline
  implicit class CreateReportOptionsOps[Self <: CreateReportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalJsContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalJsContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmdDelimiter(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailFast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failFast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiteralXmlDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalXmlDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessLineBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processLineBreaks")(value.asInstanceOf[js.Any])
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

