package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ReportViewer")
@js.native
class ReportViewer protected ()
  extends typingsSlinky.ejWebAll.ej.ReportViewer {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.ReportViewer.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.ReportViewer.Model) = this()
}

/* static members */
@JSGlobal("ej.ReportViewer")
@js.native
object ReportViewer extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.ReportViewer = js.native
  @js.native
  object ExcelFormats extends js.Object {
    /* 1 */ val Excel2007: typingsSlinky.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2007 with Double = js.native
    /* 2 */ val Excel2010: typingsSlinky.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2010 with Double = js.native
    /* 3 */ val Excel2013: typingsSlinky.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2013 with Double = js.native
    /* 0 */ val Excel97to2003: typingsSlinky.ejWebAll.ej.ReportViewer.ExcelFormats.Excel97to2003 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.ExcelFormats with Double] = js.native
  }
  
  @js.native
  object ExportOptions extends js.Object {
    /* 0 */ val All: typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions.All with Double = js.native
    /* 6 */ val CSV: typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions.CSV with Double = js.native
    /* 7 */ val CustomItems: typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions.CustomItems with Double = js.native
    /* 3 */ val Excel: typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions.Excel with Double = js.native
    /* 4 */ val Html: typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions.Html with Double = js.native
    /* 5 */ val PPT: typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions.PPT with Double = js.native
    /* 1 */ val Pdf: typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions.Pdf with Double = js.native
    /* 2 */ val Word: typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions.Word with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.ExportOptions with Double] = js.native
  }
  
  @js.native
  object Orientation extends js.Object {
    /* 0 */ val Landscape: typingsSlinky.ejWebAll.ej.ReportViewer.Orientation.Landscape with Double = js.native
    /* 1 */ val Portrait: typingsSlinky.ejWebAll.ej.ReportViewer.Orientation.Portrait with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.Orientation with Double] = js.native
  }
  
  @js.native
  object PPTFormats extends js.Object {
    /* 1 */ val PowerPoint2007: typingsSlinky.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2007 with Double = js.native
    /* 2 */ val PowerPoint2010: typingsSlinky.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2010 with Double = js.native
    /* 3 */ val PowerPoint2013: typingsSlinky.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2013 with Double = js.native
    /* 0 */ val PowerPoint97to2003: typingsSlinky.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint97to2003 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.PPTFormats with Double] = js.native
  }
  
  @js.native
  object PaperSize extends js.Object {
    /* 0 */ val A3: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.A3 with Double = js.native
    /* 2 */ val B4_JIS: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.B4_JIS with Double = js.native
    /* 3 */ val B5_JIS: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.B5_JIS with Double = js.native
    /* 10 */ val Custom: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.Custom with Double = js.native
    /* 4 */ val Envelope_10: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.Envelope_10 with Double = js.native
    /* 5 */ val Envelope_Monarch: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.Envelope_Monarch with Double = js.native
    /* 6 */ val Executive: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.Executive with Double = js.native
    /* 7 */ val Legal: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.Legal with Double = js.native
    /* 8 */ val Letter: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.Letter with Double = js.native
    /* 1 */ val Portrait: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.Portrait with Double = js.native
    /* 9 */ val Tabloid: typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize.Tabloid with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.PaperSize with Double] = js.native
  }
  
  @js.native
  object PrintOptions extends js.Object {
    /* 0 */ val Default: typingsSlinky.ejWebAll.ej.ReportViewer.PrintOptions.Default with Double = js.native
    /* 1 */ val NewTab: typingsSlinky.ejWebAll.ej.ReportViewer.PrintOptions.NewTab with Double = js.native
    /* 2 */ val None: typingsSlinky.ejWebAll.ej.ReportViewer.PrintOptions.None with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.PrintOptions with Double] = js.native
  }
  
  @js.native
  object ProcessingMode extends js.Object {
    /* 1 */ val Local: typingsSlinky.ejWebAll.ej.ReportViewer.ProcessingMode.Local with Double = js.native
    /* 0 */ val Remote: typingsSlinky.ejWebAll.ej.ReportViewer.ProcessingMode.Remote with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.ProcessingMode with Double] = js.native
  }
  
  @js.native
  object RenderMode extends js.Object {
    /* 0 */ val Default: typingsSlinky.ejWebAll.ej.ReportViewer.RenderMode.Default with Double = js.native
    /* 2 */ val Desktop: typingsSlinky.ejWebAll.ej.ReportViewer.RenderMode.Desktop with Double = js.native
    /* 1 */ val Mobile: typingsSlinky.ejWebAll.ej.ReportViewer.RenderMode.Mobile with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.RenderMode with Double] = js.native
  }
  
  @js.native
  object ToolbarItems extends js.Object {
    /* 4 */ val Export: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.Export with Double = js.native
    /* 3 */ val FittoPage: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.FittoPage with Double = js.native
    /* 5 */ val PageNavigation: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.PageNavigation with Double = js.native
    /* 8 */ val PageSetup: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.PageSetup with Double = js.native
    /* 6 */ val Parameters: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.Parameters with Double = js.native
    /* 0 */ val Print: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.Print with Double = js.native
    /* 7 */ val PrintLayout: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.PrintLayout with Double = js.native
    /* 1 */ val Refresh: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.Refresh with Double = js.native
    /* 2 */ val Zoom: typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems.Zoom with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.ToolbarItems with Double] = js.native
  }
  
  @js.native
  object WordFormats extends js.Object {
    /* 20 */ val Automatic: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Automatic with Double = js.native
    /* 2 */ val DOCX: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.DOCX with Double = js.native
    /* 0 */ val Doc: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Doc with Double = js.native
    /* 1 */ val Dot: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Dot with Double = js.native
    /* 17 */ val EPUB: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.EPUB with Double = js.native
    /* 18 */ val HTML: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.HTML with Double = js.native
    /* 15 */ val RTF: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.RTF with Double = js.native
    /* 16 */ val Txt: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Txt with Double = js.native
    /* 3 */ val Word2007: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2007 with Double = js.native
    /* 9 */ val Word2007Docm: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2007Docm with Double = js.native
    /* 12 */ val Word2007Dotm: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2007Dotm with Double = js.native
    /* 6 */ val Word2007Dotx: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2007Dotx with Double = js.native
    /* 4 */ val Word2010: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2010 with Double = js.native
    /* 10 */ val Word2010Docm: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2010Docm with Double = js.native
    /* 13 */ val Word2010Dotm: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2010Dotm with Double = js.native
    /* 7 */ val Word2010Dotx: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2010Dotx with Double = js.native
    /* 5 */ val Word2013: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2013 with Double = js.native
    /* 11 */ val Word2013Docm: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2013Docm with Double = js.native
    /* 14 */ val Word2013Dotm: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2013Dotm with Double = js.native
    /* 8 */ val Word2013Dotx: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.Word2013Dotx with Double = js.native
    /* 19 */ val XML: typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats.XML with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ReportViewer.WordFormats with Double] = js.native
  }
  
}

