package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Spreadsheet")
@js.native
class Spreadsheet protected ()
  extends typingsSlinky.ejWebAll.ej.Spreadsheet {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Spreadsheet.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Spreadsheet.Model) = this()
}
/* static members */
@JSGlobal("ej.Spreadsheet")
@js.native
object Spreadsheet extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.Spreadsheet = js.native
  
  @js.native
  object AutoFillOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.AutoFillOptions with Double] = js.native
    
    /* 0 */ val CopyCells: typingsSlinky.ejWebAll.ej.Spreadsheet.AutoFillOptions.CopyCells with Double = js.native
    
    /* 2 */ val FillFormattingOnly: typingsSlinky.ejWebAll.ej.Spreadsheet.AutoFillOptions.FillFormattingOnly with Double = js.native
    
    /* 1 */ val FillSeries: typingsSlinky.ejWebAll.ej.Spreadsheet.AutoFillOptions.FillSeries with Double = js.native
    
    /* 3 */ val FillWithoutFormatting: typingsSlinky.ejWebAll.ej.Spreadsheet.AutoFillOptions.FillWithoutFormatting with Double = js.native
    
    /* 4 */ val FlashFill: typingsSlinky.ejWebAll.ej.Spreadsheet.AutoFillOptions.FlashFill with Double = js.native
  }
  
  @js.native
  object BorderType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType with Double] = js.native
    
    /* 5 */ val AllBorder: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.AllBorder with Double = js.native
    
    /* 3 */ val Bottom: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.Bottom with Double = js.native
    
    /* 1 */ val Left: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.Left with Double = js.native
    
    /* 4 */ val OutSide: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.OutSide with Double = js.native
    
    /* 2 */ val Right: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.Right with Double = js.native
    
    /* 7 */ val ThickBottom: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.ThickBottom with Double = js.native
    
    /* 6 */ val ThickBox: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.ThickBox with Double = js.native
    
    /* 0 */ val Top: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.Top with Double = js.native
    
    /* 8 */ val TopandBottom: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.TopandBottom with Double = js.native
    
    /* 9 */ val TopandThickBottom: typingsSlinky.ejWebAll.ej.Spreadsheet.BorderType.TopandThickBottom with Double = js.native
  }
  
  @js.native
  object CFormatHighlightColor extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatHighlightColor with Double] = js.native
    
    /* 2 */ val GreenFillwithDarkGreenText: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatHighlightColor.GreenFillwithDarkGreenText with Double = js.native
    
    /* 3 */ val RedFill: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatHighlightColor.RedFill with Double = js.native
    
    /* 0 */ val RedFillwithDarkRedText: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatHighlightColor.RedFillwithDarkRedText with Double = js.native
    
    /* 4 */ val RedText: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatHighlightColor.RedText with Double = js.native
    
    /* 1 */ val YellowFillwithDarkYellowText: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatHighlightColor.YellowFillwithDarkYellowText with Double = js.native
  }
  
  @js.native
  object CFormatRule extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatRule with Double] = js.native
    
    /* 2 */ val Between: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatRule.Between with Double = js.native
    
    /* 5 */ val DateOccurs: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatRule.DateOccurs with Double = js.native
    
    /* 3 */ val EqualTo: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatRule.EqualTo with Double = js.native
    
    /* 0 */ val GreaterThan: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatRule.GreaterThan with Double = js.native
    
    /* 1 */ val LessThan: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatRule.LessThan with Double = js.native
    
    /* 4 */ val TextContains: typingsSlinky.ejWebAll.ej.Spreadsheet.CFormatRule.TextContains with Double = js.native
  }
  
  @js.native
  object ChartProperties extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties with Double] = js.native
    
    /* 0 */ val DataLabelCenter: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.DataLabelCenter with Double = js.native
    
    /* 1 */ val DataLabelInsideBase: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.DataLabelInsideBase with Double = js.native
    
    /* 2 */ val DataLabelInsideEnd: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.DataLabelInsideEnd with Double = js.native
    
    /* 3 */ val DataLabelNone: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.DataLabelNone with Double = js.native
    
    /* 4 */ val DataLabelOutsideEnd: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.DataLabelOutsideEnd with Double = js.native
    
    /* 5 */ val LegendsBottom: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.LegendsBottom with Double = js.native
    
    /* 6 */ val LegendsLeft: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.LegendsLeft with Double = js.native
    
    /* 7 */ val LegendsNone: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.LegendsNone with Double = js.native
    
    /* 8 */ val LegendsRight: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.LegendsRight with Double = js.native
    
    /* 9 */ val LegendsTop: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.LegendsTop with Double = js.native
    
    /* 10 */ val PrimaryHorizontal: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.PrimaryHorizontal with Double = js.native
    
    /* 11 */ val PrimaryHorizontalAxisTitle: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.PrimaryHorizontalAxisTitle with Double = js.native
    
    /* 12 */ val PrimaryMajorHorizontal: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.PrimaryMajorHorizontal with Double = js.native
    
    /* 13 */ val PrimaryMajorVertical: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.PrimaryMajorVertical with Double = js.native
    
    /* 14 */ val PrimaryMinorHorizontal: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.PrimaryMinorHorizontal with Double = js.native
    
    /* 15 */ val PrimaryMinorVertical: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.PrimaryMinorVertical with Double = js.native
    
    /* 16 */ val PrimaryVertical: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.PrimaryVertical with Double = js.native
    
    /* 17 */ val PrimaryVerticalAxisTitle: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.PrimaryVerticalAxisTitle with Double = js.native
    
    /* 18 */ val TitleCenter: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.TitleCenter with Double = js.native
    
    /* 19 */ val TitleFar: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.TitleFar with Double = js.native
    
    /* 20 */ val TitleNear: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.TitleNear with Double = js.native
    
    /* 21 */ val TitleNone: typingsSlinky.ejWebAll.ej.Spreadsheet.ChartProperties.TitleNone with Double = js.native
  }
  
  @js.native
  object ContextMenuType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.ContextMenuType with Double] = js.native
    
    /* 0 */ val Cell: typingsSlinky.ejWebAll.ej.Spreadsheet.ContextMenuType.Cell with Double = js.native
    
    /* 2 */ val ColumnHeader: typingsSlinky.ejWebAll.ej.Spreadsheet.ContextMenuType.ColumnHeader with Double = js.native
    
    /* 3 */ val Footer: typingsSlinky.ejWebAll.ej.Spreadsheet.ContextMenuType.Footer with Double = js.native
    
    /* 1 */ val RowHeader: typingsSlinky.ejWebAll.ej.Spreadsheet.ContextMenuType.RowHeader with Double = js.native
  }
  
  @js.native
  object CustomCellType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.CustomCellType with Double] = js.native
    
    /* 0 */ val Button: typingsSlinky.ejWebAll.ej.Spreadsheet.CustomCellType.Button with Double = js.native
    
    /* 1 */ val CheckBox: typingsSlinky.ejWebAll.ej.Spreadsheet.CustomCellType.CheckBox with Double = js.native
    
    /* 2 */ val DatePicker: typingsSlinky.ejWebAll.ej.Spreadsheet.CustomCellType.DatePicker with Double = js.native
    
    /* 3 */ val DropDownList: typingsSlinky.ejWebAll.ej.Spreadsheet.CustomCellType.DropDownList with Double = js.native
  }
  
  @js.native
  object ExportType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.ExportType with Double] = js.native
    
    /* 1 */ val Csv: typingsSlinky.ejWebAll.ej.Spreadsheet.ExportType.Csv with Double = js.native
    
    /* 0 */ val Excel: typingsSlinky.ejWebAll.ej.Spreadsheet.ExportType.Excel with Double = js.native
    
    /* 2 */ val Pdf: typingsSlinky.ejWebAll.ej.Spreadsheet.ExportType.Pdf with Double = js.native
  }
  
  @js.native
  object SelectionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.SelectionType with Double] = js.native
    
    /* 0 */ val Column: typingsSlinky.ejWebAll.ej.Spreadsheet.SelectionType.Column with Double = js.native
    
    /* 2 */ val Default: typingsSlinky.ejWebAll.ej.Spreadsheet.SelectionType.Default with Double = js.native
    
    /* 1 */ val Row: typingsSlinky.ejWebAll.ej.Spreadsheet.SelectionType.Row with Double = js.native
  }
  
  @js.native
  object SelectionUnit extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.SelectionUnit with Double] = js.native
    
    /* 2 */ val MultiRange: typingsSlinky.ejWebAll.ej.Spreadsheet.SelectionUnit.MultiRange with Double = js.native
    
    /* 1 */ val Range: typingsSlinky.ejWebAll.ej.Spreadsheet.SelectionUnit.Range with Double = js.native
    
    /* 0 */ val Single: typingsSlinky.ejWebAll.ej.Spreadsheet.SelectionUnit.Single with Double = js.native
  }
  
  @js.native
  object scrollMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Spreadsheet.scrollMode with Double] = js.native
    
    /* 0 */ val Infinite: typingsSlinky.ejWebAll.ej.Spreadsheet.scrollMode.Infinite with Double = js.native
    
    /* 1 */ val Normal: typingsSlinky.ejWebAll.ej.Spreadsheet.scrollMode.Normal with Double = js.native
  }
}
