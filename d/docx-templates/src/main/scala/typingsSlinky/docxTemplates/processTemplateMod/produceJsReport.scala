package typingsSlinky.docxTemplates.processTemplateMod

import typingsSlinky.docxTemplates.typesMod.CreateReportOptions
import typingsSlinky.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/processTemplate", "produceJsReport")
@js.native
object produceJsReport extends js.Object {
  def apply(data: js.Any, template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = js.native
}

