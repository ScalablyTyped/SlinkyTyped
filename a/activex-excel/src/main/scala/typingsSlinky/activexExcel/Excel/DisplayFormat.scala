package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayFormat extends js.Object {
  
  val AddIndent: Boolean | Null = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  
  def Characters(): typingsSlinky.activexExcel.Excel.Characters = js.native
  def Characters(Start: js.UndefOr[scala.Nothing], Length: Double): typingsSlinky.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typingsSlinky.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typingsSlinky.activexExcel.Excel.Characters = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.DisplayFormat_typekey")
  var ExcelDotDisplayFormat_typekey: DisplayFormat = js.native
  
  val Font: typingsSlinky.activexExcel.Excel.Font = js.native
  
  val FormulaHidden: Boolean | Null = js.native
  
  val HorizontalAlignment: js.Any = js.native
  
  val IndentLevel: js.Any = js.native
  
  val Interior: typingsSlinky.activexExcel.Excel.Interior = js.native
  
  val Locked: Boolean | Null = js.native
  
  val MergeCells: Boolean = js.native
  
  val NumberFormat: String | Null = js.native
  
  val NumberFormatLocal: String | Null = js.native
  
  val Orientation: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  val ReadingOrder: Double = js.native
  
  val ShrinkToFit: Boolean = js.native
  
  val Style: typingsSlinky.activexExcel.Excel.Style = js.native
  
  val VerticalAlignment: js.Any = js.native
  
  val WrapText: Boolean = js.native
}
