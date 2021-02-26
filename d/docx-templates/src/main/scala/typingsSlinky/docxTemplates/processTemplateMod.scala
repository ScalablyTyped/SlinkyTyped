package typingsSlinky.docxTemplates

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.docxTemplates.anon.CmdName
import typingsSlinky.docxTemplates.docxTemplatesStrings.errors
import typingsSlinky.docxTemplates.docxTemplatesStrings.success
import typingsSlinky.docxTemplates.typesMod.Context
import typingsSlinky.docxTemplates.typesMod.CreateReportOptions
import typingsSlinky.docxTemplates.typesMod.Images
import typingsSlinky.docxTemplates.typesMod.Links
import typingsSlinky.docxTemplates.typesMod.Node
import typingsSlinky.docxTemplates.typesMod.ReportData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processTemplateMod {
  
  @JSImport("docx-templates/lib/processTemplate", "extractQuery")
  @js.native
  def extractQuery(template: Node, options: CreateReportOptions): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("docx-templates/lib/processTemplate", "getCommand")
  @js.native
  def getCommand(command: String, shorthands: StringDictionary[String], fixSmartQuotes: Boolean): String = js.native
  
  @JSImport("docx-templates/lib/processTemplate", "produceJsReport")
  @js.native
  def produceJsReport(data: js.UndefOr[scala.Nothing], template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = js.native
  @JSImport("docx-templates/lib/processTemplate", "produceJsReport")
  @js.native
  def produceJsReport(data: ReportData, template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = js.native
  
  @JSImport("docx-templates/lib/processTemplate", "splitCommand")
  @js.native
  def splitCommand(cmd: String): CmdName = js.native
  
  @JSImport("docx-templates/lib/processTemplate", "walkTemplate")
  @js.native
  def walkTemplate(
    data: js.UndefOr[scala.Nothing],
    template: Node,
    options: CreateReportOptions,
    processor: CommandProcessor
  ): js.Promise[ReportOutput] = js.native
  @JSImport("docx-templates/lib/processTemplate", "walkTemplate")
  @js.native
  def walkTemplate(data: ReportData, template: Node, options: CreateReportOptions, processor: CommandProcessor): js.Promise[ReportOutput] = js.native
  
  type CommandProcessor = js.Function3[
    /* data */ js.UndefOr[ReportData], 
    /* node */ Node, 
    /* ctx */ Context, 
    js.Promise[js.UndefOr[String | js.Error]]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.docxTemplates.anon.Htmls
    - typingsSlinky.docxTemplates.anon.Errors
  */
  trait ReportOutput extends StObject
  object ReportOutput {
    
    @scala.inline
    def Errors(errors: js.Array[js.Error], status: errors): typingsSlinky.docxTemplates.anon.Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.docxTemplates.anon.Errors]
    }
    
    @scala.inline
    def Htmls(
      htmls: typingsSlinky.docxTemplates.typesMod.Htmls,
      images: Images,
      links: Links,
      report: Node,
      status: success
    ): typingsSlinky.docxTemplates.anon.Htmls = {
      val __obj = js.Dynamic.literal(htmls = htmls.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.docxTemplates.anon.Htmls]
    }
  }
}
