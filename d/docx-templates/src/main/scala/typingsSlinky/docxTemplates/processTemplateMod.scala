package typingsSlinky.docxTemplates

import typingsSlinky.docxTemplates.typesMod.CreateReportOptions
import typingsSlinky.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/processTemplate", JSImport.Namespace)
@js.native
object processTemplateMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.docxTemplates.AnonHtmls
    - typingsSlinky.docxTemplates.AnonErrors
  */
  trait ReportOutput extends js.Object
  
  def extractQuery(template: Node, options: CreateReportOptions): js.Promise[js.UndefOr[String]] = js.native
  def produceJsReport(data: js.Any, template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = js.native
}

