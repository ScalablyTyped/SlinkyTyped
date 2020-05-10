package typingsSlinky.html5ToPdf.mod

import typingsSlinky.node.Buffer
import typingsSlinky.puppeteer.mod.LaunchOptions
import typingsSlinky.puppeteer.mod.PDFOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedOptions extends js.Object {
  var body: String | Buffer = js.native
  var include: js.Array[FileDef] = js.native
  var launchOptions: LaunchOptions = js.native
  var pdf: PDFOptions = js.native
  var renderDelay: Double = js.native
  var templatePath: String = js.native
  var templateUrl: String = js.native
}

object ParsedOptions {
  @scala.inline
  def apply(
    body: String | Buffer,
    include: js.Array[FileDef],
    launchOptions: LaunchOptions,
    pdf: PDFOptions,
    renderDelay: Double,
    templatePath: String,
    templateUrl: String
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], launchOptions = launchOptions.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], renderDelay = renderDelay.asInstanceOf[js.Any], templatePath = templatePath.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
  @scala.inline
  implicit class ParsedOptionsOps[Self <: ParsedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[FileDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchOptions(value: LaunchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPdf(value: PDFOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplatePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

