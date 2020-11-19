package typingsSlinky.docxTemplates

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.docxTemplates.anon.CmdName
import typingsSlinky.docxTemplates.typesMod.Context
import typingsSlinky.docxTemplates.typesMod.CreateReportOptions
import typingsSlinky.docxTemplates.typesMod.Node
import typingsSlinky.docxTemplates.typesMod.ReportData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docx-templates/lib/processTemplate", JSImport.Namespace)
@js.native
object processTemplateMod extends js.Object {
  
  def extractQuery(template: Node, options: CreateReportOptions): js.Promise[js.UndefOr[String]] = js.native
  
  def getCommand(command: String, shorthands: StringDictionary[String]): String = js.native
  
  def produceJsReport(data: js.UndefOr[scala.Nothing], template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = js.native
  def produceJsReport(data: ReportData, template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = js.native
  
  def splitCommand(cmd: String): CmdName = js.native
  
  def walkTemplate(
    data: js.UndefOr[scala.Nothing],
    template: Node,
    options: CreateReportOptions,
    processor: CommandProcessor
  ): js.Promise[ReportOutput] = js.native
  def walkTemplate(data: ReportData, template: Node, options: CreateReportOptions, processor: CommandProcessor): js.Promise[ReportOutput] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.docxTemplates.anon.Htmls
    - typingsSlinky.docxTemplates.anon.Errors
  */
  trait ReportOutput extends js.Object
  
  type CommandProcessor = js.Function3[
    /* data */ js.UndefOr[ReportData], 
    /* node */ Node, 
    /* ctx */ Context, 
    js.Promise[js.UndefOr[String | js.Error]]
  ]
}
