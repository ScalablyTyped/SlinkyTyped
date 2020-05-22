package typingsSlinky.docxTemplates.anon

import typingsSlinky.docxTemplates.docxTemplatesStrings.errors
import typingsSlinky.docxTemplates.processTemplateMod.ReportOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends ReportOutput {
  var errors: js.Array[js.Error]
  var status: errors
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[js.Error], status: errors): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

