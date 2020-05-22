package typingsSlinky.html5ToPdf.mod

import typingsSlinky.node.Buffer
import typingsSlinky.puppeteer.mod.LaunchOptions
import typingsSlinky.puppeteer.mod.PDFOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions extends js.Object {
  var body: String | Buffer
  var include: js.Array[FileDef]
  var launchOptions: LaunchOptions
  var pdf: PDFOptions
  var renderDelay: Double
  var templatePath: String
  var templateUrl: String
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
}

